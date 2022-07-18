package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Configuration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;

@Component
public class SalesGovernanceSupportAndSolution extends PageObject{
    public SalesGovernanceSupportAndSolution(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }
    @Autowired
    static
    Configuration configuration;
//AgreementToSupport
@FindBy(how= How.XPATH, using = "//*[@title=\"Edit - Record 1 - Agreement to Support\"]")
public static WebElement Edit_form_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[2]")
    public static WebElement Win_strategy_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"ResponseYN\"])[2]")
    public static WebElement Customer_budget_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"ResponseYN\"])[3]")
    public static WebElement Credict_risk_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"ResponseYN\"])[5]")
    public static WebElement Existing_TC_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[11]")
    public static WebElement Current_margin_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[1]")
    public static WebElement Call_request_date_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[3]")
    public static WebElement UK_locations_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[5]")
    public static WebElement International_locations_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[7]")
    public static WebElement Competitors_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"ResponseYN\"])[4]")
    public static WebElement Supplier_deal_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[9]")
    public static  WebElement Supplier_details_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"ResponseYN\"])[6]")
    public static  WebElement Response_type_ATS;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:0:j_id42:field:29:j_id119\"]/div/table/tbody/tr/td[2]/span/span/a")
    public static  WebElement Contract_end_date_ATS;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:0:j_id42:field:33:j_id119\"]/div/table/tbody/tr/td[2]/span/span/a")
    public static  WebElement Submission_date_ATS;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:0:j_id42:field:35:j_id119\"]/div/table/tbody/tr/td[2]/span/span/a")
    public static  WebElement Service_start_date_ATS;
    //Check_lists
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClassTextarea\"])[1]")
    public static  WebElement Checklist1_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[1]")
    public static  WebElement Checklist2_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClassTextarea\"])[2]")
    public static  WebElement Checklist3_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[2]")
    public static WebElement Checklist4_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[3]")
    public static  WebElement Checklist5_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClassTextarea\"])[3]")
    public static  WebElement Checklist6_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[4]")
    public static  WebElement Checklist7_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[5]")
    public static  WebElement Checklist8_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[6]")
    public static  WebElement Checklist9_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[7]")
    public static  WebElement Checklist10_ATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"btn\"])[1]")
    public static WebElement Save_form_ATS;
    //Submit_form
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:j_id29:j_id31\"]")
    public static WebElement Submit_form_ATS;
    @FindBy(how= How.XPATH, using = "//a[text()=\"Corporate Senior Admin Support.E2E\"]")
    public static  WebElement Corporate_sales_Pricing_ATS;

    //ApprovalAgreementToSupport
    @FindBy(how= How.XPATH, using = "//*[@id=\"userNavLabel\"]")
    public static WebElement logout;
    @FindBy(how= How.XPATH, using = "//*[@id=\"userNav-menuItems\"]/a[4]")
    public static WebElement logoutclick;
    @FindBy(how= How.XPATH, using = "//*[@id=\"phSearchInput\"]")
    public static WebElement inputbox;
    @FindBy(how= How.XPATH, using = "//*[@id=\"phSearchButton\"]")
    public static WebElement search;
    @FindBy(how= How.XPATH, using = "//*[text()=\"Qgate Admin.E2E\"]")
    public static WebElement Qgate_admin;
    @FindBy(how= How.XPATH, using = "//*[@id=\"moderatorMutton\"]")
    public static  WebElement dropdown;
    @FindBy(how= How.XPATH, using = "//*[@id=\"USER_DETAIL\"]")
    public static  WebElement userdetail;
    @FindBy(how= How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[4]")
    public static  WebElement loginuser;
    @FindBy(how= How.XPATH, using = "//*[@title=\"Edit - Record 1 - Agreement to Support\"]")
    public static WebElement Edit_form_apprATS;
    @FindBy(how= How.XPATH, using ="(//*[@class=\"dateFormat\"])[5]")
    public static WebElement Call_request_date_apprATS;
    @FindBy(how= How.XPATH, using ="(//*[@class=\"OpptyEditFields\"])[16]")
    public static WebElement Call_time_apprATS;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:2:j_id42:field:4:j_id46:StatusField\"]")
    public static WebElement Approval_status_apprATS;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:2:j_id42:field:8:j_id46:RiskField\"]")
    public static WebElement Risk_Assessment_apprATS;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"btn\"])[3]")
    public static WebElement Save_Approval_apprATS;
    @FindBy(how= How.XPATH, using = "//*[@id=\"username\"]")
    public static WebElement username;
    @FindBy(how= How.XPATH, using = "(//*[@id='password'])")
    public static  WebElement password;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Login\"]")
    public static  WebElement login;
//SolutionAndDeliveryQA
@FindBy(how= How.XPATH, using = "//*[@title=\"Edit - Record 1 - Solution & Delivery QA\"]")
public static WebElement Edit_form_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[1]")
    public static WebElement Callrequest_date_SAD;
    @FindBy(how= How.XPATH, using = "//*[@class=\"solutionTextArea\"]")
    public static WebElement Solution_Description_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[5]")
    public static WebElement Managed_service_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[7]")
    public static WebElement Suppliers_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[8]")
    public static WebElement RAID_Updated_SAD;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:0:j_id42:field:20:j_id119\"]/div/table/tbody/tr/td[2]/span/span/a")
    public static WebElement Delivery_start_date_SAD;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:0:j_id42:field:22:j_id119\"]/div/table/tbody/tr/td[2]/span/span/a")
    public static WebElement Service_start_date_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])")
    public static WebElement HLD_SAD;
    //Checklist
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[1]")
    public static WebElement Checklist_1_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[2]")
    public static WebElement Checklist_2_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[3]")
    public static WebElement Checklist_3_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[4]")
    public static  WebElement Checklist_4_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[5]")
    public static  WebElement Checklist_5_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"btn\"])[1]")
    public static  WebElement Save_form_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@value=\"Submit\"])[1]")
    public static  WebElement Submit_form_SAD;
    @FindBy(how= How.XPATH, using = "//a[text()=\"Corporate Senior Admin Support.E2E\"]")
    public static  WebElement Corporate_sales_Pricing_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[2]")
    public static WebElement Submission_date_SAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[3]")
    public static WebElement Response_type_SAD;
    @FindBy(how= How.XPATH, using = "//*[text()=\"Corporate Sales AQ,AM.E2E\"]")
    public static WebElement Corporate_Sales_SAD ;
    @FindBy(how= How.XPATH, using = "(//*[@title=\"Edit - Record 1 - Solution & Delivery QA\"])[1]")
    public static WebElement Edit_form_apprSAD;
    @FindBy(how= How.XPATH, using ="(//*[@class=\"dateFormat\"])[5]")
    public static WebElement Call_request_date_apprSAD;
    @FindBy(how= How.XPATH, using ="(//*[@class=\"OpptyEditFields\"])[11]")
    public static WebElement Call_time_apprSAD;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:2:j_id42:field:4:j_id46:StatusField\"]")
    public static WebElement Approval_status_apprSAD;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:2:j_id42:field:5:j_id46:RiskField\"]")
    public static WebElement Risk_Assessment_apprSAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"btn\"])[3]")
    public static WebElement Save_Approval_apprSAD;


    public void agreementToSupportAction(String oppLink, String supportType) throws InterruptedException, IOException {
        if (supportType.contains("Bid and Solutions") || supportType.contains("Solutions only")) {
            clickElement(Edit_form_ATS);
            Thread.sleep(5000);
            sendKeys(Win_strategy_ATS, "Yes");
            dropDown(Customer_budget_ATS, "No");
            dropDown(Credict_risk_ATS, "71-100 Very good credit worthiness");
            dropDown(Existing_TC_ATS, "Yes");
            sendKeys(Current_margin_ATS, "71");
            clickElement(Call_request_date_ATS);
            sendKeys(UK_locations_ATS, "1234");
            sendKeys(International_locations_ATS, "1234");
            sendKeys(Competitors_ATS, "Competitors");
            dropDown(Supplier_deal_ATS, "Yes");
            sendKeys(Supplier_details_ATS, "Suppiler details");
            dropDown(Response_type_ATS, "Proactive Response");
            clickElement(Contract_end_date_ATS);
            clickElement(Submission_date_ATS);
            clickElement(Service_start_date_ATS);
            sendKeys(Checklist1_ATS, "Checklist");
            dropDown(Checklist2_ATS, "Yes");
            sendKeys(Checklist3_ATS, "Checklist");
            dropDown(Checklist4_ATS, "Yes");
            dropDown(Checklist5_ATS, "Yes");
            sendKeys(Checklist6_ATS, "Checklist");
            dropDown(Checklist7_ATS, "Yes");
            dropDown(Checklist8_ATS, "Yes");
            dropDown(Checklist9_ATS, "Yes");
            dropDown(Checklist10_ATS, "Yes");
            clickElement(Save_form_ATS);
            clickElement(Submit_form_ATS);
            Thread.sleep(6000);
            logger.debug("Agreement to Support-Submitted");
            takeScreenShot("Agreement to Support-Submitted");
        }
    }

    public void approvalAgreementToSupportAction(String oppLink, String supportType) throws InterruptedException, IOException {
        if (supportType.contains("Bid and Solutions") || supportType.contains("Solutions only")) {
            clickElement(logout);
            clickElement(logoutclick);
            Thread.sleep(2000);
            try {
                inputbox.isDisplayed(); }
            catch (Exception e) {
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
            Thread.sleep(2000);
            driver.get(oppLink);
            clickElement(Edit_form_apprATS);
            Thread.sleep(6000);
            clickElement(Call_request_date_apprATS);
            clearElement(Call_time_apprATS);
            sendKeys(Call_time_apprATS, "20:20");
            Thread.sleep(2000);
            dropDown(Approval_status_apprATS, "Agreed to Support");
            dropDown(Risk_Assessment_apprATS, "Medium risk");
            clickElement(Save_Approval_apprATS);
            logger.debug("Agreement to Support-Approved");
            takeScreenShot("Agreement to Support-Approved");
        }
    }
    public void solutionAndDeliveryQA(String oppLink,String supportType) throws InterruptedException, IOException {
        if (supportType.contains("Bid and Solutions") || supportType.contains("Solutions only")) {
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
                clickElement(Corporate_sales_Pricing_SAD);
            } else {
                sendKeys(inputbox, "Corporate Sales AQ,AM.E2E");
                clickElement(search);
                clickElement(Corporate_Sales_SAD);
            }
            clickElement(dropdown);
            clickElement(userdetail);
            clickElement(loginuser);
            Thread.sleep(2000);
            driver.get(oppLink);
            clickElement(Edit_form_SAD);
            Thread.sleep(6000);
            clickElement(Callrequest_date_SAD);
            sendKeys(Solution_Description_SAD, "aaaaaaaaaaa aaaaaaaaaaaaa aaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaa aaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaa aaaaaaaaaa");
            dropDown(Managed_service_SAD, "No");
            dropDown(Suppliers_SAD, "No");
            sendKeys(HLD_SAD, "HLD");
            dropDown(RAID_Updated_SAD, "No");
            clickElement(Delivery_start_date_SAD);
            clickElement(Service_start_date_SAD);
            if ("Pricing Desk".equals(supportType)) {
                dropDown(Response_type_SAD, "Proactive Response");
                clickElement(Submission_date_SAD);
            }
            dropDown(Checklist_1_SAD, "No");
            dropDown(Checklist_2_SAD, "No");
            dropDown(Checklist_3_SAD, "No");
            dropDown(Checklist_4_SAD, "No");
            dropDown(Checklist_5_SAD, "No");
            clickElement(Save_form_SAD);
            clickElement(Submit_form_SAD);
            Thread.sleep(5000);
            logger.debug("Solution and Delivery QA - Submitted");
            takeScreenShot("Solution and Delivery QA - Submitted");
        }
    }
    public void approvalSolutionAndDeliveryQA(String oppLink, String supportType) throws InterruptedException, IOException {
        if (supportType.contains("Bid and Solutions") || supportType.contains("Solutions only")) {
            Thread.sleep(2000);
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
            Thread.sleep(2000);
            driver.get(oppLink);
            clickElement(Edit_form_apprSAD);
            Thread.sleep(6000);
            clickElement(Call_request_date_apprSAD);
            clearElement(Call_time_apprSAD);
            sendKeys(Call_time_apprSAD, "20:20");
            Thread.sleep(2000);
            dropDown(Approval_status_apprSAD, "Solution & Delivery QA Approved");
            dropDown(Risk_Assessment_apprSAD, "Medium risk");
            clickElement(Save_Approval_apprSAD);
            Thread.sleep(8000);
            logger.debug("Solution and Delivery QA-Approved");
            takeScreenShot("Solution and Delivery QA-Approved");
        }
    }
}
