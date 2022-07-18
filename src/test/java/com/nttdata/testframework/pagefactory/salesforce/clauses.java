package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.IOException;
import java.util.Set;

@Component
public class clauses extends PageObject {

    @Autowired
    public clauses(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }


    @FindBy(how= How.XPATH, using = "//*[@class='btn-basic dropdown-arrow icon-toggle-expanded ng-scope']")
    public static WebElement Clauses_dropdown;
    @FindBy(how= How.XPATH, using = "//*[text()=' Clauses ']")
    public static WebElement Clauses_section;
    @FindBy(how= How.XPATH, using = "(//*[@value='Edit'])[2]")
    public static WebElement Edit_Clauses;
    @FindBy(how= How.XPATH, using = "//*[@value='New Additional Contractual']")
    public static WebElement Additional_Contractuals_section;
    @FindBy(how= How.XPATH, using = "//*[text()='Transformation Credit']")
    public static WebElement Transformation_Credit_Entry;
    @FindBy(how= How.XPATH, using = "//*[text()='Min. Term (months)']/..//*[@class='dataCol  first ']")
    public static WebElement MinTerm_in_Months;
    @FindBy(how= How.XPATH, using = "(//*[text()='Amended Min. Term (Months)']/..//*[@class='dataCol '])[2]")
    public static WebElement MinimumHolding_Voice_and_Data_SIM_cards;
    @FindBy(how= How.XPATH, using = "(//*[text()='Min. Term (months)']/..//*[@class='dataCol  first '])[2]")
    public static WebElement MinHoldingPeriod_in_Months;
    @FindBy(how= How.XPATH, using = "(//*[contains(text(),'Min. Period (months)')]/../../..//*[@class='dataCol '])[1]")
    public static WebElement MinPeriod_in_Months;

    @FindBy(how= How.XPATH, using = "//*[text()='Mobile High Risk deal']/../../td[2]")
    public static WebElement Mobile_High_Risk_deal_SIT;
    @FindBy(how= How.XPATH, using = "//*[text()='Mobile Terms']/../td[2]")
    public static WebElement Mobile_Terms_SIT;
    @FindBy(how= How.XPATH, using = "//*[text()=\"Mobile SLA's\"]/../td[1]")
    public static WebElement Mobile_SLAs_SIT;
    @FindBy(how= How.XPATH, using = "//input[@value='New Credit Fund Distributions']")
    public static WebElement New_Credit_Fund_Distributions_SIT;
    @FindBy(how= How.XPATH, using = "//*[text()='Name']/../../td[1]/div/input")
    public static WebElement Name;
    @FindBy(how= How.XPATH, using = "(//*[contains(text(),'Amount (£)')])[1]/../../td[1]/div/input")
    public static WebElement Amount;
    @FindBy(how= How.XPATH, using = "//*[contains(text(),'1st Payment Split Amount (£)')]/../../td[1]/input")
    public static WebElement First_Payment_Split_Amount;
    @FindBy(how= How.XPATH, using = "//*[contains(text(),'2nd Payment Split Amount (£)')]/../../td[1]/input")
    public static WebElement Second_Payment_Split_Amount;
    @FindBy(how= How.XPATH, using = "//*[contains(text(),'3rd Payment Split Amount (£)')]/../../td[1]/input")
    public static WebElement Third_Payment_Split_Amount;
    @FindBy(how= How.XPATH, using = "//*[text()='Payment Type']/../../td[2]/div/select")
    public static WebElement Payment_Type;
    @FindBy(how= How.XPATH, using = "//*[contains(text(),'TF as a percentage (%) of airtime revenue')]/../../td[2]")
    public static WebElement TF_as_a_percentage_of_airtime_revenue;
    @FindBy(how= How.XPATH, using = "(//span/input[@value=\"Save\"])[1]")
    public static WebElement Save_TF;
    @FindBy(how = How.XPATH, using = "//*[text()='Total Billed Revenue (£) (Min Spend)']/../..//div/input")
    public static WebElement totalBilledRevenue;


    public  void clauses() throws InterruptedException, IOException {

        String parentwindow= driver.getWindowHandle();
        Thread.sleep(5000);
        clickElement(Clauses_dropdown);
        clickElement(Clauses_section);
        takeScreenShot("clauses");
        Thread.sleep(20000);
        driver.switchTo().window(parentwindow);
    }

    public  void clauses(String X, String oppLink, String transformation_fund, String Term, String Total_number_of_SIMs) throws InterruptedException, IOException {

        String parentwindowone= driver.getWindowHandle();
        //Thread.sleep(5000);
        clickElement(Clauses_dropdown);
        clickElement(Clauses_section);
        Thread.sleep(2000);
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        String currentLink;
        for (String child:allwindows)
        {
            if(!parentwindowone.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
                currentLink = driver.getCurrentUrl();
                if (!parentwindowone.equalsIgnoreCase(child) && !currentLink.equalsIgnoreCase(oppLink))
                {
                    driver.switchTo().window(child);
                }
            }
        }
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(Edit_Clauses));
        takeScreenShot("clauses");
        //Thread.sleep(2000);
        if(X.equals("1"))
        {
            try
            {
                Additional_Contractuals_section.isDisplayed();
                logger.debug("PASS: Additional Contractuals Section is displayed on Clauses page for Bespoke configuration");
            }
            catch(Exception e)
            {
                logger.debug("Fail: Additional Contractuals Section is not displayed on Clauses page for Bespoke configuration");
            }
        }
        if(transformation_fund=="Yes")
        {
            try
            {
                Transformation_Credit_Entry.isDisplayed();
                logger.debug("PASS: Transformation Credit Entry is displayed on Clauses page when Transformation Fund is configured");
            }
            catch(Exception e)
            {
                logger.debug("Fail: ATransformation Credit Entry is not displayed on Clauses page when Transformation Fund is configured");
            }

        }
        String Min_Term_in_Months= MinTerm_in_Months.getText();
        if(Term.equals(Min_Term_in_Months))
        {
            logger.debug("PASS: Min. Term (months) value is correct on Clauses page");
        }
        else
        {
            logger.debug("Fail: Min. Term (months) value is incorrect on Clauses page");
        }

        String Minimum_Holding_Voice_and_Data_SIM_cards= MinimumHolding_Voice_and_Data_SIM_cards.getText();
        if(Total_number_of_SIMs.equals(Minimum_Holding_Voice_and_Data_SIM_cards))
        {
            logger.debug("PASS: Minimum Holding (Voice and Data SIM cards) value is correct on Clauses page");
        }
        else
        {
            logger.debug("Fail: Minimum Holding (Voice and Data SIM cards) value is incorrect on Clauses page");
        }
        String Min_Holding_Period_in_Months= MinHoldingPeriod_in_Months.getText();
        if(Min_Holding_Period_in_Months.equals("3"))
        {
            logger.debug("PASS: Min. Holding Period (months) value is correct on Clauses page");
        }
        else
        {
            logger.debug("Fail: Min. Holding Period (months) value is incorrect on Clauses page");
        }
        String Min_Period_in_Months= MinPeriod_in_Months.getText();
        if(Min_Period_in_Months.equals("1"))
        {
            logger.debug("PASS: Min. Period (months) value is correct on Clauses page");
        }
        else
        {
            logger.debug("Fail: Min. Period (months) value is incorrect on Clauses page");
        }

        //Thread.sleep(2000);
        driver.switchTo().window(parentwindowone);
    }

    public  void clausesSIT(String TF, String X, String oppLink, String transformation_fund, String Term, String Total_number_of_SIMs) throws InterruptedException, IOException {
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        String parentwindowone= driver.getWindowHandle();
        Thread.sleep(10000);
        clickElement(Clauses_dropdown);
        clickElement(Clauses_section);
        Thread.sleep(3000);
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        String currentLink;
        for (String child:allwindows)
        {
            if(!parentwindowone.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
                currentLink = driver.getCurrentUrl();
                if (!parentwindowone.equalsIgnoreCase(child) && !currentLink.equalsIgnoreCase(oppLink))
                {
                    driver.switchTo().window(child);
                }
            }
        }
        /*Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(Edit_Clauses));
        takeScreenShot("clauses");
        //Thread.sleep(2000);
        if(X.equals("1"))
        {
            try
            {
                Additional_Contractuals_section.isDisplayed();
                logger.debug("PASS: Additional Contractuals Section is displayed on Clauses page for Bespoke configuration");
            }
            catch(Exception e)
            {
                logger.debug("Fail: Additional Contractuals Section is not displayed on Clauses page for Bespoke configuration");
            }
        }
        if(transformation_fund=="Yes")
        {
            try
            {
                Transformation_Credit_Entry.isDisplayed();
                logger.debug("PASS: Transformation Credit Entry is displayed on Clauses page when Transformation Fund is configured");
            }
            catch(Exception e)
            {
                logger.debug("Fail: ATransformation Credit Entry is not displayed on Clauses page when Transformation Fund is configured");
            }

        }
        String Min_Term_in_Months= MinTerm_in_Months.getText();
        if(Term.equals(Min_Term_in_Months))
        {
            logger.debug("PASS: Min. Term (months) value is correct on Clauses page");
        }
        else
        {
            logger.debug("Fail: Min. Term (months) value is incorrect on Clauses page");
        }

        String Minimum_Holding_Voice_and_Data_SIM_cards= MinimumHolding_Voice_and_Data_SIM_cards.getText();
        if(Total_number_of_SIMs.equals(Minimum_Holding_Voice_and_Data_SIM_cards))
        {
            logger.debug("PASS: Minimum Holding (Voice and Data SIM cards) value is correct on Clauses page");
        }
        else
        {
            logger.debug("Fail: Minimum Holding (Voice and Data SIM cards) value is incorrect on Clauses page");
        }
        String Min_Holding_Period_in_Months= MinHoldingPeriod_in_Months.getText();
        if(Min_Holding_Period_in_Months.equals("3"))
        {
            logger.debug("PASS: Min. Holding Period (months) value is correct on Clauses page");
        }
        else
        {
            logger.debug("Fail: Min. Holding Period (months) value is incorrect on Clauses page");
        }
        String Min_Period_in_Months= MinPeriod_in_Months.getText();
        if(Min_Period_in_Months.equals("1"))
        {
            logger.debug("PASS: Min. Period (months) value is correct on Clauses page");
        }
        else
        {
            logger.debug("Fail: Min. Period (months) value is incorrect on Clauses page");
        }
*/

        Thread.sleep(5000);
        WebDriverWait wait1 = new WebDriverWait(driver, 100);
        wait1.until(ExpectedConditions.visibilityOf(Mobile_High_Risk_deal_SIT));
        String Mobile_High_Risk_deal= Mobile_High_Risk_deal_SIT.getText();
        System.out.println("Mobile High Risk deal = "+Mobile_High_Risk_deal);

        String Mobile_Terms= Mobile_Terms_SIT.getText();
        System.out.println("Mobile_Terms = "+Mobile_Terms);

        String Mobile_SLAs= Mobile_SLAs_SIT.getText();
        System.out.println("Mobile SLAs = "+Mobile_SLAs);

        New_Credit_Fund_Distributions_SIT.click();
        sendKeys(Name,"TestOne");
        sendKeys(Amount,TF);
        First_Payment_Split_Amount.clear();
        sendKeys(First_Payment_Split_Amount,TF);
        //Name_SIT.click();
        Thread.sleep(10000);
        dropDown(Payment_Type,"Transformation Credit");

        String TF_as_a_percentage_of_Airtime_Revenue= TF_as_a_percentage_of_airtime_revenue.getText();
        System.out.println("TF as a percentage of airtime revenue = "+TF_as_a_percentage_of_Airtime_Revenue);
        Save_TF.click();

        Thread.sleep(4000);
        driver.switchTo().window(parentwindowone);
    }

    public  void clausesPreProd(String TF, String oppLink, int term) throws InterruptedException, IOException {
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        String parentwindowone= driver.getWindowHandle();
        Thread.sleep(13000);
        clickElement(Clauses_dropdown);
        Thread.sleep(2000);
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.elementToBeClickable(Clauses_section));
        clickElement(Clauses_section);
        Thread.sleep(3000);
        Set<String> allwindows=driver.getWindowHandles();
        int count= allwindows.size();
        String currentLink;
        for (String child:allwindows)
        {
            if(!parentwindowone.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
                currentLink = driver.getCurrentUrl();
                if (!parentwindowone.equalsIgnoreCase(child) && !currentLink.equalsIgnoreCase(oppLink))
                {
                    driver.switchTo().window(child);
                }
            }
        }

        Thread.sleep(5000);
        WebDriverWait wait2 = new WebDriverWait(driver, 100);
        wait2.until(ExpectedConditions.visibilityOf(Mobile_High_Risk_deal_SIT));
        String Mobile_High_Risk_deal= Mobile_High_Risk_deal_SIT.getText();
        System.out.println("Mobile High Risk deal = "+Mobile_High_Risk_deal);

        String Mobile_Terms= Mobile_Terms_SIT.getText();
        System.out.println("Mobile_Terms = "+Mobile_Terms);

        String Mobile_SLAs= Mobile_SLAs_SIT.getText();
        System.out.println("Mobile SLAs = "+Mobile_SLAs);

        if(!TF.equals(""))
        {
            Thread.sleep(5000);
            New_Credit_Fund_Distributions_SIT.click();
            Thread.sleep(5000);
            sendKeys(Name, "TestOne");
            sendKeys(Amount, TF);
            Thread.sleep(3000);
            //First_Payment_Split_Amount.clear();

            //Thread.sleep(2000);
            int Amount = Integer.parseInt(TF);
            int Split_Amount_First;
            int Split_Amount_Second;
            String Payment_Split_Amount_First;
            String Payment_Split_Amount_Second;
            System.out.println("Term= " + term);
            if (term <= 12) {
                //Payment_Split_Amount= Integer.toString(Amount);
                Thread.sleep(2000);
                First_Payment_Split_Amount.clear();
                sendKeys(First_Payment_Split_Amount, TF);
                Thread.sleep(2000);
            }
            if (term >= 13 && term <= 24) {
                Split_Amount_First = Amount / 2;
                Payment_Split_Amount_First = Integer.toString(Split_Amount_First);
                Thread.sleep(2000);
                First_Payment_Split_Amount.clear();
                sendKeys(First_Payment_Split_Amount, Payment_Split_Amount_First);
                Thread.sleep(2000);
                Split_Amount_Second = Amount - Split_Amount_First;
                Payment_Split_Amount_Second = Integer.toString(Split_Amount_Second);
                Second_Payment_Split_Amount.clear();
                //Thread.sleep(2000);
                sendKeys(Second_Payment_Split_Amount, Payment_Split_Amount_Second);
                Thread.sleep(2000);
            }
            if (term >= 25 && term <= 36) {
                Split_Amount_First = Amount / 3;
                Payment_Split_Amount_First = Integer.toString(Split_Amount_First);
                Thread.sleep(2000);
                First_Payment_Split_Amount.clear();
                sendKeys(First_Payment_Split_Amount, Payment_Split_Amount_First);
                Thread.sleep(2000);

                Second_Payment_Split_Amount.clear();
                //Thread.sleep(2000);
                sendKeys(Second_Payment_Split_Amount, Payment_Split_Amount_First);
                Thread.sleep(2000);

                Split_Amount_Second = Amount - (Split_Amount_First * 2);
                Payment_Split_Amount_Second = Integer.toString(Split_Amount_Second);
                Third_Payment_Split_Amount.clear();
                //Thread.sleep(2000);
                sendKeys(Third_Payment_Split_Amount, Payment_Split_Amount_Second);
                Thread.sleep(2000);
            }
            //Name_SIT.click();
            Thread.sleep(2000);
            dropDown(Payment_Type, "Transformation Credit");
            Thread.sleep(3000);
            //String TF_as_a_percentage_of_Airtime_Revenue= TF_as_a_percentage_of_airtime_revenue.getText();
            //System.out.println("TF as a percentage of airtime revenue = "+TF_as_a_percentage_of_Airtime_Revenue);
            Save_TF.click();
        }
        Thread.sleep(4000);
        driver.switchTo().window(parentwindowone);
    }
    public void captureBilledRevenue() throws InterruptedException {
        Thread.sleep(5000);
        String Basket_URL= driver.getCurrentUrl();
        System.out.println("Basket Link = "+Basket_URL);
        String billedRevenue= totalBilledRevenue.getAttribute("value");
        System.out.println("Total Billed Revenue= "+billedRevenue);
    }
}
