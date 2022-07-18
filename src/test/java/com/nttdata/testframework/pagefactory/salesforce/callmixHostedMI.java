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
public class callmixHostedMI extends PageObject{
    @Autowired
    public callmixHostedMI(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }
    @FindBy(how= How.XPATH, using = "(//*[@class='btn-basic ng-binding ng-scope ng-isolate-scope icon'])[1]")
    public static WebElement Call_mix_icon;
    @FindBy(how= How.XPATH, using = "//*[@id='j_id0:j_id555:j_id556:j_id558:j_id584:j_id586:editButtonId']")
    public static WebElement Call_mix_edit;
    @FindBy(how= How.XPATH, using = "(//*[@class='btn'])[1]")
    public static  WebElement Edit_callmix;
    @FindBy(how= How.XPATH, using = "//*[@id='callMixTableBody']/tr[2]/td[3]/input")
    public static WebElement edit1;
    @FindBy(how= How.XPATH, using = "//*[@id='callMixTableBody']/tr[2]/td[4]/input")
    public static WebElement edit2;
    @FindBy(how= How.XPATH, using = "//*[@id='callMixTableBody']/tr[2]/td[5]/input")
    public static WebElement edit3;

    @FindBy(how= How.XPATH, using = "(//*[text()='Local']/..//input)[1]")
    public static WebElement fixedLinesLocal;
    @FindBy(how= How.XPATH, using = "(//*[text()='Local']/..//input)[2]")
    public static WebElement fixedLinesLocal1;
    @FindBy(how= How.XPATH, using = "(//*[text()='Local']/..//input)[3]")
    public static WebElement fixedLinesLocal2;

    @FindBy(how= How.XPATH, using ="(//*[@value='Save'])[1]")
    public static WebElement save_callmix;
    @FindBy(how= How.XPATH, using ="//*[@class='btn icon-cancel']")
    public static WebElement cancel_callmix;

    public void callmix() throws Throwable {
        Thread.sleep(10000);
        driver.navigate().refresh();
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,0)");
        //clickElement(Call_mix_icon);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()",Call_mix_icon);
        Thread.sleep(3000);
        WebDriverWait wait3 = new WebDriverWait(driver,20);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        WebDriverWait wait4 = new WebDriverWait(driver, 20);
        wait4.until(ExpectedConditions.elementToBeClickable(Edit_callmix));
        /*Thread.sleep(15000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,0)");
        clickElement(Call_mix_icon);
        Thread.sleep(15000);
        driver.switchTo().frame(1);*/
        clickElement(Edit_callmix);
        Thread.sleep(5000);
        sendKeys(edit1,"10");
        sendKeys(edit2,"10");
        sendKeys(edit3,"10");
        clickElement(save_callmix);
        takeScreenShot("call mix");
        Thread.sleep(9000);
        driver.switchTo().defaultContent();
        clickElement(cancel_callmix);
    }

    public void Fixedlinescallmix() throws Throwable {
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,0)");
        Thread.sleep(2000);
        WebDriverWait wait1 = new WebDriverWait(driver, 100);
        wait1.until(ExpectedConditions.visibilityOf(Call_mix_icon));
        Thread.sleep(1000);
        wait1.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        Thread.sleep(1000);
        clickElement(Call_mix_icon);
        Thread.sleep(15000);
        driver.switchTo().frame(1);
        Thread.sleep(5000);
        clickElement(Edit_callmix);
        Thread.sleep(10000);
        sendKeys(fixedLinesLocal,"10");
        Thread.sleep(2000);
        sendKeys(fixedLinesLocal1,"10");
        Thread.sleep(2000);
        sendKeys(fixedLinesLocal2,"10");
        Thread.sleep(2000);
        clickElement(save_callmix);
        Thread.sleep(4000);
        takeScreenShot("Fixed Line Call Mix");
        Thread.sleep(9000);
        driver.switchTo().defaultContent();
        clickElement(cancel_callmix);
        Thread.sleep(2000);
    }
}
