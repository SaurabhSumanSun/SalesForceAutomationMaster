package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;

@Component
public class discount extends PageObject {

    @Autowired
    public discount(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @FindBy(how= How.XPATH, using = "//*[text()=' Discount ']")
    public static WebElement Discount_icon;
    @FindBy(how= How.XPATH, using = "//*[@class='btn icon-cancel']")
    public static WebElement Discount_cancel;
    @FindBy(how= How.XPATH, using = "(//*[@class='slds-button__icon'])[1]")
    public static WebElement Dollar_bag1;
    @FindBy(how= How.XPATH, using = "(//*[@class='slds-button__icon'])[2]")
    public static WebElement Dollar_bag2;
    @FindBy(how= How.XPATH, using = "(//*[@class='slds-button__icon'])[3]")
    public static WebElement Dollar_bag3;
    @FindBy(how= How.XPATH, using = "//*[@id=\"dialog-body-id-2\"]/div/button[2]")
    public static WebElement Add_discount;
    @FindBy(how= How.XPATH, using = "//*[text()='Save discounts']")
    public static WebElement Save_discounts;
    @FindBy(how= How.XPATH, using = "//lightning-input/div/input")
    public static WebElement disAmount;
    @FindBy(how= How.XPATH, using = "(//lightning-input/div/input)[2]")
    public static WebElement disAmount2;
    @FindBy(how= How.XPATH, using = "//*[@class='slds-button slds-button_neutral slds-float--right slds-m-bottom_xx-small']")
    public static  WebElement Save;
    @FindBy(how= How.XPATH, using = "(//*[@class='slds-button slds-button_icon  slds-button_icon-border'])[1]")
    public static WebElement Show_Discount_Flex;
    @FindBy(how= How.XPATH, using = "(//*[@class='slds-button slds-button_icon  slds-button_icon-border'])[2]")
    public static WebElement Show_Discount_Row_Pass;
    @FindBy(how= How.XPATH, using = "(//*[@class='slds-button slds-p-horizontal_x-small slds-border_left slds-m-left_none'])[1]")
    public static WebElement Add_Discount_Flex;
    @FindBy(how= How.XPATH, using = "(//*[@class='slds-button slds-p-horizontal_x-small slds-border_left slds-m-left_none'])[3]")
    public static WebElement Add_Discount_Row_Pass;
    @FindBy(how= How.XPATH, using = "//*[@class='slds-button slds-button_neutral']")
    public static WebElement Back_To_Basket_SIT;
    @FindBy(how= How.XPATH, using = "//*[text()='Charge Type']/../..//select")
    public static WebElement Charge_Type;
    @FindBy(how= How.XPATH, using = "(//*[text()='Charge Type']/../..//select)[2]")
    public static WebElement Charge_Type2;
    @FindBy(how= How.XPATH, using = "(//*[text()='GBP'])[1]/../lightning-formatted-number")
    public static WebElement voiceRRP1;
    @FindBy(how= How.XPATH, using = "(//*[text()='GBP'])[2]/../lightning-formatted-number")
    public static WebElement dataRRP1;
    @FindBy(how= How.XPATH, using = "(//*[text()='GBP'])[7]/../lightning-formatted-number")
    public static WebElement voiceRRP2;
    @FindBy(how= How.XPATH, using = "(//*[text()='GBP'])[8]/../lightning-formatted-number")
    public static WebElement dataRRP2;
    @FindBy(how= How.XPATH, using = "(//*[text()='GBP'])[13]/../lightning-formatted-number")
    public static WebElement voiceRRP3;
    @FindBy(how= How.XPATH, using = "(//*[text()='GBP'])[14]/../lightning-formatted-number")
    public static WebElement dataRRP3;


    public  void discounts() throws InterruptedException, IOException {
        Thread.sleep(10000);
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.elementToBeClickable(Discount_icon));
        clickElement(Discount_icon);
        Thread.sleep(15000);
        WebDriverWait wait2 = new WebDriverWait(driver,20);
        wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        Thread.sleep(10000);
        //wait2.until(ExpectedConditions.elementToBeClickable(Dollar_bag1));
        //Thread.sleep(2000);
        //clickElement(Dollar_bag1);
        //Thread.sleep(1000);
        //clickElement(Add_discount);
        //Thread.sleep(1000);
        //sendKeys(disAmount,"10");
        clickElement(Save_discounts);
        takeScreenShot("Discount");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        clickElement(Discount_cancel);
        Thread.sleep(10000);
    }

    public void captureRRP() throws InterruptedException {
        Thread.sleep(10000);
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.elementToBeClickable(Discount_icon));
        clickElement(Discount_icon);
        Thread.sleep(10000);
        WebDriverWait wait2 = new WebDriverWait(driver,20);
        wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        String voice_RRP1=voiceRRP1.getText();
        String voice_RRP2=voiceRRP2.getText();
        String voice_RRP3=voiceRRP3.getText();
        String data_RRP1=dataRRP1.getText();
        String data_RRP2=dataRRP2.getText();
        String data_RRP3=dataRRP3.getText();
        System.out.println("Voice RRP 1= "+voice_RRP1);
        System.out.println("Data RRP 1= "+data_RRP1);
        System.out.println("Voice RRP 2= "+voice_RRP2);
        System.out.println("Data RRP 2= "+data_RRP2);
        System.out.println("Voice RRP 3= "+voice_RRP3);
        System.out.println("Data RRP 3= "+data_RRP3);
    }

    public void discountGPT(String Voice_Discount1,String Voice_Discount2,String Voice_Discount3,String Data_Discount1,String Data_Discount2,String Data_Discount3, String Sharer_Fee3) throws InterruptedException, IOException {
        Thread.sleep(10000);
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.elementToBeClickable(Discount_icon));
        clickElement(Discount_icon);
        Thread.sleep(10000);
        WebDriverWait wait2 = new WebDriverWait(driver,20);
        wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        if(!Voice_Discount1.equals("")&&!Data_Discount1.equals(""))
        {
            clickElement(Dollar_bag1);
            clickElement(Add_discount);
            Thread.sleep(1000);
            dropDown(Charge_Type, "Voice RRP");
            Thread.sleep(2000);
            disAmount.clear();
            sendKeys(disAmount, Voice_Discount1);
            clickElement(Save_discounts);
            Thread.sleep(13000);
            WebDriverWait wait3 = new WebDriverWait(driver, 20);
            wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
            Thread.sleep(5000);
            clickElement(Add_discount);
            Thread.sleep(2000);
            dropDown(Charge_Type2, "Data RRP");
            Thread.sleep(2000);
            disAmount2.clear();
            sendKeys(disAmount2, Data_Discount1);
            clickElement(Save_discounts);
            Thread.sleep(13000);
            wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
            Thread.sleep(4000);
            clickElement(Dollar_bag1);
            Thread.sleep(2000);
        }
        else if(!Voice_Discount1.equals("")||!Data_Discount1.equals(""))
            {
                clickElement(Dollar_bag1);
                if(!Voice_Discount1.equals(""))
                    {
                        clickElement(Add_discount);
                        Thread.sleep(1000);
                        dropDown(Charge_Type, "Voice RRP");
                        Thread.sleep(2000);
                        disAmount.clear();
                        sendKeys(disAmount, Voice_Discount1);
                        clickElement(Save_discounts);
                        Thread.sleep(13000);
                        WebDriverWait wait3 = new WebDriverWait(driver, 20);
                        wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
                        Thread.sleep(2000);
                    }
                if(!Data_Discount1.equals(""))
                    {
                        clickElement(Add_discount);
                        Thread.sleep(1000);
                        dropDown(Charge_Type, "Data RRP");
                        Thread.sleep(2000);
                        disAmount.clear();
                        sendKeys(disAmount, Data_Discount1);
                        clickElement(Save_discounts);
                        Thread.sleep(13000);
                        WebDriverWait wait3 = new WebDriverWait(driver, 20);
                        wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
                        Thread.sleep(2000);
                    }
                Thread.sleep(3000);
                clickElement(Dollar_bag1);
                Thread.sleep(2000);
            }
        else
        {
            System.out.println("No discount Applied for 1st product");
        }
        if(!Voice_Discount2.equals("")&&!Data_Discount2.equals(""))
        {
            Thread.sleep(1000);
            clickElement(Dollar_bag2);
            clickElement(Add_discount);
            Thread.sleep(1000);
            dropDown(Charge_Type, "Voice RRP");
            Thread.sleep(2000);
            disAmount.clear();
            sendKeys(disAmount, Voice_Discount2);
            clickElement(Save_discounts);
            Thread.sleep(13000);
            WebDriverWait wait3 = new WebDriverWait(driver, 20);
            wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
            Thread.sleep(5000);
            clickElement(Add_discount);
            Thread.sleep(2000);
            dropDown(Charge_Type2, "Data RRP");
            Thread.sleep(2000);
            disAmount2.clear();
            sendKeys(disAmount2, Data_Discount2);
            clickElement(Save_discounts);
            Thread.sleep(13000);
            wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
            Thread.sleep(5000);
            clickElement(Dollar_bag2);
            Thread.sleep(2000);
        }
        else if(!Voice_Discount2.equals("")||!Data_Discount2.equals(""))
            {
                Thread.sleep(1000);
                clickElement(Dollar_bag2);
            if(!Voice_Discount2.equals(""))
            {
                clickElement(Add_discount);
                Thread.sleep(1000);
                dropDown(Charge_Type, "Voice RRP");
                Thread.sleep(2000);
                disAmount.clear();
                sendKeys(disAmount, Voice_Discount2);
                clickElement(Save_discounts);
                Thread.sleep(13000);
                WebDriverWait wait3 = new WebDriverWait(driver, 20);
                wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
                Thread.sleep(2000);
            }

        if(!Data_Discount2.equals(""))
            {
                clickElement(Add_discount);
                Thread.sleep(1000);
                dropDown(Charge_Type, "Data RRP");
                Thread.sleep(2000);
                disAmount.clear();
                sendKeys(disAmount, Data_Discount2);
                clickElement(Save_discounts);
                Thread.sleep(13000);
                WebDriverWait wait3 = new WebDriverWait(driver, 20);
                wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
                Thread.sleep(2000);
            }
            Thread.sleep(2000);
            clickElement(Dollar_bag2);
            Thread.sleep(2000);
        }
        else
        {
            System.out.println("No discount Applied for 2nd product");
        }

        if(!Sharer_Fee3.equals("")&&!Data_Discount3.equals(""))
        {
            Thread.sleep(1000);
            clickElement(Dollar_bag3);
            clickElement(Add_discount);
            Thread.sleep(1000);
            dropDown(Charge_Type, "Sharer Fee or Aggregation Fee");
            Thread.sleep(2000);
            disAmount.clear();
            sendKeys(disAmount, Sharer_Fee3);
            clickElement(Save_discounts);
            Thread.sleep(13000);
            WebDriverWait wait3 = new WebDriverWait(driver, 20);
            wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
            Thread.sleep(5000);
            clickElement(Add_discount);
            Thread.sleep(2000);
            dropDown(Charge_Type2, "Data RRP");
            Thread.sleep(2000);
            disAmount2.clear();
            sendKeys(disAmount2, Data_Discount3);
            clickElement(Save_discounts);
            Thread.sleep(13000);
            wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
            Thread.sleep(6000);
            clickElement(Dollar_bag3);
            Thread.sleep(2000);
        }
        else if(!Voice_Discount3.equals("")&&!Data_Discount3.equals(""))
        {
            Thread.sleep(1000);
            clickElement(Dollar_bag3);
            clickElement(Add_discount);
            Thread.sleep(1000);
            dropDown(Charge_Type, "Voice RRP");
            Thread.sleep(2000);
            disAmount.clear();
            sendKeys(disAmount, Voice_Discount3);
            clickElement(Save_discounts);
            Thread.sleep(13000);
            WebDriverWait wait3 = new WebDriverWait(driver, 20);
            wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
            Thread.sleep(6000);
            clickElement(Add_discount);
            Thread.sleep(2000);
            dropDown(Charge_Type2, "Data RRP");
            Thread.sleep(2000);
            disAmount2.clear();
            sendKeys(disAmount2, Data_Discount3);
            clickElement(Save_discounts);
            Thread.sleep(13000);
            wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
            Thread.sleep(5000);
            clickElement(Dollar_bag3);
            Thread.sleep(2000);
        }
        else if(!Voice_Discount3.equals("")||!Data_Discount3.equals("")) {
            Thread.sleep(1000);
            clickElement(Dollar_bag3);
            if(!Voice_Discount3.equals(""))
            {
                clickElement(Add_discount);
                Thread.sleep(2000);
                dropDown(Charge_Type, "Voice RRP");
                Thread.sleep(2000);
                disAmount.clear();
                sendKeys(disAmount, Voice_Discount3);
                clickElement(Save_discounts);
                Thread.sleep(13000);
                WebDriverWait wait3 = new WebDriverWait(driver, 20);
                wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
                Thread.sleep(2000);
            }
            if(!Data_Discount3.equals(""))
            {
                clickElement(Add_discount);
                Thread.sleep(1000);
                dropDown(Charge_Type, "Data RRP");
                Thread.sleep(2000);
                disAmount.clear();
                sendKeys(disAmount, Data_Discount3);
                clickElement(Save_discounts);
                Thread.sleep(13000);
                WebDriverWait wait3 = new WebDriverWait(driver, 20);
                wait3.until(ExpectedConditions.visibilityOf(Dollar_bag1));
                Thread.sleep(2000);
            }
            Thread.sleep(2000);
            clickElement(Dollar_bag3);
            Thread.sleep(2000);
        }
        else
        {
            System.out.println("No discount Applied for 3rd product");
        }
        takeScreenShot("Discount");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        clickElement(Discount_cancel);
        Thread.sleep(10000);
    }
    public  void discountOpenClose() throws InterruptedException, IOException {
        Thread.sleep(10000);
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.elementToBeClickable(Discount_icon));
        clickElement(Discount_icon);
        Thread.sleep(10000);
        WebDriverWait wait2 = new WebDriverWait(driver,20);
        wait2.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        takeScreenShot("Discount");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        clickElement(Discount_cancel);
        Thread.sleep(10000);
    }

    public  void discountOpenCloseFP() throws InterruptedException, IOException {
        Thread.sleep(10000);
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.elementToBeClickable(Discount_icon));
        clickElement(Discount_icon);
        Thread.sleep(10000);
        //JavascriptExecutor js1 = (JavascriptExecutor) driver;
        //js1.executeScript("window.scrollTo(0,0)");
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(Discount_icon));
        //JavascriptExecutor js2 = (JavascriptExecutor) driver;
        //js2.executeScript("arguments[0].click()",Discount_icon);
        //clickElement(Discount_icon);
        //Thread.sleep(3000);
        WebDriverWait wait3 = new WebDriverWait(driver,20);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        takeScreenShot("Discount");
        //Thread.sleep(3000);
        //WebDriverWait wait4 = new WebDriverWait(driver, 15);
        //wait4.until(ExpectedConditions.elementToBeClickable(Show_Discount_Flex));
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click()",Show_Discount_Flex);
        //clickElement(Show_Discount_Flex);
        if(Add_Discount_Flex.isEnabled())
        {
            logger.debug("Fail: Discount can be added for Flex Plan");
        }
        else
        {
            logger.debug("Pass: Discount cannot be added for Flex Plan");
        }
        clickElement(Show_Discount_Row_Pass);
        if(Add_Discount_Row_Pass.isEnabled())
        {
            logger.debug("Fail: Discount can be added for 24 Hour Row Pass");
        }
        else
        {
            logger.debug("Pass: Discount cannot be added for 24 Hour Row Pass");
        }
        //Thread.sleep(5000);
        driver.switchTo().defaultContent();
        clickElement(Discount_cancel);

    }

    public  void discountOpenCloseSIT() throws InterruptedException, IOException {
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,0)");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Discount_icon));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()",Discount_icon);
        //clickElement(Discount_icon);
        Thread.sleep(5000);
        //WebDriverWait wait3 = new WebDriverWait(driver,20);
        //wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        takeScreenShot("Discount");
        //Thread.sleep(3000);
        //WebDriverWait wait4 = new WebDriverWait(driver, 15);
        //wait4.until(ExpectedConditions.elementToBeClickable(Show_Discount_Flex));
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click()",Show_Discount_Flex);
        //clickElement(Show_Discount_Flex);
        if(Add_Discount_Flex.isEnabled())
        {
            logger.debug("Discount can be added for product");
        }
        else
        {
            logger.debug("Discount cannot be added for product");
        }

        //Thread.sleep(5000);
        //driver.switchTo().defaultContent();
        //clickElement(Discount_cancel);
        clickElement(Back_To_Basket_SIT);
        //Thread.sleep(5000);

    }

}
