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
import org.testng.Reporter;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class guidedPricingGPT {

    static Logger logger = LogManager.getLogger(guidedPricingGPT.class);

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


    public guidedPricingGPT(CustomWebDriver customWebDriver) {
        this.driver = customWebDriver.getWebDriver();
    }


        @Given("^User logins as Enterprise Sales representative for GPT$")
        public void user_logins_as_Enterprise_Sales_representative() throws Throwable {
            try {
                Loginpage.login();
                Loginpage.profileLoginGPT(supportType);
            } catch (Exception e) {
                logger.error(e.toString());
            }
        }

        @Then("^Sales rep for GPT creates an opportunity with the following details \"([^\"]*)\"\"([^\"]*)\" \"([^\"]*)\"$")
        public void sales_rep_for_DPT_creates_an_opportunity_with_the_following_details(String Account_Name, String Deal_Type, String Type_of_support) throws Throwable {
            String[] arr = opportunityPage.opportunityCreation(Account_Name, Deal_Type, Type_of_support);
            DealType = arr[1];
            supportType = arr[0];
            System.out.println("DealType" + DealType);
            System.out.println("supportType" + supportType);
            oppLink = driver.getCurrentUrl();
    }


    @Then("^Sales rep for GPT adds the Enterprise product details for all DPT products$")
    public void sales_rep_adds_the_Enterprise_product_details_for_all_DPT_products(DataTable table) throws Throwable {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {
            O2productdetail.productdetailsMobile(list.get(i).get("Product_Category"), list.get(i).get("Product"), list.get(i).get("Product_Detail"), list.get(i).get("Mobile_Tariffs"), list.get(i).get("Mobile_Services"), list.get(i).get("Quans"), list.get(i).get("LOC"), list.get(i).get("Billed_Upfront"), list.get(i).get("Revenue_per_month"), list.get(i).get("Business_Type"));
            driver.get(oppLink);
        }

    }

    @Then("^Sales rep for GPT creates a product basket to add GPT products$")
    public void sales_rep_creates_a_product_basket_to_add_DPT_products() throws InterruptedException {
        Productbasket.productBasket(oppLink);
        Productbasket.addproduct();
        basketLink = driver.getCurrentUrl();
        Reporter.log("basket Link=" +basketLink);
    }


        @Then("^Sales rep for GPT configures GPT product one in the basket with the following details\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
        public void sales_rep_configures_GPT_product_one_in_the_basket_with_the_following_details(String NoOfConnections1, String ProvisionalTarrif1, String BillSpendCap1, String PrivateAPN1, String MobexRequired1, String MobexService1, String Type1, String VoiceType1, String Term1, String DataType1, String DataAllowance1, String CappedOrUncapped1, String AggregatedData1) throws InterruptedException, IOException
        {
            DDPConfig.BBConfig(NoOfConnections1, ProvisionalTarrif1, BillSpendCap1, PrivateAPN1, MobexRequired1, MobexService1, Type1, VoiceType1, Term1, DataType1, DataAllowance1, CappedOrUncapped1, AggregatedData1);
            term= Integer.parseInt(Term1);
        }

        @Then("^Sales rep for GPT configures GPT product two in the basket with the following details\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
        public void sales_rep_configures_GPT_product_two_in_the_basket_with_the_following_details(String NoOfConnections2, String ProvisionalTarrif2, String BillSpendCap2, String PrivateAPN2, String MobexRequired2, String MobexService2, String Type2, String VoiceType2, String DataType2, String DataAllowance2, String CappedOrUncapped2, String AggregatedData2) throws InterruptedException, IOException
        {
            DDPConfig.BBConfigSecond(NoOfConnections2, ProvisionalTarrif2, BillSpendCap2, PrivateAPN2, MobexRequired2, MobexService2, Type2, VoiceType2, DataType2, DataAllowance2, CappedOrUncapped2, AggregatedData2);

        }
        @Then("^Sales rep for GPT configures GPT product three in the basket with the following details\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
                public void sales_rep_configures_GPT_product_three_in_the_basket_with_the_following_details(String NoOfConnections3, String ProvisionalTarrif3, String BillSpendCap3, String PrivateAPN3, String MobexRequired3, String MobexService3, String Type3, String VoiceType3, String DataType3, String DataAllowance3, String CappedOrUncapped3, String AggregatedData3) throws InterruptedException, IOException
        {
            DDPConfig.BBConfigThird(NoOfConnections3, ProvisionalTarrif3, BillSpendCap3, PrivateAPN3, MobexRequired3, MobexService3, Type3, VoiceType3, DataType3, DataAllowance3, CappedOrUncapped3, AggregatedData3);
            DDPConfig.RunCompatiblity();
        }

    @Then("^Sales representative for GPT configures Resign details\"([^\"]*)\" \"([^\"]*)\"$")
    public void Sales_representative_configures_Resign_details(String Connections_Resign, String Revenue_Resign) throws Throwable {
        if (DealType.equalsIgnoreCase("Resign")) {
            AddResignDetails.addResignDetails(Connections_Resign, Revenue_Resign);
        }
    }


    @Then("^Sales representative for GPT configures Call mix details\"([^\"]*)\"$")
    public void Sales_representative_configures_Call_mix_details(String International_and_Roaming_Rates) throws Throwable {
        if (DealType.equalsIgnoreCase("Resign")) {
            callmix.callmixResign();
        } else {
            callmix.callmixGPT(International_and_Roaming_Rates);
        }
    }

    @Then("^Sales rep for GPT visits Clauses section to update the required details\"([^\"]*)\"$")
    public void sales_rep_for_DPT_visits_Clauses_section_to_update_the_required_details(String TF) throws InterruptedException, IOException {
        Clausespage.clausesPreProd(TF, oppLink, term);
        Clausespage.captureBilledRevenue();
    }

    @Then("^Sales rep for GPT captures the Voice RRP and Data RRP$")
    public void sales_rep_for_GPT_captures_the_Voice_RRP_and_Data_RRP() throws InterruptedException, IOException {
        Discountpage.captureRRP();
    }


    @Then("^Sales rep for GPT verifies the discount section\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_for_DPT_verifies_the_discount_section(String Voice_Discount1,String Voice_Discount2,String Voice_Discount3,String Data_Discount1,String Data_Discount2,String Data_Discount3, String Sharer_Fee3) throws InterruptedException, IOException {
        Discountpage.discountGPT(Voice_Discount1, Voice_Discount2, Voice_Discount3, Data_Discount1, Data_Discount2, Data_Discount3, Sharer_Fee3);
    }

    @Then("^Sales rep for GPT views the Profit and Loss section for the configured GPT products$")
    public void sales_rep_views_the_Profit_and_Loss_section_for_the_configured_DPT_products() throws InterruptedException, IOException {
        ProfitLoss.profitLoss();
    }

    @Then("^Sales rep for GPT validates the basket page$")
    public void sales_rep_for_DPT_validates_the_BasketPage() throws InterruptedException {
        BasketPage.CaptureValues();
        if (DealType.equalsIgnoreCase("Resign")) {
            BasketPage.CaptureResignDetails();
        }
    }

    @Then("^Sales rep for GPT submits basket for approval and Financial approvers for GPT approve the basket and the basket is synced with the opportunity$")
    public void Sales_rep_for_DPT_submits_basket_for_approval_and_financial_approvers_for_DPT__approve_the_basket_and_the_basket_is_synced_with_the_opportunity() throws InterruptedException, IOException {
        ApprovalandSync.GPTApproval(basketLink);
    }

    @Then("^User logs in as Sales Rep to change the opportunity stage as Awareness of needs inorder to kick off the Sales governance process for GPT products$")
    public void user_logs_in_as_Sales_Rep_to_change_the_opportunity_stage_as_Awareness_of_needs_inorder_to_kick_off_the_Sales_governance_process_for_DDP_products() throws InterruptedException, IOException {
        SalesGovernance.kickoff(oppLink,supportType);
    }
    @Then("^Sales Rep for GPT feeds in the details in Agreement to support stage$")
    public void sales_Rep_for_DDP_feeds_in_the_details_in_Agreement_to_support_stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.agreementToSupportAction(oppLink,supportType);
    }

    @Then("^User logins as Qgate Admin to approve Agreement to support stage for GPT$")
    public void user_logins_as_Qgate_Admin_to_approve_Agreement_to_support_stage_for_DDP() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.approvalAgreementToSupportAction(oppLink,supportType);
    }

    @Then("^User logins as Qgate admin to approve Solution and Delivery of GPT QA Stage$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_details_in_Solution_and_Delivery_DDP_QA_Stage() throws InterruptedException, IOException {
        salesGovernanceSupportAndSolution.solutionAndDeliveryQA(oppLink,supportType);
    }
    /*Contract_terms
    @Then("^User logins as Qgate admin to approve Solution and Delivery in DDP QA Stage$")
    public void user_logins_as_Qgate_admin_to_approve_Solution_and_Delivery_in_DDP_QA_Stage() throws InterruptedException, IOException {
     salesGovernanceSupportAndSolution.approvalSolutionAndDeliveryQA(oppLink,supportType);
    }*/

    @Then("^User logins as Sales Rep to feed in the data in Agreement to Propose stage with the following details for GPT products \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_data_in_Agreement_to_Propose_stage_with_the_following_details_for_DDP_products(String Submission_type, String Contract_terms, String Service_levels) throws InterruptedException, IOException {
        SalesGovernance.agreementToPropose(oppLink,Submission_type, Contract_terms, Service_levels,TCV2, supportType);
        SalesGovernance.CaptureValues();
    }

    @Then("^User logins as Qgate Admin to approve Agreement to propose stage for GPT products$")
    public void user_logins_as_Qgate_Admin_to_approve_Agreement_to_propose_stage_for_DDP_products() throws InterruptedException, IOException {
        SalesGovernance.financeApprovalAgreementToPropose(oppLink,TCV2,supportType);
        SalesGovernance.approvalAgreementToPropose(oppLink,TCV2);

    }

    @Then("^User logins as Sales Rep to change the Opportunity stage as decision for configured GPT products$")
    public void user_logins_as_Sales_Rep_to_change_the_Opportunity_stage_as_decision_for_configured_DDP_products() throws InterruptedException, IOException {
        SalesGovernance.Opp_stage_Decision_action(oppLink,TCV2,supportType);

    }

    @Then("^User logins as Sales Rep to feed in thr details in Agreement to sign stage for GPT products$")
    public void user_logins_as_Sales_Rep_to_feed_in_thr_details_in_Agreement_to_sign_stage_for_DDP_products() throws InterruptedException, IOException {
        SalesGovernance.Agreement_to_Sign_action(oppLink,TCV2);
    }

    @Then("^User logins as Qgate admin to approve Agreement to sign stage for GPT products$")
    public void user_logins_as_Qgate_admin_to_approve_Agreement_to_sign_stage_for_DDP_products() throws InterruptedException, IOException {
        SalesGovernance.Approval_Agreement_to_Sign_action(oppLink,TCV2);
        output.OutPut(DealType,supportType,basketLink);
    }
    @Then("^User logins as Sales Rep to feed in the details in Acceptance into delivery stage for GPT products$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_details_in_Acceptance_into_delivery_stage_for_DDP_products() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.acceptanceToDelivery(oppLink,supportType,TCV2);
    }

    @Then("^User logins as Qgate Admin to approve Acceptance into delivery stage for GPT products$")
    public void user_logins_as_Qgate_Admin_to_approve_Acceptance_into_delivery_stage_for_DDP_products() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.approvalAcceptanceToDelivery(oppLink,TCV2,supportType);
    }

    @Then("^User logins as Sales Rep to feed in the details in Acceptance into service stage for GPT products$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_details_in_Acceptance_into_service_stage_for_DDP_products() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.acceptanceToService(oppLink,supportType,TCV2);
    }

    @Then("^User logins as Qgate Admin to approve Acceptance into service stage for GPT products$")
    public void user_logins_as_Qgate_Admin_to_approve_Acceptance_into_service_stage_for_DDP_products() throws InterruptedException, IOException {
        SalesGovernanceDeliveryAndService.approvalAcceptanceToService(oppLink,TCV2,supportType);
        output.OutPut(DealType, supportType, basketLink);
    }

}
