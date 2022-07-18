package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;


import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.pagefactory.salesforce.*;
//import cucumber.api.DataTable;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Reporter;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class enterpriseIndustrializationDigitalWorkplace {

    static Logger logger = LogManager.getLogger(enterpriseIndustrializationDigitalWorkplace.class);

    public WebDriver driver;
    public static String accName;
    public static String supportType;
    public static String  DealType;
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
    AddDW AddDW;
    @Autowired
    digitalWorkplaceConfiguration DWconfiguartion;
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


    public enterpriseIndustrializationDigitalWorkplace(CustomWebDriver customWebDriver) {
        this.driver = customWebDriver.getWebDriver();
    }
    @Given("^User logins as Enterprise Sales representative$")
    public void user_logins_as_Enterprise_Sales_representative() throws Throwable {
        try {

            Loginpage.login();
        }catch(Exception e)
        {
            logger.error(e.toString());
        }
    }
    @Then("^Sales rep creates an opportunity with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_creates_an_opportunity_with_the_following_details(String Account_Name, String Deal_Type, String Type_of_support) throws Throwable {

        DealType=Deal_Type;
        supportType=Type_of_support;
        accName=Account_Name;
        try {

            Loginpage.profileLogin(supportType,accName);
        }
        catch(Exception e)
        {
            logger.error(e.toString());
        }
        String[] arr=opportunityPage.opportunityCreation (Account_Name, Deal_Type, Type_of_support );
        oppLink= driver.getCurrentUrl();
        Reporter.log("Account name=" +accName,true);
    }
    @Then("^Sales rep adds the Enterprise product details for all DW products$")
    public void sales_rep_adds_the_Enterprise_product_details_for_all_DW_products(DataTable table) throws Throwable {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        for(int i=0; i<=5; i++) {
            O2productdetail.productdetails(list.get(i).get("Product_Category"), list.get(i).get("Product"), list.get(i).get("Product_Detail"), list.get(i).get("Quans"), list.get(i).get("LOC"), list.get(i).get("Billed_Upfront"), list.get(i).get("Revenue_per_month"), list.get(i).get("Business_Type"));
            driver.get(oppLink);
        }
    }
    @Then("^Sales rep creates a product basket to add DW products$")
    public void sales_rep_creates_a_product_basket_to_add_DW_products() throws InterruptedException {
        Productbasket.productBasket(oppLink);
        Productbasket.addproduct();
        basketLink= driver.getCurrentUrl();
        Reporter.log("BasketLink=" +basketLink,true);
    }
    @Then("^Sales rep add DW products to basket$")
    public void salesRepAddDWProductsToBasket() throws InterruptedException, IOException {
        DWconfiguartion.addProducts();
    }
    @Then("^Sales rep configures MLS product in the basket with the following details \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_configures_MLS_product_in_the_basket_with_the_following_details(String MLS_Handset_Volume, String MLS_Handset_Acc) throws InterruptedException, IOException {
        DWconfiguartion.DWConfig(MLS_Handset_Volume, MLS_Handset_Acc);
        //driver.navigate().refresh();
    }
    @Then("^Sales rep configures MaaS product in the basket with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_configures_MaaS_product_in_the_basket_with_the_following_details(String MaaS_License_period, String MaaS_License_volume, String MaaS_License_type,String MaaS_Products) throws InterruptedException, IOException {
        DWconfiguartion.MaaS360(MaaS_License_period, MaaS_License_volume, MaaS_License_type, MaaS_Products);

    }
        @Then("^Sales rep configures WSO product in the basket with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
        public void sales_rep_configures_WSO_product_in_the_basket_with_the_following_details(String WSO_SKU_Code, String WSO_License_Volume, String WSO_Professional_services, String WSO_Standard_Engineer, String WSO_Consultant) throws InterruptedException, IOException {
            DWconfiguartion.WSO(WSO_SKU_Code, WSO_License_Volume, WSO_Professional_services, WSO_Standard_Engineer, WSO_Consultant);

    }
    @Then("^Sales rep configures Rotageek product in the basket with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_configures_Rotageek_product_in_the_basket_with_the_following_details(String Rotageek_License_period, String Rotageek_License_volume, String Rotageek_License_type_1, String Rotageek_License_type_2,String Rotageek_PS_Manager) throws InterruptedException, IOException {
        driver.navigate().refresh();
        Thread.sleep(5000);
        Productbasket.addanotherproduct();
        DWconfiguartion.addRotageek();
        DWconfiguartion.Rotageek(Rotageek_License_period, Rotageek_License_volume, Rotageek_License_type_1, Rotageek_License_type_2, Rotageek_PS_Manager);

        //DWconfiguartion.Rotageek(Rotageek_License_period, Rotageek_License_volume, Rotageek_License_type_1, Rotageek_License_type_2, Rotageek_PS_Manager);
    }
    @Then("^Sales rep configures Sandblast product in the basket with the following details \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_configures_Sandblast_product_in_the_basket_with_the_following_details(String Sandblast_License_period,String Sandblast_License_volume) throws InterruptedException, IOException {

       // DWconfiguartion.Sandblast(Sandblast_License_period, Sandblast_License_volume);
    }
    @Then("^Sales rep configures AsavieModa product in the basket with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_configures_AsavieModa_product_in_the_basket_with_the_following_details(String AsavieModa_License_period, String AsavieModa_License_volume, String AsavieModa_PS_Fulldays, String AsavieModa_PS_Halfdays) throws InterruptedException, IOException {

        DWconfiguartion.AsavieModa(AsavieModa_License_period, AsavieModa_License_volume, AsavieModa_PS_Fulldays, AsavieModa_PS_Halfdays);
    }
    @Then("^Sales rep configures MMA product in the basket with the following details$")
    public void sales_rep_configures_MMA_product_in_the_basket_with_the_following_details() throws InterruptedException, IOException {

        DWconfiguartion.MMA();
    }
   @Then("^Sales rep views the Profit and Loss section for the configured DW products$")
   public void sales_rep_views_the_Profit_and_Loss_section_for_the_configured_DW_products() throws InterruptedException, IOException {
       ProfitLoss.profitLoss();
   }

    @Then("^Sales rep provides required discount under the discount section$")
    public void sales_rep_provides_required_discount_under_the_discount_section() throws InterruptedException, IOException {
       Discountpage.discounts();
    }

    @Then("^Sales rep vists Clauses section to update the required details and submits basket for approval$")
    public void sales_rep_vists_Clauses_section_to_update_the_required_details_and_submits_basket_for_approval() throws InterruptedException, IOException {
       Clausespage.clauses();
    }
  @Then("^Financial approvers approve the basket and the basket is synced with the opportunity$")
  public void financial_approvers_approve_the_basket_and_the_basket_is_synced_with_the_opportunity() throws InterruptedException {
      ApprovalandSync.DWApproval(basketLink);
  }
    @Then("^User logs in as Sales Rep to change the opportunity satge as Awareness of needs inorder to kick off the Sales governance process for DW products$")
    public void user_logs_in_as_Sales_Rep_to_change_the_opportunity_satge_as_Awareness_of_needs_inorder_to_kick_off_the_Sales_governance_process_for_DW_products() throws InterruptedException, IOException {
      SalesGovernance.kickoff(oppLink,supportType);
    }
    @Then("^Sales Rep feeds in the details in Agreement to support stage$")
    public void sales_Rep_feeds_in_the_details_in_Agreement_to_support_stage() throws InterruptedException, IOException {
      salesGovernanceSupportAndSolution.agreementToSupportAction(oppLink,supportType);
    }

    @Then("^User logins as Qgate Admin to approve Agreement to support stage$")
    public void user_logins_as_Qgate_Admin_to_approve_Agreement_to_support_stage() throws InterruptedException, IOException {
     salesGovernanceSupportAndSolution.approvalAgreementToSupportAction(oppLink,supportType);
    }

    @Then("^User logins as Sales Rep to feed in the details in Solution and Delivery QA Stage$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_details_in_Solution_and_Delivery_QA_Stage() throws InterruptedException, IOException {
     salesGovernanceSupportAndSolution.solutionAndDeliveryQA(oppLink,supportType);
    }

    @Then("^User logins as Qgate admin to approve Solution and Delivery QA Stage$")
    public void user_logins_as_Qgate_admin_to_approve_Solution_and_Delivery_QA_Stage() throws InterruptedException, IOException {
     salesGovernanceSupportAndSolution.approvalSolutionAndDeliveryQA(oppLink,supportType);
    }

    @Then("^User logins as Sales Rep to feed in the data in Agreement to Propose stage with the following details for DW products \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_data_in_Agreement_to_Propose_stage_with_the_following_details_for_DW_products(String Submission_type, String Contract_terms, String Service_levels) throws InterruptedException, IOException {
        SalesGovernance.agreementToPropose(oppLink,Submission_type, Contract_terms, Service_levels,TCV2, supportType);
}

    @Then("^User logins as Qgate Admin to approve Agreement to propose stage for DW products$")
    public void user_logins_as_Qgate_Admin_to_approve_Agreement_to_propose_stage_for_DW_products() throws InterruptedException, IOException {
    SalesGovernance.financeApprovalAgreementToPropose(oppLink,TCV2,supportType);
    SalesGovernance.approvalAgreementToPropose(oppLink,TCV2);

    }

    @Then("^User logins as Sales Rep to change the Opportunity stage as decision for configured DW products$")
    public void user_logins_as_Sales_Rep_to_change_the_Opportunity_stage_as_decision_for_configured_DW_products() throws InterruptedException, IOException {
        SalesGovernance.Opp_stage_Decision_action(oppLink,TCV2,supportType);

    }

    @Then("^User logins as Sales Rep to feed in thr details in Agreement to sign stage for DW products$")
    public void user_logins_as_Sales_Rep_to_feed_in_thr_details_in_Agreement_to_sign_stage_for_DW_products() throws InterruptedException, IOException {
        SalesGovernance.Agreement_to_Sign_action(oppLink,TCV2);
    }

    @Then("^User logins as Qgate admin to approve Agreement to sign stage for DW products$")
    public void user_logins_as_Qgate_admin_to_approve_Agreement_to_sign_stage_for_DW_products() throws InterruptedException, IOException {
      SalesGovernance.Approval_Agreement_to_Sign_action(oppLink,TCV2);
        output.OutPut(DealType,supportType,basketLink);
    }
    @Then("^User logins as Sales Rep to feed in the details in Acceptance into delivery stage for DW products$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_details_in_Acceptance_into_delivery_stage_for_DW_products() throws InterruptedException, IOException {
      SalesGovernanceDeliveryAndService.acceptanceToDelivery(oppLink,supportType,TCV2);
    }

    @Then("^User logins as Qgate Admin to approve Acceptance into delivery stage for DW products$")
    public void user_logins_as_Qgate_Admin_to_approve_Acceptance_into_delivery_stage_for_DW_products() throws InterruptedException, IOException {
      SalesGovernanceDeliveryAndService.approvalAcceptanceToDelivery(oppLink,TCV2,supportType);
    }

    @Then("^User logins as Sales Rep to feed in the details in Acceptance into service stage for DW products$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_details_in_Acceptance_into_service_stage_for_DW_products() throws InterruptedException, IOException {
      SalesGovernanceDeliveryAndService.acceptanceToService(oppLink,supportType,TCV2);
    }

    @Then("^User logins as Qgate Admin to approve Acceptance into service stage for DW products$")
    public void user_logins_as_Qgate_Admin_to_approve_Acceptance_into_service_stage_for_DW_products() throws InterruptedException, IOException {
      SalesGovernanceDeliveryAndService.approvalAcceptanceToService(oppLink,TCV2,supportType);
        output.OutPut(DealType, supportType, basketLink);
    }



}



