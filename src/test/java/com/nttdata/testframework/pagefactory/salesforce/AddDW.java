package com.nttdata.testframework.pagefactory.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
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
public class AddDW extends PageObject {
    @Autowired
    public AddDW(CustomWebDriver customWebDriver) throws AWTException {
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

        Thread.sleep(10000);
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
        /*js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
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

         */
    }
}
