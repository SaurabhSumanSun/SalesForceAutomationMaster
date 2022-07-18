package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;

@Component
public class configureSIP extends PageObject{

    @FindBy(how= How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']")
    public static WebElement add_product;
    @FindBy(how= How.XPATH, using = "//*[@id=\"a1y9E000001feq4QAA~a2I9E000001uNYyUAM_anchor\"]")
    public static WebElement SIP;
    @FindBy(how= How.XPATH, using = "//*[@class='btn label icon-add']")
    public static WebElement save_product;
    @FindBy(how= How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[2]")
    public static WebElement edit_pencil;

    @FindBy(how= How.XPATH, using = "//*[@id='SIP_Trunking:General_Information:Sites_0']")
    public static WebElement sites;
    @FindBy(how= How.XPATH, using = "//*[@id='SIP_Trunking:General_Information:Bundle_Type_0']")
    public static WebElement bundleTypes;
    @FindBy(how= How.XPATH, using = "//*[@id='SIP_Trunking:General_Information:Contract_Length_0']")
    public static WebElement terms;
    @FindBy(how= How.XPATH, using = "//*[@id='SIP_Trunking:CONFIGURATION_INFORMATION:Access_Type_0']")
    public static WebElement accessType;
    @FindBy(how= How.XPATH, using = "//*[@id='SIP_Trunking:CONFIGURATION_INFORMATION:SIP_Selection_0']")
    public static WebElement SIPSelection;
    @FindBy(how= How.XPATH, using = "//*[@id='SIP_Trunking:CONFIGURATION_INFORMATION:SDM_0']")
    public static WebElement serviceDeliveryManager;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id2:0:j_id3:0:j_id6:1:j_id8:2:j_id20']")
    public static WebElement isManagedAcceptanceTestingRequired;
    @FindBy(how= How.XPATH, using = "//*[@id='SIP_Trunking:CONFIGURATION_INFORMATION:Managed_Acceptance_Testing_Cost_0']")
    public static WebElement managedAcceptanceTestingOneOffCost;
    @FindBy(how= How.XPATH, using = "//*[@id='SIP_Trunking:CONFIGURATION_INFORMATION:PBX_Model_0']")
    public static WebElement PBXModel;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "//*[text()='New O2 Numbering']")
    public static WebElement newO2numbering;
    @FindBy(how= How.XPATH, using = "//*[@id='O2_Numbering:O2_Numbering_Information:Numbering_0']")
    public static WebElement numbering;
    @FindBy(how= How.XPATH, using = "//*[@id='O2_Numbering:O2_Numbering_Information:Quantity_0']")
    public static WebElement quantity;
    @FindBy(how= How.XPATH, using = "(//*[text()='Continue'])[2]")
    public static WebElement continueBtn;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "//*[@id=\"screen-content-landmark\"]/div[6]/article/div/div[1]/div/button")
    public static WebElement newO2NumberPorting;
    @FindBy(how= How.XPATH, using = "//*[@id='NUMBER_PORTING:Number_Porting_Information:Number_Porting_0']")
    public static WebElement numberingPorting;
    @FindBy(how= How.XPATH, using = "//*[@id='NUMBER_PORTING:Number_Porting_Information:Quantity_0']")
    public static WebElement quantity1;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "(//button[text()='Circuit Configuration'])[1]")
    public static WebElement circuitConfiguration;
    @FindBy(how= How.XPATH, using = "(//*[text()='Please select value'])[1]")
    public static WebElement site;
    @FindBy(how= How.XPATH, using = "//*[@id='select2-result-label-9']")
    public static WebElement site1;
    @FindBy(how= How.XPATH, using = "//*[@id='Circuit_Configuration:SIP_EndPoint_1:Channels_Endpoint_1_0']")
    public static WebElement noOfChannels;
    @FindBy(how= How.XPATH, using = "(//*[text()='Finish'])[1]")
    public static WebElement circuitConfigurationFinish;

    @FindBy(how= How.XPATH, using = "(//*[text()='Finish'])[2]")
    public static WebElement finish;

    public configureSIP(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public void SIPConfiguation() throws InterruptedException, IOException {

        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("arguments[0].click()",SIP);
        WebDriverWait wait1 = new WebDriverWait(driver, 500);
        wait1.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);
        Thread.sleep(5000);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait2 = new WebDriverWait(driver, 500);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil));
        clickElement(edit_pencil);
        Thread.sleep(8000);
        WebDriverWait wait3 = new WebDriverWait(driver,15);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(20000);

       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(10000);
        scroll(add_product);
        clickElement(add_product);
        scroll(SIP);
        clickElement(SIP);
        clickElement(save_product);
        Thread.sleep(20000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickElement(edit_pencil);
        Thread.sleep(4000);
        driver.switchTo().frame(1);
        Thread.sleep(6000);*/

        wait2.until(ExpectedConditions.visibilityOf(sites));
        Thread.sleep(1000);
        wait2.until(ExpectedConditions.elementToBeClickable(sites));
        Thread.sleep(1000);

        dropDown(sites,"1");
        dropDown(bundleTypes,"PPM");
        dropDown(terms,"36");
        Thread.sleep(2000);
        dropDown(accessType,"SIP over Public Internet");
        Thread.sleep(2000);
        dropDown(SIPSelection,"2 SIP Endpoints Loadshare");
        Thread.sleep(2000);
        dropDown(serviceDeliveryManager,"Not Required");
        Thread.sleep(2000);
        dropDown(PBXModel,"Not required live customer");
        Thread.sleep(8000);

        clickElement(newO2numbering);
        dropDown(numbering,"New DDI");
        Thread.sleep(8000);
        sendKeys(quantity,"12");
        clickElement(quantity);
        clickElement(continueBtn);
        Thread.sleep(8000);
        //------------------------------------------------------------------
        clickElement(newO2NumberPorting);
        Thread.sleep(8000);
        dropDown(numberingPorting,"Port Single Line");
        Thread.sleep(8000);
        sendKeys(quantity1,"12");
        clickElement(quantity1);
        clickElement(continueBtn);
        Thread.sleep(8000);
        //------------------------------------------------------------------
        clickElement(circuitConfiguration);
        Thread.sleep(5000);
        clickElement(site);
        Thread.sleep(5000);
        clickElement(site1);
        Thread.sleep(13000);
        sendKeys(noOfChannels,"12");
        Thread.sleep(8000);
        clickElement(circuitConfigurationFinish);
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        //------------------------------------------------------------------
        //clickElement(finish);
        Thread.sleep(10000);
        logger.debug("SIP is added into the basket");
        takeScreenShot("SIP");

    }



}

