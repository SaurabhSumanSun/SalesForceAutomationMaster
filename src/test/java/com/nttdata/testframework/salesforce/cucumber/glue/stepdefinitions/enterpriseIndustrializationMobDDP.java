package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;


import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.pagefactory.salesforce.*;
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

public class enterpriseIndustrializationMobDDP {

    static Logger logger = LogManager.getLogger(enterpriseIndustrializationMobDDP.class);

    public WebDriver driver;
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


    public enterpriseIndustrializationMobDDP(CustomWebDriver customWebDriver) {
        this.driver = customWebDriver.getWebDriver();
    }
    @Given("^User logins as Enterprise Sales representative for DDP$")
    public void user_logins_as_Enterprise_Sales_representative() throws Throwable {
        try {
            Loginpage.login();
            Loginpage.profileLogin(supportType);
        }catch(Exception e)
        {
            logger.error(e.toString());
        }
    }
    @Then("^Sales rep for DDP creates an opportunity with the following details \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_for_DDP_creates_an_opportunity_with_the_following_details(String Deal_Type, String Type_of_support) throws Throwable {
        String[] arr=opportunityPage.opportunityCreationOne(Deal_Type,Type_of_support);
        DealType=arr[1];
        supportType=arr[0];
        System.out.println("DealType" +DealType);
        System.out.println("supportType" +supportType);
        oppLink= driver.getCurrentUrl();
    }
    @Then("^Sales rep for DDP adds the Enterprise product details for all DDP products$")
    public void sales_rep_adds_the_Enterprise_product_details_for_all_DDP_products(DataTable table) throws Throwable {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {
            O2productdetail.productdetailsMobile(list.get(i).get("Product_Category"), list.get(i).get("Product"), list.get(i).get("Product_Detail"), list.get(i).get("Mobile_Tariffs"), list.get(i).get("Mobile_Services"), list.get(i).get("Quans"), list.get(i).get("LOC"), list.get(i).get("Billed_Upfront"), list.get(i).get("Revenue_per_month"), list.get(i).get("Business_Type"));
            driver.get(oppLink);
        }

    }
    @Then("^Sales rep for DDP creates a product basket to add DDP products$")
    public void sales_rep_creates_a_product_basket_to_add_DDP_products() throws InterruptedException {
        Productbasket.productBasket(oppLink);
        basketLink= driver.getCurrentUrl();
        Productbasket.addproduct();
    }
    @Then("^Sales rep for DDP configures all DDP products in the basket with the following details\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_rep_configures_all_DDP_products_in_the_basket_with_the_following_details(String NoOfConnections,String ProvisionalTarrif,String BillSpendCap,String PrivateAPN,String MobexRequired,String MobexService,String Type,String VoiceType, String Term, String DataType, String DataAllowance, String CappedOrUncapped, String AggregatedData) throws InterruptedException, IOException {
        DDPConfig.BBConfig(NoOfConnections, ProvisionalTarrif, BillSpendCap, PrivateAPN, MobexRequired, MobexService, Type, VoiceType, Term, DataType, DataAllowance, CappedOrUncapped, AggregatedData);
        DDPConfig.RunCompatiblity();
    }
/*
    @Then("^Sales representative configures Resign details\"([^\"]*)\" \"([^\"]*)\"$")
    public void Sales_representative_configures_Resign_details(String Connections_Resign, String Revenue_Resign) throws Throwable {
        if(DealType.equalsIgnoreCase("Resign"))
        {
            AddResignDetails.addResignDetails(Connections_Resign, Revenue_Resign);
        }
    }
*/
    @Then("^Sales representative for DDP configures Call mix details$")
    public void Sales_representative_configures_Call_mix_details() throws Throwable {
        if(DealType.equalsIgnoreCase("Resign"))
        {
            callmix.callmixResign();
        }
        else {
            callmix.callmix();
        }
    }

    @Then("^Sales rep for DDP visits Clauses section$")
    public void sales_rep_for_DDP_visits_Clauses_section() throws InterruptedException, IOException {
        Clausespage.clauses();
    }
/*
    @Then("^Sales rep for DDP visits Clauses section to update the required details\"([^\"]*)\"$")
    public void sales_rep_for_DDP_visits_Clauses_section_to_update_the_required_details(String TF) throws InterruptedException, IOException {
        Clausespage.clausesPreProd(TF,oppLink);
    }
*/
    @Then("^Sales rep for DDP provides required discount under the discount section$")
    public void sales_rep_for_DDP_provides_required_discount_under_the_discount_section() throws InterruptedException, IOException {
        Discountpage.discounts();
    }
/*
    @Then("^Sales rep for DDP verifies the discount section$")
    public void sales_rep_for_DDP_verifies_the_discount_section() throws InterruptedException, IOException {
        Discountpage.discountOpenClose();
    }
*/
   @Then("^Sales rep for DDP views the Profit and Loss section for the configured DDP products$")
   public void sales_rep_views_the_Profit_and_Loss_section_for_the_configured_DDP_products() throws InterruptedException, IOException {
       ProfitLoss.profitLoss();
   }
/*
    @Then("^Sales rep for DDP validates the basket page$")
    public void sales_rep_for_DDP_validates_the_BasketPage() throws InterruptedException {
        BasketPage.CaptureValues();
        if(DealType.equalsIgnoreCase("Resign"))
        {
            BasketPage.CaptureResignDetails();
        }
    }

    @Then("^Sales rep for DDP submits basket for approval and Financial approvers for DDP approve the basket and the basket is synced with the opportunity$")
    public void Sales_rep_for_DDP_submits_basket_for_approval_and_financial_approvers_for_DDP__approve_the_basket_and_the_basket_is_synced_with_the_opportunity() throws InterruptedException, IOException {
        ApprovalandSync.DDPApproval(basketLink);
    }
*/

  @Then("^Sales rep submits basket for approval and Financial approvers for DDP approve the basket and the basket is synced with the opportunity$")
  public void Sales_rep_submits_basket_for_approval_and_financial_approvers_for_DDP__approve_the_basket_and_the_basket_is_synced_with_the_opportunity() throws InterruptedException, IOException {
      ApprovalandSync.FPApproval(basketLink);
  }
    @Then("^User logs in as Sales Rep to change the opportunity stage as Awareness of needs inorder to kick off the Sales governance process for DDP products$")
    public void user_logs_in_as_Sales_Rep_to_change_the_opportunity_stage_as_Awareness_of_needs_inorder_to_kick_off_the_Sales_governance_process_for_DDP_products() throws InterruptedException, IOException {
      SalesGovernance.kickoff(oppLink,supportType);
    }
    @Then("^Sales Rep for DDP feeds in the details in Agreement to support stage$")
    public void sales_Rep_for_DDP_feeds_in_the_details_in_Agreement_to_support_stage() throws InterruptedException, IOException {
      salesGovernanceSupportAndSolution.agreementToSupportAction(oppLink,supportType);
    }

    @Then("^User logins as Qgate Admin to approve Agreement to support stage for DDP$")
    public void user_logins_as_Qgate_Admin_to_approve_Agreement_to_support_stage_for_DDP() throws InterruptedException, IOException {
     salesGovernanceSupportAndSolution.approvalAgreementToSupportAction(oppLink,supportType);
    }

    @Then("^User logins as Qgate admin to approve Solution and Delivery of DDP QA Stage$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_details_in_Solution_and_Delivery_DDP_QA_Stage() throws InterruptedException, IOException {
     salesGovernanceSupportAndSolution.solutionAndDeliveryQA(oppLink,supportType);
    }
    /*Contract_terms
    @Then("^User logins as Qgate admin to approve Solution and Delivery in DDP QA Stage$")
    public void user_logins_as_Qgate_admin_to_approve_Solution_and_Delivery_in_DDP_QA_Stage() throws InterruptedException, IOException {
     salesGovernanceSupportAndSolution.approvalSolutionAndDeliveryQA(oppLink,supportType);
    }*/

    @Then("^User logins as Sales Rep to feed in the data in Agreement to Propose stage with the following details for DDP products \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_data_in_Agreement_to_Propose_stage_with_the_following_details_for_DDP_products(String Submission_type, String Contract_terms, String Service_levels) throws InterruptedException, IOException {
        SalesGovernance.agreementToPropose(oppLink,Submission_type, Contract_terms, Service_levels,TCV2, supportType);
}

    @Then("^User logins as Qgate Admin to approve Agreement to propose stage for DDP products$")
    public void user_logins_as_Qgate_Admin_to_approve_Agreement_to_propose_stage_for_DDP_products() throws InterruptedException, IOException {
    SalesGovernance.financeApprovalAgreementToPropose(oppLink,TCV2,supportType);
    SalesGovernance.approvalAgreementToPropose(oppLink,TCV2);

    }

    @Then("^User logins as Sales Rep to change the Opportunity stage as decision for configured DDP products$")
    public void user_logins_as_Sales_Rep_to_change_the_Opportunity_stage_as_decision_for_configured_DDP_products() throws InterruptedException, IOException {
        SalesGovernance.Opp_stage_Decision_action(oppLink,TCV2,supportType);

    }

    @Then("^User logins as Sales Rep to feed in thr details in Agreement to sign stage for DDP products$")
    public void user_logins_as_Sales_Rep_to_feed_in_thr_details_in_Agreement_to_sign_stage_for_DDP_products() throws InterruptedException, IOException {
        SalesGovernance.Agreement_to_Sign_action(oppLink,TCV2);
    }

    @Then("^User logins as Qgate admin to approve Agreement to sign stage for DDP products$")
    public void user_logins_as_Qgate_admin_to_approve_Agreement_to_sign_stage_for_DDP_products() throws InterruptedException, IOException {
      SalesGovernance.Approval_Agreement_to_Sign_action(oppLink,TCV2);
        output.OutPut(DealType,supportType,basketLink);
    }
    @Then("^User logins as Sales Rep to feed in the details in Acceptance into delivery stage for DDP products$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_details_in_Acceptance_into_delivery_stage_for_DDP_products() throws InterruptedException, IOException {
      SalesGovernanceDeliveryAndService.acceptanceToDelivery(oppLink,supportType,TCV2);
    }

    @Then("^User logins as Qgate Admin to approve Acceptance into delivery stage for DDP products$")
    public void user_logins_as_Qgate_Admin_to_approve_Acceptance_into_delivery_stage_for_DDP_products() throws InterruptedException, IOException {
      SalesGovernanceDeliveryAndService.approvalAcceptanceToDelivery(oppLink,TCV2,supportType);
    }

    @Then("^User logins as Sales Rep to feed in the details in Acceptance into service stage for DDP products$")
    public void user_logins_as_Sales_Rep_to_feed_in_the_details_in_Acceptance_into_service_stage_for_DDP_products() throws InterruptedException, IOException {
      SalesGovernanceDeliveryAndService.acceptanceToService(oppLink,supportType,TCV2);
    }

    @Then("^User logins as Qgate Admin to approve Acceptance into service stage for DDP products$")
    public void user_logins_as_Qgate_Admin_to_approve_Acceptance_into_service_stage_for_DDP_products() throws InterruptedException, IOException {
      SalesGovernanceDeliveryAndService.approvalAcceptanceToService(oppLink,TCV2,supportType);
        output.OutPut(DealType, supportType, basketLink);
    }


}



