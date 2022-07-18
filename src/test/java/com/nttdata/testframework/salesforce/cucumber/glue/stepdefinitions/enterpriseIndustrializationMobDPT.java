package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;


import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.pagefactory.salesforce.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class enterpriseIndustrializationMobDPT {

    static Logger logger = LogManager.getLogger(enterpriseIndustrializationMobDPT.class);

    public WebDriver driver;
    public static String supportType;
    public static String DealType;
    String oppLink;
    String basketLink;
    int TCV2;
    String TCV1;
    int term;
    @Autowired
    LoginPage Loginpage;
    @Autowired
    opportunityPage Opportunitypage;
    @Autowired
    newProductBasket Productbasket;
    @Autowired
    mobileDDPConfig DDPConfig;
    @Autowired
    BasketPage BasketPage;
    @Autowired
    AddResignDetails AddResignDetails;
    @Autowired
    callmixFP callmix;
    @Autowired
    profitAndLossReport ProfitLoss;
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


    public enterpriseIndustrializationMobDPT(CustomWebDriver customWebDriver) {
        this.driver = customWebDriver.getWebDriver();
    }

    @Given("^User logins as Enterprise Sales representative for DPT$")
    public void user_logins_as_Enterprise_Sales_representative() throws Throwable {
        try {
            Loginpage.login();
            Loginpage.profileLogin(supportType);
        } catch (Exception e) {
            logger.error(e.toString());
        }
    }

    @Then("^Sales rep for DPT creates an opportunity with the following details \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_for_DPT_creates_an_opportunity_with_the_following_details(String Deal_Type, String Type_of_support) throws Throwable {
        String[] arr = opportunityPage.opportunityCreationOne(Deal_Type, Type_of_support);
        DealType = arr[1];
        supportType = arr[0];
        System.out.println("DealType" + DealType);
        System.out.println("supportType" + supportType);
        oppLink = driver.getCurrentUrl();
    }

    @Then("^Sales rep for DPT adds the Enterprise product details for all DDP products$")
    public void sales_rep_adds_the_Enterprise_product_details_for_all_DPT_products(DataTable table) throws Throwable {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {
            O2productdetail.productdetailsMobile(list.get(i).get("Product_Category"), list.get(i).get("Product"), list.get(i).get("Product_Detail"), list.get(i).get("Mobile_Tariffs"), list.get(i).get("Mobile_Services"), list.get(i).get("Quans"), list.get(i).get("LOC"), list.get(i).get("Billed_Upfront"), list.get(i).get("Revenue_per_month"), list.get(i).get("Business_Type"));
            driver.get(oppLink);
        }

    }

    @Then("^Sales rep for DPT creates a product basket to add DDP products$")
    public void sales_rep_creates_a_product_basket_to_add_DPT_products() throws InterruptedException {
        Productbasket.productBasket(oppLink);
        basketLink = driver.getCurrentUrl();
        Productbasket.addproduct();
    }

    @Then("^Sales rep for DPT configures all DPT products in the basket with the following details\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_configures_all_DPT_products_in_the_basket_with_the_following_details(String NoOfConnections, String ProvisionalTarrif, String BillSpendCap, String PrivateAPN, String MobexRequired, String MobexService, String Type, String VoiceType, String Term, String DataType, String DataAllowance, String CappedOrUncapped, String AggregatedData) throws InterruptedException, IOException {
        DDPConfig.BBConfig(NoOfConnections, ProvisionalTarrif, BillSpendCap, PrivateAPN, MobexRequired, MobexService, Type, VoiceType, Term, DataType, DataAllowance, CappedOrUncapped, AggregatedData);
        term= Integer.parseInt(Term);
        DDPConfig.RunCompatiblity();
    }

    @Then("^Sales representative configures Resign details\"([^\"]*)\" \"([^\"]*)\"$")
    public void Sales_representative_configures_Resign_details(String Connections_Resign, String Revenue_Resign) throws Throwable {
        if (DealType.equalsIgnoreCase("Resign")) {
            AddResignDetails.addResignDetails(Connections_Resign, Revenue_Resign);
        }
    }

    @Then("^Sales representative configures Call mix details$")
    public void Sales_representative_configures_Call_mix_details() throws Throwable {
        if (DealType.equalsIgnoreCase("Resign")) {
            callmix.callmixResign();
        } else {
            callmix.callmix();
        }
    }


    @Then("^Sales rep for DPT visits Clauses section to update the required details\"([^\"]*)\"$")
    public void sales_rep_for_DPT_visits_Clauses_section_to_update_the_required_details(String TF) throws InterruptedException, IOException {
        Clausespage.clausesPreProd(TF, oppLink, term);
    }


    @Then("^Sales rep for DPT verifies the discount section$")
    public void sales_rep_for_DPT_verifies_the_discount_section() throws InterruptedException, IOException {
        Discountpage.discountOpenClose();
    }

    @Then("^Sales rep for DPT views the Profit and Loss section for the configured DPT products$")
    public void sales_rep_views_the_Profit_and_Loss_section_for_the_configured_DPT_products() throws InterruptedException, IOException {
        ProfitLoss.profitLoss();
    }

    @Then("^Sales rep for DPT validates the basket page$")
    public void sales_rep_for_DPT_validates_the_BasketPage() throws InterruptedException {
        BasketPage.CaptureValues();
        if (DealType.equalsIgnoreCase("Resign")) {
            BasketPage.CaptureResignDetails();
        }
    }

    @Then("^Sales rep for DPT submits basket for approval and Financial approvers for DPT approve the basket and the basket is synced with the opportunity$")
    public void Sales_rep_for_DPT_submits_basket_for_approval_and_financial_approvers_for_DPT__approve_the_basket_and_the_basket_is_synced_with_the_opportunity() throws InterruptedException, IOException {
        ApprovalandSync.DDPApproval(basketLink);
    }
}