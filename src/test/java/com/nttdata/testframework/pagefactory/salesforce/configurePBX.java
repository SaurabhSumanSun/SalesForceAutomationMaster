package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;
import java.util.Set;

@Component
public class configurePBX extends PageObject{

    @FindBy(how= How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']")
    public static  WebElement add_product;
    @FindBy(how= How.XPATH, using = "//*[@id=\"a1y9E000001ftKNQAY~a2I9E000001uNYyUAM_anchor\"]")
    public static WebElement PBX;
    @FindBy(how= How.XPATH, using = "//*[@class='btn label icon-add']")
    public static WebElement save_product;
    @FindBy(how= How.XPATH, using = "//*[@class='btn btn-edit ng-scope']")
    public static WebElement edit_pencil;
    @FindBy(how= How.XPATH, using = "//*[@id='PBX:General_Information:Contract_Length_Months_0']")
    public static WebElement Terms;
    @FindBy(how= How.XPATH, using = "//*[@id='PBX:General_Information:Summary_of_Requirements_0']")
    public static WebElement Summary;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "//*[text()='New Equipment']")
    public static WebElement newEquipmentBtn;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Unique_Site_Identifier_0']")
    public static WebElement uniqueSiteIdentifier;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Site_Address_0']")
    public static WebElement siteAddress;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Postcode_0']")
    public static WebElement poseCode;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Supplier_0']")
    public static WebElement supplierName;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Part_Code_0']")
    public static WebElement partCode;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Description_0']")
    public static WebElement Description;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Quantity_0']")
    public static WebElement Quantity;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Comments_0']")
    public static WebElement Comments;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Total_Cost_0']")
    public static WebElement oneOffCost;
    @FindBy(how= How.XPATH, using = "//*[@id='Default:BOM_Information:Charging_Frequency_0']")
    public static WebElement chargeType;
    @FindBy(how= How.XPATH, using = "(//*[text()='Continue'])[2]")
    public static WebElement continueBtn;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = " //*[text()='New Software']")
    public static WebElement newSoftware;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Unique_Site_Identifier_0']")
    public static WebElement uniqueSiteIdentifier1;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Site_Address_0']")
    public static WebElement siteAddress1;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Postcode_0']")
    public static WebElement poseCode1;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Supplier_0']")
    public static WebElement supplierName1;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Part_Code_0']")
    public static WebElement partCode1;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Description_0']")
    public static WebElement Description1;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Quantity_0']")
    public static WebElement Quantity1;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Comments_0']")
    public static WebElement Comments1;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Total_Cost_0']")
    public static WebElement oneOffCost1;
    @FindBy(how= How.XPATH, using = "//*[@id='General_Information:BOM_Information:Charging_Frequency_0']")
    public static WebElement chargeType1;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "//*[text()='New Third Party Professional Service']")
    public static WebElement newThirdPartyProfessionalService;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Postcode_0']")
    public static WebElement uniqueSiteIdentifier2;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Site_Address_0']")
    public static WebElement siteAddress2;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Postcode_0']")
    public static WebElement poseCode2;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Supplier_0']")
    public static WebElement supplierName2;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Part_Code_0']")
    public static WebElement partCode2;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Description_0']")
    public static WebElement Description2;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Quantity_0']")
    public static WebElement Quantity2;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Comments_0']")
    public static WebElement Comments2;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Total_Cost_0']")
    public static WebElement oneOffCost2;
    @FindBy(how= How.XPATH, using = "//*[@id='Professional_Services_Third_Party_:BOM_Information:Charging_Frequency_0']")
    public static WebElement chargeType2;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "//*[text()='New Managed Service']")
    public static WebElement newManagedService;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Unique_Site_Identifier_0']")
    public static WebElement uniqueSiteIdentifier3;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Site_Address_0']")
    public static WebElement siteAddress3;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Postcode_0']")
    public static WebElement poseCode3;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Supplier_0']")
    public static WebElement supplierName3;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Part_Code_0']")
    public static WebElement partCode3;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Description_0']")
    public static WebElement Description3;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Quantity_0']")
    public static WebElement Quantity3;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Comments_0']")
    public static WebElement Comments3;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Total_Cost_0']")
    public static WebElement oneOffCost3;
    @FindBy(how= How.XPATH, using = "//*[@id='Managed_Services_Third_Party_:BOM_Information:Charging_Frequency_0']")
    public static WebElement chargeType3;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "//*[text()='New Maintenance Service']")
    public static WebElement newMaintenanceService;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Unique_Site_Identifier_0']")
    public static WebElement uniqueSiteIdentifier4;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Site_Address_0']")
    public static WebElement siteAddress4;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Postcode_0']")
    public static WebElement poseCode4;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Supplier_0']")
    public static WebElement supplierName4;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Part_Code_0']")
    public static WebElement partCode4;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Description_0']")
    public static WebElement Description4;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Quantity_0']")
    public static WebElement Quantity4;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Comments_0']")
    public static WebElement Comments4;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Total_Cost_0']")
    public static WebElement oneOffCost4;
    @FindBy(how= How.XPATH, using = "//*[@id='Maintenance_Services:BOM_Information:Charging_Frequency_0']")
    public static WebElement chargeType4;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "//*[text()='New Other/VAS']")
    public static WebElement newOtherVAS;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Unique_Site_Identifier_0']")
    public static WebElement uniqueSiteIdentifier5;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Site_Address_0']")
    public static WebElement siteAddress5;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Postcode_0']")
    public static WebElement poseCode5;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Supplier_0']")
    public static WebElement supplierName5;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Part_Code_0']")
    public static WebElement partCode5;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Description_0']")
    public static WebElement Description5;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Quantity_0']")
    public static WebElement Quantity5;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Comments_0']")
    public static WebElement Comments5;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Total_Cost_0']")
    public static WebElement oneOffCost5;
    @FindBy(how= How.XPATH, using = "//*[@id='Other_VAS:BOM_Information:Charging_Frequency_0']")
    public static WebElement chargeType5;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "//*[text()='New Supplier']")
    public static WebElement newSupplier;
    @FindBy(how= How.XPATH, using = "//*[@id='Supplier_Information:Supplier_Information:Supplier_Name_0']")
    public static WebElement supllierName;
    @FindBy(how= How.XPATH, using = "//*[@id='Supplier_Information:Supplier_Information:Quote_Reference_Number_0']")
    public static WebElement quoteReferenceNumber;
    @FindBy(how= How.XPATH, using = "(//*[text()='Today'])[1]")
    public static WebElement today1;
    @FindBy(how= How.XPATH, using = "//*[@id='Supplier_Information:Supplier_Information:Quote_Expiry_Date_0']")
    public static WebElement today2;
    //------------------------------------------------------------------
    @FindBy(how= How.XPATH, using = "(//*[text()='Finish'])[2]")
    public static WebElement finish;

    public configurePBX(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }
    public void PBXConfiguation() throws InterruptedException, IOException {
       /* String parentwindow= driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        //System.out.println("Total number of tabs"+count);
        for (String child:allwindows)
        {
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // scroll(add_product);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        clickElement(add_product);*/
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("arguments[0].click()",PBX);
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);
        Thread.sleep(5000);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait2 = new WebDriverWait(driver, 700);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil));
        clickElement(edit_pencil);
        Thread.sleep(8000);
        WebDriverWait wait3 = new WebDriverWait(driver,15);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(15000);
        wait2.until(ExpectedConditions.visibilityOf(Terms));
        Thread.sleep(1000);
        wait2.until(ExpectedConditions.elementToBeClickable(Terms));
        Thread.sleep(1000);
        sendKeys(Terms,"12");
        Summary.click();
        Thread.sleep(5000);
        sendKeys(Summary,"Test");
        Summary.sendKeys(Keys.TAB);
        Thread.sleep(5000);

        clickElement(newEquipmentBtn);
        Thread.sleep(5000);
        sendKeys(uniqueSiteIdentifier,"Test");
        Thread.sleep(5000);
        sendKeys(siteAddress,"Test");
        Thread.sleep(5000);
        sendKeys(poseCode,"SL11 ur");
        Thread.sleep(5000);
        sendKeys(supplierName,"Test");
        Thread.sleep(5000);
        sendKeys(partCode,"Test");
        Thread.sleep(5000);
        sendKeys(Description,"Test");
        Thread.sleep(5000);
        sendKeys(Quantity,"12");
        Thread.sleep(5000);
        sendKeys(Comments,"Test");
        Thread.sleep(5000);
        sendKeys(oneOffCost,"12");
        Thread.sleep(5000);
        dropDown(chargeType,"One-Off");
        Thread.sleep(5000);
        clickElement(Comments);
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(5000);
        //------------------------------------------------------------------
        clickElement(newSoftware);
        Thread.sleep(5000);
        sendKeys(uniqueSiteIdentifier1,"Test");
        Thread.sleep(5000);
        sendKeys(siteAddress1,"Test");
        Thread.sleep(5000);
        sendKeys(poseCode1,"SL11 ur");
        Thread.sleep(5000);
        sendKeys(supplierName1,"Test");
        Thread.sleep(5000);
        sendKeys(partCode1,"Test");
        Thread.sleep(5000);
        sendKeys(Description1,"Test");
        Thread.sleep(5000);
        sendKeys(Quantity1,"12");
        Thread.sleep(5000);
        sendKeys(Comments1,"Test");
        Thread.sleep(5000);
        sendKeys(oneOffCost1,"12");
        Thread.sleep(5000);
        dropDown(chargeType1,"One-Off");
        Thread.sleep(5000);
        clickElement(Comments1);
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(5000);
        //------------------------------------------------------------------
        clickElement(newThirdPartyProfessionalService);
        Thread.sleep(5000);
        sendKeys(uniqueSiteIdentifier2,"Test");
        Thread.sleep(5000);
        sendKeys(siteAddress2,"Test");
        Thread.sleep(5000);
        sendKeys(poseCode2,"SL11 ur");
        Thread.sleep(5000);
        sendKeys(supplierName2,"Test");
        Thread.sleep(5000);
        sendKeys(partCode2,"Test");
        Thread.sleep(5000);
        sendKeys(Description2,"Test");
        Thread.sleep(5000);
        sendKeys(Quantity2,"12");
        Thread.sleep(5000);
        sendKeys(Comments2,"Test");
        Thread.sleep(5000);
        sendKeys(oneOffCost2,"12");
        Thread.sleep(5000);
        dropDown(chargeType2,"One-Off");
        Thread.sleep(5000);
        clickElement(Comments2);
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(5000);
        //------------------------------------------------------------------
        clickElement(newManagedService);
        Thread.sleep(5000);
        sendKeys(uniqueSiteIdentifier3,"Test");
        Thread.sleep(5000);
        sendKeys(siteAddress3,"Test");
        Thread.sleep(5000);
        sendKeys(poseCode3,"SL11 ur");
        Thread.sleep(5000);
        sendKeys(supplierName3,"Test");
        Thread.sleep(5000);
        sendKeys(partCode3,"Test");
        Thread.sleep(5000);
        sendKeys(Description3,"Test");
        Thread.sleep(5000);
        sendKeys(Quantity3,"12");
        Thread.sleep(5000);
        sendKeys(Comments3,"Test");
        Thread.sleep(5000);
        sendKeys(oneOffCost3,"12");
        Thread.sleep(5000);
        dropDown(chargeType3,"One-Off");
        Thread.sleep(5000);
        clickElement(Comments3);
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(5000);
        //------------------------------------------------------------------
        clickElement(newMaintenanceService);
        Thread.sleep(5000);
        sendKeys(uniqueSiteIdentifier4,"Test");
        Thread.sleep(5000);
        sendKeys(siteAddress4,"Test");
        Thread.sleep(5000);
        sendKeys(poseCode4,"SL11 ur");
        Thread.sleep(5000);
        sendKeys(supplierName4,"Test");
        Thread.sleep(5000);
        sendKeys(partCode4,"Test");
        Thread.sleep(5000);
        sendKeys(Description4,"Test");
        Thread.sleep(5000);
        sendKeys(Quantity4,"12");
        Thread.sleep(5000);
        sendKeys(Comments4,"Test");
        Thread.sleep(5000);
        sendKeys(oneOffCost4,"12");
        Thread.sleep(5000);
        dropDown(chargeType4,"One-Off");
        Thread.sleep(5000);
        clickElement(Comments4);
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(5000);
        //------------------------------------------------------------------
        clickElement(newOtherVAS);
        Thread.sleep(5000);
        sendKeys(uniqueSiteIdentifier5,"Test");
        Thread.sleep(5000);
        sendKeys(siteAddress5,"Test");
        Thread.sleep(5000);
        sendKeys(poseCode5,"SL11 ur");
        Thread.sleep(5000);
        sendKeys(supplierName5,"Test");
        Thread.sleep(5000);
        sendKeys(partCode5,"Test");
        Thread.sleep(5000);
        sendKeys(Description5,"Test");
        Thread.sleep(5000);
        sendKeys(Quantity5,"12");
        Thread.sleep(5000);
        sendKeys(Comments5,"Test");
        Thread.sleep(5000);
        sendKeys(oneOffCost5,"12");
        Thread.sleep(5000);
        dropDown(chargeType5,"One-Off");
        Thread.sleep(5000);
        clickElement(Comments5);
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(5000);
        //------------------------------------------------------------------
        clickElement(newSupplier);
        Thread.sleep(5000);
        sendKeys(supllierName,"Test");
        Thread.sleep(5000);
        sendKeys(quoteReferenceNumber,"123456");
        Thread.sleep(5000);
        clickElement(today1);
        Thread.sleep(5000);
        sendEnter(today2,"22/12/2022");
        Thread.sleep(5000);
        clickElement(continueBtn);
        Thread.sleep(5000);
        //------------------------------------------------------------------
        clickElement(finish);
        Thread.sleep(1000);
        logger.debug("PBX is added into the basket");
        takeScreenShot("PBX");
        Thread.sleep(1000);
        driver.switchTo().parentFrame();
        Thread.sleep(10000);
    }
}
