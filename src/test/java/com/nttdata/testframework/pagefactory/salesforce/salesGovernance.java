package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Configuration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;

@Component
public class salesGovernance extends PageObject  {

    public salesGovernance(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"userNavLabel\"]")
    public static WebElement logout;
    @FindBy(how = How.XPATH, using = "//*[@id=\"userNav-menuItems\"]/a[5]")
    public static WebElement logoutclick;
    @FindBy(how = How.XPATH, using = "//*[@id=\"phSearchInput\"]")
    public static WebElement inputbox;
    @FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
    public static WebElement username;
    @FindBy(how = How.XPATH, using = "(//*[@id='password'])")
    public static WebElement password;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Login\"]")
    public static WebElement login;
    @FindBy(how = How.XPATH, using = "//*[@id=\"phSearchButton\"]")
    public static WebElement search;
    @FindBy(how = How.XPATH, using = "//a[text()=\"Corporate Senior Admin Support.E2E\"]")
    public static WebElement Corporate_sales_Pricing;
    @FindBy(how = How.XPATH, using = "//a[text()=\"Corporate Sales AQ,AM.E2E\"]")
    public static WebElement Corporate_Sales;
    @FindBy(how = How.XPATH, using = "//*[@id=\"moderatorMutton\"]")
    public static WebElement dropdown;
    @FindBy(how = How.XPATH, using = "//*[@id=\"USER_DETAIL\"]")
    public static WebElement userdetail;
    @FindBy(how = How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[4]")
    public static WebElement loginuser;
    @FindBy(how = How.XPATH, using = "//*[@name='newRole']")
    public static WebElement New_contact;
    @FindBy(how = How.XPATH, using = "//*[@name='role0']")
    public static WebElement COP;
    @FindBy(how = How.XPATH, using = "//*[@name='role1']")
    public static WebElement COD;
    @FindBy(how = How.XPATH, using = "//*[@name='role2']")
    public static WebElement COR;
    @FindBy(how = How.XPATH, using = "//*[@name='role3']")
    public static WebElement Billing;
    @FindBy(how = How.XPATH, using = "//*[@name='role4']")
    public static WebElement Other;
    @FindBy(how = How.XPATH, using = "//*[@id='primary0']")
    public static WebElement Primary_contact;
    @FindBy(how = How.XPATH, using = "//*[@name='save']")
    public static WebElement save_contact;

    @FindBy(how = How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[3]")
    public static WebElement Edit_Opp;
    @FindBy(how = How.XPATH, using = "//*[@id=\"opp11\"]")
    public static WebElement Stage_AON;
    @FindBy(how = How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[1]")
    public static WebElement Save_Opp;

    //Feed data in Agreement to Propose
    @FindBy(how= How.XPATH, using = "//a[@title=\"Edit - Record 1 - Agreement to Propose\"]")
    public static WebElement Edit_form;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[1]")
    public static WebElement Callrequest_date;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[3]")
    public static WebElement Delivery_start_date;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[4]")
    public static WebElement Service_start_date;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[3]")
    public static WebElement Customer_budget;
    @FindBy(how= How.XPATH, using = "(//*[@class='solutionTextArea'])")
    public static WebElement A2P_Desc;
    @FindBy(how= How.XPATH, using = "(//*[@class='OpptyEditFields'])[2]")
    public static WebElement A2P_Comp;
    @FindBy(how= How.XPATH, using = "(//*[@class='OpptyEditFields'])[4]")
    public static WebElement UK_Loc;
    @FindBy(how= How.XPATH, using = "(//*[@class='OpptyEditFields'])[5]")
    public static WebElement International_Loc;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:1:j_id211:8:j_id212:1:j_id224']")
    public static WebElement Checklist_desc;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[8]")
    public static WebElement Updated_credict_risk;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[10]")
    public static WebElement Credict_risk_comments;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[13]")
    public static WebElement Nonstandard_elements;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[14]")
    public static WebElement LOC;
    @FindBy(how= How.XPATH, using = "//*[text()='Specific Supplier Requested by the Customer']/..//td[@class='dataCol first last']/span")
    public static WebElement Specific_supplier;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[1]")
    public static WebElement Checklist_1;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[2]")
    public static WebElement Checklist_2;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[3]")
    public static WebElement Checklist_3;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[4]")
    public static  WebElement Checklist_4;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[5]")
    public static  WebElement Checklist_5;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[6]")
    public static  WebElement Checklist_6;
    @FindBy(how= How.XPATH, using = "//*[text()='Share Point Link ']/../..//input")
    public static  WebElement Share_Point_link;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:2:j_id42:field:0:j_id119:j_id202\"]")
    public static  WebElement Finance_manager;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[17]")
    public static  WebElement ICT_Digital;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[18]")
    public static  WebElement Setup_revenue;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[19]")
    public static  WebElement Annunity_revenue;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[20]")
    public static  WebElement Discount;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[21]")
    public static WebElement Contract_value;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[22]")
    public static  WebElement Setup_margin;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[23]")
    public static  WebElement Annunity_margin;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[24]")
    public static  WebElement Setup_margin_value;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[25]")
    public static  WebElement Annunity_margin_value;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[26]")
    public static  WebElement Contract_term;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:1:j_id211:10:j_id212:1:j_id224']")
    public static WebElement A2P_Customer_selection_criteria;

    //Qgate triggers
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:3:j_id42:field:1:j_id119:j_id162\"]/img")
    public static  WebElement ICT_Digital_1;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[28]")
    public static  WebElement Margin_trigger;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[30]")
    public static  WebElement Submission_type_trigger;
    @FindBy(how= How.XPATH, using = "(//*[@class='OpptyEditFields'])[17]")
    public static  WebElement Contract_terms_trigger;
    @FindBy(how= How.XPATH, using = "(//*[@class='OpptyEditFields'])[18]")
    public static  WebElement Service_levels_trigger;
    //Save form
    @FindBy(how= How.XPATH, using = "(//*[@class='btn'])[1]")
    public static  WebElement Save_form;
    @FindBy(how= How.XPATH, using = "(//*[@class='btn'])[2]")
    public static  WebElement Submit_for_finance_approval;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[2]")
    public static WebElement Submission_date;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[6]")
    public static WebElement Response_type;
    //@FindBy(how= How.XPATH, using = "//a[text()=\"Corporate Senior Admin Support.E2E\"]")
    //public static  WebElement Corporate_sales_Pricing;

    //AgreementToPropose
    @FindBy(how= How.XPATH, using = "//*[text()=\"Qgate Admin.E2E\"]")
    public static WebElement Qgate_admin;
    @FindBy(how= How.XPATH, using = "//*[@title=\"Edit - Record 1 - Agreement to Propose\"]")
    public static WebElement Edit_form_propose;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"btn\"])[1]")
    public static WebElement Save_form_propose;
    @FindBy(how= How.XPATH, using = "(//*[@value=\"Submit\"])[2]")
    public static WebElement Submit_form_propose;
    @FindBy(how= How.XPATH, using = "(//*[@class='btn'])[2]")
    public static WebElement Edit_propose;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[5]")
    public static WebElement Call_date_propose;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[19]")
    public static WebElement Call_time_propose;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:4:j_id42:field:4:j_id46:StatusField']")
    public static  WebElement Approval_status_propose;
    @FindBy(how= How.XPATH, using = "(//*[@value='Save'])[2]")
    public static  WebElement Save_form1_propose;
    @FindBy(how= How.XPATH, using = "(//*[@value=\"1\"])[1]")
    public static  WebElement Need_to_sign_propose;

    //opp stage decision action
    @FindBy(how= How.XPATH, using = "(//*[@name='edit'])[1]")
    public static WebElement Opp_edit;
    @FindBy(how= How.XPATH, using = "//*[@id=\"opp11\"]")
    public static WebElement Stage_Decision;
    @FindBy(how= How.XPATH, using = "//*[@id=\"00N9E000000kNgD\"]")
    public static WebElement Key_competitor;
    @FindBy(how= How.XPATH, using = "//*[@id=\"00N9E000000kNg4\"]")
    public static WebElement Incumbent;
    @FindBy(how= How.XPATH, using = "(//*[@class='dateFormat'])[6]")
    public static WebElement Actual_contract_date;
    @FindBy(how= How.XPATH, using = "//*[@id=\"00N9E000003HLPF\"]")
    public static WebElement Actual_contract_value;
    @FindBy(how= How.XPATH, using = "//*[@id=\"00N9E000001h92B\"]")
    public static WebElement Margin;
    @FindBy(how= How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[1]")
    public static WebElement Save_opp;
    @FindBy(how= How.XPATH, using = "//*[@value='Authorised Commercial Output']")
    public static WebElement ACO;
    @FindBy(how= How.XPATH, using = "(//*[@value='Handover Document'])[1]")
    public static WebElement Handover;
    //Agreement ToSign
    @FindBy(how= How.XPATH, using = "//*[@value=\"Create a Copy\"]")
    public static WebElement Create_copy;
    @FindBy(how= How.XPATH, using = "//*[@title=\"Edit - Record 1 - Agreement to Sign\"]")
    public static WebElement Edit_form_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[1]")
    public static WebElement Call_date_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[3]")
    public static WebElement Agreement_to_sign_TCV_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[4]")
    public static WebElement Update_customer_risk_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[5]")
    public static WebElement Risk_comments_sign ;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[6]")
    public static  WebElement LOC_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[1]")
    public static  WebElement url1_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[2]")
    public static  WebElement url2_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[3]")
    public static WebElement url3_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[4]")
    public static WebElement url4_sign;
    //Checklist
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[1]")
    public static WebElement Checklist1_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[2]")
    public static WebElement Checklist2_sign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[3]")
    public static WebElement Checklist3_sign ;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:j_id29:bottom:mySaveBtn\"]")
    public static  WebElement Save_form_sign;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:j_id29:j_id31\"]")
    public static  WebElement Submit_form_sign;
    @FindBy(how= How.XPATH, using = "//*[@title=\"Edit - Record 1 - Agreement to Sign\"]")
    public static WebElement Edit_form_apprsign;
    @FindBy(how= How.XPATH, using ="(//*[@class=\"dateFormat\"])[2]")
    public static WebElement Call_request_dat_apprsign;
    @FindBy(how= How.XPATH, using ="(//*[@class=\"OpptyEditFields\"])[9]")
    public static WebElement Call_time_apprsign;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:2:j_id42:field:4:j_id46:StatusField\"]")
    public static WebElement Approval_status_apprsign;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"btn\"])[3]")
    public static WebElement Save_Approval_apprsign;
    @FindBy(how= How.XPATH, using = "//a[text()=\"Finance Manager.E2E\"]")
    public static WebElement finance_manager;
    //Finance Approval
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[39]")
    public static WebElement Approved_contract_value;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:0:j_id42:field:5:j_id84\"]/div/table/tbody/tr/td[2]/span/span/a")
    public static WebElement Call_date;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"btn\"])[1]")
    public static  WebElement Save_approval;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:j_id29:j_id35\"]")
    public static  WebElement Submit_finance_approval;
    @FindBy(how= How.XPATH, using = "//*[contains(text(),'High Risk Deal ')]/../..//td/span/span")
    public static  WebElement High_Risk_Deal;
    @FindBy(how= How.XPATH, using = "//*[contains(text(),'Guided Pricing ')]/../..//td/span/span")
    public static  WebElement Guided_Pricing;
    @FindBy(how= How.XPATH, using = "(//*[contains(text(),'Approval Level ')])[2]/../..//td/span")
    public static  WebElement Approval_Level;

    @Autowired
    static
    Configuration configuration;

    public void kickoff(String oppLink, String supportType) throws InterruptedException, IOException {
        Thread.sleep(3000);
        clickElement(logout);
        Thread.sleep(3000);
        clickElement(logoutclick);
        Thread.sleep(2000);
        try {
            inputbox.isDisplayed();
        } catch (Exception e) {
            String url = configuration.getProperty("salesforceBaseUrl");
            String userName = configuration.getProperty("User_Name");
            String passWord = configuration.getProperty("Pass_code");
            driver.get(url);
            Thread.sleep(2000);
            sendKeys(username, userName);
            sendKeys(password, passWord);
            clickElement(login);
        }
        if ("Pricing Desk".equals(supportType)) {
            sendKeys(inputbox, "Corporate Senior Admin Support.E2E");
            clickElement(search);
            clickElement(Corporate_sales_Pricing);
        } else {
            sendKeys(inputbox, "Corporate Sales AQ,AM.E2E");
            clickElement(search);
            clickElement(Corporate_Sales);
        }
        Thread.sleep(2000);
        clickElement(dropdown);
        clickElement(userdetail);
        Thread.sleep(3000);
        clickElement(loginuser);
        Thread.sleep(2000);
        driver.get(oppLink);
        Thread.sleep(10000);
        driver.navigate().refresh();
        //clickElement(Edit_Opp);
        //clickElement(Save_Opp);
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        clickElement(New_contact);
        dropDown(COP, "COP - Centre of Power");
        clickElement(Primary_contact);
        Thread.sleep(2000);
        dropDown(COD, "COD - Centre of Dissatisfaction");
        Thread.sleep(2000);
        dropDown(COR, "COR - Centre of Receptivity");
        Thread.sleep(2000);
        dropDown(Billing, "Billing");
        Thread.sleep(2000);
        dropDown(Other, "Other");
        Thread.sleep(2000);
        clickElement(save_contact);
        Thread.sleep(3000);
        clickElement(Edit_Opp);
        dropDown(Stage_AON, "Awareness of Needs");
        clickElement(Save_Opp);
        Thread.sleep(3000);
        logger.debug("Sales Governance kicked off");
        takeScreenShot("Sales Governance kicked off");
    }

    public void agreementToPropose(String oppLink, String Submission_type, String Contract_terms, String Service_levels, int TCV2, String supportType) throws InterruptedException, IOException {
        Thread.sleep(5000);
        clickElement(logout);
        clickElement(logoutclick);
        Thread.sleep(2000);
        try {
            inputbox.isDisplayed();
        } catch (Exception e) {
            String url = configuration.getProperty("salesforceBaseUrl");
            String userName = configuration.getProperty("username");
            String passWord = configuration.getProperty("password");
            driver.get(url);
            sendKeys(username, userName);
            sendKeys(password, passWord);
            clickElement(login);
        }
        if ("Pricing Desk".equals(supportType)) {
            sendKeys(inputbox, "Corporate Senior Admin Support.E2E");
            clickElement(search);
            clickElement(Corporate_sales_Pricing);
        } else {
            sendKeys(inputbox, "Corporate Sales AQ,AM.E2E");
            clickElement(search);
            clickElement(Corporate_Sales);
        }
        Thread.sleep(2000);
        clickElement(dropdown);
        clickElement(userdetail);
        clickElement(loginuser);
        Thread.sleep(2000);
        driver.get(oppLink);
        Thread.sleep(8000);
        clickElement(Edit_form);
        Thread.sleep(5000);
        if (supportType.contains("Bid and Solutions") || supportType.contains("Solutions only")) {
            Thread.sleep(10000);
            clickElement(Callrequest_date);
            sendKeys(Credict_risk_comments, "Risk comments");
            dropDown(Updated_credict_risk, "30-50 Credit worthy");
            sendKeys(Customer_budget, "12345678");
            sendKeys(LOC, "11");
            dropDown(Nonstandard_elements, "No");
            dropDown(Specific_supplier, "No");
        }
        else
        {
            Thread.sleep(11000);
        clickElement(Callrequest_date);
        Thread.sleep(2000);
        Thread.sleep(2000);
        clickElement(Service_start_date);
        sendKeys(Credict_risk_comments, "Risk comments");
        dropDown(Updated_credict_risk, "30-50 Credit worthy");
        sendKeys(Customer_budget, "12345678");
        sendKeys(LOC, "11");
        sendKeys(A2P_Desc, "Description");
        sendKeys(A2P_Comp, "Competitors");
        sendKeys(UK_Loc, "1234");
        sendKeys(International_Loc, "1234");
        //System.out.println("saurabh="+supportType);
        if (supportType.contains("Self") || supportType.contains("Pricing Desk"))
        {
            Thread.sleep(2000);
            dropDown(Response_type, "Proactive Response");
            Thread.sleep(2000);
            clickElement(Submission_date);
        }
        dropDown(Nonstandard_elements, "No");


    }
        dropDown(Checklist_1,"Yes");
        dropDown(Checklist_2,"Yes");
        dropDown(Checklist_3,"Yes");
        dropDown(Checklist_4,"Yes");
        dropDown(Checklist_5,"Yes");
        dropDown(Checklist_6,"Yes");
        sendKeys(Share_Point_link, oppLink);
        sendKeys(Checklist_desc, "Business Problem Description");
        sendKeys(A2P_Customer_selection_criteria, "Solution Criteria");
/*
        try {
            if(Specific_supplier.isDisplayed() && Specific_supplier.isEnabled())
            {
                dropDown(Specific_supplier, "No");
            }
            if(Contract_terms_trigger.isDisplayed() && Contract_terms_trigger.isEnabled())
            {
                Thread.sleep(2000);
                dropDown(Contract_terms_trigger,Contract_terms);
            }
            if(Service_levels_trigger.isDisplayed() && Service_levels_trigger.isEnabled())
            {
                Thread.sleep(2000);
                dropDown(Service_levels_trigger,Service_levels);
            }
        }
        catch(Exception e)
        {

        }

 */
        Thread.sleep(2000);
        clickElement(Save_form);
        Thread.sleep(10000);
        WebDriverWait wait1= new WebDriverWait(driver,50);
        wait1.until(ExpectedConditions.visibilityOf(Submit_for_finance_approval));
        clickElement(Submit_for_finance_approval);
        //clickElement(Submit_for_finance_approval);
        Thread.sleep(15000);
        logger.debug("Agreement to Propose-Submitted for Finance Approval");
        takeScreenShot("Agreement to Propose-Submitted for Finance Approval");


    }

    public void CaptureValues()
    {
        driver.navigate().refresh();
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        wait3.until(ExpectedConditions.visibilityOf(High_Risk_Deal));

        String HighRiskDeal = High_Risk_Deal.getText();
        System.out.println("High Risk Deal is: " +HighRiskDeal);
        String GuidedPricing = Guided_Pricing.getText();
        System.out.println("Guided Pricing is: " +GuidedPricing);
        String ApprovalLevel = Approval_Level.getText();
        System.out.println("Approval Level is: " +ApprovalLevel);
    }
    public void financeApprovalAgreementToPropose(String oppLink,int TCV2,String supportType) throws InterruptedException, IOException {
        if(TCV2<3000000)
        {
            System.out.println("Sales Governance is over");
            //System.exit(0);
            return;
        }
        else
        {
        clickElement(logout);
        clickElement(logoutclick);
        try
        {
            inputbox.isDisplayed();
        }
        catch (Exception e)
        {
            String url=configuration.getProperty("salesforceBaseUrl");
            String userName=configuration.getProperty("username");
            String passWord=configuration.getProperty("password");
            driver.get(url);
            sendKeys(username,userName);
            sendKeys(password,passWord);
            clickElement(login);
        }

        sendKeys(inputbox,"Finance Manager.E2E");
        clickElement(search);
        clickElement(finance_manager);
        clickElement(dropdown);
        clickElement(userdetail);
        clickElement(loginuser);
        driver.get(oppLink);
        clickElement(Edit_form_propose);
        Thread.sleep(8000);

        Thread.sleep(3000);
        //sendKeys(Approved_contract_value,"6000000");
        //clickElement(Call_date);
        clickElement(Save_approval);
        Thread.sleep(5000);
        WebDriverWait wait1= new WebDriverWait(driver,30);
        wait1.until(ExpectedConditions.visibilityOf(Submit_finance_approval));
        clickElement(Submit_for_finance_approval);
        System.out.println("Finance Approval provided");
        takeScreenShot("Finance Approval provided");

        if("Bid only".contains(supportType) || "Self-serve pricing tools".contains(supportType) || "Pricing Desk".contains(supportType))
        {
            if(TCV2<3000000)
            {
                System.out.println("Sales Governance is over");
                //System.exit(0);
                return;
            }
        }

    }}
    public void approvalAgreementToPropose(String oppLink,int TCV2) throws InterruptedException, IOException {
        if (TCV2 < 3000000) {
            System.out.println("Sales Governance is over");

        } else {
            Thread.sleep(6000);
            clickElement(logout);
            clickElement(logoutclick);
            Thread.sleep(2000);
            try {
                inputbox.isDisplayed();
            } catch (Exception e) {
                String url = configuration.getProperty("salesforceBaseUrl");
                String userName = configuration.getProperty("username");
                String passWord = configuration.getProperty("password");
                driver.get(url);
                sendKeys(username, userName);
                sendKeys(password, passWord);
                clickElement(login);
            }
            sendKeys(inputbox, "Qgate Admin.E2E");
            clickElement(search);
            clickElement(Qgate_admin);
            clickElement(dropdown);
            clickElement(userdetail);
            clickElement(loginuser);
            driver.get(oppLink);
            clickElement(Edit_form_propose);
            Thread.sleep(8000);
            clickElement(Call_date_propose);
            clearElement(Call_time_propose);
            sendKeys(Call_time_propose, "20:20");
            Thread.sleep(2000);
            dropDown(Approval_status_propose, "Agreed to propose");
            clickElement(Save_form1_propose);
            logger.debug("Agreement to Propose- Approved");
            takeScreenShot("Agreement to Propose- Approved");
            Thread.sleep(6000);
        }
    }
    public void Opp_stage_Decision_action(String oppLink,int TCV2,String supportType) throws InterruptedException
    {
        if("Bid only".contains(supportType) || "Self-serve pricing tools".contains(supportType) || "Pricing Desk".contains(supportType))
        {
            if(TCV2<3000000)
            {
                System.out.println("Sales Governance is over");
                //System.exit(0);
                return;
            }
        }
        driver.get(oppLink);
        Thread.sleep(4000);
        clickElement(logout);
        clickElement(logoutclick);
        Thread.sleep(2000);
        try {
            inputbox.isDisplayed();
        } catch (Exception e) {
            String url = configuration.getProperty("salesforceBaseUrl");
            String userName = configuration.getProperty("username");
            String passWord = configuration.getProperty("password");
            driver.get(url);
            sendKeys(username, userName);
            sendKeys(password, passWord);
            clickElement(login);
        }

        if("Pricing Desk".equals(supportType))
        {
            sendKeys(inputbox, "Corporate Senior Admin Support.E2E");
            clickElement(search);
            clickElement(Corporate_sales_Pricing);
        }
        else{
            sendKeys(inputbox, "Corporate Sales AQ,AM.E2E");
            clickElement(search);
            clickElement(Corporate_Sales);
        }
        clickElement(dropdown);
        clickElement(userdetail);
        clickElement(loginuser);
        Thread.sleep(2000);
        driver.get(oppLink);
        Thread.sleep(2000);
        clickElement(Opp_edit);
        Thread.sleep(2000);
        dropDown(Stage_Decision,"Decision");
        dropDown(Key_competitor,"3");
        dropDown(Incumbent,"3");
        sendKeys(Margin, "75");
        clickElement(Actual_contract_date);
        sendKeys(Actual_contract_value,String.valueOf(TCV2));
        clickElement(Save_opp);
        logger.debug("Opportunity stage changed as Decision");
        Thread.sleep(8000);
        clickElement(ACO);
        Thread.sleep(20000);
        clickElement(Handover);
        logger.debug("Output Documents are downloaded \n Sales Governance is over");
         }

    public void Agreement_to_Sign_action(String oppLink,int TCV2) throws InterruptedException, IOException {
        if(TCV2<3000000)
        {
            System.out.print("");
        }
        else
        {
            driver.get(oppLink);
            clickElement(Edit_form_sign);
            Thread.sleep(5000);
            clickElement(Call_date_sign);
            sendKeys(Agreement_to_sign_TCV_sign,String.valueOf(TCV2));
            dropDown(Update_customer_risk_sign,"30-50 Credit worthy");
            sendKeys(Risk_comments_sign,"Risk_Comments");
            sendKeys(LOC_sign,"11");
            sendKeys(url1_sign,"www.test.com");
            sendKeys(url2_sign,"www.test.com");
            sendKeys(url3_sign,"www.test.com");
            sendKeys(url4_sign,"www.test.com");
            dropDown(Checklist1_sign,"No");
            dropDown(Checklist2_sign,"No");
            dropDown(Checklist3_sign,"No");
            Thread.sleep(2000);
            clickElement(Save_form_sign);
            clickElement(Submit_form_sign);
            logger.debug("Agreement to Sign-Submitted");
            takeScreenShot("Agreement to Sign-Submitted");
        }
    }
    public void Approval_Agreement_to_Sign_action(String oppLink,int TCV2) throws InterruptedException, IOException {
        if(TCV2<3000000)
        {
            System.out.print("");
        }
        else
        {
            Thread.sleep(5000);
            clickElement(logout);
            clickElement(logoutclick);
            Thread.sleep(2000);
            try {
                inputbox.isDisplayed();
            } catch (Exception e) {
                String url = configuration.getProperty("salesforceBaseUrl");
                String userName = configuration.getProperty("username");
                String passWord = configuration.getProperty("password");
                driver.get(url);
                sendKeys(username, userName);
                sendKeys(password, passWord);
                clickElement(login);
            }
            sendKeys(inputbox, "Qgate Admin.E2E");
            clickElement(search);
            clickElement(Qgate_admin);
            clickElement(dropdown);
            clickElement(userdetail);
            clickElement(loginuser);
            driver.get(oppLink);
            clickElement(Edit_form_apprsign);
            Thread.sleep(4000);
            clickElement(Call_request_dat_apprsign);
            clearElement(Call_time_apprsign);
            Thread.sleep(1000);
            sendKeys(Call_time_apprsign,"20:20");
            Thread.sleep(2000);
            dropDown(Approval_status_apprsign,"Agreed to Sign");
            clickElement(Save_Approval_apprsign);
            logger.debug("Agreement to Sign-Approved");
            takeScreenShot("Agreement to Sign-Approved");
        }
    }
}
