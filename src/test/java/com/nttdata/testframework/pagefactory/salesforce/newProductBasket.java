package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.Set;

@Component
public class newProductBasket extends PageObject {

    @FindBy(how= How.XPATH, using = "//*[@value='New Product Basket']")
    public static WebElement new_product_basket;
    @FindBy(how= How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']")
    public static  WebElement add_product;


    public newProductBasket(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public void productBasket(String oppLink) throws InterruptedException {

        driver.get(oppLink);
        clickElement(new_product_basket);
        Thread.sleep(30000);
    }

    public void addproduct() throws InterruptedException {
        String parentwindow= driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        for (String child:allwindows)
        {
            if(!parentwindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }
        System.out.println("Add Product");
        Thread.sleep(30000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        WebDriverWait wait1 = new WebDriverWait(driver, 300);
        wait1.until(ExpectedConditions.visibilityOf(add_product));
        Thread.sleep(2000);
        wait1.until(ExpectedConditions.elementToBeClickable(add_product));
        Thread.sleep(2000);
        clickElement(add_product);
        Thread.sleep(2000);
        logger.debug("Basket is ready to add products");
    }


    public void addanotherproduct() throws InterruptedException {
        System.out.println("Add Product");
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(20000);
        WebDriverWait wait1 = new WebDriverWait(driver, 100);
        wait1.until(ExpectedConditions.visibilityOf(add_product));
        Thread.sleep(2000);
        wait1.until(ExpectedConditions.elementToBeClickable(add_product));
        Thread.sleep(2000);
        clickElement(add_product);
        Thread.sleep(2000);
        logger.debug("Basket is ready to add products");
    }

}
