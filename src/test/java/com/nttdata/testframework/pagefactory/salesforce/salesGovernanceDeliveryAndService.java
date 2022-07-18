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
public class salesGovernanceDeliveryAndService extends PageObject {


    public salesGovernanceDeliveryAndService(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }
    //Delivery
    @FindBy(how= How.XPATH, using = "//*[@value=\"Create a Copy\"]")
    public static WebElement Create_copy;
    @FindBy(how= How.XPATH, using = "//*[@id=\"userNavLabel\"]")
    public static WebElement logout;
    @FindBy(how= How.XPATH, using = "//*[@id=\"userNav-menuItems\"]/a[4]")
    public static WebElement logoutclick;
    @FindBy(how= How.XPATH, using = "//*[@id=\"phSearchInput\"]")
    public static WebElement inputbox;
    @FindBy(how= How.XPATH, using = "//*[@id=\"phSearchButton\"]")
    public static WebElement search;
    @FindBy(how= How.XPATH, using = "//*[text()=\"Corporate Sales AQ,AM.E2E\"]")
    public static WebElement Corporate_Sales ;
    @FindBy(how= How.XPATH, using = "//*[@id=\"moderatorMutton\"]")
    public static  WebElement dropdown;
    @FindBy(how= How.XPATH, using = "//*[@id=\"USER_DETAIL\"]")
    public static  WebElement userdetail;
    @FindBy(how= How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[4]")
    public static  WebElement loginuser;
    @FindBy(how= How.XPATH, using = "(//*[@title=\"Edit - Record 1 - Acceptance into Delivery\"])")
    public static WebElement Edit_form_Delivery;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:0:j_id42:field:5:j_id119\"]/div/table/tbody/tr/td[2]/span/span/a")
    public static WebElement Call_date_Delivery;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:0:j_id42:field:10:j_id119:j_id202\"]")
    public static WebElement RAID_Updated;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[5]")
    public static WebElement PTF;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[6]")
    public static WebElement Transition_plan;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[7]")
    public static  WebElement HLD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[8]")
    public static  WebElement Details_Supplier;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[9]")
    public static  WebElement DISE;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[10]")
    public static WebElement New_suppliers;
    //URL
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[1]")
    public static WebElement COFAD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[2]")
    public static WebElement Bid_Model;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[3]")
    public static WebElement Link_HLD_Delivery;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[4]")
    public static WebElement Customer_contract ;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[5]")
    public static  WebElement Customer_contract_handover;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"NeedHeight\"])")
    public static  WebElement Element_of_solution;
    @FindBy(how= How.XPATH, using = "(//*[@value=\"Save\"])")
    public static  WebElement Save_form;
    @FindBy(how= How.XPATH, using = "(//*[@value=\"Submit\"])")
    public static  WebElement Submit_form;
    @FindBy(how= How.XPATH, using = "//*[@id=\"username\"]")
    public static WebElement username;
    @FindBy(how= How.XPATH, using = "(//*[@id='password'])")
    public static  WebElement password;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Login\"]")
    public static  WebElement login;
    @FindBy(how= How.XPATH, using = "//a[text()=\"Corporate Senior Admin Support.E2E\"]")
    public static  WebElement Corporate_sales_Pricing;

    @FindBy(how= How.XPATH, using = "(//*[@title=\"Edit - Record 1 - Acceptance into Service\"])")
    public static WebElement Edit_form_Service;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[1]")
    public static WebElement Call_date;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"OpptyEditFields\"])[2]")
    public static WebElement Services_requested;
    //URL fields
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[1]")
    public static WebElement Link_HLD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[2]")
    public static WebElement Link_customer_contract;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[4]")
    public static WebElement SNOW_Template;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[5]")
    public static WebElement Link_LLD;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"URLinputFields\"])[6]")
    public static WebElement Customer_service_charter;
    //Checklist
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[1]")
    public static WebElement Checklist1;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[2]")
    public static  WebElement Checklist2;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[3]")
    public static  WebElement Checklist3;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[4]")
    public static  WebElement Checklist4;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[5]")
    public static WebElement Checklist5;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[6]")
    public static WebElement Checklist6;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[7]")
    public static WebElement Checklist7;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[8]")
    public static WebElement Checklist8;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[9]")
    public static WebElement Checklist9;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[10]")
    public static WebElement Checklist10;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[11]")
    public static  WebElement Checklist11;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[12]")
    public static  WebElement Checklist12;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"selectClass\"])[13]")
    public static  WebElement Checklist13;
    //ApprovalDelivery
    @FindBy(how= How.XPATH, using = "//*[text()=\"Qgate Admin.E2E\"]")
    public static WebElement Qgate_admin;
    @FindBy(how= How.XPATH, using ="(//*[@class=\"dateFormat\"])[2]")
    public static WebElement Call_request_date;
    @FindBy(how= How.XPATH, using ="(//*[@class=\"OpptyEditFields\"])[14]")
    public static WebElement Call_time;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:1:j_id42:field:4:j_id46:StatusField\"]")
    public static WebElement Approval_status;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"btn\"])[3]")
    public static WebElement Save_Approval;
    //ApprovalService
    @FindBy(how= How.XPATH, using ="(//*[@class=\"dateFormat\"])[2]")
    public static WebElement Call_request_date_Service;
    @FindBy(how= How.XPATH, using ="(//*[@class=\"OpptyEditFields\"])[4]")
    public static WebElement Call_time_Service;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id18:j_id19:theForm:SalesGovernanceRecord:SectionList:j_id41:2:j_id42:field:4:j_id46:StatusField\"]")
    public static WebElement Approval_status_Service;
    @FindBy(how= How.XPATH, using = "(//*[@value=\"Save\"])[2]")
    public static WebElement Save_Approval_Service;

    @Autowired
    static
    Configuration configuration;

    public void acceptanceToDelivery(String oppLink,String supportType,int TCV2) throws InterruptedException, IOException {
        if (TCV2 < 3000000) {
            System.out.print("");
        } else {

            if (supportType.contains("Bid and Solutions") || supportType.contains("Solutions only")) {
                driver.get(oppLink);

                Thread.sleep(5000);
                clickElement(logout);
                clickElement(logoutclick);
                Thread.sleep(4000);
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
                clickElement(dropdown);
                clickElement(userdetail);
                clickElement(loginuser);
                Thread.sleep(2000);
                driver.get(oppLink);
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOf(Edit_form_Delivery));
                clickElement(Edit_form_Delivery);
                Thread.sleep(5000);
                clickElement(Call_date_Delivery);
                dropDown(RAID_Updated, "No");
                dropDown(Transition_plan, "No");
                dropDown(HLD, "No");
                dropDown(DISE, "No");
                dropDown(New_suppliers, "No");
                dropDown(PTF, "No");
                dropDown(PTF, "No");
                dropDown(Element_of_solution, "No");
                sendKeys(Details_Supplier, "Supplier");
                sendKeys(COFAD, "www.test.com");
                sendKeys(Bid_Model, "www.test.com");
                sendKeys(Link_HLD_Delivery, "www.test.com");
                sendKeys(Customer_contract, "www.test.com");
                sendKeys(Customer_contract_handover, "www.test.com");
                clickElement(Save_form);
                WebDriverWait wait1 = new WebDriverWait(driver, 10);
                wait1.until(ExpectedConditions.visibilityOf(Submit_form));
                clickElement(Submit_form);
                Thread.sleep(5000);
                logger.debug("Acceptance into Delivery-Submitted");
                takeScreenShot("Acceptance into Delivery-Submitted");
            }
        }
    }
    public void approvalAcceptanceToDelivery(String oppLink,int TCV2,String supportType) throws InterruptedException, IOException {
        if (TCV2 < 3000000) {
            System.out.print("");
        } else {
            if (supportType.contains("Bid and Solutions") || supportType.contains("Solutions only")) {
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
                WebDriverWait wait8 = new WebDriverWait(driver, 10);
                wait8.until(ExpectedConditions.visibilityOf(Edit_form_Delivery));
                clickElement(Edit_form_Delivery);
                Thread.sleep(4000);
                clickElement(Call_date_Delivery);
                clearElement(Call_time);
                Thread.sleep(1000);
                sendKeys(Call_time, "20:20");
                Thread.sleep(2000);
                dropDown(Approval_status, "Accepted into Delivery");
                clickElement(Save_form);
                Thread.sleep(5000);
                logger.debug("Acceptance into Delivery-Approved");
                takeScreenShot("Acceptance into Delivery-Approved");
            }
        }
    }
    public void acceptanceToService(String oppLink,String supportType,int TCV2) throws InterruptedException, IOException {
        if (TCV2 < 3000000) {
            System.out.print("");
        } else {
            if (supportType.contains("Bid and Solutions") || supportType.contains("Solutions only")) {
                driver.get(oppLink);
                Thread.sleep(5000);
                clickElement(logout);
                clickElement(logoutclick);
                Thread.sleep(4000);
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
                clickElement(dropdown);
                clickElement(userdetail);
                clickElement(loginuser);
                Thread.sleep(2000);
                driver.get(oppLink);
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOf(Edit_form_Service));
                clickElement(Edit_form_Service);
                Thread.sleep(6000);
                clickElement(Call_date);
                sendKeys(Services_requested, "Services requested");
                sendKeys(Link_HLD, "www.test.com");
                Thread.sleep(2000);
                sendKeys(Link_customer_contract, "www.test.com");
                sendKeys(SNOW_Template, "www.test.com");
                sendKeys(Link_LLD, "www.test.com");
                sendKeys(Customer_service_charter, "www.test.com");
                dropDown(Checklist1, "No");
                dropDown(Checklist2, "No");
                dropDown(Checklist3, "No");
                dropDown(Checklist4, "No");
                dropDown(Checklist5, "No");
                dropDown(Checklist6, "No");
                dropDown(Checklist7, "No");
                dropDown(Checklist8, "No");
                dropDown(Checklist9, "No");
                dropDown(Checklist10, "No");
                dropDown(Checklist11, "No");
                dropDown(Checklist12, "No");
                dropDown(Checklist13, "No");
                clickElement(Save_form);
                WebDriverWait wait2 = new WebDriverWait(driver, 10);
                wait2.until(ExpectedConditions.visibilityOf(Submit_form));
                clickElement(Submit_form);
                Thread.sleep(4000);
                logger.debug("Acceptance into Service-Submitted");
                takeScreenShot("Acceptance into Service-Submitted");
            }
        }
    }
    public void approvalAcceptanceToService(String oppLink,int TCV2,String supportType) throws InterruptedException, IOException {
        if (TCV2 < 3000000) {
            System.out.print("");
        }
        else {
            if (supportType.contains("Bid and Solutions") || supportType.contains("Solutions only")) {
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
                WebDriverWait wait8 = new WebDriverWait(driver, 10);
                wait8.until(ExpectedConditions.visibilityOf(Edit_form_Service));
                Thread.sleep(3000);
                clickElement(Call_request_date_Service);
                clearElement(Call_time);
                Thread.sleep(1000);
                sendKeys(Call_time, "20:20");
                Thread.sleep(2000);
                dropDown(Approval_status, "Accepted into service");
                clickElement(Save_Approval_Service);
                Thread.sleep(8000);
                logger.debug("Acceptance into Service-Approved");
                takeScreenShot("Acceptance into Service-Approved");
            }
        }
    }



}
