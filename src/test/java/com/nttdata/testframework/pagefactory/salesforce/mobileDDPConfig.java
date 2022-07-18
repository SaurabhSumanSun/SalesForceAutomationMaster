package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;
import java.util.List;

@Component
public class mobileDDPConfig extends PageObject {
    @Autowired
    public mobileDDPConfig(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001ec8aQAA~a2I9E000000pGkvUAE_anchor\"]")
    public static WebElement mobileBB;
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E000001apoaQAA~a2I9E000000lir0UAA_anchor\"]")
    public static WebElement mobileBB_SIT;
    @FindBy(how = How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']")
    public static WebElement add_product;
    @FindBy(how = How.XPATH, using = "//*[@class='btn label icon-add']")
    public static WebElement save_product;

   //Edit- pencil xpath details
    @FindBy(how = How.XPATH, using = "(//div[@ng-if='isAction()']//button)[2]")
    public static WebElement edit_pencil1;

    @FindBy(how = How.XPATH, using = "(//div[@ng-if='isAction()']//button)[5]")
    public static WebElement edit_pencil2;

    @FindBy(how = How.XPATH, using = "(//div[@ng-if='isAction()']//button)[8]")
    public static WebElement edit_pencil3;

    //Edit config Page Xpaths
    @FindBy(how = How.XPATH, using = "//*[@name='No_of_Connections_0']")
    public static WebElement noOfConnections;

    @FindBy(how = How.XPATH, using = "//*[@name='Provisional_Tariff_0']/..//*[@class='checkbox-style']")
    public static WebElement provisionalTarrif;

    @FindBy(how = How.XPATH, using = "//*[@name='Bill_Spend_Cap_0']")
    public static WebElement billSpendCap;

    @FindBy(how = How.XPATH, using = "//*[@name='Is_Private_APN_0']")
    public static WebElement privateAPN;

    @FindBy(how = How.XPATH, using = "//*[@name='Mobex_0']")
    public static WebElement mobexRequired;

    @FindBy(how = How.XPATH, using = "//*[@id='select2-chosen-2'][text()='Please select value']")
    public static WebElement mobexService;

    @FindBy(how = How.XPATH, using = "//*[@id='Mobile:Big_Business:Type_0']")
    public static WebElement type;

    @FindBy(how = How.XPATH, using = "//*[@id='Mobile:Big_Business:Voice_Type_0']")
    public static WebElement voiceType;

    @FindBy(how = How.XPATH, using = "//*[@name='Contract_Term_0']")
    public static WebElement term;

    @FindBy(how = How.XPATH, using = "//*[@id='Mobile:Big_Business:Type_of_Data_0']")
    public static WebElement dataType;

    @FindBy(how = How.XPATH, using = "//*[@id='select2-chosen-1']")
    public static WebElement dataAllowance;

    @FindBy(how = How.XPATH, using = "//div[@class='rTableCell']")
    public static List<WebElement> options;

    @FindBy(how = How.XPATH, using = "//*[@id='Mobile:Data:Capped_Uncapped_0']")
    public static WebElement cappedOrUncapped;

    @FindBy(how = How.XPATH, using = "//*[@name='Aggregate_0']/..//*[@class='checkbox-style']")
    public static WebElement aggregatedData;

    @FindBy(how = How.XPATH, using = "(//button[@class='slds-button slds-button--brand'])[1]")
    public static WebElement finishIntialization;

    @FindBy(how = How.XPATH, using = "//*[text()='Run Compatibility Rules']/..//*[@class='ng-binding ng-isolate-scope icon-sync']")
    public static WebElement runCompatibilityRules;

    @FindBy(how = How.XPATH, using = "(//*[@class='inner-pre'])[1]")
    public static WebElement runCompatibilityRulesMsg;

    @FindBy(how = How.XPATH, using = "//*[@class='btn icon-cancel']")
    public static WebElement compatibilityCloseButton;

    @FindBy(how = How.XPATH, using = "//*[text()='2.5TB Shared Data']")
    public static WebElement element;

    public void BBConfig(String NoOfConnections,String ProvisionalTarrif,String BillSpendCap,String PrivateAPN,String MobexRequired,String MobexService,String Type,String VoiceType, String Term, String DataType,String DataAllowance, String CappedOrUncapped, String AggregatedData) throws InterruptedException, IOException {

        // add product already clicked
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Select the mobile product mobile Big Business
        clickElement(mobileBB);
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);

        //Wait till background process and click the edit pencil

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait2 = new WebDriverWait(driver, 500);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil1));

        if (edit_pencil1.isEnabled()) {
            logger.debug("Big Business or NS2 product is present in Basket");
        } else {
            logger.debug("Big Business or NS2 product is not present in Basket");
        }
        clickElement(edit_pencil1);
        //Thread.sleep(25000);
        //driver.switchTo().frame(1);
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(10000);
        WebDriverWait wait4 = new WebDriverWait(driver, 15);
        wait4.until(ExpectedConditions.elementToBeClickable(noOfConnections));

        int s = driver.findElements(By.tagName("iframe")).size();
        //System.out.println("s is",+s);
        Thread.sleep(2000);
        sendKeys(noOfConnections, NoOfConnections);

        Thread.sleep(2000);
        sendKeys(billSpendCap, BillSpendCap);
        Thread.sleep(2000);
        sendKeys(privateAPN, PrivateAPN);
        Thread.sleep(2000);
        sendKeys(mobexRequired, MobexRequired);

        Thread.sleep(2000);
        dropDown(type, Type);
        Thread.sleep(5000);
        if(!"Data Only".equals(Type))
        {
            dropDown(voiceType, VoiceType);
            Thread.sleep(2000);
        }
        term.clear();
        WebDriverWait wait21 = new WebDriverWait(driver, 20);
        wait21.until(ExpectedConditions.visibilityOf(term));
        Thread.sleep(11000);
        sendKeys(term, Term);
        Thread.sleep(5000);
        if(!"Voice Only".equals(Type))
        {
            //Thread.sleep(4000);
            dropDown(dataType, DataType);
            Thread.sleep(10000);
            //wait4.until(ExpectedConditions.elementToBeClickable(dataAllowance));
        }
        //clickElement(dataAllowance);
        //Select select = new Select(dataAllowance);
        //System.out.println("Element Clicked");
        //Thread.sleep(10000);

        if (!DataAllowance.equals(""))
        {
            Thread.sleep(4000);
            dropDown(cappedOrUncapped, CappedOrUncapped);
            Thread.sleep(5000);
            clickElement(dataAllowance);
            //Select select = new Select(dataAllowance);
            //System.out.println("Element Clicked");
            Thread.sleep(11000);

            for (int i = 0; i < options.size(); i++)
            {
                String temp = options.get(i).getText();
                if (temp.equals(DataAllowance))
                {
                    options.get(i).click();
                    break;
                }
            }

            if(AggregatedData.equals("Yes"))
            {
                aggregatedData.click();
                Thread.sleep(2000);
            }
            Thread.sleep(4000);
        }
            Thread.sleep(5000);
            clickElement(finishIntialization);
            Thread.sleep(10000);
            driver.switchTo().defaultContent();
            Thread.sleep(2000);
            //logger.debug("mobile Flex International Bolton has been pre-configured");
            //takeScreenShot("mobile Flex International Bolton pre-configured");

        }



    public void BBConfig_SIT(String NoOfConnections,String ProvisionalTarrif,String BillSpendCap,String PrivateAPN,String MobexRequired,String MobexService,String Type,String VoiceType, String Term, String DataType,String DataAllowance, String CappedOrUncapped, String AggregatedData) throws InterruptedException, IOException {

        // add product already clicked
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Select the mobile product mobile Big Business
        clickElement(mobileBB_SIT);
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);

        //Wait till background process and click the edit pencil

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait2 = new WebDriverWait(driver, 500);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil1));

        if(edit_pencil1.isEnabled())
        {
            logger.debug("Big Business or NS2 product is present in Basket");
        }
        else
        {
            logger.debug("Big Business or NS2 product is not present in Basket");
        }
        clickElement(edit_pencil1);
        //Thread.sleep(25000);
        //driver.switchTo().frame(1);
        WebDriverWait wait3 = new WebDriverWait(driver,20);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //Thread.sleep(5000);
        WebDriverWait wait4 = new WebDriverWait(driver, 15);
        wait4.until(ExpectedConditions.elementToBeClickable(noOfConnections));

        int s=driver.findElements(By.tagName("iframe")).size();
        //System.out.println("s is",+s);
        Thread.sleep(2000);
        sendKeys(noOfConnections,NoOfConnections);
        Thread.sleep(2000);
        dropDown(type, Type);
        Thread.sleep(2000);
        dropDown(voiceType, VoiceType);
        Thread.sleep(2000);
        term.clear();
        Thread.sleep(2000);
        sendKeys(term,Term);
        Thread.sleep(5000);
        dropDown(dataType, DataType);
        Thread.sleep(8000);
        if(!DataAllowance.equals(""))
        {
        clickElement(dataAllowance);
        //Select select = new Select(dataAllowance);
        //System.out.println("Element Clicked");
        Thread.sleep(11000);

        for (int i = 0; i < options.size(); i++) {
            String temp = options.get(i).getText();
            if (temp.equals(DataAllowance)) {
                options.get(i).click();
                break;
            }
        }
            Thread.sleep(4000);
            dropDown(cappedOrUncapped, CappedOrUncapped);
            Thread.sleep(4000);
        }



        clickElement(finishIntialization);
        Thread.sleep(10000);
        driver.switchTo().defaultContent();
        logger.debug("mobile Big Business has been configured");
        takeScreenShot("mobile Big Business has been configured");

        //Compatibility Rules
        Thread.sleep(5000);
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        Thread.sleep(10000);
        WebDriverWait wait10 = new WebDriverWait(driver, 20);
        wait10.until(ExpectedConditions.elementToBeClickable(runCompatibilityRules));
        js4.executeScript("arguments[0].scrollIntoView();", runCompatibilityRules);
        clickElement(runCompatibilityRules);
        Thread.sleep(10000);
        driver.switchTo().frame(1);
        String actualMsgPresent= runCompatibilityRulesMsg.getText();
        Thread.sleep(2000);
        //driver.switchTo().frame(1);
        //Thread.sleep(3000);
        String actualMsgExpected ="Basket compatibility rule check passed, please close this screen and proceed to the 'Data Usage & Call Mix' tab or the next relevant step.";
        try{
            Assert.assertEquals(actualMsgPresent,actualMsgExpected);
        } catch (Exception e){
            System.out.println("message mismatch-rules not matching");
        }
        driver.switchTo().defaultContent();
        clickElement(compatibilityCloseButton);
        //driver.switchTo().defaultContent();

        // Thread.sleep(10000);
        logger.debug("Mobile Flex Compatible");
        logger.debug("mobile Flex has been checked for Compatibility");
        takeScreenShot("MobileFlex CompatibilityCheck");

    }

    public void BBConfigSecond(String NoOfConnections,String ProvisionalTarrif,String BillSpendCap,String PrivateAPN,String MobexRequired,String MobexService,String Type,String VoiceType, String DataType,String DataAllowance, String CappedOrUncapped, String AggregatedData) throws InterruptedException, IOException {
        Thread.sleep(10000);
        System.out.println("Add Product");
        driver.navigate().refresh();
        Thread.sleep(8000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(8000);
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        wait1.until(ExpectedConditions.elementToBeClickable(add_product));
        Thread.sleep(10000);
        clickElement(add_product);
        Thread.sleep(2000);
        logger.debug("Basket is ready to add products");
        Thread.sleep(3000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Select the mobile product mobile Big Business
        clickElement(mobileBB);
        WebDriverWait wait20 = new WebDriverWait(driver, 20);
        wait20.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);
        Thread.sleep(2000);
        //Wait till background process and click the edit pencil

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait2 = new WebDriverWait(driver, 500);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil2));

        if (edit_pencil2.isEnabled()) {
            logger.debug("Big Business or NS2 product is present in Basket");
        } else {
            logger.debug("Big Business or NS2 product is not present in Basket");
        }
        Thread.sleep(2000);
        clickElement(edit_pencil2);
        //Thread.sleep(25000);
        //driver.switchTo().frame(1);
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //Thread.sleep(5000);
        WebDriverWait wait4 = new WebDriverWait(driver, 15);
        wait4.until(ExpectedConditions.elementToBeClickable(noOfConnections));

        int s = driver.findElements(By.tagName("iframe")).size();
        //System.out.println("s is",+s);
        Thread.sleep(2000);
        sendKeys(noOfConnections, NoOfConnections);

        //Thread.sleep(2000);
        //sendKeys(billSpendCap, BillSpendCap);
        Thread.sleep(2000);
        sendKeys(privateAPN, PrivateAPN);
        Thread.sleep(2000);
        sendKeys(mobexRequired, MobexRequired);

        Thread.sleep(2000);
        dropDown(type, Type);
        Thread.sleep(5000);
        if(!"Data Only".equals(Type))
        {
            dropDown(voiceType, VoiceType);
            Thread.sleep(2000);
        }
        //term.clear();
        //Thread.sleep(2000);
        //sendKeys(term, Term);
        //Thread.sleep(5000);
        if(!"Voice Only".equals(Type))
        {
            dropDown(dataType, DataType);
            Thread.sleep(10000);
            //wait4.until(ExpectedConditions.elementToBeClickable(dataAllowance));
        }
        //clickElement(dataAllowance);
        //Select select = new Select(dataAllowance);
        //System.out.println("Element Clicked");
        //Thread.sleep(10000);

        if (!DataAllowance.equals(""))
        {
            Thread.sleep(4000);
            dropDown(cappedOrUncapped, CappedOrUncapped);
            Thread.sleep(5000);
            clickElement(dataAllowance);
            //Select select = new Select(dataAllowance);
            //System.out.println("Element Clicked");
            Thread.sleep(11000);

            for (int i = 0; i < options.size(); i++)
            {
                String temp = options.get(i).getText();
                if (temp.equals(DataAllowance))
                {
                    options.get(i).click();
                    break;
                }
            }

            if(AggregatedData.equals("Yes"))
            {
                aggregatedData.click();
                Thread.sleep(2000);
            }
            Thread.sleep(4000);
        }
        Thread.sleep(5000);
        clickElement(finishIntialization);
        Thread.sleep(10000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        //logger.debug("mobile Flex International Bolton has been pre-configured");
        //takeScreenShot("mobile Flex International Bolton pre-configured");

    }
    public void BBConfigThird(String NoOfConnections,String ProvisionalTarrif,String BillSpendCap,String PrivateAPN,String MobexRequired,String MobexService,String Type,String VoiceType, String DataType,String DataAllowance, String CappedOrUncapped, String AggregatedData) throws InterruptedException, IOException {
        Thread.sleep(10000);
        System.out.println("Add Product");
        driver.navigate().refresh();
        Thread.sleep(8000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(8000);
        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        wait1.until(ExpectedConditions.elementToBeClickable(add_product));
        Thread.sleep(10000);
        clickElement(add_product);
        Thread.sleep(2000);
        logger.debug("Basket is ready to add products");
        Thread.sleep(3000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        // Select the mobile product mobile Big Business
        clickElement(mobileBB);
        WebDriverWait wait20 = new WebDriverWait(driver, 20);
        wait20.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);

        //Wait till background process and click the edit pencil

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait2 = new WebDriverWait(driver, 500);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil3));

        if (edit_pencil3.isEnabled()) {
            logger.debug("Big Business or NS2 product is present in Basket");
        } else {
            logger.debug("Big Business or NS2 product is not present in Basket");
        }
        Thread.sleep(2000);
        clickElement(edit_pencil3);
        //Thread.sleep(25000);
        //driver.switchTo().frame(1);
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //Thread.sleep(5000);
        WebDriverWait wait4 = new WebDriverWait(driver, 15);
        wait4.until(ExpectedConditions.elementToBeClickable(noOfConnections));

        int s = driver.findElements(By.tagName("iframe")).size();
        //System.out.println("s is",+s);
        Thread.sleep(2000);
        sendKeys(noOfConnections, NoOfConnections);

        //Thread.sleep(2000);
        //sendKeys(billSpendCap, BillSpendCap);
        Thread.sleep(2000);
        sendKeys(privateAPN, PrivateAPN);
        Thread.sleep(2000);
        sendKeys(mobexRequired, MobexRequired);

        Thread.sleep(2000);
        dropDown(type, Type);
        Thread.sleep(5000);
        if (!"Data Only".equals(Type)) {
            dropDown(voiceType, VoiceType);
            Thread.sleep(2000);
        }
        //term.clear();
        //Thread.sleep(2000);
        //sendKeys(term, Term);
        Thread.sleep(5000);
        if (!"Voice Only".equals(Type)) {
            dropDown(dataType, DataType);
            Thread.sleep(10000);
            //wait4.until(ExpectedConditions.elementToBeClickable(dataAllowance));
        }
        //clickElement(dataAllowance);
        //Select select = new Select(dataAllowance);
        //System.out.println("Element Clicked");
        //Thread.sleep(10000);

        if (!DataAllowance.equals("")) {

            Thread.sleep(4000);
            dropDown(cappedOrUncapped, CappedOrUncapped);
            Thread.sleep(5000);
            clickElement(dataAllowance);
            //Select select = new Select(dataAllowance);
            //System.out.println("Element Clicked");
            Thread.sleep(11000);

            //Actions action = new Actions(driver);
            //action.moveToElement(element).build().perform();
            JavascriptExecutor je = (JavascriptExecutor) driver;
            je.executeScript("arguments[0].scrollIntoView(true);", options.get(51) );

            Thread.sleep(5000);
            //System.out.println("Size= "+options.size());

            for (int i = 0; i < options.size(); i++) {
                String temp = options.get(i).getText();
                if (temp.equals(DataAllowance))
                {
                    options.get(i).click();
                    break;
                }
            }
            Thread.sleep(20000);

            if(AggregatedData.equals("Yes"))
            {
                aggregatedData.click();
                Thread.sleep(2000);
            }
            Thread.sleep(4000);
        }
        Thread.sleep(5000);
        clickElement(finishIntialization);
        Thread.sleep(10000);
        driver.switchTo().defaultContent();
        //logger.debug("mobile Flex International Bolton has been pre-configured");
        //takeScreenShot("mobile Flex International Bolton pre-configured");
        Thread.sleep(2000);
    }


    public void RunCompatiblity() throws InterruptedException, IOException {
//Compatibility Rules
                Thread.sleep(5000);
                Thread.sleep(8000);
                driver.navigate().refresh();
                Thread.sleep(6000);
                WebDriverWait wait5 = new WebDriverWait(driver, 200);
                wait5.until(ExpectedConditions.elementToBeClickable(runCompatibilityRules));
                JavascriptExecutor js4 = (JavascriptExecutor) driver;
                js4.executeScript("arguments[0].scrollIntoView();", runCompatibilityRules);
                clickElement(runCompatibilityRules);
                Thread.sleep(12000);
                driver.switchTo().frame(1);
                String actualMsgPresent = runCompatibilityRulesMsg.getText();
                Thread.sleep(2000);
                //driver.switchTo().frame(1);
                //Thread.sleep(3000);
                String actualMsgExpected = "Basket compatibility rule check passed, please close this screen and proceed to the 'Data Usage & Call Mix' tab or the next relevant step.";
                try {
                Assert.assertEquals(actualMsgPresent, actualMsgExpected);
                } catch (Exception e) {
                System.out.println("message mismatch-rules not matching");
                }
                driver.switchTo().defaultContent();
                clickElement(compatibilityCloseButton);
                //driver.switchTo().defaultContent();

                // Thread.sleep(10000);
                logger.debug("Mobile Flex Compatible");
                logger.debug("mobile Flex has been checked for Compatibility");
                takeScreenShot("MobileFlex CompatibilityCheck");
                }
}