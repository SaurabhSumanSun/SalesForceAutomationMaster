package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.Set;

@Component
public class connectivityDrop1Configuration extends PageObject {

    @Autowired
    public connectivityDrop1Configuration(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id32\"]/div/div[3]/div[2]/div[2]/div/div[1]/header/div[4]/div[4]/span/button")
    public static WebElement AddSol;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id2\"]/app-root/main/div[2]/app-cs-complex-product-components/div/div/button")
    public static WebElement AddnewSolution;
    @FindBy(how= How.XPATH, using = "//*[@id=\"modal-content-id-1\"]/article[1]/div")
    public static WebElement MWANProd;
    @FindBy(how= How.XPATH, using = "	//*[@id=\"j_id0:j_id2\"]/app-root/div[3]/div/button")
    public static WebElement AddbewSolution1;
    @FindBy(how= How.XPATH, using = "//*[@id=\"mat-dialog-1\"]/app-solution-template-selection/section/div/footer/button[2]")
    public static WebElement Addbtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"mat-dialog-0\"]/app-solution-template-selection/section/div/footer/button[1]")
    public static WebElement Cancelbtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"redirecToCircuit\"]/span[2]")
    public static WebElement configurecircuit;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:thePageBlockTable1:0:c1\"]")
    public static WebElement Sitecheckbox;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:AddSite\"]")
    public static WebElement AddSiteGrpbtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:j_id129\"]")
    public static WebElement groupName;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:j_id140\"]")
    public static WebElement resiliency;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:j_id148\"]")
    public static WebElement Primarycircuittype;
    @FindBy(how= How.XPATH, using = "//*[@id=\"example\"]/tbody/tr[4]/td[1]/select")
    public static WebElement PrimaryAccesstype;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:AddSites\"]")
    public static WebElement savebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"closePopup\"]")
    public static WebElement closebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:thePageBlockTable1:1:c1\"]")
    public static WebElement Site2chck;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:thePageBlockTable1:2:c1\"]")
    public static WebElement Site2chck1;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:j_id154\"]")
    public static WebElement SecondaryCircuitType;
    @FindBy(how= How.XPATH, using = "//*[@id=\"example\"]/tbody/tr[4]/td[2]/select")
    public static WebElement secondaryAccessType;
    @FindBy(how= How.XPATH, using = "//*[@id=\"redirecToRouter\"]/span[2]")
    public static WebElement configurerouter;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock3:thePageBlockTable6:0:Chkdone\"]")
    public static WebElement routerSiteCheckbox;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:AddSite\"]")
    public static WebElement AddRouter;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:j_id120:sect1:InputFieldId\"]")
    public static WebElement routerquantity;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:j_id120:sect1:CPE1\"]")
    public static WebElement CPE1;
    @FindBy(how= How.XPATH, using = "//*[@id=\"example2\"]/tbody/tr/td[2]/select")
    public static WebElement Maintenance;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:j_id120:sect5:AddSites\"]")
    public static WebElement routersavebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"closePopup\"]")
    public static WebElement routerclosebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock3:thePageBlockTable6:1:j_id349\"]")
    public static WebElement sitecheckbox2;
    @FindBy(how= How.XPATH, using = "//*[@id=\"redirecToCOS\"]/span[2]")
    public static WebElement configurecos;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:pageBlock3:thePageBlockTable6:0:j_id228\"]")
    public static WebElement cossitechckbx;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:pageBlock3:thePageBlockTable6:1:Chkdone\"]")
    public static WebElement cossitechckbx2;
    @FindBy(how= How.XPATH, using = "//*[@id=\"examplesss\"]/tbody/tr[1]/td/select")
    public static WebElement quantityofVPN;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:AddSite1\"]")
    public static WebElement AddCos;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:j_id60:AddSites2\"]")
    public static WebElement cossavebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"closePopup\"]")
    public static WebElement cosclosebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:j_id60:sect1:j_id90\"]")
    public static WebElement COSEF;
    @FindBy(how= How.XPATH, using = "//*[@id=\"mwanVP\"]/span[2]")
    public static WebElement configureManagedServices;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:pageBlock3:thePageBlockTable6:0:j_id169\"]")
    public static WebElement ManagedServiceSiteChckbx;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:showServiceAvail\"]")
    public static WebElement AddManagedServices;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:showVisibilityData:sect1:VisibilityPortalTier\"]")
    public static WebElement MWANVisibilityTier;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Controller:theForm:pageBlock1:saveButton\"]")
    public static WebElement ManagedServicesSavebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"closePopup\"]")
    public static WebElement ManagedServicesClosebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"createConfigs\"]/span[2]")
    public static WebElement createconfigurationbtn;
    @FindBy(how= How.XPATH, using = "//html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/app-navigation-bar/article/div/div/div[1]/div/div/ul/li[3]/a/span[2]")
    public static WebElement MSDashboard;
    @FindBy(how= How.XPATH, using = "//*[@id=\"calculateMS\"]")
    public static WebElement calculateMS;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[3]/app-specification-editor/app-navigation-bar/article/div/div/div[1]/div/div/ul/li[4]/a/span[2]")
    public static WebElement PSDashboard;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id2\"]/app-root/div[3]/div[2]/button")
    public static WebElement CalculateTotalabondansavebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"calculatePS\"]/span[2]")
    public static WebElement calculatePS;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id2\"]/app-root/main/div[2]/app-cs-complex-product-components/div[4]/app-specification-editor/app-navigation-bar/article/div/div/div[3]/button")
    public static WebElement calculatetotals;
    @FindBy(how= How.XPATH, using = "//*[@id=\"backToBasketInternal\"]")
    public static WebElement backtobasket;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id32\"]/div/div[3]/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[1]/div/div/div/div[1]/div/div[1]/button[2]")
    public static WebElement editbtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Private_Mobile_Access:General_Information:Contract_Term_0\"]")
    public static WebElement PMATerm;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Private_Mobile_Access:General_Information:Bandwidth_0\"]")
    public static WebElement PMABAndwidth;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Private_Mobile_Access:General_Information:APN_0\"]")
    public static WebElement QuantityOfAPN;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Private_Mobile_Access:General_Information:Additional_Notes_0\"]")
    public static WebElement VRFTextBox;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Private_Mobile_Access:Site_Details:Select_how_many_sites_the_PMA_will_be_delivered_into_0\"]")
    public static WebElement NumberofSites;
    @FindBy(how= How.XPATH, using = "//*[@id=\"s2id_Private_Mobile_Access:Site_Details:Site_1_0\"]")
    public static WebElement Site1;
    @FindBy(how= How.XPATH, using = "//*[@id=\"select2-chosen-2\"]")
    public static WebElement Site2;
    @FindBy(how= How.XPATH, using = "//html/body/div[3]/ul[2]/li[1]/div/div/div/div[1]")
    public static WebElement Site1Res;
    @FindBy(how= How.XPATH, using = "//html/body/div[4]/ul[2]/li[2]/div/div/div/div[1]")
    public static WebElement Site2Res;
    @FindBy(how= How.XPATH, using = "//*[@id=\"footer-landmark\"]/div/div[2]/button[2]")
    public static WebElement Finishbtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"j_id0:j_id32\"]/div/div[3]/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[2]/div/div/div/div[1]/div/div[1]/button[2]")
    public static WebElement editbtn2;
    @FindBy(how= How.XPATH, using = "//*[@id=\"BT_NNI:General_Information:Contract_Term_0\"]")
    public static WebElement BTNNITerm;
    @FindBy(how= How.XPATH, using = "//*[@id=\"BT_NNI:Migration:Migration_Type_0\"]")
    public static WebElement BTNNIMigrationType;
    @FindBy(how= How.XPATH, using = "//*[@id=\"BT_NNI:Migration:Purpose_of_BT_NNI_and_Migration_Details_0\"]")
    public static WebElement purposeofBTNNI;
    @FindBy(how= How.XPATH, using = "//*[@id=\"screen-content-landmark\"]/div[5]/article/div/div[1]/div/button")
    public static WebElement newbandwidthandIPprefixes;
    @FindBy(how= How.XPATH, using = "//*[@id=\"select2-chosen-1\"]")
    public static WebElement IPPrefixBAndwidth;
    @FindBy(how= How.XPATH, using = "//html/body/div[3]/ul[2]/li[3]/div")
    public static WebElement IPPrefixBAndwidthres;
    @FindBy(how= How.XPATH, using = "//*[@id=\"configurationContainer\"]/div/div/div[1]/div/div[2]/div/div/div[2]/button[2]")
    public static WebElement continuebtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"configurationContainer\"]/div/div/div[1]/div/div[2]/div/div/div[2]/button[2]")
    public static WebElement finishbtn2;
    @FindBy(how= How.XPATH, using = "/html/body/div/div[2]/table/tbody/tr/td[2]/div/span/div/div[3]/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[3]/div/div/div/div[1]/div/div[1]/button[2]")
    public static WebElement editbtn3;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Public_Cloud_Connect:General_Information:PCC_Delivery_Type_0\"]")
    public static WebElement PCCDeliveryType;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Public_Cloud_Connect:General_Information:Contract_Term_0\"]")
    public static WebElement PCCContractTerm;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Public_Cloud_Connect:General_Information:Bandwidth_Type_0\"]")
    public static WebElement PCCGeoBAndwidth;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Public_Cloud_Connect:General_Information:Cloud_Service_Provider_0\"]")
    public static WebElement PCCServiceProvider;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Public_Cloud_Connect:General_Information:Peering_Type_0\"]")
    public static WebElement PCCPeeringType;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Public_Cloud_Connect:General_Information:Bandwidth_0\"]")
    public static WebElement PCCBandwidth;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Public_Cloud_Connect:General_Information:Installation_type_0\"]")
    public static WebElement PCCInstallationtype;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Public_Cloud_Connect:Site_Details:Number_of_Sites_0\"]")
    public static WebElement PCCNoofSites;
    @FindBy(how= How.XPATH, using = "//*[@id=\"select2-chosen-2\"]")
    public static WebElement PCCSite1;
    @FindBy(how= How.XPATH, using = "//html/body/div[3]/ul[2]/li[1]/div/div/div/div[1]")
    public static WebElement PCCSite1res;
    @FindBy(how= How.XPATH, using = "//*[@id=\"footer-landmark\"]/div/div[2]/button[2]")
    public static WebElement finishbtn3;
    @FindBy(how= How.XPATH, using = "/html/body/div/div[2]/table/tbody/tr/td[2]/div/span/div/div[3]/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[4]/div/div/div/div[1]/div/div[1]/button[2]")
    public static WebElement editbtn4;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Gateway_Internet_Protect:General_Information:Contract_Term_0\"]")
    public static WebElement GIPTerm;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Gateway_Internet_Protect:General_Information:Service_SLA_0\"]")
    public static WebElement GIPServiceTier;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Gateway_Internet_Protect:General_Information:Service_Size_Tier_0\"]")
    public static WebElement GIPServiceSizeTier;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Gateway_Internet_Protect:General_Information:Gateway_Internet_Protect_Bandwidth_0\"]")
    public static WebElement GIPBAndwidth;
    @FindBy(how= How.XPATH, using = "//*[@id=\"Gateway_Internet_Protect:General_Information:Additional_Notes_0\"]")
    public static WebElement GIPVRF;
    @FindBy(how= How.XPATH, using = "//*[@id=\"footer-landmark\"]/div/div[2]/button[2]")
    public static WebElement finishbtn4;
    @FindBy(how= How.XPATH, using = "//*[@id=\"a1y9E000000GD9pQAG~a2I9E000000gmnkUAA_anchor\"]")
    public static  WebElement privatemobileaccess;
    @FindBy(how= How.XPATH, using = "//*[@id=\"a1y9E000000GDA4QAO~a2I9E000000gmnkUAA_anchor\"]")
    public static WebElement BTNNI;
    @FindBy(how= How.XPATH, using = "//*[@id=\"a1y9E000000GD9kQAG~a2I9E000000gmnkUAA_anchor\"]")
    public static WebElement publicloudconnect;
    @FindBy(how= How.XPATH, using = "//*[@id=\"a1y9E000000GDA9QAO~a2I9E000000gmnkUAA_anchor\"]/i[1]")
    public static WebElement GatewayInternetProtect;
    @FindBy(how= How.XPATH, using = "//*[@class='btn label icon-add']")
    public static WebElement save_product;


    public void configurationMWAN (String MWANTerm, String MWANAPN,  String GroupName, String Resiliency, String PrimaryCircuitType, String PrimaryAccessType, String GroupName2, String Resiliency2, String PrimaryCircuitType2, String PrimaryAccessType2, String SecondaryCircuitytype, String SecondaryAccessType) throws InterruptedException
    {
        clickElement(AddSol);
        clickElement(AddnewSolution);
        Thread.sleep(2000);
        clickElement(Cancelbtn);
        driver.switchTo().defaultContent();
        clickElement(AddbewSolution1);
        clickElement(MWANProd);
        clickElement(Addbtn);
        String parentwindow= driver.getWindowHandle();
        clickElement(configurecircuit);
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        //System.out.println("Total number of tabs"+count);
        for (String child:allwindows)
        {
            //System.out.println(child);
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }
        driver.manage().window().maximize();
        Thread.sleep(1000);
        clickElement(Sitecheckbox);
        Thread.sleep(1000);
        clickElement(AddSiteGrpbtn);
        Thread.sleep(1000);
        sendKeys(groupName,GroupName);
        Thread.sleep(1000);
        dropDown(resiliency,Resiliency);
        Thread.sleep(1000);
        dropDown(Primarycircuittype,PrimaryCircuitType);
        Thread.sleep(1000);
        dropDown(PrimaryAccesstype,PrimaryAccessType);
        Thread.sleep(1000);
        clickElement(savebtn);
        Thread.sleep(1000);
        clickElement(closebtn);
        Thread.sleep(8000);
        clickElement(Site2chck);
        clickElement(Site2chck1);
        clickElement(AddSiteGrpbtn);
        Thread.sleep(1000);
        sendKeys(groupName,GroupName2);
        Thread.sleep(2000);
        dropDown(resiliency,Resiliency2);
        Thread.sleep(2000);
        dropDown(Primarycircuittype,PrimaryCircuitType2);
        Thread.sleep(1000);
        dropDown(SecondaryCircuitType,SecondaryCircuitytype);
        Thread.sleep(1000);
        dropDown(PrimaryAccesstype,PrimaryAccessType2);
        Thread.sleep(1000);
        dropDown(secondaryAccessType,SecondaryAccessType);
        Thread.sleep(1000);
        clickElement(savebtn);
        Thread.sleep(1000);
        clickElement(closebtn);
        driver.switchTo().window(parentwindow);
        clickElement(configurerouter);
        Set<String> allwindows1=driver.getWindowHandles();
        int count1= allwindows1.size();
        //System.out.println("Total number of tabs"+count1);
        for (String child:allwindows1)
        {
          //  System.out.println(child);
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }

        clickElement(routerSiteCheckbox);
        clickElement(AddRouter);
        dropDownIndex(CPE1,1);
        dropDownIndex(Maintenance,1);
        Thread.sleep(1000);
        clickElement(routersavebtn);
        Thread.sleep(1000);
        clickElement(routerclosebtn);
        Thread.sleep(1000);
        clickElement(sitecheckbox2);
        Thread.sleep(1000);
        clickElement(AddRouter);
        Thread.sleep(1000);
        dropDown(routerquantity,"1");
        dropDownIndex(CPE1,1);
        Thread.sleep(1000);
        dropDownIndex(Maintenance,1);
        Thread.sleep(1000);
        clickElement(routersavebtn);
        clickElement(routerclosebtn);
        driver.switchTo().window(parentwindow);
        clickElement(configurecos);
        Set<String> allwindows2=driver.getWindowHandles();
        int count2= allwindows2.size();
        //System.out.println("Total number of tabs"+count2);
        for (String child:allwindows2)
        {
           // System.out.println(child);
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }
        clickElement(cossitechckbx);
        Thread.sleep(1000);
        clickElement(AddCos);
        Thread.sleep(5000);
        dropDown(quantityofVPN,"1");
        clickElement(cossavebtn);
        Thread.sleep(1000);
        clickElement(closebtn);
        Thread.sleep(5000);
        clickElement(cossitechckbx2);
        Thread.sleep(1000);
        clickElement(AddCos);
        Thread.sleep(1000);
        sendKeys(COSEF,"2000");
        dropDown(quantityofVPN,"1");
        Thread.sleep(1000);
        clickElement(cossavebtn);
        Thread.sleep(1000);
        clickElement(cosclosebtn);
        Thread.sleep(3000);
        driver.switchTo().window(parentwindow);
        clickElement(configureManagedServices);
        Set<String> allwindows3=driver.getWindowHandles();
        int count3= allwindows3.size();
        //System.out.println("Total number of tabs"+count3);
        for (String child:allwindows3)
        {
           // System.out.println(child);
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }
        clickElement(ManagedServiceSiteChckbx);
        Thread.sleep(1000);
        clickElement(AddManagedServices);
        Thread.sleep(3000);
        dropDown(MWANVisibilityTier,"Essential");
        clickElement(ManagedServicesSavebtn);
        clickElement(ManagedServicesClosebtn);
        Thread.sleep(3000);
        driver.switchTo().window(parentwindow);
        clickElement(createconfigurationbtn);
        clickElement(MSDashboard);
        clickElement(calculateMS);
        clickElement(PSDashboard);
        clickElement(calculatePS);
        clickElement(calculatetotals);
        Thread.sleep(25000);
        clickElement(backtobasket);
    }


    public void configurationDrop1 (String PMATermValue,String PMABandwidth,String QuantityofAPN,String NoOfSites, String BTNNITermValue, String BTNIMigrationType,String PCCDeliveryTypeValue, String PCCContractTermValue, String GIPTermValue,String GIPServiceTierValue) throws InterruptedException
    {
        clickElement(privatemobileaccess);
        clickElement(BTNNI);
        clickElement(publicloudconnect);
        clickElement(GatewayInternetProtect);
        clickElement(save_product);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickElement(editbtn);
        Thread.sleep(3000);
        driver.switchTo().frame(1);
        dropDown(PMATerm,PMATermValue);
        dropDown(PMABAndwidth,PMABandwidth);
        dropDown(QuantityOfAPN,QuantityofAPN);
        Thread.sleep(3000);
        sendKeys(VRFTextBox,"test");
        dropDown(NumberofSites,"2");
        clickElement(Site1);
        clickElement(Site1Res);
        clickElement(Site2);
        clickElement(Site2Res);
        clickElement(Finishbtn);
        driver.switchTo().defaultContent();
        Thread.sleep(20000);
        /*
        webDriverWait.until(ExpectedConditions.visibilityOf(editbtn2));
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickElement(editbtn2);
        Thread.sleep(10000);
        driver.switchTo().frame(1);
        sendKeys(BTNNITerm,BTNNITermValue);
        dropDown(BTNNIMigrationType,BTNIMigrationType);
        sendKeys(purposeofBTNNI,"Test");
        clickElement(newbandwidthandIPprefixes);
        Thread.sleep(5000);
        clickElement(IPPrefixBAndwidth);
        clickElement(IPPrefixBAndwidthres);
        clickElement(continuebtn);
        clickElement(finishbtn2);
        Thread.sleep(20000);
        driver.switchTo().defaultContent();
        clickElement(editbtn3);
        Thread.sleep(3000);
        driver.switchTo().frame(1);
        dropDown(PCCDeliveryType,PCCDeliveryTypeValue);
        dropDown(PCCContractTerm,PCCContractTermValue);
        dropDown(PCCGeoBAndwidth,"Legacy");
        dropDown(PCCServiceProvider,"AWS");
        dropDown(PCCPeeringType,"Private");
        dropDown(PCCBandwidth,"50Mb");
        dropDown(PCCInstallationtype,"Initial Installation");
        Thread.sleep(3000);
        dropDown(PCCNoofSites,"1");
        Thread.sleep(2000);
        clickElement(PCCSite1);
        Thread.sleep(1000);
        clickElement(PCCSite1res);
        clickElement(finishbtn3);
        Thread.sleep(20000);
        driver.switchTo().defaultContent();
        clickElement(editbtn4);
        Thread.sleep(3000);
        driver.switchTo().frame(1);
        dropDown(GIPTerm,GIPTermValue);
        dropDown(GIPServiceTier,GIPServiceTierValue);
        dropDown(GIPServiceSizeTier,"Small");
        dropDown(GIPBAndwidth,"10 MB");
        Thread.sleep(2000);
        sendKeys(GIPVRF,"Test");
        clickElement(finishbtn4);
        Thread.sleep(20000);

         */
    }
    }
