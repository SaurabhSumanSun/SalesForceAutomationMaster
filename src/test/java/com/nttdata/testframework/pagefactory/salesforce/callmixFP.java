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
@Component
public class callmixFP extends PageObject{
    @Autowired
    public callmixFP (CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }
    @FindBy(how= How.XPATH, using = "(//*[@class='btn-basic ng-binding ng-scope ng-isolate-scope icon'])[1]")
    public static WebElement Call_mix_icon;
    @FindBy(how= How.XPATH, using = "(//*[@class='btn'])[1]")
    public static  WebElement Edit_callmix;
    @FindBy(how= How.XPATH, using = "//*[text()='Usage Period']/../select")
    public static  WebElement Usage_Period;
    @FindBy(how= How.XPATH, using = "//*[contains(text(),'Usage Date Range')]/../input")
    public static  WebElement Usage_Date_Range;
    @FindBy(how= How.XPATH, using = "//*[@class='selectedFile']")
    public static  WebElement Choose_File;

    @FindBy(how= How.XPATH, using = "//*[@class='selectedUsageDomestic']")
    public static WebElement edit1;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id4:j_id5:theForm:callmixPage:j_id397:j_id400:j_id405']")
    public static WebElement edit2;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id4:j_id5:theForm:callmixPage:j_id407:j_id409']")
    public static  WebElement refresh;



    @FindBy(how= How.XPATH, using ="(//*[@value='Save'])[1]")
    public static WebElement save_callmix;
    @FindBy(how= How.XPATH, using ="//*[@class='btn icon-cancel']")
    public static WebElement cancel_callmix;

    @FindBy(how= How.XPATH, using ="(//*[@class='dataCol  first '])[6]")
    public static WebElement TotalMinutesPerMonth;
    @FindBy(how= How.XPATH, using ="//tr/td[text()='Total']/../td[3]")
    public static WebElement CalculatedTotalMinutesPerMonth;
    @FindBy(how= How.XPATH, using ="(//*[@class='dataCol  first '])[5]")
    public static WebElement NewVoiceNumberOfConnections;
    @FindBy(how= How.XPATH, using ="(//*[@class='dataCol  last '])[5]")
    public static WebElement AverageMinutesPerConnectionPerMonth;
    @FindBy(how= How.XPATH, using ="//*[text()='International and Roaming Rates']/..//select")
    public static WebElement InternationalAndRoamingRates;

    public static void callmix() throws Throwable {
        //Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,0)");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        //clickElement(Call_mix_icon);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()",Call_mix_icon);
        Thread.sleep(2000);
        //driver.switchTo().frame(1);
        WebDriverWait wait3 = new WebDriverWait(driver,15);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        clickElement(Edit_callmix);
        Thread.sleep(10000);
        //edit1.clear();
        //sendKeys(edit1,"1000");
        //edit2.clear();
        //sendKeys(edit2,"1000");
        clickElement(save_callmix);
        takeScreenShot("call mix");
        //Thread.sleep(9000);
        //clickElement(refresh);
        Thread.sleep(15000);
        driver.switchTo().defaultContent();
        clickElement(cancel_callmix);
    }
    public static void callmixResign() throws Throwable {
        //Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,0)");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        //clickElement(Call_mix_icon);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()",Call_mix_icon);
        Thread.sleep(2000);
        //driver.switchTo().frame(1);
        WebDriverWait wait3 = new WebDriverWait(driver,15);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        clickElement(Edit_callmix);
        Thread.sleep(10000);
        dropDown(Usage_Period, "12 Months");
        Thread.sleep(2000);
        sendKeys(Usage_Date_Range, "6");
        Thread.sleep(2000);
        Choose_File.sendKeys("C:\\Users\\sumans\\Desktop\\O2_One\\ResignUsage_BA.csv");
        Thread.sleep(10000);
        //edit1.clear();
        //sendKeys(edit1,"1000");
        //edit2.clear();
        //sendKeys(edit2,"1000");
        clickElement(save_callmix);
        takeScreenShot("call mix");
        //Thread.sleep(9000);
        //clickElement(refresh);
        Thread.sleep(15000);
        driver.switchTo().defaultContent();
        clickElement(cancel_callmix);
    }
    public static void callmixFP() throws Throwable {
        //Thread.sleep(10000);
        driver.navigate().refresh();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,0)");
        //clickElement(Call_mix_icon);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()",Call_mix_icon);
        //clickElement(Call_mix_icon);
        Thread.sleep(3000);
        WebDriverWait wait3 = new WebDriverWait(driver,20);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        WebDriverWait wait4 = new WebDriverWait(driver, 20);
        wait4.until(ExpectedConditions.elementToBeClickable(Edit_callmix));
        clickElement(Edit_callmix);
        Thread.sleep(2000);
        //Thread.sleep(10000);
        //edit1.clear();
        //sendKeys(edit1,"1000");
        //edit2.clear();
        //sendKeys(edit2,"1000");
        WebDriverWait wait1 = new WebDriverWait(driver, 100);
        wait1.until(ExpectedConditions.elementToBeClickable(save_callmix));
        clickElement(save_callmix);
        takeScreenShot("call mix");
        //Thread.sleep(9000);
        //clickElement(refresh);
        String Total_MinutesPerMonth= TotalMinutesPerMonth.getText();
        String Total_Minutes_PerMonth = Total_MinutesPerMonth.replace(",", "");
        int Total_Minutes_Per_Month = Integer.parseInt(Total_Minutes_PerMonth);
        String CalculatedTotal_MinutesPerMonth= CalculatedTotalMinutesPerMonth.getText();
        if(Total_MinutesPerMonth.equals(CalculatedTotal_MinutesPerMonth))
            {
                logger.debug("PASS: Total Minutes Per Month value is correct on Data Usage And Call Mix page");
            }
        else
            {
                logger.debug("Fail: Total Minutes Per Month value is incorrect on Data Usage And Call Mix page");
            }
        String NewVoice_NumberOfConnections= NewVoiceNumberOfConnections.getText();
        String New_Voice_NumberOfConnections = NewVoice_NumberOfConnections.replace(",", "");
        int New_Voice_Number_Of_Connections = Integer.parseInt(New_Voice_NumberOfConnections);

        String AverageMinutes_PerConnectionPerMonth= AverageMinutesPerConnectionPerMonth.getText();
        String Average_Minutes_PerConnectionPerMonth = AverageMinutes_PerConnectionPerMonth.replace(",", "");
        int Average_Minutes_Per_Connection_Per_Month = Integer.parseInt(Average_Minutes_PerConnectionPerMonth);

        int Calculated_Average_Minutes_PerConnectionPerMonth= Total_Minutes_Per_Month/New_Voice_Number_Of_Connections;
        if(Average_Minutes_Per_Connection_Per_Month == Calculated_Average_Minutes_PerConnectionPerMonth)
        {
            logger.debug("PASS: Average Minutes Per Connection Per Month value is correct on Data Usage And Call Mix page");
        }
        else
        {
            logger.debug("Fail: Average Minutes Per Connection Per Month value is incorrect on Data Usage And Call Mix page");
        }

        int Calculated_New_Voice_Number_Of_Connections= Total_Minutes_Per_Month/Average_Minutes_Per_Connection_Per_Month;
        if(New_Voice_Number_Of_Connections == Calculated_New_Voice_Number_Of_Connections)
        {
            logger.debug("PASS: New Voice Number Of Connections value is correct on Data Usage And Call Mix page");
        }
        else
        {
            logger.debug("Fail: New Voice Number Of Connections Per Month value is incorrect on Data Usage And Call Mix page");
        }

        //Thread.sleep(15000);
        //Thread.sleep(2000);
        driver.switchTo().defaultContent();
        clickElement(cancel_callmix);
        //driver.navigate().refresh();
        Thread.sleep(3000);
    }
    public static void callmixGPT(String International_and_Roaming_Rates) throws Throwable {
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,0)");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        //clickElement(Call_mix_icon);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()",Call_mix_icon);
        Thread.sleep(2000);
        //driver.switchTo().frame(1);
        WebDriverWait wait3 = new WebDriverWait(driver,15);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        clickElement(Edit_callmix);
        Thread.sleep(10000);
        dropDown(InternationalAndRoamingRates, International_and_Roaming_Rates);



        //edit1.clear();
        //sendKeys(edit1,"1000");
        //edit2.clear();
        //sendKeys(edit2,"1000");
        clickElement(save_callmix);
        takeScreenShot("call mix");
        //Thread.sleep(9000);
        //clickElement(refresh);
        Thread.sleep(15000);
        driver.switchTo().defaultContent();
        clickElement(cancel_callmix);
    }

}
