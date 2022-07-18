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
public class configureFixedLines extends PageObject {
    @FindBy(how = How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']")
    public static WebElement add_product;
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001c2A2QAI~a2I9E000001uNYyUAM_anchor\"]")
    public static WebElement fixedLine;
    @FindBy(how = How.XPATH, using = "//*[@class='btn label icon-add']")
    public static WebElement save_product;
    @FindBy(how = How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[4]")
    public static WebElement edit_pencil;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:General_Information:License_Period_0']")
    public static WebElement terms;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:BASIC_PSTN_LINES_SERVICE_INFORMATION:BasicPSTN_Quan_LineInstall_0']")
    public static WebElement quantityofNewLineInstallations;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:BASIC_PSTN_LINES_SERVICE_INFORMATION:BasicPSTN_Quan_LineTransfer_0']")
    public static WebElement quantityofLineTransfers;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:BASIC_PSTN_LINES_SERVICE_INFORMATION:BasicPSTN_Quan_Cnvrsn_from_PremiumLines_0']")
    public static WebElement quantityoflinesconvertedfromPremiumPSTNtoBasicPSTN;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:BASIC_PSTN_LINES_SERVICE_INFORMATION:BasicPSTN_Quan_lines_resigned_0']")
    public static WebElement quantityofLinesBeingResigned;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:BASIC_PSTN_LINES_ADDITIONAL_SUPPORT_INFORMATION:BasicPSTN_Quan_UpCareLvl2_0']")
    public static WebElement quantityofUpgradestoCareLevel2;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:BASIC_PSTN_LINES_ADDITIONAL_SUPPORT_INFORMATION:BasicPSTN_Quan_UpCareLvl3_0']")
    public static WebElement quantityofUpgradestoCareLevel3;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:BASIC_PSTN_LINES_ADDITIONAL_SUPPORT_INFORMATION:BasicPSTN_Quan_UpCareLvl4_0']")
    public static WebElement quantityofUpgradestoCareLevel4;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:PREMIUM_PSTN_LINES_SERVICE_INFORMATION:PremiumPSTN_Quan_LineInstall_0']")
    public static WebElement quantityofNewLineInstallationsChargable;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:PREMIUM_PSTN_LINES_SERVICE_INFORMATION:PremiumPSTN_Quan_LineTransfer_0']")
    public static WebElement quantityofLineTransfersFreeofCharge;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:PREMIUM_PSTN_LINES_SERVICE_INFORMATION:PremiumPSTN_Quan_LineResigned_0']")
    public static WebElement quantityofLinesBeingResigned1;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:PREMIUM_PSTN_LINES_ADDITIONAL_SUPPORT_INFORMATION:PremiumPSTN_Quan_UpCareLvl3_0']")
    public static WebElement quantityofUpgradestoCareLevel3_1;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:PREMIUM_PSTN_LINES_ADDITIONAL_SUPPORT_INFORMATION:PremiumPSTN_Quan_UpCareLvl4_0']")
    public static WebElement quantityofUpgradestoCareLevel4_1;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_2_Lines_Service_Information:ISDN2_Chrg_Quan_LineInstall_0']")
    public static WebElement quantityofNewLineInstallations_1;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_2_Lines_Service_Information:ISDN2_Free_Quan_LineTransfer_0']")
    public static WebElement quantityofLineTransfers_1;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_2_Lines_Service_Information:ISDN2_Chrg_Quan_LineTransfer_0']")
    public static WebElement quantityofLineTransfers_2;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_2_Lines_Service_Information:ISDN2_Quan_ChannelsResigned_0']")
    public static WebElement quantityofChannelsbeingResigned;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_2_Lines_ADDITIONAL_SUPPORT_iNFORMATION:ISDN2_Quan_UpCareLvl3_0']")
    public static WebElement quantityofUpgradestoCareLevel3_2;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_2_Lines_ADDITIONAL_SUPPORT_iNFORMATION:ISDN2_Quan_UpCareLvl4_0']")
    public static WebElement quantityofUpgradestoCareLevel4_2;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_2_DDI_INFORMATION:ISDN2_Quan_DDI_ToTransfer_0']")
    public static WebElement quantityofDDItoTransfer;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_Service_Information:ISDN30_Chrg_Quan_LineTransfer_0']")
    public static WebElement quantityofExistingBearerstoTransfer;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_Service_Information:ISDN30_Free_Quan_LineTransfer_0']")
    public static WebElement quantityofExistingBearerstoTransfer_1;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_Service_Information:ISDN30_Bearer_QuanLineInstall_0']")
    public static WebElement quantityofNewBearerInstallations;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_Service_Information:ISDN30_Channel_QuanLineInstall_0']")
    public static WebElement quantityofNewChannelsRequired;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_Service_Information:ISDN30_TransferExistingChannels_0']")
    public static WebElement quantityofExistingChannelsbeingTransferred;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_Service_Information:ISDN30_Quan_BearersResigned_0']")
    public static WebElement quantityofBearersbeingResigned;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_Service_Information:ISDN30_Quan_ChannelsResigned_0']")
    public static WebElement quantityofChannelsbeingResigned_1;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_Service_Information:ISDN30_QuanChannelRentals_0']")
    public static WebElement totalQuantityofISDN30Channels;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_ADDITIONAL_SUPPORT_INFORMATION:ISDN30_Quan_UpCareLvl3_0']")
    public static WebElement quantityofUpgradestoCareLevel3_3;
    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_Lines_ADDITIONAL_SUPPORT_INFORMATION:ISDN30_Quan_UpCareLvl4_0']")
    public static WebElement quantityofUpgradestoCareLevel4_3;

    @FindBy(how = How.XPATH, using = "//*[@id='Fixed_Lines:ISDN_30_DDI_INFORMATION:ISDN30_Quan_DDI_ToTransfer_0']")
    public static WebElement quantityofDDItoTransfer_1;

    //==========Nuvoli=============
    @FindBy(how = How.XPATH, using = "//*[text()='New Nuvoli']")
    public static WebElement new_Nuvoli;
    @FindBy(how = How.XPATH, using = "//*[@id='Nuvoli:Nuvoli_Audit:Number_of_Lines_and_Channels_0']")
    public static WebElement totalNumberofLinesandChannels;
    @FindBy(how = How.XPATH, using = "//*[@id='Nuvoli:Telecoms_Expense_Management:Monthly_Recurring_Cost_0']")
    public static WebElement monthlyRecurringCost;
    @FindBy(how = How.XPATH, using = "//*[@id='Nuvoli:Telecoms_Expense_Management:Monthly_Recurring_Price_0']")
    public static WebElement monthlyRecurringPrice;
    @FindBy(how = How.XPATH, using = "//*[@id=\"j_id0:j_id2:0:j_id3:0:j_id6:1:j_id8:1:j_id20\"]/label/span")
    public static WebElement nuvoliCheckBox;
    @FindBy(how= How.XPATH, using = "(//*[text()='Continue'])[2]")
    public static WebElement continueBtn;

    //============Business Continuity Option===============
    @FindBy(how = How.XPATH, using = "//*[text()='New Business Continuity Option']")
    public static WebElement newBusinessContinuityOption;
    @FindBy(how = How.XPATH, using = "//*[@id='BUSINESS_CONTINUITY_OPTION:SERVICE_INFORMATION:Business_Continuity_Option_0']")
    public static WebElement businessContinuityOption;
    @FindBy(how = How.XPATH, using = "//*[@id='BUSINESS_CONTINUITY_OPTION:SERVICE_INFORMATION:One_Off_Cost_from_OpenReach_0']")
    public static WebElement oneOffInstallationCost;
    @FindBy(how = How.XPATH, using = "//*[@id='BUSINESS_CONTINUITY_OPTION:SERVICE_INFORMATION:Recurring_Cost_from_OpenReach_0']")
    public static WebElement monthlyRecurringCost_1;

    //============Features===============
    @FindBy(how = How.XPATH, using = "//*[text()='New Features']")
    public static WebElement new_Features;
    @FindBy(how = How.XPATH, using = "//*[@id='Features:Feature_Information:Description_0']")
    public static WebElement Description;
    @FindBy(how = How.XPATH, using = "//*[@id='Features:Cost_and_Price_Information:One_Off_Cost_Feature_0']")
    public static WebElement oneOffCost;
    @FindBy(how = How.XPATH, using = "//*[@id='Features:Cost_and_Price_Information:One_Off_Price_Feature_0']")
    public static WebElement oneOffPrice;
    @FindBy(how = How.XPATH, using = "//*[@id='Features:Cost_and_Price_Information:Recurring_Feature_Cost_0']")
    public static WebElement monthlyRecurringCost_2;
    @FindBy(how = How.XPATH, using = "//*[@id='Features:Cost_and_Price_Information:Recurring_Feature_Price_0']")
    public static WebElement monthlyRecurringPrice_2;

//=============    Business Broadband    =====================
    @FindBy(how= How.XPATH, using = "(//*[text()='Finish'])[2]")
    public static WebElement finish;

    public configureFixedLines(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public void fixedLineConfiguation() throws InterruptedException, IOException {
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("arguments[0].click()",fixedLine);
        WebDriverWait wait1 = new WebDriverWait(driver, 100);
        wait1.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);
        Thread.sleep(5000);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait2 = new WebDriverWait(driver, 600);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil));
        clickElement(edit_pencil);
        //Thread.sleep(10000);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll(add_product);
        //clickElement(add_product);
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //clickElement(fixedLine);
        //clickElement(save_product);
        //scroll(edit_pencil);
        //clickElement(edit_pencil);
        Thread.sleep(8000);
        WebDriverWait wait3 = new WebDriverWait(driver,15);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(20000);
        wait1.until(ExpectedConditions.visibilityOf(terms));
        Thread.sleep(1000);
        wait1.until(ExpectedConditions.elementToBeClickable(terms));
        Thread.sleep(1000);
        sendKeys(terms,"12");

        sendEnter(quantityofNewLineInstallations,"12");
        Thread.sleep(5000);
        sendEnter(quantityofLineTransfers,"12");
        Thread.sleep(8000);
        sendEnter(quantityoflinesconvertedfromPremiumPSTNtoBasicPSTN,"12");
        Thread.sleep(5000);
        sendEnter(quantityofLinesBeingResigned,"12");
        Thread.sleep(5000);

        sendEnter(quantityofUpgradestoCareLevel2,"12");
        Thread.sleep(5000);
        sendEnter(quantityofUpgradestoCareLevel3,"12");
        Thread.sleep(5000);
        sendEnter(quantityofUpgradestoCareLevel4,"12");
        Thread.sleep(5000);

        sendEnter(quantityofNewLineInstallationsChargable,"12");
        Thread.sleep(5000);
        sendEnter(quantityofLineTransfersFreeofCharge,"12"); // Issue
        Thread.sleep(5000);
        sendEnter(quantityofLinesBeingResigned1,"12");
        Thread.sleep(5000);

        sendEnter(quantityofUpgradestoCareLevel3_1,"12");
        Thread.sleep(5000);
        sendEnter(quantityofUpgradestoCareLevel4_1,"12");
        Thread.sleep(5000);

        sendEnter(quantityofNewLineInstallations_1,"12");
        Thread.sleep(5000);
        sendEnter(quantityofLineTransfers_1,"12");
        Thread.sleep(5000);
        sendEnter(quantityofLineTransfers_2,"12");
        Thread.sleep(8000);
        sendEnter(quantityofChannelsbeingResigned,"12");
        Thread.sleep(5000);

        sendEnter(quantityofUpgradestoCareLevel3_2,"12");
        Thread.sleep(5000);
        sendEnter(quantityofUpgradestoCareLevel4_2,"12");
        Thread.sleep(5000);

        sendEnter(quantityofDDItoTransfer,"12");
        Thread.sleep(5000);

        sendEnter(quantityofExistingBearerstoTransfer,"12");
        Thread.sleep(5000);
        sendEnter(quantityofExistingBearerstoTransfer_1,"12");
        Thread.sleep(5000);
        sendEnter(quantityofNewBearerInstallations,"12");
        Thread.sleep(5000);
        sendEnter(quantityofNewChannelsRequired,"12");
        Thread.sleep(5000);
        sendEnter(quantityofExistingChannelsbeingTransferred,"12");
        Thread.sleep(5000);
        sendEnter(quantityofBearersbeingResigned,"12");
        Thread.sleep(5000);
        sendEnter(quantityofChannelsbeingResigned_1,"12");
        Thread.sleep(5000);
        sendEnter(totalQuantityofISDN30Channels,"500");
        Thread.sleep(5000);

        sendEnter(quantityofUpgradestoCareLevel3_3,"12");
        Thread.sleep(5000);
        sendEnter(quantityofUpgradestoCareLevel4_3,"12");
        Thread.sleep(5000);

        sendEnter(quantityofDDItoTransfer_1,"12");
        Thread.sleep(5000);
        //------------------------------------------------------------------
       /* clickElement(new_Nuvoli);
        Thread.sleep(5000);
        sendEnter(totalNumberofLinesandChannels,"12");
        Thread.sleep(5000);
        sendEnter(monthlyRecurringCost,"12");
        Thread.sleep(5000);
        sendEnter(monthlyRecurringPrice,"12");
        Thread.sleep(5000);
        clickElement(nuvoliCheckBox);
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(5000);*/
        //------------------------------------------------------------------
        clickElement(newBusinessContinuityOption);
        Thread.sleep(5000);
        dropDown(businessContinuityOption,"Alternative Routing");
        Thread.sleep(5000);
        sendEnter(oneOffInstallationCost,"12");
        Thread.sleep(5000);
        sendEnter(monthlyRecurringCost_1,"12");
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(5000);
        //------------------------------------------------------------------
        clickElement(new_Features);
        Thread.sleep(5000);
        sendEnter(Description,"Test");
        Thread.sleep(8000);
        sendEnter(oneOffCost,"12");
        Thread.sleep(5000);
        sendEnter(oneOffPrice,"12");
        Thread.sleep(5000);
        sendEnter(monthlyRecurringCost_2,"12");
        Thread.sleep(5000);
        sendEnter(monthlyRecurringPrice_2,"12");
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(13000);
        //------------------------------------------------------------------
        wait1.until(ExpectedConditions.visibilityOf(finish));
        Thread.sleep(1000);
        wait1.until(ExpectedConditions.elementToBeClickable(finish));
        Thread.sleep(1000);
        clickElement(finish);
        Thread.sleep(2000);
        logger.debug("Fixed Line is added into the basket");
        takeScreenShot("Fixed Line");
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
    }
}
