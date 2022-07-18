package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;
import java.util.Set;

@Component
public class AddDrop2Products extends PageObject{
    public AddDrop2Products(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @FindBy(how= How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope icon-new']")
    public static WebElement addSolutionbtn;
    @FindBy(how= How.XPATH, using = "//button[text()='Add New Solution']")
    public static WebElement addNewSolution;
    @FindBy(how= How.XPATH, using = "//*[text()='MLAN']")
    public static WebElement MLAN;
    @FindBy(how= How.XPATH, using = "//*[text()='Add ']")
    public static WebElement add;
    @FindBy(how= How.XPATH, using = "//button[text()=' Add New Solution ']")
    public static WebElement addNewSolution2;
    @FindBy(how= How.XPATH, using = "//*[text()='Meraki WLAN']")
    public static WebElement Meraki;
    @FindBy(how= How.XPATH, using = "//*[text()='Gateway Internet']")
    public static WebElement gatewayInternet;
    @FindBy(how= How.XPATH, using = "//*[text()='Global Access']")
    public static WebElement global_Access;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id2']/app-root/main/div[2]/app-cs-complex-product-components/div[1]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[1]/app-specification-editor-attribute/div/div[1]/input")
    public static WebElement term;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id2']/app-root/main/div[2]/app-cs-complex-product-components/div[1]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[1]/app-specification-editor-attribute/div/div[1]/input")
    public static WebElement term2;
    @FindBy(how= How.XPATH, using = "//*[text()='Configure Sites']")
    public static WebElement configureSites;
    @FindBy(how= How.XPATH, using = "(//*[@type='CheckBox'])[1]")
    public static WebElement site1;
    @FindBy(how= How.XPATH, using = "(//*[@type='CheckBox'])[2]")
    public static WebElement site2;
    @FindBy(how= How.XPATH, using = "//*[@id='Allocatebtn']")
    public static WebElement Allocatebtn;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:theForm:j_id88:0:j_id90']")
    public static WebElement quantity13;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:theForm:j_id88:0:j_id90']")
    public static WebElement merakiQuantity;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:theForm:j_id88:6:j_id90']")
    public static WebElement quantity14;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:theForm:j_id88:0:j_id92']")
    public static WebElement maintenanceType;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:theForm:j_id88:0:j_id92']")
    public static WebElement merakiMaintenanceType;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:theForm:j_id88:0:j_id94']")
    public static WebElement cost1;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:theForm:j_id88:0:j_id94']")
    public static WebElement cost2;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:theForm:j_id88:0:j_id98']")
    public static WebElement cost3;
    @FindBy(how= How.XPATH, using = "//*[@id='modalSaveBtn']")
    public static WebElement saveBtn;
    @FindBy(how= How.XPATH, using = "//*[text()='Create Configuration']")
    public static WebElement createConfiguration;
    @FindBy(how= How.XPATH, using = "(//span[text()='Managed Service Dashboard'])[2]")
    public static WebElement managedServiceDashboard;
    @FindBy(how= How.XPATH, using = "//*[@id='calculateMerakiMS']")
    public static WebElement calculateMerakiMS;
    @FindBy(how= How.XPATH, using = "(//*[text()='Calculate Totals'])[2]") // To  e altered
    public static WebElement calculateTotals;
    @FindBy(how= How.XPATH, using = "(//*[text()='Calculate Totals'])[3]") // To  e altered
    public static WebElement calculateTotalsMeraki;
    @FindBy(how= How.XPATH, using = "(//*[text()='Calculate Totals'])[2]")// To  e altered
    public static WebElement calculateTotalGateWayi;
    @FindBy(how= How.XPATH, using = "//*[text()='Configure Bandwidth']")
    public static WebElement configureBandwidth;
    @FindBy(how= How.XPATH, using = "//*[@id='AddGroup']")
    public static WebElement addGroup;
    @FindBy(how= How.XPATH, using = "//*[@id='Controller:Form:Block:j_id115']")
    public static WebElement groupName;
    @FindBy(how= How.XPATH, using = "//*[@id='Controller:Form:Block:EtherflowType']")
    public static WebElement EVCType;
    @FindBy(how= How.XPATH, using = "//*[@id='Controller:Form:Block:j_id120']")
    public static WebElement description;
    @FindBy(how= How.XPATH, using = "//*[@id='Controller:Form:Block:Resiliency']")
    public static WebElement resiliency;
    @FindBy(how= How.XPATH, using = "//*[@id='Controller:Form:Block:InternetBandwidth']")
    public static WebElement internetBandwidth;
    @FindBy(how= How.XPATH, using = "//*[@id='Controller:Form:Block:PublicIPAddress']")
    public static WebElement publicIPAddress;
    @FindBy(how= How.XPATH, using = "//*[@id='Controller:Form:Block:AddSites']")
    public static WebElement save;
    @FindBy(how= How.XPATH, using = "//*[@id='closePopup']")
    public static WebElement close;
    @FindBy(how= How.XPATH, using = "//*[@id='gatewayCreateConfigs']")
    public static WebElement createConfigs;

    @FindBy(how= How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']")
    public static  WebElement add_product;
    @FindBy(how= How.XPATH, using = "//*[@id='a1y9E000000GM8CQAW~a2I9E000000gmnkUAA_anchor']")
    public static WebElement CPE;
    @FindBy(how= How.XPATH, using = "//*[@class='btn label icon-add']")
    public static WebElement save_product;
    @FindBy(how= How.XPATH, using = "//*[@class='btn btn-edit ng-scope']")
    public static WebElement edit_pencil;
    @FindBy(how= How.XPATH, using = "//*[@id='CPE_Portal:General_Details:Contract_Term__Months__0']")
    public static WebElement CPETerms;
    @FindBy(how= How.XPATH, using = "//*[@id='CPE_Portal:CPE_Portal_Devices:Number_of_Devices_0']")
    public static WebElement numberOfDevices;
    @FindBy(how= How.XPATH, using = "//*[@id='CPE_Portal:CPE_Portal_Devices:Additional_Notes_0']")
    public static WebElement additionalNotes;
    @FindBy(how= How.XPATH, using = "(//button[text()='Finish'])[2]")
    public static WebElement finish;

    //-----------------------Global Access--------------------

    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[1]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[1]/app-specification-editor-attribute/div/div[1]/input")
    public static WebElement terms;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[1]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[2]/app-specification-editor-attribute/div/div[1]/input")
    public static WebElement TBSSalesforceID;
    @FindBy(how= How.XPATH, using = "//input[@id='mat-input-0']")
    public static WebElement leadOperatorSu;

    @FindBy(how= How.XPATH, using = "(//span[text()='Global Access Site Allocation'])[1]")
    public static WebElement globalAccessSiteAllocation;
    @FindBy(how= How.XPATH, using = "(//span[text()='Add Configuration'])[2]")
    public static WebElement addConfiguration;
    @FindBy(how= How.XPATH, using = "(//*[text()=' Global Access Site Allocation 1'])[2]")
    public static WebElement globalAccessSiteAllocation1;
    //--------Details---------
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[1]/app-specification-editor-attribute/div/app-specification-editor-attribute-lookup/div/div/div[1]/div/div[1]/input")
    public static WebElement site;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[2]/app-specification-editor-attribute/div/app-specification-editor-attribute-picklist/div/div[1]/div/ng-select/div/span")
    public static WebElement currency;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[2]/app-specification-editor-attribute/div/app-specification-editor-attribute-picklist/div/div/div/ng-select/ng-dropdown-panel/div[2]/div[2]/div[2]/span")
    public static WebElement currencyselected;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[4]/app-specification-editor-attribute/div/app-specification-editor-attribute-picklist/div/div/div/ng-select/div/span")
    public static WebElement SLA;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[4]/app-specification-editor-attribute/div/app-specification-editor-attribute-picklist/div/div/div/ng-select/ng-dropdown-panel/div[2]/div[2]/div[2]")
    public static WebElement SLAselected;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[5]/app-specification-editor-attribute/div/div/input")
    public static WebElement comments;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[6]/app-specification-editor-attribute/div/app-specification-editor-attribute-picklist/div/div[1]/div/ng-select/div")
    public static WebElement mainAccess;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[6]/app-specification-editor-attribute/div/app-specification-editor-attribute-picklist/div/div[1]/div/ng-select/ng-dropdown-panel/div[2]/div[2]/div[2]/span")
    public static WebElement mainAccessselected;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[9]/app-specification-editor-attribute/div/div[1]/input")
    public static WebElement mainIPPort;

    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[24]/app-specification-editor-attribute/div/div/input")
    public static WebElement mainAccessNRC;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[25]/app-specification-editor-attribute/div/div/input")
    public static WebElement mainAccessMRC;
    @FindBy(how= How.XPATH, using = "/html/body/div[1]/div[2]/table/tbody/tr/td/span[2]/app-root/main/div[2]/app-cs-complex-product-components/div[2]/app-specification-editor/div[2]/div[2]/div[2]/div/div[2]/div[26]/app-specification-editor-attribute/div/div/input")
    public static WebElement backUpAccessNRC;
    @FindBy(how= How.XPATH, using = "//*[text()='Related Products']")
    public static WebElement relatedProducts;
    @FindBy(how= How.XPATH, using = "(//*[text()=' Calculate Totals '])[2]")
    public static WebElement calculateTotalGlobalAccess;
    @FindBy(how= How.XPATH, using = "//*[text()='Back to basket']")
    public static WebElement Backtobasket;

    public void configureMLAN() throws InterruptedException, IOException {

        scroll(addSolutionbtn);
        clickElement(addSolutionbtn);
        for(int i=1;i<=80;i++)
        {
            //System.out.println(i);
            Thread.sleep(1000);
        }
        clickElement(addNewSolution); // To be altered
        Thread.sleep(3000);
        clickElement(MLAN);
        clickElement(add);
        Thread.sleep(5000);
        sendKeys(term,"36");
        Thread.sleep(3000);
        clickElement(configureSites);
        Thread.sleep(5000);
        String parentwindow= driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        System.out.println("Total number of tabs"+count);
        for (String child:allwindows)
        {
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }
        System.out.println("Switched to window");
        driver.manage().window().maximize();
        clickElement(site1);
        Thread.sleep(20000);
        clickElement(Allocatebtn);
        Thread.sleep(3000);
        quantity13.clear();
        sendKeys(quantity13,"10");
        quantity14.clear();
        sendKeys(quantity14,"10");
        dropDown(maintenanceType,"NBD P NBH");
        Thread.sleep(2000);
        cost1.clear();
        sendKeys(cost1,"10");
        cost2.clear();
        sendKeys(cost2,"10");
        cost3.clear();
        sendKeys(cost3,"10");
        clickElement(saveBtn);
        Thread.sleep(10000);
        driver.switchTo().window(parentwindow);
        clickElement(createConfiguration);
        Thread.sleep(8000);
        clickElement(calculateTotals);
        logger.debug("MLAN added successfully into basket");
        takeScreenShot("MLAN added");
    }

    public void configureMeraki() throws InterruptedException, IOException {
      for(int i=1;i<=10;i++)
        {
            //System.out.println(i);
            Thread.sleep(1000);
        }
        clickElement(addNewSolution2);
        clickElement(Meraki);
        clickElement(add);
        Thread.sleep(5000);
        sendKeys(term2,"36");
        clickElement(configureSites);
        String parentwindow= driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        System.out.println("Total number of tabs"+count);
        for (String child:allwindows)
        {
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }
        driver.manage().window().maximize();
        clickElement(site1);
        Thread.sleep(15000);
        clickElement(Allocatebtn);
        //merakiQuantity.clear();
        sendKeys(merakiQuantity,"10");
        Thread.sleep(3000);
        dropDown(merakiMaintenanceType,"NBD Fix NBH");
        Thread.sleep(3000);
        clickElement(saveBtn);
        Thread.sleep(3000);
        driver.switchTo().window(parentwindow);
        clickElement(createConfiguration);
        Thread.sleep(5000);
        clickElement(calculateTotals);
       /* Thread.sleep(3000);
        clickElement(managedServiceDashboard);
        Thread.sleep(3000);
        clickElement(calculateMerakiMS);
        Thread.sleep(3000);
        clickElement(calculateTotalsMeraki); */
        logger.debug("MERAKI added successfully into basket");
        takeScreenShot("MERAKI added");
    }

    public void configureGatewayInternet() throws InterruptedException, IOException {
        for(int i=1;i<=30;i++)
        {
            //System.out.println(i);
            Thread.sleep(1000);
        }
        clickElement(addNewSolution2);
        Thread.sleep(3000);
        clickElement(gatewayInternet);
        clickElement(add);
        Thread.sleep(5000);
        sendKeys(term2,"36");
        Thread.sleep(2000);
        clickElement(configureBandwidth);
        String parentwindow= driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        System.out.println("Total number of tabs"+count);
        for (String child:allwindows)
        {
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }
        driver.manage().window().maximize();
        clickElement(site1);
        Thread.sleep(3000);
        clickElement(addGroup);
        sendKeys(groupName,"Group A");
        Thread.sleep(2000);
        dropDown(EVCType,"Shared");
        Thread.sleep(2000);
        sendKeys(description,"Test");
        Thread.sleep(2000);
        dropDown(resiliency,"Standard");
        Thread.sleep(2000);
        dropDown(internetBandwidth,"Internet VLAN 10 Mbit/s");
        Thread.sleep(2000);
        dropDown(publicIPAddress,"/29");
        Thread.sleep(8000);
        clickElement(save);
        Thread.sleep(5000);
        clickElement(close);
        driver.switchTo().window(parentwindow);
        clickElement(createConfigs);
        Thread.sleep(8000);
        clickElement(calculateTotalGateWayi);
        logger.debug("Gateway Internet added successfully into basket");
        takeScreenShot("Gateway Internet added");
    }

    public void configureGlobalAccess() throws InterruptedException, IOException {
        for(int i=1;i<=40;i++)
        {
            //System.out.println(i);
            Thread.sleep(1000);
        }
        clickElement(addNewSolution2);
        clickElement(global_Access);
        clickElement(add);
        Thread.sleep(2000);
        sendKeys(terms,"12");
        Thread.sleep(1000);
        sendKeys(TBSSalesforceID,"12");
        Thread.sleep(1000);
        leadOperatorSu.clear();
        sendKeys(leadOperatorSu,"2020-04-24");
        Thread.sleep(1000);
        clickElement(globalAccessSiteAllocation);
        Thread.sleep(3000);
        clickElement(addConfiguration);
        Thread.sleep(3000);
        clickElement(globalAccessSiteAllocation1);
        Thread.sleep(3000);
        sendEnter(site,"site 1");
        Thread.sleep(2000);
        clickElement(currency);
        Thread.sleep(1000);
        clickElement(currencyselected);
        clickElement(SLA);
        Thread.sleep(1000);
        clickElement(SLAselected);
        Thread.sleep(1000);
        sendKeys(comments,"Test");
        Thread.sleep(2000);
        clickElement(mainAccess);
        Thread.sleep(3000);
        clickElement(mainAccessselected);
        Thread.sleep(2000);
        sendKeys(mainIPPort,"12");
        Thread.sleep(3000);
        mainAccessNRC.clear();
        sendKeys(mainAccessNRC,"100");
        mainAccessMRC.clear();
        sendKeys(mainAccessMRC,"100");
        backUpAccessNRC.clear();
        sendKeys(backUpAccessNRC,"100");
        Thread.sleep(5000);
        scroll(relatedProducts);
        clickElement(relatedProducts);
        Thread.sleep(7000);
        clickElement(calculateTotalGlobalAccess);
        logger.debug("Global Access added successfully into basket");
        takeScreenShot("Global Access added");
        Thread.sleep(10000);
        clickElement(Backtobasket);
    }

    public void CPEPortal() throws InterruptedException, IOException {
       Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        scroll(add_product);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickElement(add_product);
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickElement(CPE);
        clickElement(save_product);
        scroll(edit_pencil);
        clickElement(edit_pencil);
        Thread.sleep(4000);
        driver.switchTo().frame(1);
        Thread.sleep(5000);
        sendKeys(CPETerms,"12");
        sendKeys(numberOfDevices,"12");
        sendKeys(additionalNotes,"Test");
        Thread.sleep(7000);
        clickElement(finish);
        Thread.sleep(3000);
        logger.debug("CPE added successfully into basket");
        takeScreenShot("CPE added");
        driver.switchTo().defaultContent();
        driver.navigate().refresh();
    }
}
