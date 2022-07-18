package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.pagefactory.salesforce.*;
import com.nttdata.testframework.utils.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.math.BigDecimal;


public class enterpriseIndustrialisationConnectivityDrop1 {
    static Logger logger = LogManager.getLogger(enterpriseIndustrialisationConnectivityDrop1.class);
    public static int TCV2;
    public WebDriver driver;
    public static String supportType;
    public static String DealType;
    String oppLink;
    String basketLink;
    @Autowired
    CustomWebDriver customWebDriver;
    @Autowired
    Configuration configuration;
    @Autowired
    LoginPage loginPage;
    @Autowired
    com.nttdata.testframework.pagefactory.salesforce.opportunityPage opportunityPage;
    @Autowired
    o2ProductDetails configureMobileAction;
    @Autowired
    com.nttdata.testframework.pagefactory.salesforce.newProductBasket newProductBasket;
    @Autowired
    connectivityDrop1Configuration connectivityDrop1Configuration;
    @Autowired
    profitAndLossReport profitAndLossReport;
    @Autowired
    discount discount;
    @Autowired
    clauses clauses;
    @Autowired
    connectivityDrop1ApprovalsAndBasketSync connectivityDrop1ApprovalsAndBasketSync;
    @Autowired
    salesGovernance SalesGovernance;
    @Autowired
    output  output;
    @Autowired
    salesGovernanceDeliveryAndService SalesGovernanceDeliveryAndService;
    @Autowired
    SalesGovernanceSupportAndSolution salesGovernanceSupportAndSolution;
    public enterpriseIndustrialisationConnectivityDrop1(CustomWebDriver customWebDriver) {
        this.driver = customWebDriver.getWebDriver();
    }


    @Given("^User logins as Sales rep$")
    public void User_logins_as_Sales_rep() throws Throwable {
        try {
            loginPage.login();
            loginPage.profileLogin(supportType);
        }catch(Exception e){
            logger.error(e.toString());
        }

    }


    @Then("^Sales rep creates an opportunity with the following details and saves it \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void Sales_rep_creates_an_opportunity_with_the_following_details_and_saves_it(String Account_Name, String Deal_Type, String Type_of_support) throws Throwable {
        String[] arr=opportunityPage.opportunityCreation (Account_Name, Deal_Type, Type_of_support );
        DealType=arr[0];
        supportType=arr[1];
        oppLink= driver.getCurrentUrl();

    }

    @Then("^Sales rep adds an retail product with the following details \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
    public void Sales_rep_adds_an_retail_product_with_the_following_details(String Product_Category, String Product, String Product_Detail, String Quans, String LOC, String Billed_Upfront, String Revenue_per_month,String Business_Type) throws Throwable {
        String TCV1=configureMobileAction.productdetails(Product_Category,Product,Product_Detail,Quans,LOC,Billed_Upfront,Revenue_per_month,Business_Type);
        driver.get(oppLink);
        TCV1=TCV1.replaceAll(",", "");
        TCV2=new BigDecimal(TCV1).intValue();
    }


    @Then("^Sales rep creates a product basket and adds an Enterprise mobile offer$")
    public void Sales_rep_creates_a_product_basket_and_adds_an_Enterprise_mobile_offer() throws Throwable {
        newProductBasket.productBasket(oppLink);
        basketLink= driver.getCurrentUrl();
        newProductBasket.addproduct();
    }

    @Then("^Sales rep edits and completes the configuration of all the products \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void Sales_rep_edits_and_completes_the_configuration_of_all_the_products(String PMATerm, String PMABAndwidth, String QuantityofAPN, String NumberofSites, String BTNNITerm,String BTNIMigrationType,String PCCDeliveryType, String PCCContractTerm, String GIPTerm,String GIPServiceTier) throws Throwable {
        connectivityDrop1Configuration.configurationDrop1(PMATerm,PMABAndwidth,QuantityofAPN,NumberofSites,BTNNITerm,BTNIMigrationType,PCCDeliveryType,PCCContractTerm,GIPTerm,GIPServiceTier);
    }


    @Then("^Sales rep adds MWAN to the basket \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void Sales_rep_adds_MWAN_to_the_basket(String MWANTerm, String MWANAPN,  String GroupName, String Resiliency, String PrimaryCircuitType, String PrimaryAccessType, String GroupName2, String Resiliency2, String PrimaryCircuitType2, String PrimaryAccessType2, String SecondaryCircuitytype, String SecondaryAccessType) throws Throwable {
        connectivityDrop1Configuration.configurationMWAN( MWANTerm, MWANAPN,  GroupName, Resiliency,PrimaryCircuitType,PrimaryAccessType,GroupName2,Resiliency2,PrimaryCircuitType2, PrimaryAccessType2, SecondaryCircuitytype,SecondaryAccessType);

    }

    @Then("^Sales rep views the Profit and Loss report for the configured mobile offer$")
    public void Sales_rep_views_the_Profit_and_Loss_report_for_the_configured_mobile_offer() throws Throwable {
        profitAndLossReport.profitLoss();
    }
    @Then("^Sales rep provides the required discount for the opted configuration$")
    public void Sales_rep_provides_the_required_discount_for_the_opted_configuration() throws Throwable {
    discount.discounts();
    }

    @Then("^Sales rep visits the Clauses section for further details$")
    public void Sales_rep_visits_the_Clauses_section_for_further_details() throws Throwable {
        clauses.clauses();
    }
    @Then("^Finance Manager approves the basket for the required approval criteria$")
    public void Finance_Manager_approves_the_basket_for_the_required_approval_criteria() throws Throwable {
        connectivityDrop1ApprovalsAndBasketSync.approval(basketLink);
    }

    @Then("^User logs in as Sales rep to change the opportunity stage as Awareness of needs inorder to kick off the Sales governance process$")
    public void user_logs_in_as_Sales_rep_to_change_the_opportunity_stage_as_Awareness_of_needs_inorder_to_kick_off_the_Sales_governance_process() throws InterruptedException, IOException {
        SalesGovernance.kickoff(oppLink,supportType);
    }
    @Then("^Sales rep feeds in the details into Agreement to support stage$")
    public void sales_rep_feeds_in_the_details_into_Agreement_to_support_stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.agreementToSupportAction(oppLink,supportType);
    }
    @Then("^User logins as Qgate Admin and approve Agreement to support stage$")
    public void user_logins_as_Qgate_Admin_and_approve_Agreement_to_support_stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.approvalAgreementToSupportAction(oppLink,supportType);
    }
    @Then("^User logins as Sales rep and feed in the details in Solution and Delivery QA Stage$")
    public void user_logins_as_Sales_rep_and_feed_in_the_details_in_Solution_and_Delivery_QA_Stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.solutionAndDeliveryQA(oppLink,supportType);
    }
    @Then("^User logins as Qgate admin and approve Solution and Delivery QA Stage$")
    public void user_logins_as_Qgate_admin_and_approve_Solution_and_Delivery_QA_Stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.approvalSolutionAndDeliveryQA(oppLink,supportType);
    }
    @Then("^User logins as Sales rep to feed in the data in Agreement to Propose stage with the following details\"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
    public void user_logins_as_Sales_rep_to_feed_in_the_data_in_Agreement_to_Propose_stage_with_the_following_details(String Submission_type, String Contract_terms, String Service_levels) throws InterruptedException, IOException {
        SalesGovernance.agreementToPropose(oppLink,Submission_type, Contract_terms, Service_levels,TCV2, supportType);
    }
    @Then("^User logins as Qgate Admin to approve Agreement to propose stage$")
    public void user_logins_as_Qgate_Admin_to_approve_Agreement_to_propose_stage() throws InterruptedException, IOException {
        SalesGovernance.financeApprovalAgreementToPropose(oppLink,TCV2,supportType);
        SalesGovernance.approvalAgreementToPropose(oppLink,TCV2);
    }
    @Then("^User logins as Sales rep to change the Opportunity stage as decision$")
    public void user_logins_as_Sales_rep_to_change_the_Opportunity_stage_as_decision() throws InterruptedException{
        SalesGovernance.Opp_stage_Decision_action(oppLink,TCV2,supportType);
    }
    @Then("^User logins as Sales rep to feed in thr details in Agreement to sign stage$")
    public void user_logins_as_Sales_rep_to_feed_in_thr_details_in_Agreement_to_sign_stage() throws InterruptedException, IOException {
        SalesGovernance.Agreement_to_Sign_action(oppLink,TCV2);
    }
    @Then("^User logins as Qgate Admin to approve Agreement to sign stage$")
    public void user_logins_as_Qgate_Admin_to_approve_Agreement_to_sign_stage() throws InterruptedException, IOException {
        SalesGovernance.Approval_Agreement_to_Sign_action(oppLink,TCV2);
    }

    @Then("^User logins as Sales Rep and feed in the details in Acceptance into delivery stage for DW products$")
    public void user_logins_as_Sales_Rep_and_feed_in_the_details_in_Acceptance_into_delivery_stage_for_DW_products() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.acceptanceToDelivery(oppLink,supportType,TCV2);
    }
    @Then("^User logins as Qgate Admin and approve Acceptance into delivery stage for DW products$")
    public void user_logins_as_Qgate_Admin_and_approve_Acceptance_into_delivery_stage_for_DW_products() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.approvalAcceptanceToDelivery(oppLink,TCV2,supportType);
    }
    @Then("^User logins as Sales rep and feed in the details in Acceptance into service stage for DW products$")
    public void user_logins_as_Sales_rep_and_feed_in_the_details_in_Acceptance_into_service_stage_for_DW_products() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.acceptanceToService(oppLink,supportType,TCV2);
    }
    @Then("^User logins as Qgate Admin and approve Acceptance into service stage for DW products$")
    public void user_logins_as_Qgate_Admin_and_approve_Acceptance_into_service_stage_for_DW_products() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.approvalAcceptanceToService(oppLink,TCV2,supportType);
        output.OutPut(DealType, supportType, basketLink);
    }
}
