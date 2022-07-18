package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;


import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.pagefactory.salesforce.*;
//import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;
import java.util.Map;
public class flexPlan {

    static Logger logger = LogManager.getLogger(enterpriseIndustrializationDigitalWorkplace.class);

    public WebDriver driver;
    public static String supportType;
    public static String DealType;
    String oppLink;
    String basketLink;
    int TCV2;
    String TCV1;
    @Autowired
    LoginPage Loginpage;
    @Autowired
    opportunityPage Opportunitypage;
    @Autowired
    newProductBasket Productbasket;
    @Autowired
    configureFlexPlan FlexPlanConfiguartion;
    @Autowired
    profitAndLossReport ProfitLoss;
    @Autowired
    callmixFP callmix;
    @Autowired
    discount Discountpage;
    @Autowired
    clauses Clausespage;
    @Autowired
    o2ProductDetails O2productdetail;
    @Autowired
    connectivityDrop1ApprovalsAndBasketSync ApprovalandSync;
    @Autowired
    salesGovernance SalesGovernance;
    @Autowired
    output output;
    @Autowired
    salesGovernanceDeliveryAndService SalesGovernanceDeliveryAndService;
    @Autowired
    SalesGovernanceSupportAndSolution salesGovernanceSupportAndSolution;

    String X;
    String transformation_fund, term, total_number_of_SIMs;


    public flexPlan(CustomWebDriver customWebDriver) {
        this.driver = customWebDriver.getWebDriver();
    }

    @Given("^User login as Sales representative$")
    public void user_login_as_Sales_representative() throws Throwable {
        try {

            Loginpage.login();
            Loginpage.profileLogin(supportType);
        } catch (Exception e) {
            logger.error(e.toString());
        }
    }

    @When("^Sales representative creates an opportunity with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_representative_creates_an_opportunity_with_the_following_details(String Account_Name, String Deal_Type, String Type_of_support) throws Throwable {
        String[] arr = opportunityPage.opportunityCreation(Account_Name,Deal_Type, Type_of_support);
        DealType = arr[0];
        supportType = arr[1];
        oppLink = driver.getCurrentUrl();
    }

    @Then("^Sales rep adds the Enterprise product details for FlexPlans products$")
    public void sales_rep_adds_the_Enterprise_product_details_for_FlexPlans_products(DataTable table) throws Throwable {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {
            O2productdetail.productdetails(list.get(i).get("Product_Category"), list.get(i).get("Product"), list.get(i).get("Product_Detail"), list.get(i).get("Quans"), list.get(i).get("LOC"), list.get(i).get("Billed_Upfront"), list.get(i).get("Revenue_per_month"), list.get(i).get("Business_Type"));
            driver.get(oppLink);
            System.out.println("O2");
        }

    }

    @Then("^Sales rep creates a product basket to add FlexPlans products$")
    public void sales_rep_creates_a_product_basket_to_add_FlexPlans_products() throws InterruptedException {
        System.out.println(oppLink);
        Productbasket.productBasket(oppLink);

        Productbasket.addproduct();
        basketLink = driver.getCurrentUrl();
    }

    @Then("^Sales rep configures FlexPlans products in the basket with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_configures_FlexPlans_products_in_the_basket_with_the_following_details(String Standard_or_Bespoke_1, String Standard_or_Bespoke_2, String x, String Term, String Voice_and_Aggregated_Data_SIMs, String Aggregated_Data_Only_SIMs, String Transformation_Fund,String tariff, String discount, String Private_APN) throws InterruptedException, IOException {
        FlexPlanConfiguartion.FPConfig(Standard_or_Bespoke_1, Standard_or_Bespoke_2, x, Term, Voice_and_Aggregated_Data_SIMs, Aggregated_Data_Only_SIMs, Transformation_Fund, tariff, discount, Private_APN);
        X=x;
        transformation_fund= Transformation_Fund;
        term=Term;
        total_number_of_SIMs= Voice_and_Aggregated_Data_SIMs;
    }


    @Then("^Sales representative configures the required Call mix details$")
    public void Sales_representative_configures_the_required_Call_mix_details() throws Throwable {
        callmix.callmixFP();
    }

    @Then("^Sales rep provides discount under discount section$")
    public void sales_rep_provides_discount_under_discount_section() throws InterruptedException, IOException {
        Discountpage.discountOpenCloseFP();
    }

    @Then("^Sales rep opens Clauses section to update the required details$")
    public void sales_rep_opens_Clauses_section_to_update_the_required_details() throws InterruptedException, IOException {
        Clausespage.clauses(X,oppLink,transformation_fund,term,total_number_of_SIMs);
    }

    @Then("^Sales rep views the Profit and Loss section for the configured FP products$")
    public void sales_rep_views_the_Profit_and_Loss_section_for_the_configured_FP_products() throws InterruptedException, IOException {
        ProfitLoss.profitLossFP(term,transformation_fund);
    }

    @Then("^Sales rep submits basket for approval and Finance approves basket and basket is synced with the opportunity$")
    public void sales_rep_submits_basket_for_approval_and_Finance_approves_basket_and_basket_is_synced_with_the_opportunity() throws InterruptedException, IOException {
        ApprovalandSync.FPApproval(basketLink);
    }

}
