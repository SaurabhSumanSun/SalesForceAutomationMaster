package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Configuration;
import com.nttdata.testframework.utils.Excel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class o2ProductDetails extends PageObject {

    @FindBy(how= How.XPATH, using = "(//*[@value='New O2 Product Detail'])")
    public static WebElement O2_Product_btn;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000kNa9'])")
    public static WebElement Product_Category;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000ISzM'])")
    public static WebElement Product_Category_SIT;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000kNaB'])")
    public static WebElement Product;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000ISzO'])")
    public static WebElement Product_SIT;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000kNaA'])")
    public static WebElement Product_Detail;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000ISzN'])")
    public static WebElement Product_Detail_SIT;
    @FindBy(how= How.XPATH, using = " (//*[@id='00N9E000000kNaD'])")
    public static WebElement Quans;
    @FindBy(how= How.XPATH, using = " (//*[@id='00N9E000000ISzQ'])")
    public static WebElement Quans_SIT;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000kNZs'])")
    public static WebElement LOC;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000ISz5'])")
    public static WebElement LOC_SIT;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000kNaS'])")
    public static WebElement Billed_Upfront;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000ISzf'])")
    public static WebElement Billed_Upfront_SIT;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000kNaQ'])")
    public static WebElement Revenue_per_month;
    @FindBy(how= How.XPATH, using = "(//*[@id='00N9E000000ISzd'])")
    public static WebElement Revenue_per_month_SIT;
    @FindBy(how= How.XPATH, using = "//*[@id=\"00N9E000000kNZw\"]")
    public static WebElement noOfBillableDays;
    @FindBy(how= How.XPATH, using = "//*[@id=\"00N9E000000ISz9\"]")
    public static WebElement noOfBillableDays_SIT;
    @FindBy(how= How.XPATH, using = "(//*[@class='btn'])[1] ")
    public static WebElement Save_btn;
    @FindBy(how= How.XPATH, using = "//*[@id='00N9E000000kNae_ileinner']")
    public static WebElement TCV;
    @FindBy(how= How.XPATH, using = "//*[@id='00N9E000000ISzr_ileinner']")
    public static WebElement TCV_SIT;
    @FindBy(how= How.XPATH, using = "//*[@id='00N9E000000nQXD']")
    public static WebElement Std_1;
    @FindBy(how= How.XPATH, using = "//*[@id='00N9E000000eqJY']")
    public static WebElement Std_1_SIT;
    @FindBy(how= How.XPATH, using = "//*[@id='00N9E000000nQXB']")
    public static WebElement Std_2;
    @FindBy(how= How.XPATH, using = "//*[@id='00N9E000000eqJW']")
    public static WebElement Std_2_SIT;
    @FindBy(how= How.XPATH, using = "//*[@id='00N9E000005dQ8d']")
    public static WebElement Business_Type;
    @FindBy(how= How.XPATH, using = "//*[@id='00N9E000005YIQ6']")
    public static WebElement Business_Type_SIT;

    @FindBy(how= How.XPATH, using = "//*[text()='DaaS Proposition?']/../../..//select")
    public static WebElement DaaS;

    static WebDriver driver;
    @Autowired
    private Configuration configuration;
    @Autowired
    Excel excel;

    public o2ProductDetails(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    public String productdetails(String productCategory, String product, String productDetail, String quans, String loc, String billedUpfront, String revenuePerMonth, String businessType) throws Throwable
    {
        Thread.sleep(4000);
        webDriverWait.until(ExpectedConditions.visibilityOf(O2_Product_btn));
        Thread.sleep(2000);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(O2_Product_btn));
        Thread.sleep(2000);
        clickElement(O2_Product_btn);
        dropDown(Product_Category,productCategory);
        dropDown(Product, product);
        if(product.equals("Logistic Services"))
        {
            dropDown(DaaS, "No");
        }
        dropDown(Product_Detail,productDetail);
        sendKeys(Quans, quans);
        dropDown(LOC,loc);
        sendKeys(noOfBillableDays,"300");
        sendKeys(Billed_Upfront,billedUpfront);
        sendKeys(Revenue_per_month,revenuePerMonth);
        if(productCategory.contains("Mobile")||productCategory.contains("Mobility"))
        {

            dropDown(Std_1,"Standard");
            dropDown(Std_2,"Standard");
        }
        Thread.sleep(3000);
        dropDown(Business_Type,businessType);
        Thread.sleep(3000);
        clickElement(Save_btn);
        logger.debug("O2 Product is added");
        takeScreenShot("O2 Product");
        Thread.sleep(3000);
       String tcv = TCV.getText();
       return tcv;

    }
    public String productdetailsMobile(String productCategory, String product, String productDetail, String mobileTariffs, String mobileServices, String quans, String loc, String billedUpfront, String revenuePerMonth, String businessType) throws Throwable
    {
        Thread.sleep(5000);
        webDriverWait.until(ExpectedConditions.visibilityOf(O2_Product_btn));
        clickElement(O2_Product_btn);
        dropDown(Product_Category,productCategory);
        dropDown(Product, product);
        dropDown(Product_Detail,productDetail);
        sendKeys(Quans, quans);
        dropDown(LOC,loc);
        sendKeys(noOfBillableDays,"300");
        sendKeys(Billed_Upfront,billedUpfront);
        sendKeys(Revenue_per_month,revenuePerMonth);
        dropDown(Std_1,mobileTariffs);//Mobile Tariff
        dropDown(Std_2,mobileServices);// Mobile Service
        Thread.sleep(3000);
        dropDown(Business_Type,businessType);
        Thread.sleep(2000);
        clickElement(Save_btn);
        logger.debug("O2 Product is added");
        takeScreenShot("O2 Product");
        Thread.sleep(4000);
        String tcv = TCV.getText();
        return tcv;

    }

public String productdetailsMobileSIT(String productCategory, String product, String productDetail, String mobileTariffs, String mobileServices, String quans, String loc, String billedUpfront, String revenuePerMonth, String businessType) throws Throwable
        {
        webDriverWait.until(ExpectedConditions.visibilityOf(O2_Product_btn));
        clickElement(O2_Product_btn);
        dropDown(Product_Category_SIT,productCategory);
        dropDown(Product_SIT, product);
        dropDown(Product_Detail_SIT,productDetail);
        sendKeys(Quans_SIT, quans);
        dropDown(LOC_SIT,loc);
        sendKeys(noOfBillableDays_SIT,"300");
        sendKeys(Billed_Upfront_SIT,billedUpfront);
        sendKeys(Revenue_per_month_SIT,revenuePerMonth);
        dropDown(Std_1_SIT,mobileTariffs);//Mobile Tariff
        dropDown(Std_2_SIT,mobileServices);// Mobile Service
        Thread.sleep(3000);
        dropDown(Business_Type_SIT,businessType);
        clickElement(Save_btn);
        logger.debug("O2 Product is added");
        takeScreenShot("O2 Product");
        Thread.sleep(3000);
        String tcv = TCV_SIT.getText();
        return tcv;

        }
        }




