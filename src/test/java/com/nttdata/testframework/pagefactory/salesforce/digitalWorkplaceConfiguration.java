package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;

@Component
public class digitalWorkplaceConfiguration extends PageObject {
    @Autowired
    public digitalWorkplaceConfiguration(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @FindBy(how = How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']")
    public static WebElement add_product;
    @FindBy(how = How.XPATH, using = "//*[@class='btn label icon-add']")
    public static WebElement save_product;
    @FindBy(how = How.XPATH, using = "//*[@class='btn btn-edit ng-scope']")
    public static WebElement edit_pencil;
    @FindBy(how = How.XPATH, using = "(//*[@class='slds-button slds-button--brand'])[2]")
    public static WebElement finish;

    //MLS product
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001ZJKRQA4~a2I9E000001FRkHUAW_anchor\"]")
    public static WebElement MLS;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Handset_Quantity_0\"]")
    public static WebElement Volume;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Handset_0\"]")
    public static WebElement Desc;
    @FindBy(how = How.XPATH, using = "(//*[@class=\"checkbox-style\"])[5]")
    public static WebElement Device_Charging;
    @FindBy(how = How.XPATH, using = "(//*[@class=\"checkbox-style\"])[6]")
    public static WebElement Dekitting;
    @FindBy(how = How.XPATH, using = "(//*[@class=\"checkbox-style\"])[8]")
    public static WebElement Asset_Data;
    @FindBy(how = How.XPATH, using = "(//*[@class=\"checkbox-style\"])[11]")
    public static WebElement MDM_Enrollemnt;
    @FindBy(how = How.XPATH, using = "(//*[@class=\"checkbox-style\"])[18]")
    public static WebElement Apple_configurator;

    //MaaS360
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001ZKbiQAG~a2I9E000001FRkHUAW_anchor\"]")
    public static WebElement MaaS360;
    @FindBy(how = How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[2]")
    public static WebElement edit_pencil_MaaS360;
    @FindBy(how = How.XPATH, using = "//*[@name=\"License_Period_0\"]")
    public static WebElement License_period;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Licenses_0\"]")
    public static WebElement Volume_MaaS360;
    @FindBy(how = How.XPATH, using = "//*[@name=\"License_Type_0\"]")
    public static WebElement License_Type;
    @FindBy(how = How.XPATH, using = "//*[@title=\"Deluxe by O2 - Managed Service (2000 - 4999)\"]")
    public static WebElement products;
    @FindBy(how = How.XPATH, using = "//*[@id=\"select2-chosen-1\"]")
    public static WebElement Select_product;

    //WorkspaceONE
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001ZKcHQAW~a2I9E000001FRkHUAW_anchor\"]")
    public static WebElement WSO;
    @FindBy(how = How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[3]")
    public static WebElement edit_pencil_WSO;
    @FindBy(how = How.XPATH, using = "//*[@name=\"SKU_Code_0\"]")
    public static WebElement SKU;
    @FindBy(how = How.XPATH, using = "//*[@name=\"License_Quantity_0\"]")
    public static WebElement Volume_WSO;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Professional_Service_0\"]")
    public static WebElement Professional_service_wso;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Standard_Engineer_0\"]")
    public static WebElement Engineer;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Lead_Consultant_0\"]")
    public static WebElement Consultant;
    @FindBy(how = How.XPATH, using = "//*[@id=\"select2-chosen-1\"]")
    public static WebElement Deployment_select;
    @FindBy(how = How.XPATH, using = "//*[@title=\"Academic VMware Workspace ONE Deployment Add-on - Accelerated - Managed Hosting\"]")
    public static WebElement Deployment;

    //Rotageek
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001ZKazQAG~a2I9E000001FRkHUAW_anchor\"]")
    public static WebElement Rotageek;
    @FindBy(how = How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[4]")
    public static WebElement edit_pencil_Rotageek1;
    @FindBy(how = How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[7]")
    public static WebElement edit_pencil_Rotageek2;
    @FindBy(how = How.XPATH, using = "//*[@name=\"License_Period_0\"]")
    public static WebElement License_period_Rotageek;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Licenses_0\"]")
    public static WebElement License_volume_Rotageek;
    @FindBy(how = How.XPATH, using = "//*[@name=\"License_Type_0\"]")
    public static WebElement License_type_Rotageek;
    @FindBy(how = How.XPATH, using = "(//*[@class=\"checkbox-style\"])[1]")
    public static WebElement Installation_required;
    @FindBy(how = How.XPATH, using = "(//*[@class=\"checkbox-style\"])[3]")
    public static WebElement High_redunancy;
    @FindBy(how = How.XPATH, using = "(//*[@class=\"checkbox-style\"])[5]")
    public static WebElement hour_support;
    @FindBy(how = How.XPATH, using = "(//*[@name=\"Senior_Project_Manger_0\"])[1]")
    public static WebElement Senior_Manager;
    @FindBy(how = How.XPATH, using = "(//*[@name=\"Data_Analyst_0\"])[1]")
    public static WebElement Data_Analyst;

    //Sandblast
    /*@FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001ZI4eQAG~a2I9E000001FRkHUAW_anchor\"]")
    public static WebElement Sandblast;
    @FindBy(how = How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[5]")
    public static WebElement edit_pencil_Sandbalst;
    @FindBy(how = How.XPATH, using = "//*[@name=\"License_Period_0\"]")
    public static WebElement License_period_Sandblast;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Licenses_0\"]")
    public static WebElement License_volume_Sandbalst;
*/
    //Asavie MODA
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001ZJJnQAO~a2I9E000001FRkHUAW_anchor\"]")
    public static WebElement Asavie_Moda;
    @FindBy(how = How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[5]")
    public static WebElement edit_pencil_Asavie;
    @FindBy(how = How.XPATH, using = "//*[@name=\"License_Period_0\"]")
    public static WebElement License_period_Asavie;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Licenses_0\"]")
    public static WebElement License_volume_Asavie;
    @FindBy(how = How.XPATH, using = "//select[@name='Type_of_Service_0']")
    public static WebElement Type_of_Service;
    @FindBy(how = How.XPATH, using = "//select[@name='Type_of_Support_0']")
    public static WebElement Type_of_Support;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Number_of_Full_Days_0\"]")
    public static WebElement PS_Full_days;
    @FindBy(how = How.XPATH, using = "//*[@name=\"Number_of_Half_Days_0\"]")
    public static WebElement PS_Half_days;

    //MMA
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001ZI4oQAG~a2I9E000001FRkHUAW_anchor\"]")
    public static WebElement MMA;
    //@FindBy(how= How.XPATH, using = "(//*[@class='btn btn-edit ng-scope'])[8]")
    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'btn btn-edit')])[6]")
    public static WebElement edit_pencil_MMA;

    public void addProducts() throws InterruptedException, IOException {

        Thread.sleep(7000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);
        clickElement(MLS);
        clickElement(MaaS360);
        clickElement(WSO);
        clickElement(Rotageek);
        //clickElement(Sandblast);
        clickElement(Asavie_Moda);
        clickElement(MMA);
        int s1 = driver.findElements(By.tagName("iframe")).size();
        System.out.println(s1);
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);
        Thread.sleep(3000);

    }

    public void DWConfig(String MLS_Handset_Volume, String MLS_Handset_Acc) throws InterruptedException, IOException {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(10000);
        WebDriverWait wait2 = new WebDriverWait(driver, 300);
        wait2.until(ExpectedConditions.visibilityOf(edit_pencil));

        Thread.sleep(2000);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil));
        Thread.sleep(2000);

        try {
            edit_pencil.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", edit_pencil);
        }
        System.out.println("Clicked it");
        Thread.sleep(20000);
        //Thread.sleep(10000);

        wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        Thread.sleep(50000);
        webDriverWait.until(ExpectedConditions.visibilityOf(Volume));
        //int s = driver.findElements(By.tagName("iframe")).size();
        //System.out.println(s);
        //WebDriverWait waitMLs = new WebDriverWait(driver, 300);
        //waitMLs.until(ExpectedConditions.visibilityOf(Volume));
        Thread.sleep(10000);
        //waitMLs.until(ExpectedConditions.elementToBeClickable(Volume));
        //Configure MLS
        sendKeys(Volume, MLS_Handset_Volume);

       // JavascriptExecutor js2 = (JavascriptExecutor) driver;
      //  js2.executeScript("arguments[0].value=MLS_Handset_Volume", Volume);

        clickElement(Desc);
        Thread.sleep(8000);
        sendKeys(Desc, MLS_Handset_Acc);
        Thread.sleep(2000);
        clickElement(Device_Charging);
        Thread.sleep(2000);
        clickElement(Dekitting);
        Thread.sleep(8000);
        clickElement(Asset_Data);
        Thread.sleep(5000);
        clickElement(MDM_Enrollemnt);
        Thread.sleep(5000);
        clickElement(Apple_configurator);
        Thread.sleep(8000);
        clickElement(finish);
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        Thread.sleep(15000);
        logger.debug("MLS is added into the basket");
        //driver.navigate().refresh();

    }

    public void MaaS360(String MaaS_License_period, String MaaS_License_volume, String MaaS_License_type, String MaaS_Products) throws InterruptedException {
        WebDriverWait wait3 = new WebDriverWait(driver, 400);

        WebDriverWait wait4 = new WebDriverWait(driver, 10);

        WebDriverWait wait5 = new WebDriverWait(driver, 40);
        //Thread.sleep(5000);
        //wait3.until(ExpectedConditions.visibilityOf(edit_pencil_MaaS360));
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        wait3.until(ExpectedConditions.visibilityOf(edit_pencil_MaaS360));
        Thread.sleep(2000);
        wait3.until(ExpectedConditions.elementToBeClickable(edit_pencil_MaaS360));
        Thread.sleep(2000);
        //Actions actions=new Actions(driver);
        //actions.moveToElement(edit_pencil_MaaS360).click().perform();
        try {
            edit_pencil_MaaS360.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", edit_pencil_MaaS360);
        }
        System.out.println("Clicked it");
            Thread.sleep(15000);
        driver.switchTo().frame(1);
        Thread.sleep(10000);


        //Configure MaaS360
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOf(License_period));
        Thread.sleep(5000);
        sendKeys(License_period, MaaS_License_period);
        Thread.sleep(2000);
        sendKeys(Volume_MaaS360, MaaS_License_volume);
        Thread.sleep(2000);
        sendKeys(License_Type, MaaS_License_type);
        Thread.sleep(2000);
        clickElement(Select_product);
        Thread.sleep(5000);
        clickElement(products);
        Thread.sleep(2000);
        clickElement(finish);
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        logger.debug("MaaS360 is added into the basket");
        Thread.sleep(10000);
    }

    public void WSO(String WSO_SKU_Code, String WSO_License_Volume, String WSO_Professional_services, String WSO_Standard_Engineer, String WSO_Consultant) throws InterruptedException, IOException {
        Thread.sleep(15000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait7 = new WebDriverWait(driver, 400);
        wait7.until(ExpectedConditions.visibilityOf(edit_pencil_WSO));
        Thread.sleep(2000);
        wait7.until(ExpectedConditions.elementToBeClickable(edit_pencil_MaaS360));
        Thread.sleep(2000);
        //clickElement(edit_pencil_WSO);
        try {
            edit_pencil_WSO.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", edit_pencil_WSO);
        }
        Thread.sleep(5000);
        driver.switchTo().frame(1);
        Thread.sleep(12000);

        //Configure WSO
        sendKeys(SKU, WSO_SKU_Code);
        Thread.sleep(8000);
        clickElement(Volume_WSO);
        Thread.sleep(8000);
        sendKeys(Volume_WSO, WSO_License_Volume);
        Thread.sleep(5000);
        clickElement(Deployment_select);
        Thread.sleep(5000);
        clickElement(Deployment);
        Thread.sleep(8000);
        dropDown(Professional_service_wso, WSO_Professional_services);
        Thread.sleep(5000);
        sendKeys(Engineer, WSO_Standard_Engineer);
        Thread.sleep(5000);
        sendKeys(Consultant, WSO_Consultant);
        Thread.sleep(5000);
        clickElement(finish);
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(20000);
        logger.debug("WSO is added into the basket");
        takeScreenShot("WSO is added");
    }
    public void Rotageek(String Rotageek_License_period, String Rotageek_License_volume, String Rotageek_License_type_1, String Rotageek_License_type_2, String Rotageek_PS_Manager) throws InterruptedException {
        Thread.sleep(20000);
        for(int i=0;i<=1;i++) {
            //JavascriptExecutor js7 = (JavascriptExecutor) driver;
            //js7.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            if (i == 0) {
                WebDriverWait wait9 = new WebDriverWait(driver, 300);
                wait9.until(ExpectedConditions.visibilityOf(edit_pencil_Rotageek1));
                Thread.sleep(2000);
                wait9.until(ExpectedConditions.elementToBeClickable(edit_pencil_Rotageek1));
                Thread.sleep(2000);
                //clickElement(edit_pencil_Rotageek1);
                try {
                    edit_pencil_Rotageek1.click();
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", edit_pencil_Rotageek1);
                }
                Thread.sleep(5000);
            } else {
                WebDriverWait wait10 = new WebDriverWait(driver, 300);
                wait10.until(ExpectedConditions.visibilityOf(edit_pencil_Rotageek2));
                Thread.sleep(2000);
                wait10.until(ExpectedConditions.elementToBeClickable(edit_pencil_Rotageek2));
                Thread.sleep(2000);
                try {
                    edit_pencil_Rotageek2.click();
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", edit_pencil_Rotageek2);
                }
                //clickElement(edit_pencil_Rotageek2);
                Thread.sleep(5000);
            }
            driver.switchTo().frame(1);
            Thread.sleep(15000);


            //Configure Rotageek
            sendKeys(License_period_Rotageek, Rotageek_License_period);
            Thread.sleep(2000);
            sendKeys(License_volume_Rotageek, Rotageek_License_volume);
            Thread.sleep(5000);
            if (i == 0) {
                dropDown(License_type_Rotageek, Rotageek_License_type_1);
                Thread.sleep(2000);
            } else {
                dropDown(License_type_Rotageek, Rotageek_License_type_2);
                Thread.sleep(2000);
            }
            clickElement(Installation_required);
            Thread.sleep(2000);
            clickElement(High_redunancy);
            Thread.sleep(2000);
            clickElement(hour_support);
            Thread.sleep(2000);
            sendKeys(Senior_Manager, Rotageek_PS_Manager);
            Thread.sleep(2000);
            clickElement(finish);
            Thread.sleep(2000);
            driver.switchTo().defaultContent();
            Thread.sleep(20000);
        }
logger.debug("Rotageek with required license types are configured");
    }
    public void addRotageek() throws InterruptedException, IOException {

        Thread.sleep(7000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);
        clickElement(Rotageek);

        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);
        Thread.sleep(3000);
    }
 /*   public void Sandblast(String Sandblast_License_period, String Sandblast_License_volume) throws InterruptedException {

        JavascriptExecutor js9 = (JavascriptExecutor) driver;
        js9.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait13 = new WebDriverWait(driver, 200);
        wait13.until(ExpectedConditions.visibilityOf(edit_pencil_Sandbalst));
        Thread.sleep(2000);
        wait13.until(ExpectedConditions.elementToBeClickable(edit_pencil_Sandbalst));
        Thread.sleep(2000);
        try {
            edit_pencil_Sandbalst.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", edit_pencil_Sandbalst);
        }
        Thread.sleep(5000);
        //clickElement(edit_pencil_Sandbalst);
        //Thread.sleep(5000);
        driver.switchTo().frame(1);
        Thread.sleep(15000);


        //Configure Sandblast
        sendKeys(License_period_Sandblast, Sandblast_License_period);
        Thread.sleep(2000);
        sendKeys(License_volume_Sandbalst, Sandblast_License_volume);
        Thread.sleep(2000);
        clickElement(finish);
        Thread.sleep(10000);
        driver.switchTo().defaultContent();
        logger.debug("Sandblast has been configured");
    }
*/
    public void AsavieModa(String AsavieModa_License_period, String AsavieModa_License_volume, String AsavieModa_PS_Fulldays, String AsavieModa_PS_Halfdays) throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(10000);
        JavascriptExecutor js11 = (JavascriptExecutor) driver;
        js11.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait16 = new WebDriverWait(driver, 200);
        wait16.until(ExpectedConditions.visibilityOf(edit_pencil_Asavie));
        Thread.sleep(2000);
        wait16.until(ExpectedConditions.elementToBeClickable(edit_pencil_Asavie));
        Thread.sleep(2000);

            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", edit_pencil_Asavie);

        Thread.sleep(5000);
        driver.switchTo().frame(1);
        Thread.sleep(15000);


        //Configure Asavie Moda
        wait16.until(ExpectedConditions.visibilityOf(License_period_Asavie));
        Thread.sleep(2000);
        wait16.until(ExpectedConditions.elementToBeClickable(License_period_Asavie));
        Thread.sleep(8000);
        sendKeys(License_period_Asavie, AsavieModa_License_period);
        Thread.sleep(8000);
        sendKeys(License_volume_Asavie, AsavieModa_License_volume);
        Thread.sleep(2000);

        Thread.sleep(5000);
        dropDown(Type_of_Service, "Managed Moda Services");
        Thread.sleep(5000);
        dropDown(Type_of_Support, "Business Hours Support (8am-6pm, Mon-Fri)");
        Thread.sleep(5000);
        sendKeys(PS_Full_days, AsavieModa_PS_Fulldays);
        Thread.sleep(2000);
        sendKeys(PS_Half_days, AsavieModa_PS_Halfdays);
        Thread.sleep(2000);
        clickElement(finish);
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(10000);
        logger.debug("Asavie MODA has been configured");
    }
    public void MMA() throws InterruptedException, IOException
    {
        JavascriptExecutor js13 = (JavascriptExecutor) driver;
        js13.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait19 = new WebDriverWait(driver, 200);
        wait19.until(ExpectedConditions.visibilityOf(edit_pencil_MMA));
        Thread.sleep(2000);
        wait19.until(ExpectedConditions.elementToBeClickable(edit_pencil_MMA));
        Thread.sleep(2000);
        try {
            edit_pencil_MMA.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", edit_pencil_MMA);
        }
        //clickElement(edit_pencil_MMA);
        Thread.sleep(8000);
        driver.switchTo().frame(1);
        Thread.sleep(25000);
        WebDriverWait wait = new WebDriverWait(driver, 500);
        wait.until(ExpectedConditions.visibilityOf(finish));
        Thread.sleep(2000);
        //clickElement(finish);
        wait.until(ExpectedConditions.elementToBeClickable(finish));
        Thread.sleep(2000);
        try {
            finish.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", finish);
        }
        //Thread.sleep(5000);

       // JavascriptExecutor executor = (JavascriptExecutor) driver;
        //executor.executeScript("arguments[0].click();", finish);
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(10000);
        logger.debug("MMA has been configured");
        takeScreenShot("MMA configured");
    }
}
