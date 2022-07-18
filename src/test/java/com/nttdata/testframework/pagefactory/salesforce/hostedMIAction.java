package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
@Component
public class hostedMIAction extends PageObject{
    @Autowired
    public hostedMIAction(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @FindBy(how= How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[2]")
    public static WebElement edit_pencil;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:GENERAL_INFORMATION:Term_0']")
    public static WebElement term;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:GENERAL_INFORMATION:Total_Number_of_Sites_0']")
    public static WebElement totalNumOfSitesforhostedMI;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:GENERAL_INFORMATION:Service_Type_0']")
    public static WebElement serviceType;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:GENERAL_INFORMATION:Resiliency_0']")
    public static WebElement resiliency;
    //IPT Information to be passed manually
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:IPT__UC__BUSINESS_CONSOLE_AND_MOBILE_SOFTPHONE_USER_LICENCES:IPTBasicQuantity_0']")
    public static WebElement iptBasicLicQty;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:IPT__UC__BUSINESS_CONSOLE_AND_MOBILE_SOFTPHONE_USER_LICENCES:IPTStandardQuantity_0']")
    public static WebElement iptStandardLicQty;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:IPT__UC__BUSINESS_CONSOLE_AND_MOBILE_SOFTPHONE_USER_LICENCES:UCCEntryQuantity_0']")
    public static WebElement uccEntryLic;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:IPT__UC__BUSINESS_CONSOLE_AND_MOBILE_SOFTPHONE_USER_LICENCES:UCCStandardQuantity_0']")
    public static WebElement uccStndLic;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:IPT__UC__BUSINESS_CONSOLE_AND_MOBILE_SOFTPHONE_USER_LICENCES:UCCPremiumQuantity_0']")
    public static WebElement uccPremLic;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:IPT__UC__BUSINESS_CONSOLE_AND_MOBILE_SOFTPHONE_USER_LICENCES:MiCollabBusinessConsoleQuantity_0']")
    public static WebElement miColab;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:IPT__UC__BUSINESS_CONSOLE_AND_MOBILE_SOFTPHONE_USER_LICENCES:MiCollabVoiceBusinessConsoleQuantity_0']")
    public static WebElement MIVoice;
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:IPT__UC__BUSINESS_CONSOLE_AND_MOBILE_SOFTPHONE_USER_LICENCES:MobileSoftphoneQuantity_0']")
    public static WebElement mobSoftphone;
    //SIP Info to be passd from user
    @FindBy(how= How.XPATH, using = "//*[@id='Hosted_MiCloud:SIP_INFORMATION:SIP_Configuration_0']")
    public static WebElement SIPConfigg;
    @FindBy(how= How.XPATH, using = "//*[@id='screen-content-landmark']/div[8]/article/div/div[1]/div/button")
    public static WebElement hansetButton;
    @FindBy(how= How.XPATH, using = "//*[@id='MiCloud_Handsets_Peripherals:HANDSET_PERIPHERAL_INFORMATION:HandsetAndPeripheralType_0']")
    public static WebElement selectHandset;
    @FindBy(how= How.XPATH, using = "//*[@id='MiCloud_Handsets_Peripherals:HANDSET_PERIPHERAL_INFORMATION:Handsets_Peripherals_Quantity_0']")
    public static WebElement handsetQty;
    @FindBy(how= How.XPATH, using = "//*[@id='footer-landmark']/div/div[2]/button[2]")
    public static WebElement conti;
    @FindBy(how= How.XPATH, using = "//*[@id='screen-content-landmark']/div[9]/article/div/div[1]/div/button")
    public static WebElement thirdButton;
    @FindBy(how= How.XPATH, using = "//*[@id='Third_Party_Training:THIRD_PARTY_QUOTES_INFORMATION:Type_of_Quote_0']")
    public static WebElement thirdPartyType;
    @FindBy(how= How.XPATH, using = "//*[@id='Third_Party_Training:THIRD_PARTY_QUOTES_INFORMATION:SupplierName_0']")
    public static WebElement suplierName;
    @FindBy(how= How.XPATH, using = "//*[@id='Third_Party_Training:THIRD_PARTY_QUOTES_INFORMATION:SupplierQuoteReferenceNumber_0']")
    public static WebElement suplierRefNum;
    @FindBy(how= How.XPATH, using = "//*[@id='Third_Party_Training:THIRD_PARTY_QUOTES_INFORMATION:QuoteReceivedDate_0']")
    public static WebElement receiveDate;
    @FindBy(how= How.XPATH, using = "//*[@id='Third_Party_Training:THIRD_PARTY_QUOTES_INFORMATION:QuoteExpiryDate_0']")
    public static WebElement expiryDate;
    @FindBy(how= How.XPATH, using = "//*[@id='Third_Party_Training:THIRD_PARTY_QUOTES_INFORMATION:TotalThirdPartyCost_0']")
    public static WebElement thirdPartyOneOff;
    @FindBy(how= How.XPATH, using = "//*[@id='screen-content-landmark']/div[10]/article/div/div[1]/div/button")
    public static WebElement survivableGatewaybtn;
    @FindBy(how= How.XPATH, using = "//*[@id='MiCloud_Hardware:SURVIVABLE_GATEWAYS:Survivable_Gateway_Type_0']")
    public static WebElement survivableTypee;
    @FindBy(how= How.XPATH, using = "//*[@id='MiCloud_Hardware:SURVIVABLE_GATEWAYS:Survivable_Gateway_Quantity_0']")
    public static WebElement survivableQty;
    @FindBy(how= How.XPATH, using = "//*[@id='screen-content-landmark']/div[11]/article/div/div[1]/div/button")
    public static WebElement o2numportbtn;
    @FindBy(how= How.XPATH, using = "//*[@id='NUMBER_PORTING:Number_Porting_Information:Number_Porting_0']")
    public static WebElement o2type;
    @FindBy(how= How.XPATH, using = "//*[@id='NUMBER_PORTING:Number_Porting_Information:Quantity_0']")
    public static WebElement o2numqty;
    @FindBy(how= How.XPATH, using = "//*[@id='screen-content-landmark']/div[12]/article/div/div[1]/div/button")
    public static WebElement o2numberingbtn;
    @FindBy(how= How.XPATH, using = "//*[@id='Numbers:NUMBERS_INFORMATION:Number_Type_0']")
    public static WebElement o2numType;
    @FindBy(how= How.XPATH, using = "//*[@id='Numbers:NUMBERS_INFORMATION:Quantity_0']")
    public static WebElement numqty;
    @FindBy(how= How.XPATH, using = "//*[@id='screen-content-landmark']/div[13]/article/div/div[1]/div/button")
    public static WebElement iptbtn;
    @FindBy(how= How.XPATH, using = "//*[@id='IPT_and_UC_Additional_MACD:IPT_AND_UC_ADDITIONAL_MACD_INFORMATION_SECTION:Text_0']")
    public static WebElement macReq;
    @FindBy(how= How.XPATH, using = "//*[@id='IPT_and_UC_Additional_MACD:IPT_AND_UC_ADDITIONAL_MACD_INFORMATION_SECTION:Quantity_0']")
    public static WebElement macqty;
    @FindBy(how=How.XPATH, using="(//*[@class='slds-button slds-button--brand'])[2]")
    public static WebElement finish;
    //MobileRecording Objects
    @FindBy(how= How.XPATH, using = "(//div[@ng-if='isAction()']//button)[2]")
    public static WebElement edit_pencil_mobRec;
    @FindBy(how= How.XPATH, using = "//*[@id='Mobile_Recording:LICENSE_INFORMATION:License_Term_0']")
    public static WebElement term_mobRec;
    @FindBy(how= How.XPATH, using = "//*[@id='Mobile_Recording:LICENSE_INFORMATION:Quantity_0']")
    public static WebElement qty_mobRec;
    @FindBy(how= How.XPATH, using = "//*[@id='Mobile_Recording:SOLUTION_INFORMATION:Solution_0']")
    public static WebElement solution_mobRec;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id2:0:j_id3:0:j_id6:2:j_id8:0:j_id20']/label/span")
    public static WebElement sftp;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id2:0:j_id3:0:j_id6:2:j_id8:0:j_id139']/label/span")
    public static WebElement sms;

    //Inbound Objects
    @FindBy(how= How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[3]")
    public static WebElement edit_pencil_inb;
    @FindBy(how= How.XPATH, using = "//*[@id='Inbound_Numbers__TalkTalk_:General_Information:License_Period_0']")
    public static WebElement term_inb;
    @FindBy(how= How.XPATH, using = "//*[@id='Inbound_Numbers__TalkTalk_:General_Information:Product_Type_0']")
    public static WebElement prodType_inb;
    @FindBy(how= How.XPATH, using = "//*[@id='Inbound_Numbers__TalkTalk_:TalkTalk__Managed_Services:MAC_0']")
    public static WebElement MAC_inb;
    @FindBy(how= How.XPATH, using = "//*[@id='Inbound_Numbers__TalkTalk_:TalkTalk_Professional_Services:Discovery_and_Document_0']")
    public static WebElement discAndDocDays_inb;
    @FindBy(how= How.XPATH, using = "//*[@id='Inbound_Numbers__TalkTalk_:TalkTalk_Professional_Services:Build_and_Test_0']")
    public static WebElement buildAndTestDays_inb;
    @FindBy(how= How.XPATH, using = "//*[@id='Inbound_Numbers__TalkTalk_:TalkTalk_Professional_Services:Post_Project_Management_0']")
    public static WebElement portDay_inb;
    @FindBy(how= How.XPATH, using = "//*[@id='Inbound_Numbers__TalkTalk_:TalkTalk_Professional_Services:Platform_Development_0']")
    public static WebElement platformDays_inb;
    @FindBy(how= How.XPATH, using = "//*[@id='screen-content-landmark']/div[6]/article/div/div[1]/div/button")
    public static WebElement newFeature_inb;
    @FindBy(how= How.XPATH, using = "//*[@id='Feature:Feature_Information:Features_0']")
    public static WebElement feature_inb;

    @FindBy(how= How.XPATH, using = "//*[@id='Feature:Feature_Information:Quantity_0']")
    public static WebElement qty_inb;

    @FindBy(how= How.XPATH, using = "//*[@id='footer-landmark']/div/div[2]/button[2]")
    public static WebElement cont_inb;
//Adding Products into basket
@FindBy(how= How.XPATH, using = "//*[@id=\"a1y9E000001fepzQAA~a2I9E000001uNYyUAM_anchor\"]")
public static  WebElement MobileRecording;
    @FindBy(how= How.XPATH, using = "//*[@id=\"a1y9E000001fswGQAQ~a2I9E000001uNYyUAM_anchor\"]")
    public static  WebElement HostedMICloud;
    @FindBy(how= How.XPATH, using = "//*[@id=\"a1y9E000001feppQAA~a2I9E000001uNYyUAM_anchor\"]")
    public static  WebElement InboundNumb;
    @FindBy(how= How.XPATH, using = "//*[@class='btn label icon-add']")
    public static WebElement save_product;

    public void addProducts() throws Throwable {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(HostedMICloud));
        clickElement(MobileRecording);
        clickElement(HostedMICloud);
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickElement(InboundNumb);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);
        Thread.sleep(4000);
        logger.debug("Products are added in the basket");

    }

    public void configMobRecordingAndInboundNum(String MobileRecording_Term, String MobRcordingsolution, String SFTP_Transmission, String SMS2Email_Transmission, String inbound_Term, String Product_Type, String MAC, String DiscoveryAndDocumentDays, String BuildAndTestDays, String PortDays, String PlatformDevelopmentDaysDays, String InboundNumberFeature) throws Throwable{
        //Thread.sleep(15000);
        Thread.sleep(15000);
        //driver.navigate().refresh();
        //Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait1 = new WebDriverWait(driver, 500);
        wait1.until(ExpectedConditions.visibilityOf(edit_pencil_mobRec));
        Thread.sleep(2000);
        WebDriverWait wait2 = new WebDriverWait(driver, 500);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil_mobRec));
        Thread.sleep(2000);
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        if (edit_pencil_mobRec.isEnabled()) {
            logger.debug("Mobile Recording product is present in Basket");
        } else {
            logger.debug("Mobile Recording product is not present in Basket");
        }
        driver.navigate().refresh();
        Thread.sleep(10000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait1.until(ExpectedConditions.visibilityOf(edit_pencil_mobRec));
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil_mobRec));
        Thread.sleep(2000);
        clickElement(edit_pencil_mobRec);
        Thread.sleep(10000);
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        Thread.sleep(10000);
        sendKeys(term_mobRec,MobileRecording_Term);
        term_mobRec.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        sendKeys(qty_mobRec,"123");
        qty_mobRec.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        dropDown(solution_mobRec,MobRcordingsolution);
        Thread.sleep(5000);
        if(SFTP_Transmission.equalsIgnoreCase("Yes")) {
            clickElement(sftp);
        }

        if(SMS2Email_Transmission.equalsIgnoreCase("Yes")) {
            Thread.sleep(8000);
            clickElement(sms);
        }
        Thread.sleep(5000);
        clickElement(finish);
        Thread.sleep(15000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        logger.debug("MobileRecording has been configured");

        Thread.sleep(15000);
        driver.navigate().refresh();
        Thread.sleep(10000);

       // Thread.sleep(30000);
        //JavascriptExecutor jsi = (JavascriptExecutor) driver;
        //jsi.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //clickElement(edit_pencil_inb);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait4 = new WebDriverWait(driver, 500);
        wait4.until(ExpectedConditions.visibilityOf(edit_pencil_inb));
        Thread.sleep(2000);
        WebDriverWait wait5 = new WebDriverWait(driver, 500);
        wait5.until(ExpectedConditions.elementToBeClickable(edit_pencil_inb));
        Thread.sleep(2000);
        if (edit_pencil_inb.isEnabled()) {
            logger.debug("inboundNumberTalkTalk product is present in Basket");
        } else {
            logger.debug("inboundNumberTalkTalk product is not present in Basket");
        }
        Thread.sleep(3000);
        clickElement(edit_pencil_inb);
        Thread.sleep(15000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));

        //driver.switchTo().frame(1);
       Thread.sleep(12000);
        sendKeys(term_inb,inbound_Term);
        //Thread.sleep(3000);
        if(Product_Type.equals("CC2")) {
            dropDown(prodType_inb,Product_Type);
            Thread.sleep(3000);
            dropDown(MAC_inb,MAC);
            Thread.sleep(3000);
        }
        else {
            dropDown(prodType_inb,Product_Type);
            Thread.sleep(3000);
        }
        if(DiscoveryAndDocumentDays.isEmpty()){
            sendKeys(discAndDocDays_inb,"");
        }
        else {
            sendKeys(discAndDocDays_inb,DiscoveryAndDocumentDays);
        }
        Thread.sleep(3000);
        if(BuildAndTestDays.isEmpty()){
            sendKeys(buildAndTestDays_inb,"");
        }
        else {
            sendKeys(buildAndTestDays_inb,BuildAndTestDays);
        }
        Thread.sleep(5000);
        if(PortDays.isEmpty()){
            sendKeys(portDay_inb,"");
        }
        else{
            sendKeys(portDay_inb,PortDays);
        }
        Thread.sleep(8000);
        if(PlatformDevelopmentDaysDays.isEmpty()){
            sendKeys(platformDays_inb,"");
        }
        else{
            sendKeys(platformDays_inb,PlatformDevelopmentDaysDays);
        }
        Thread.sleep(5000);
        clickElement(newFeature_inb);
        Thread.sleep(5000);
        dropDown(feature_inb,InboundNumberFeature);
       Thread.sleep(8000);
        sendKeys(qty_inb,"232");
        //Thread.sleep(2000);
        clickElement(cont_inb);
        Thread.sleep(5000);
        clickElement(finish);
        Thread.sleep(10000);
        driver.switchTo().defaultContent();
        logger.debug("Inbound has been configured");
        takeScreenShot("Inbound configured");
    }

    public void hostedMIconfig(String hostedTerm, String totalNumOfSites, String ServiceTypes, String SIPConfig, String selectHandsetType, String HandsetQty, String ThirdPartyType, String survivableType, String SurveyQty, String numPrtType, String TotalnumPortQty, String O2numType, String qtynumType, String macdReq, String totalmacdQty) throws Throwable{
        Thread.sleep(15000);
        //driver.navigate().refresh();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        clickElement(edit_pencil);
        Thread.sleep(8000);
        driver.switchTo().frame(1);
        Thread.sleep(5000);
        dropDown(term,hostedTerm);
        Thread.sleep(15000);
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.visibilityOf(totalNumOfSitesforhostedMI));
        Thread.sleep(2000);
        wait1.until(ExpectedConditions.elementToBeClickable(totalNumOfSitesforhostedMI));
        Thread.sleep(2000);
        sendKeys(totalNumOfSitesforhostedMI,totalNumOfSites);
        totalNumOfSitesforhostedMI.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        dropDown(serviceType,ServiceTypes);
        Thread.sleep(18000);
        wait1.until(ExpectedConditions.visibilityOf(iptBasicLicQty));
        Thread.sleep(2000);
        //IP Configuration
        sendKeys(iptBasicLicQty,"234");
        clickElement(iptStandardLicQty);
        Thread.sleep(12000);
        wait1.until(ExpectedConditions.visibilityOf(iptStandardLicQty));
        Thread.sleep(2000);
        wait1.until(ExpectedConditions.elementToBeClickable(iptStandardLicQty));
        Thread.sleep(2000);
        sendKeys(iptStandardLicQty,"234");
        clickElement(uccEntryLic);
        Thread.sleep(15000);
        wait1.until(ExpectedConditions.visibilityOf(uccEntryLic));
        Thread.sleep(2000);
        sendKeys(uccEntryLic,"234");
        clickElement(uccStndLic);
        Thread.sleep(20000);
        wait1.until(ExpectedConditions.visibilityOf(uccStndLic));
        Thread.sleep(2000);
        sendKeys(uccStndLic,"234");
        //uccStndLic.sendKeys(Keys.ENTER);
        clickElement(uccPremLic);
        Thread.sleep(15000);
        wait1.until(ExpectedConditions.visibilityOf(uccPremLic));
        Thread.sleep(2000);
        sendKeys(uccPremLic,"234");
        clickElement(miColab);
       // uccPremLic.sendKeys(Keys.ENTER);
        Thread.sleep(15000);
        wait1.until(ExpectedConditions.visibilityOf(miColab));
        Thread.sleep(2000);
        sendKeys(miColab,"234");
        //Thread.sleep(5000);
        clickElement(MIVoice);
        Thread.sleep(15000);
        wait1.until(ExpectedConditions.visibilityOf(MIVoice));
        Thread.sleep(2000);
        sendKeys(MIVoice,"234");
        //Thread.sleep(5000);
        clickElement(mobSoftphone);
        Thread.sleep(15000);
        wait1.until(ExpectedConditions.visibilityOf(mobSoftphone));
        Thread.sleep(2000);
        sendKeys(mobSoftphone,"234");
        dropDown(SIPConfigg,SIPConfig);
        Thread.sleep(5000);
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
       // WebElement Elem4= webDriverWait.until(ExpectedConditions.visibilityOf(hansetButton));
        js4.executeScript("arguments[0].scrollIntoView();", hansetButton);
        clickElement(hansetButton);
        Thread.sleep(5000);
        dropDown(selectHandset,selectHandsetType);
        Thread.sleep(12000);
        wait1.until(ExpectedConditions.visibilityOf(handsetQty));
        Thread.sleep(2000);
        sendKeys(handsetQty,HandsetQty);
        Thread.sleep(2000);
        clickElement(conti);
        Thread.sleep(5000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        WebElement Elem5= webDriverWait.until(ExpectedConditions.visibilityOf(thirdButton));
        js5.executeScript("arguments[0].scrollIntoView();", Elem5);
        clickElement(Elem5);
        Thread.sleep(5000);
        dropDown(thirdPartyType,ThirdPartyType);
        Thread.sleep(5000);
        sendKeys(suplierName,"Test");
        Thread.sleep(2000);
        sendKeys(suplierRefNum,"Test123");
        Thread.sleep(2000);
        sendKeys(receiveDate,"04/05/2022");
        Thread.sleep(2000);
        sendKeys(expiryDate,"12/12/2024");
        Thread.sleep(2000);
        sendKeys(thirdPartyOneOff,"11112");
        Thread.sleep(2000);
        clickElement(conti);
        Thread.sleep(7000);

        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        WebElement Elem6= webDriverWait.until(ExpectedConditions.visibilityOf(survivableGatewaybtn));
        js6.executeScript("arguments[0].scrollIntoView();", Elem6);
        clickElement(Elem6);
        Thread.sleep(5000);
        dropDown(survivableTypee,survivableType);
        Thread.sleep(8000);
        sendKeys(survivableQty,SurveyQty);
        //Thread.sleep(2000);
        clickElement(conti);
       // Thread.sleep(7000);

        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        WebElement Elem7= webDriverWait.until(ExpectedConditions.visibilityOf(o2numportbtn));
        js7.executeScript("arguments[0].scrollIntoView();", Elem7);
        clickElement(Elem7);
        Thread.sleep(5000);
        dropDown(o2type,numPrtType);
        Thread.sleep(8000);
        sendKeys(o2numqty,TotalnumPortQty);
       Thread.sleep(5000);
        clickElement(conti);
      //  Thread.sleep(7000);

        JavascriptExecutor js8 = (JavascriptExecutor) driver;
        WebElement Elem8= webDriverWait.until(ExpectedConditions.visibilityOf(o2numberingbtn));
        js8.executeScript("arguments[0].scrollIntoView();", Elem8);
        clickElement(Elem8);
        Thread.sleep(8000);
        dropDown(o2numType,O2numType);
        Thread.sleep(8000);
        sendKeys(numqty,qtynumType);
        Thread.sleep(4000);
        clickElement(conti);
       // Thread.sleep(7000);

        JavascriptExecutor js9 = (JavascriptExecutor) driver;
        WebElement Elem9= webDriverWait.until(ExpectedConditions.visibilityOf(iptbtn));
        js9.executeScript("arguments[0].scrollIntoView();", Elem9);
        clickElement(Elem9);
        Thread.sleep(8000);
        sendKeys(macReq,macdReq);
        Thread.sleep(8000);
        sendKeys(macqty,totalmacdQty);
        //Thread.sleep(2000);
        clickElement(conti);
       Thread.sleep(8000);
        clickElement(finish);
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        logger.debug("hostedMICloud has been configured");
        takeScreenShot("hostedMICloud configured");
    }
}
