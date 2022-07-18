package com.nttdata.testframework.salesforce.cucumber.glue.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.pagefactory.salesforce.*;
import io.cucumber.datatable.DataTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.io.IOException;

public class bigBusinessSITenvironment {
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
    profitAndLossReport ProfitLoss;
    @Autowired
    discount Discountpage;
    @Autowired
    clauses Clausespage;
    @Autowired
    o2ProductDetails O2productdetail;
    @Autowired
    callmixFP callmix;
    @Autowired
    connectivityDrop1ApprovalsAndBasketSync ApprovalandSync;

    String X;
    String transformation_fund, term, total_number_of_SIMs;

    public bigBusinessSITenvironment(CustomWebDriver customWebDriver) {
        this.driver = customWebDriver.getWebDriver();
    }

    @Given("^User logins in SIT environment as Enterprise Sales representative for DDP$")
    public void user_Logins_In_SIT_Environment_As_Enterprise_Sales_Representative_For_DDP() throws Throwable {
        try {
            Loginpage.login();
            Loginpage.profileLoginSIT(supportType);
        }catch(Exception e)
        {
            logger.error(e.toString());
        }
    }

    @Then("^Sales rep for DDP creates an opportunity with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void sales_Rep_For_DDP_Creates_An_Opportunity_With_The_Following_Details(String Account_Name, String Deal_Type, String Type_of_support) throws Throwable {
        String[] arr=opportunityPage.opportunityCreationSIT( Account_Name, Deal_Type, Type_of_support);
        DealType=arr[1];
        supportType=arr[0];
        System.out.println("DealType: " +DealType);
        System.out.println("supportType: " +supportType);
        oppLink= driver.getCurrentUrl();
    }

    @Then("Sales rep adds the Enterprise product details for all DDP products")
    public void sales_Rep_Adds_The_Enterprise_Product_Details_For_All_DDP_Products(DataTable table) throws Throwable {
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {
            O2productdetail.productdetailsMobileSIT(list.get(i).get("Product_Category"), list.get(i).get("Product"), list.get(i).get("Product_Detail"), list.get(i).get("Mobile_Tariffs"), list.get(i).get("Mobile_Services"), list.get(i).get("Quans"), list.get(i).get("LOC"), list.get(i).get("Billed_Upfront"), list.get(i).get("Revenue_per_month"), list.get(i).get("Business_Type"));
            driver.get(oppLink);
        }
    }

    @Then("^Sales rep creates a product basket to add DDP products$")
    public void sales_Rep_Creates_A_Product_Basket_To_Add_DDP_Products() throws InterruptedException {
        Productbasket.productBasket(oppLink);
        basketLink= driver.getCurrentUrl();
        System.out.println("Opportunity Link: " +basketLink);

        Productbasket.addproduct();
    }

    @Then("^Sales rep configures all DDP products in the basket with the following details\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void salesRepConfiguresAllDDPProductsInTheBasketWithTheFollowingDetails(String NoOfConnections,String ProvisionalTarrif,String BillSpendCap,String PrivateAPN,String MobexRequired,String MobexService,String Type,String VoiceType, String Term, String DataType, String DataAllowance, String CappedOrUncapped, String AggregatedData) throws InterruptedException, IOException {
        DDPConfig.BBConfig_SIT(NoOfConnections, ProvisionalTarrif, BillSpendCap, PrivateAPN, MobexRequired, MobexService, Type, VoiceType, Term, DataType, DataAllowance, CappedOrUncapped, AggregatedData);
        X="0";
        transformation_fund= "No";
        term=Term;
        total_number_of_SIMs= NoOfConnections;
    }




    @Then("^Sales representative adds the required Call mix details$")
    public void Sales_representative_adds_the_required_Call_mix_details() throws Throwable {
        callmix.callmixFP();
    }

    @Then("^Sales rep updates Clauses section with the required details\"([^\"]*)\"$")
    public void sales_rep_updates_Clauses_section_with_the_required_details(String TF) throws InterruptedException, IOException {
        Clausespage.clausesSIT(TF,X,oppLink,transformation_fund,term,total_number_of_SIMs);
    }

    @Then("^Sales rep gives discount under discount section$")
    public void sales_rep_gives_discount_under_discount_section() throws InterruptedException, IOException {
        Discountpage.discountOpenCloseSIT();
    }

    @Then("^Sales rep verifies Profit and Loss section for the configured FP products$")
    public void sales_rep_verifies_Profit_and_Loss_section_for_the_configured_FP_products() throws InterruptedException, IOException {
        ProfitLoss.profitLoss();
    }

    @Then("Sales rep validates the basket page")
    public void salesRepValidatesTheBasketPage() throws InterruptedException {
        BasketPage.CaptureValues();
    }

    @Then("^Sales rep submits the basket for approval and Finance approves the basket and basket is synced with the opportunity$")
    public void sales_rep_submits_the_basket_for_approval_and_Finance_approves_the_basket_and_basket_is_synced_with_the_opportunity() throws InterruptedException, IOException, InvalidFormatException {
        Workbook wb = null;

        ApprovalandSync.FPApprovalSIT();

        //System.out.println("Basket Link: " +basketLink);
       /* File fExcel = new File("C:\\Users\\sumans\\Desktop\\newone.xls");
       // WritableWorkbook writableBook = Workbook.createWorkbook(fExcel);
       // XSSFWorkbook writableBook = Workbook.createWorkbook(fExcel);
        wb = new XSSFWorkbook();
       // wb.createSheet("Data");
        wb.createSheet("Saurabh");
        WritableSheet writableSheet = writableBook.getSheet(0);

        Label data1 = new Label(j, 1, basketLink);
        writableSheet.addCell(data1);

        writableBook.write();
        writableBook.close();*/
    }

}
