//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

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
public class configureGammaIboundNumber extends PageObject {
    @FindBy(
            how = How.XPATH,
            using = "//*[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']"
    )
    public static WebElement add_product;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id=\"a1y9E000001i1BhQAI~a2I9E000001uNYyUAM_anchor\"]"
    )
    public static WebElement inboundNumbers;
    @FindBy(
            how = How.XPATH,
            using = "//*[@class='btn label icon-add']"
    )
    public static WebElement save_product;
    @FindBy(
            how = How.XPATH,
            using = "(//*[@class='btn btn-edit ng-scope'])[3]"
    )
    public static WebElement edit_pencil;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:General_Information:Contract_Term_0']"
    )
    public static WebElement term;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:General_Information:Product_Type_0']"
    )
    public static WebElement productType;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id=\"Gamma_Inbound_and_SIP_Trunk_Call_Manager:Gamma_Managed_Services:Managed_Cost_0\"]"
    )
    public static WebElement managedService;

    @FindBy(
            how = How.XPATH,
            using = "//*[@id=\"j_id0:j_id2:0:j_id3:0:j_id6:1:j_id8:2:j_id20\"]/label/span"
    )
    public static WebElement gammaQuoteCheckox;

    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Gamma_Managed_Services:MAC_0']"
    )
    public static WebElement MAC;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Gamma_Managed_Services:AdHoc_Number_of_Days_0']"
    )
    public static WebElement adHocNumberofDays;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Gamma_Professional_Services:Call_Plan_Build_0']"
    )
    public static WebElement callPlanBuild;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Gamma_Professional_Services:Project_Management___Desk_Based_0']"
    )
    public static WebElement projectManagementDeskBased;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Gamma_Professional_Services:End_Customer_Training_0']"
    )
    public static WebElement endCustomerTraining;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Gamma_Professional_Services:Project_Management___Customer_Facing_0']"
    )
    public static WebElement projectManagementCustomerFacing;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Gamma_Professional_Services:Out_of_Hours___Testing_0']"
    )
    public static WebElement outofHoursTesting;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Gamma_Professional_Services:Professional_Services__Other_0']"
    )
    public static WebElement professionalServicesOther;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='j_id0:j_id2:0:j_id3:0:j_id6:2:j_id8:4:j_id20']"
    )
    public static WebElement checkBox;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Feature_Bundle:Feature_Bundle_0']"
    )
    public static WebElement featureBundle;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_Inbound_and_SIP_Trunk_Call_Manager:Feature_Bundle:Quantity_of_Numbers_0']"
    )
    public static WebElement quantityofNumbers;
    @FindBy(
            how = How.XPATH,
            using = "//*[text()='New Optional Features']"
    )
    public static WebElement newOptionalFeatures;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Optional_Features:Optional_Features:Quantity_Storage_only_0']"
    )
    public static WebElement quantityStorageonly;
    @FindBy(
            how = How.XPATH,
            using = "(//*[text()='Continue'])[2]"
    )
    public static WebElement continueBtn;
    @FindBy(
            how = How.XPATH,
            using = "//*[text()='New O2 Numbering']"
    )
    public static WebElement newO2Numbering;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_O2_Numbering:O2_Numbering_Information:Numbering_0']"
    )
    public static WebElement numbering;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_O2_Numbering:O2_Numbering_Information:Quantity_0']"
    )
    public static WebElement quantity;
    @FindBy(
            how = How.XPATH,
            using = "//*[text()='New O2 Number Porting']"
    )
    public static WebElement newO2NumberPorting;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_NUMBER_PORTING:Number_Porting_Information:Number_Porting_0']"
    )
    public static WebElement numberPorting;
    @FindBy(
            how = How.XPATH,
            using = "//*[@id='Gamma_NUMBER_PORTING:Number_Porting_Information:Quantity_0']"
    )
    public static WebElement quantity1;
    @FindBy(
            how = How.XPATH,
            using = "(//*[text()='Finish'])[2]"
    )
    public static WebElement finish;

    @FindBy(
            how = How.XPATH,
            using = "//*[@id=\"j_id0:j_id2:0:j_id3:0:j_id6:2:j_id8:4:j_id20\"]/label/span"
    )
    public static WebElement gammaQuoteProfCheck;

    public configureGammaIboundNumber(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public void GammaInboundNumberConfiguation() throws InterruptedException, IOException {

        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("arguments[0].click()",inboundNumbers);
        WebDriverWait wait1 = new WebDriverWait(driver, 100);
        wait1.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);
        Thread.sleep(5000);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait2 = new WebDriverWait(driver, 600);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil));
        clickElement(edit_pencil);
        Thread.sleep(8000);
        WebDriverWait wait3 = new WebDriverWait(driver,15);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(20000);

        //Thread.sleep(10000);
        //JavascriptExecutor js = (JavascriptExecutor)this.driver;
        //scroll(add_product);
        //clickElement(add_product);
        //scroll(inboundNumbers);
        //clickElement(inboundNumbers);
        //clickElement(save_product);
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)", new Object[0]);
        //clickElement(edit_pencil);
        //Thread.sleep(4000);
        //driver.switchTo().frame(1);
        //Thread.sleep(6000);

        wait1.until(ExpectedConditions.visibilityOf(term));
        Thread.sleep(1000);
        wait1.until(ExpectedConditions.elementToBeClickable(term));
        Thread.sleep(1000);
        sendEnter(term, "12");
        dropDown(productType, "Inbound Numbers");
        Thread.sleep(5000);
        dropDown(MAC, "Managed");
        Thread.sleep(5000);
        sendKeys(managedService, "1200");
        Thread.sleep(5000);
        clickElement(gammaQuoteCheckox);
        Thread.sleep(5000);
        sendKeys(callPlanBuild, "12");
        sendEnter(projectManagementDeskBased, "12");
        sendKeys(endCustomerTraining, "12");
        sendEnter(projectManagementCustomerFacing, "12");
        sendKeys(outofHoursTesting, "12");
        sendKeys(professionalServicesOther, "12");
        Thread.sleep(2000);
        clickElement(gammaQuoteProfCheck);
        Thread.sleep(4000);
        dropDown(featureBundle, "Inbound Standard");
        Thread.sleep(6000);
        sendKeys(quantityofNumbers, "12");
        Thread.sleep(4000);
        //------------------------------------------------------------------
        clickElement(newOptionalFeatures);
        dropDown(quantityStorageonly, "51Mb up to 500Mb");
        Thread.sleep(4000);
        clickElement(continueBtn);
        //------------------------------------------------------------------
        clickElement(newO2Numbering);
        dropDown(numbering, "Number Selection 1-9");
        Thread.sleep(4000);
        sendKeys(quantity, "12");
        Thread.sleep(4000);
        clickElement(continueBtn);
        //------------------------------------------------------------------
        clickElement(newO2NumberPorting);
        dropDown(numberPorting, "Port Single Line");
        Thread.sleep(4000);
        sendEnter(quantity1, "12");
        Thread.sleep(4000);
        clickElement(continueBtn);
        //------------------------------------------------------------------
        Thread.sleep(2000);
        clickElement(finish);
        Thread.sleep(2000);
        logger.debug("Inbound Gamma is added into the basket");
        takeScreenShot("Inbound Gamma");
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
    }
}