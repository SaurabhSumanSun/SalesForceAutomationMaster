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


public class enterpriseIndustrialisationConnectivityDrop2 {

    static Logger logger = LogManager.getLogger(enterpriseIndustrialisationConnectivityDrop2.class);
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
    com.nttdata.testframework.pagefactory.salesforce.newProductBasket newProductBasket;
    @Autowired
    AddCSVFile AddCSVFile;
    @Autowired
    AddDrop2Products AddDrop2Products;
    @Autowired
    profitAndLossReport profitAndLossReport;
    @Autowired
    discount discount;
    @Autowired
    clauses clauses;
    @Autowired
    connectivityDrop1ApprovalsAndBasketSync connectivityDrop1ApprovalsAndBasketSync;
    @Autowired
    output output;

    @Autowired
    salesGovernance SalesGovernance;
    @Autowired
    salesGovernanceDeliveryAndService SalesGovernanceDeliveryAndService;
    @Autowired
    SalesGovernanceSupportAndSolution salesGovernanceSupportAndSolution;
    public enterpriseIndustrialisationConnectivityDrop2(CustomWebDriver customWebDriver) {
        this.driver = customWebDriver.getWebDriver();
    }

    @Given("^SalesREP login to salesforce application$")
    public void SalesREP_login_to_salesforce_application() throws Throwable {
        try {
            loginPage.login();
            //loginPage.profileLogin(supportType);
        }catch(Exception e){
            logger.error(e.toString());
        }
    }

    @Then("^SalesREP creates an opportunity with the \"([^\"]*)\" as Account \"([^\"]*)\" as Deal Type and \"([^\"]*)\" as Type of support$")
    public void SalesREP_creates_an_opportunity_with_the_as_Deal_Type_and_as_Type_of_support(String Account_Name, String Deal_Type, String Type_of_support) throws Throwable {
        String[] arr=opportunityPage.opportunityCreation ( Account_Name, Deal_Type, Type_of_support );
        DealType=arr[0];
        supportType=arr[1];
        oppLink= driver.getCurrentUrl();
    }

    @Then("^SalesREP creates a product basket$")
    public void SalesREP_creates_a_product_basket() throws Throwable {
        newProductBasket.productBasket(oppLink);
        basketLink= driver.getCurrentUrl();
    }

    @Given("^SalesREP adds CSV file from \"([^\"]*)\" location$")
    public void SalesREP_adds_CSV_file_from_location(String fileLocation) throws Throwable{
        Thread.sleep(3000);
        AddCSVFile.uploadFile(fileLocation);
    }

    @Given("^SalesREP adds Drop2 products into basket$")
    public void SalesREP_adds_Drop2_products_into_basket() throws Throwable{
        AddDrop2Products.CPEPortal();
        Thread.sleep(10000);
        AddDrop2Products.configureMLAN();
        Thread.sleep(4000);
        AddDrop2Products.configureMeraki();
        Thread.sleep(4000);
        AddDrop2Products.configureGatewayInternet();
        Thread.sleep(4000);
        AddDrop2Products.configureGlobalAccess();
        Thread.sleep(4000);
    }

    @Then("^SalesREP views the Profit and Loss report for the configured mobile offer$")
    public void SalesREP_views_the_Profit_and_Loss_report_for_the_configured_mobile_offer() throws Throwable {
        profitAndLossReport.profitLoss();
    }

    @Then("^SalesREP provides the required discount for the opted configuration$")
    public void SalesREP_provides_the_required_discount_for_the_opted_configuration() throws Throwable {
        discount.discounts();
    }

    @Then("^SalesREP visits the Clauses section for further details$")
    public void SalesREP_visits_the_Clauses_section_for_further_details() throws Throwable {
        clauses.clauses();
    }

    @Then("^FinanceManager approves the basket$")
    public void FinanceManager_approves_the_basket() throws Throwable {
        connectivityDrop1ApprovalsAndBasketSync.approval(basketLink);
    }

    @Then("^SalesREP sync the basket$")
    public void SalesREP_sync_the_basket() throws Throwable {

    }
    @Then("^User logs in as SalesREP to change the opportunity satge as Awareness of needs inorder to kick off the Sales governance process$")
    public void user_logs_in_as_SalesREP_to_change_the_opportunity_satge_as_Awareness_of_needs_inorder_to_kick_off_the_Sales_governance_process() throws InterruptedException, IOException {
        SalesGovernance.kickoff(oppLink,supportType);
    }
    @Then("^SalesREP feeds in the details in Agreement to support stage$")
    public void salesrep_feeds_in_the_details_in_Agreement_to_support_stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.agreementToSupportAction(oppLink,supportType);
    }
    @Then("^User logins as QgateAdmin to approve Agreement to support stage$")
    public void user_logins_as_QgateAdmin_to_approve_Agreement_to_support_stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.approvalAgreementToSupportAction(oppLink,supportType);
    }
    @Then("^User logins as SalesREP to feed in the details in Solution and Delivery QA Stage$")
    public void user_logins_as_SalesREP_to_feed_in_the_details_in_Solution_and_Delivery_QA_Stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.solutionAndDeliveryQA(oppLink,supportType);
    }
    @Then("^User logins as QgateAdmin to approve Solution and Delivery QA Stage$")
    public void user_logins_as_QgateAdmin_to_approve_Solution_and_Delivery_QA_Stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.approvalSolutionAndDeliveryQA(oppLink,supportType);
    }
    @Then("^User logins as SalesREP to feed in the data in Agreement to Propose stage with the following details \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
    public void user_logins_as_SalesREP_to_feed_in_the_data_in_Agreement_to_Propose_stage_with_the_following_details(String Submission_type, String Contract_terms, String Service_levels) throws InterruptedException, IOException {
        SalesGovernance.financeApprovalAgreementToPropose(oppLink,TCV2,supportType);
        SalesGovernance.agreementToPropose(oppLink,Submission_type, Contract_terms, Service_levels,TCV2, supportType);
    }
    @Then("^User logins as QgateAdmin to approve Agreement to propose stage$")
    public void user_logins_as_QgateAdmin_to_approve_Agreement_to_propose_stage() throws InterruptedException, IOException {
        SalesGovernance.approvalAgreementToPropose(oppLink,TCV2);
    }
    @Then("^User logins as SalesREP to change the Opportunity stage as decision$")
    public void user_logins_as_SalesREP_to_change_the_Opportunity_stage_as_decision() throws InterruptedException{
        SalesGovernance.Opp_stage_Decision_action(oppLink,TCV2,supportType);
    }
    @Then("^User logins as SalesREP to feed in thr details in Agreement to sign stage$")
    public void user_logins_as_SalesREP_to_feed_in_thr_details_in_Agreement_to_sign_stage() throws InterruptedException, IOException {
        SalesGovernance.Agreement_to_Sign_action(oppLink,TCV2);
    }
    @Then("^User logins as QgateAdmin to approve Agreement to sign stage$")
    public void user_logins_as_QgateAdmin_to_approve_Agreement_to_sign_stage() throws InterruptedException, IOException {
        SalesGovernance.Approval_Agreement_to_Sign_action(oppLink,TCV2);
    }
    @Then("^User logins as SalesREP to feed in the details in Acceptance into delivery stage$")
    public void user_logins_as_SalesREP_to_feed_in_the_details_in_Acceptance_into_delivery_stage() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.acceptanceToDelivery(oppLink,supportType,TCV2);
    }
    @Then("^User logins as QgateAdmin to approve Acceptance into delivery stage$")
    public void user_logins_as_QgateAdmin_to_approve_Acceptance_into_delivery_stage() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.approvalAcceptanceToDelivery(oppLink,TCV2,supportType);
    }
    @Then("^User logins as SalesREP to feed in the details in Acceptance into service stage$")
    public void user_logins_as_SalesREP_to_feed_in_the_details_in_Acceptance_into_service_stage() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.acceptanceToService(oppLink,supportType,TCV2);
    }
    @Then("^User logins as QgateAdmin to approve Acceptance into service stage$")
    public void user_logins_as_QgateAdmin_to_approve_Acceptance_into_service_stage() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.approvalAcceptanceToService(oppLink,TCV2,supportType);
        output.OutPut(DealType, supportType, basketLink);
    }

}
