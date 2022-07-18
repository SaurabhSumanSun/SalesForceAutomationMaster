package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Configuration;
import com.nttdata.testframework.utils.Excel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class opportunityPage extends PageObject {

    @FindBy(how= How.XPATH, using = "//*[@id='Opportunity_Tab']")
    public static WebElement Opportunity_tab;
    @FindBy(how= How.XPATH, using ="(//*[@class='btn'])[2]")
    public static WebElement New;
    @FindBy(how= How.XPATH, using = "//*[@id='bottomButtonRow']/input[1]")
    public static WebElement recordtype;
    @FindBy(how= How.XPATH, using = "(//*[@id='opp3'])")
    public static WebElement Opp_name;
    @FindBy(how= How.XPATH, using = "(//*[@id='opp4'])")
    public static WebElement Acc_name;
    @FindBy(how= How.XPATH, using = "(//*[@id='opp5'])")
    public static WebElement Type;
    @FindBy(how= How.XPATH, using = "(//*[@id='TotalOpportunityQuantity'])")
    public static WebElement Quantity;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000003Huzd'])")
    public static WebElement Deal_type;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000003E2tw'])")
    public static WebElement Deal_type_SIT;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000kNkR'])")
    public static WebElement Type_of_support;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000IT9S'])")
    public static WebElement Type_of_support_SIT;
    @FindBy(how= How.XPATH, using = "(//*[@id='opp11'])")
    public static WebElement Stage;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[2]")
    public static WebElement Close_date;
    @FindBy(how= How.XPATH, using = "(//*[@class=\"dateFormat\"])[3]")
    public static WebElement Close_date_SIT;
    @FindBy(how= How.XPATH, using = "(//*[@id='opp6'])")
    public static WebElement Lead_source;
    @FindBy(how= How.XPATH, using = "(//*[@id='opp14'])")
    public static WebElement Desc;
    @FindBy(how= How.XPATH, using = " (//*[@class='btn'])[1]")
    public static WebElement savebtn;
    @FindBy(how= How.XPATH, using = "//a[text()='Corporate Senior Admin Support.E2E']")
    public static  WebElement Corporate_sales_Pricing;

    @FindBy(how= How.XPATH, using = "(//*[text()='Buying Through Framework?']/../..//select)[1]")
    public static WebElement framework;

    @Autowired
    private Configuration configuration;
    @Autowired
    Excel excel;
    @Autowired
    public opportunityPage(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public static String[] opportunityCreation(String AccountName, String dealType, String typeOfSupport) throws Throwable {
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        webDriverWait.until(ExpectedConditions.visibilityOf(Opportunity_tab));
        clickElement(Opportunity_tab);
        webDriverWait.until(ExpectedConditions.visibilityOf(New));
        clickElement(New);
        webDriverWait.until(ExpectedConditions.visibilityOf(recordtype));
        clickElement(recordtype);
        webDriverWait.until(ExpectedConditions.visibilityOf(recordtype));
        sendKeys(Opp_name, "Enterprise E2E");
        sendKeys(Acc_name, AccountName);
        dropDown(Type, "New Business");
        Thread.sleep(2000);
        sendKeys(Quantity,"4500");
        dropDown(Deal_type,dealType);
        Thread.sleep(2000);
        if(AccountName.equals("Test_Public"))
        {
            dropDownIndex(framework,1);
        }
        dropDown(Type_of_support, typeOfSupport);
        dropDown(Stage,"Qualified Lead");
        clickElement(Close_date);
        dropDown(Lead_source,"BRT");
        //dropDown(Lead_source,"All In - Online");
        sendKeys(Desc,"Description");

        Thread.sleep(7000);
        clickElement(savebtn);
        logger.debug("Opportunity is created");
        takeScreenShot("Opportunity Creation Page");
        String Support= typeOfSupport;
        String DealType= dealType;

        return new String[]{ typeOfSupport, dealType , AccountName};

    }

    public static String[] opportunityCreationOne(String dealType, String typeOfSupport) throws Throwable {

        webDriverWait.until(ExpectedConditions.visibilityOf(Opportunity_tab));
        clickElement(Opportunity_tab);
        webDriverWait.until(ExpectedConditions.visibilityOf(New));
        clickElement(New);
        webDriverWait.until(ExpectedConditions.visibilityOf(recordtype));
        clickElement(recordtype);
        webDriverWait.until(ExpectedConditions.visibilityOf(recordtype));
        sendKeys(Opp_name, "Enterprise E2E");
        sendKeys(Acc_name, "Test Private");
        dropDown(Type, "New Business");
        sendKeys(Quantity,"4500");
        dropDown(Deal_type,dealType);
        dropDown(Type_of_support, typeOfSupport);
        dropDown(Stage,"Qualified Lead");
        clickElement(Close_date);
        dropDown(Lead_source,"All In - Online");
        sendKeys(Desc,"Description");
        clickElement(savebtn);
        logger.debug("Opportunity is created");
        takeScreenShot("Opportunity Creation Page");
        String Support= typeOfSupport;
        String DealType= dealType;
        return new String[]{ typeOfSupport, dealType };
    }
    public static String[] opportunityCreationSIT(String accountName, String dealType, String typeOfSupport) throws Throwable {

        webDriverWait.until(ExpectedConditions.visibilityOf(Opportunity_tab));
        clickElement(Opportunity_tab);
        webDriverWait.until(ExpectedConditions.visibilityOf(New));
        clickElement(New);
        //webDriverWait.until(ExpectedConditions.visibilityOf(recordtype));
        //clickElement(recordtype);
        webDriverWait.until(ExpectedConditions.visibilityOf(recordtype));
        sendKeys(Opp_name, "Enterprise E2E");
        sendKeys(Acc_name, accountName);
        dropDown(Type, "New Business");
        sendKeys(Quantity,"4500");
        dropDown(Deal_type_SIT,dealType);
        dropDown(Type_of_support_SIT, typeOfSupport);
        dropDown(Stage,"Qualified Lead");
        clickElement(Close_date_SIT);
        dropDown(Lead_source,"All In - Online");
        sendKeys(Desc,"Description");
        clickElement(savebtn);
        logger.debug("Opportunity is created");
        takeScreenShot("Opportunity Creation Page");
        String Support= typeOfSupport;
        String DealType= dealType;
        return new String[]{ typeOfSupport, dealType };
    }
}