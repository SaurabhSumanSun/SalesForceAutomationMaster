package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.pagefactory.salesforce.*;
import com.nttdata.testframework.utils.Configuration;
//import cucumber.api.DataTable;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class enterpriseIndustrialistionUnifiedCommunicationAndGamma {
    static Logger logger = LogManager.getLogger(enterpriseIndustrialistionUnifiedCommunicationAndGamma.class);
    public static String TCV1;
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
    o2ProductDetails O2productdetail;
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
    hostedMIAction hostedMIaction;
    @Autowired
    callmixHostedMI callmixHostedMI;
    @Autowired
    salesGovernance SalesGovernance;
    @Autowired
    output output;
    @Autowired
    SalesGovernanceSupportAndSolution SalesGovernanceSupandSol;
    @Autowired
    salesGovernanceDeliveryAndService SalesGovernanceDeliveryAndService;
    public enterpriseIndustrialistionUnifiedCommunicationAndGamma(CustomWebDriver customWebDriver) {
        this.driver = customWebDriver.getWebDriver();
    }
    @Given("^User logins as Sales representative$")
    public void User_logins_as_Sales_representative() throws Throwable {
        try {

            loginPage.login();
            loginPage.profileLogin(supportType);
        }catch(Exception e){
            logger.error(e.toString());
        }

    }

  @Then("^Sales representative creates an opportunity with the following details and saves it \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_representative_creates_an_opportunity_with_the_following_details_and_saves_it(String Account_Name, String Deal_Type, String Type_of_support) throws Throwable {
      String[] arr=opportunityPage.opportunityCreation ( Account_Name, Deal_Type, Type_of_support );
      DealType=arr[0];
      supportType=arr[1];
      oppLink= driver.getCurrentUrl();
    }

     @Then("^Sales rep adds an retail product with required details$")
    public void sales_rep_adds_an_retail_product_with_required_details(DataTable table) throws Throwable {
        //List<Map<String, String>> list = table.asMaps(String.class, String.class);
         List<Map<String, String>> list = table.asMaps(String.class, String.class);
         for (int i = 0; i < list.size(); i++) {
             TCV1 = O2productdetail.productdetails(list.get(i).get("Product_Category"), list.get(i).get("Product"), list.get(i).get("Product_Detail"), list.get(i).get("Quans"), list.get(i).get("LOC"), list.get(i).get("Billed_Upfront"), list.get(i).get("Revenue_per_month"), list.get(i).get("Business_Type"));
             driver.get(oppLink);
             System.out.println("O2");
         }
        TCV1=TCV1.replaceAll(",", "");
        TCV2=new BigDecimal(TCV1).intValue();
    }

     @Then("^Sales representative creates a product basket and adds an Enterprise mobile offer$")
    public void sales_representative_creates_a_product_basket_and_adds_an_Enterprise_mobile_offer() throws Throwable {
        newProductBasket.productBasket(oppLink);

        newProductBasket.addproduct();
        basketLink= driver.getCurrentUrl();
        System.out.println("Basket Link=" +basketLink);
    }

    @Then("^Sales representative adds hostedMICloud mobileRecording inBoundNumbersTalkTalk into basket and edits and configures hostedMICloud\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void sales_representative_adds_hostedMICloud_mobileRecording_inBoundNumbersTalkTalk_into_basket_and_edits_and_configures_hostedMICloud(String hostedTerm, String totalNumOfSites, String ServiceTypes, String SIPConfig, String selectHandsetType, String HandsetQty, String ThirdPartyType, String survivableType, String SurveyQty, String numPrtType, String TotalnumPortQty, String O2numType, String qtynumType, String macdReq, String totalmacdQty) throws Throwable {
          hostedMIaction.addProducts();
        hostedMIaction.hostedMIconfig(hostedTerm,totalNumOfSites,ServiceTypes,SIPConfig,selectHandsetType,HandsetQty,ThirdPartyType,survivableType,SurveyQty,numPrtType,TotalnumPortQty,O2numType,qtynumType,macdReq,totalmacdQty);

    }
    @Then("^Sales representative edits and configures mobileRecording and inboundNumberTalkTalk\"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
    public void sales_representative_edits_and_configures_mobileRecording_and_inboundNumberTalkTalk(String MobileRecording_Term, String MobRcordingsolution, String SFTP_Transmission, String SMS2Email_Transmission, String inbound_Term, String Product_Type, String MAC, String DiscoveryAndDocumentDays, String BuildAndTestDays, String PortDays, String PlatformDevelopmentDaysDays, String InboundNumberFeature) throws Throwable {
        hostedMIaction.configMobRecordingAndInboundNum(MobileRecording_Term,MobRcordingsolution,SFTP_Transmission,SMS2Email_Transmission,inbound_Term,Product_Type,MAC, DiscoveryAndDocumentDays,BuildAndTestDays,PortDays,PlatformDevelopmentDaysDays,InboundNumberFeature);
    }

    @Then("^Sales representative configures the Call mix details as required details$")
    public void Sales_representative_configures_the_Call_mix_details_as_required_details() throws Throwable {
        callmixHostedMI.callmix();
    }
    @Then("^Sales representative views the Profit and Loss report for the configured mobile offer$")
    public void Sales_representative_views_the_Profit_and_Loss_report_for_the_configured_mobile_offer() throws Throwable {
        profitAndLossReport.profitLoss();
    }
    @Then("^Sales representative provides the required discount for the opted configuration$")
    public void Sales_representative_provides_the_required_discount_for_the_opted_configuration() throws Throwable {
        discount.discounts();
    }
    @Then("^Sales representative visits the Clauses section for further details$")
    public void Sales_representative_visits_the_Clauses_section_for_further_details() throws Throwable {
        clauses.clauses();
    }

    @Then("^Finance Manager approves the basket for the approval criteria$")
    public void Finance_Manager_approves_the_basket_for_the_approval_criteria() throws Throwable {
        connectivityDrop1ApprovalsAndBasketSync.approvalHostedMI(basketLink);
        //connectivityDrop1ApprovalsAndBasketSync.approval(basketLink);
        connectivityDrop1ApprovalsAndBasketSync.UCApproval(basketLink);
    }
    @Then("^User logs in as Sales representative to change the opportunity stage as Awareness of needs inorder to kick off the Sales governance process$")
    public void user_logs_in_as_Sales_representative_to_change_the_opportunity_stage_as_Awareness_of_needs_inorder_to_kick_off_the_Sales_governance_process() throws InterruptedException, IOException {
        SalesGovernance.kickoff(oppLink,supportType);
    }
    @Then("^Sales representative feeds in the details in Agreement to support stage$")
    public void sales_representative_feeds_in_the_details_in_Agreement_to_support_stage() throws InterruptedException, IOException {
        SalesGovernanceSupandSol.agreementToSupportAction(oppLink,supportType);
    }
    @Then("^User logins as Qgate Administrator to approve Agreement to support stage$")
    public void user_logins_as_Qgate_Administrator_to_approve_Agreement_to_support_stage() throws InterruptedException, IOException {
        SalesGovernanceSupandSol.approvalAgreementToSupportAction(oppLink,supportType);
    }
    @Then("^User logins as Sales representative to feed in the details in Solution and Delivery QA Stage$")
    public void user_logins_as_Sales_representative_to_feed_in_the_details_in_Solution_and_Delivery_QA_Stage() throws InterruptedException, IOException {
        SalesGovernanceSupandSol.solutionAndDeliveryQA(oppLink,supportType);
    }
    @Then("^User logins as Qgate Administrator to approve Solution and Delivery QA Stage$")
    public void user_logins_as_Qgate_Administrator_to_approve_Solution_and_Delivery_QA_Stage() throws InterruptedException, IOException {
        SalesGovernanceSupandSol.approvalSolutionAndDeliveryQA(oppLink,supportType);
    }
    @Then("^User logins as Sales representative to feed in the data in Agreement to Propose stage with the following details\"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
    public void user_logins_as_Sales_representative_to_feed_in_the_data_in_Agreement_to_Propose_stage_with_the_following_details(String Submission_type, String Contract_terms, String Service_levels) throws InterruptedException, IOException {
        SalesGovernance.agreementToPropose(oppLink,Submission_type, Contract_terms, Service_levels,TCV2, supportType);
    }
    @Then("^User logins as Qgate Administrator to approve Agreement to propose stage$")
    public void user_logins_as_Qgate_Administrator_to_approve_Agreement_to_propose_stage() throws InterruptedException, IOException {
        SalesGovernance.financeApprovalAgreementToPropose(oppLink,TCV2,supportType);
        SalesGovernance.approvalAgreementToPropose(oppLink,TCV2);
    }
    @Then("^User logins as Sales representative to change the Opportunity stage as decision$")
    public void user_logins_as_Sales_representative_to_change_the_Opportunity_stage_as_decision() throws InterruptedException, IOException {
        SalesGovernance.Opp_stage_Decision_action(oppLink,TCV2,supportType);
    }

    @Then("^User logins as Sales representative to feed in thr details in Agreement to sign stage$")
    public void user_logins_as_Sales_representative_to_feed_in_thr_details_in_Agreement_to_sign_stage() throws InterruptedException, IOException {
        SalesGovernance.Agreement_to_Sign_action(oppLink,TCV2);
    }
    @Then("^User logins as Qgate Administrator to approve Agreement to sign stage$")
    public void user_logins_as_Qgate_Administrator_to_approve_Agreement_to_sign_stage() throws InterruptedException, IOException {
        SalesGovernance.Approval_Agreement_to_Sign_action(oppLink,TCV2);
        output.OutPut(DealType,supportType,basketLink);
    }

    @Then("^User logins as Sales representative to feed in the details in Acceptance into delivery stage$")
    public void user_logins_as_Sales_representative_to_feed_in_the_details_in_Acceptance_into_delivery_stage() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.acceptanceToDelivery(oppLink,supportType,TCV2);
    }
    @Then("^User logins as Qgate Administrator to approve Acceptance into delivery stage$")
    public void user_logins_as_Qgate_Administrator_to_approve_Acceptance_into_delivery_stage() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.approvalAcceptanceToDelivery(oppLink,TCV2,supportType);
    }
    @Then("^User logins as Sales representative to feed in the details in Acceptance into service stage\\.$")
    public void user_logins_as_Sales_representative_to_feed_in_the_details_in_Acceptance_into_service_stage() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.acceptanceToService(oppLink,supportType,TCV2);
    }
    @Then("^User logins as Qgate Administrator to approve Acceptance into service stage$")
    public void user_logins_as_Qgate_Administrator_to_approve_Acceptance_into_service_stage() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.approvalAcceptanceToService(oppLink,TCV2,supportType);
        output.OutPut(DealType, supportType, basketLink);
    }
}
