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
public class AddResignDetails extends PageObject {
    @Autowired
    public AddResignDetails(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }
    @FindBy(how= How.XPATH, using = "(//*[text()='Contract Term (months)']/../../div[2]/input)[2]")
    public static WebElement Resign_Term;
    @FindBy(how= How.XPATH, using = "//*[text()='Quantity of Voice & Data Connections']/../../div[2]/input")
    public static WebElement Quantity;
    @FindBy(how= How.XPATH, using = "//*[text()='Total Net revenue across term (minus TF, Rebates, Credits) (£)']/../../div[2]/input")
    public static  WebElement Net_Revenue;
    @FindBy(how= How.XPATH, using = "//button[text()=' Save ']")
    public static WebElement Save_button;

    public static void addResignDetails(String Connections_Resign, String Revenue_Resign) throws Throwable {
        //Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,0)");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(Quantity));
        //clickElement(Call_mix_icon);
        Thread.sleep(8000);
        sendKeys(Resign_Term, "24");
        Thread.sleep(2000);
        sendKeys(Quantity, Connections_Resign);
        Thread.sleep(2000);
        sendKeys(Net_Revenue, Revenue_Resign);
        Thread.sleep(2000);
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.elementToBeClickable(Save_button));
        clickElement(Save_button);
        Thread.sleep(15000);
        //WebDriverWait wait1 = new WebDriverWait(driver, 30);
        //WebDriverWait wait2 = new WebDriverWait(driver, 30);
        //wait2.until(ExpectedConditions.elementToBeClickable(Quantity));
        //driver.navigate().refresh();
        Thread.sleep(5000);
    }
}
