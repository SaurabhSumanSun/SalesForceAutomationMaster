package com.nttdata.testframework.pagefactory.salesforce;


import com.nttdata.testframework.drivers.CustomWebDriver;
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
import java.text.DecimalFormat;

@Component
public class configureFlexPlan extends PageObject {
    @Autowired
    public configureFlexPlan(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }


    //@FindBy(how = How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope btn-new-basket label icon icon-new']")
    //public static WebElement add_product;
    @FindBy(how = How.XPATH, using = "//*[@class='btn label icon-add']")
    public static WebElement save_product;
    @FindBy(how = How.XPATH, using = "//div[text()=' Flex Plan ']/../..//*[@class='btn btn-edit ng-scope']")
    public static WebElement edit_pencil;
    @FindBy(how = How.XPATH, using = "(//*[@class='slds-button slds-button--brand'])[2]")
    public static WebElement finish;
    @FindBy(how = How.XPATH, using = "(//*[@class='slds-button slds-button--brand'])[1]")
    public static WebElement finishOne;
    //FP product
    @FindBy(how = How.XPATH, using = "//*[@id=\"a1y9E0000022bovQAA~a2I9E000000pGkvUAE_anchor\"]")
    public static WebElement FP;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Flex_Plan:Tariff_Selection:Standard_or_Bespoke_0\"]")
    public static WebElement standard_or_Bespoke;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Flex_Plan:Tariff_Selection:Term_0\"]")
    public static WebElement term;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Flex_Plan:Tariff_Selection:Voice_and_Data_Connections_0\"]")
    public static WebElement voice_and_Aggregated_Data_SIMs;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Flex_Plan:Tariff_Selection:Data_Only_Connections_0\"]")
    public static WebElement aggregated_Data_Only_SIMs;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Flex_Plan:Tariff_Selection:Tariff_Name_0\"]")
    public static WebElement flex_Plan_and_Initial_Data_Allowance;
    @FindBy(how = How.XPATH, using = "//*[@id='lookupIframeLE']")
    public static WebElement frametwo;
    @FindBy(how = How.XPATH, using = "//*[@class='slds-input input-search']")
    public static WebElement searchTariff;
    @FindBy(how = How.XPATH, using = "//*[@class='btn slds-button slds-button--neutral']")
    public static WebElement searchForTariff;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Flex Plan")
    public static WebElement flex_Plan_and_Initial_Data;

    @FindBy(how = How.XPATH, using = "//*[@id='Flex_Plan:Tariff_Summary__Voice_and_Aggregated_Data___Starting_Point:Line_Rental_Monthly_0']")
    public static WebElement rentalCharge;
    @FindBy(how = How.XPATH, using = "//*[@id='Flex_Plan:Tariff_Summary__Voice_and_Aggregated_Data___Starting_Point:Data_Service_Monthly_0']")
    public static WebElement dataServiceCharge;
    @FindBy(how = How.XPATH, using = "//*[@id='Flex_Plan:Tariff_Summary__Voice_and_Aggregated_Data___Starting_Point:Voice_Data_Per_Conn_Charge_0']")
    public static WebElement unitCharges;
    @FindBy(how = How.XPATH, using = "//*[@id='Flex_Plan:Tariff_Summary__Voice_and_Aggregated_Data___Starting_Point:Voice_Data_Total_Charge_0']")
    public static WebElement totalCharge;
    @FindBy(how = How.XPATH, using = "//*[@id='Flex_Plan:Tariff_Summary__Minimum_Point_on_the_Ladder:Data_Service_Min_Monthly_0']")
    public static WebElement minValue;
    @FindBy(how = How.XPATH, using = "//*[@id='Flex_Plan:Tariff_Summary__Minimum_Point_on_the_Ladder:Data_Service_Min_Total_Charge_0']")
    public static WebElement totalValue;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Flex_Plan:Tariff_Summary__Voice_and_Aggregated_Data___Starting_Point:Transformation_Fund_0\"]")
    public static WebElement transformationFund;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Flex_Plan:Tariff_Summary__Voice_and_Aggregated_Data___Starting_Point:Transformation_Fund_Total_Charge_0\"]")
    public static WebElement totalTransformationFund;

    @FindBy(how = How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope icon-sync']")
    public static WebElement compatiblity;
    @FindBy(how = How.XPATH, using = "//*[@class='btn icon-cancel']")
    public static WebElement cancel;
    @FindBy(how= How.XPATH, using = "//div[text()=' International or Roaming Bolt On ']/../..//*[@class='btn btn-edit ng-scope']")
    public static WebElement edit_pencilOne;
    @FindBy(how= How.XPATH, using = "//div[text()=' International or Roaming Bolt On ']/../..//*[@class='btn btn-expand icon-package ng-scope']")
    public static WebElement grid_icon;
    @FindBy(how = How.XPATH, using = "//*[@id='Flex_Plan:Tariff_Selection:Rental_Charge_0']")
    public static WebElement Voice_and_Aggregated_Data_Rental_Charge_and_Discount;
    @FindBy(how = How.XPATH, using = "//*[@id='lookupIframeLE']")
    public static WebElement framethree;
    @FindBy(how = How.XPATH, using = "//*[@class='slds-input input-search']")
    public static WebElement searchDiscount;
    @FindBy(how = How.XPATH, using = "//*[@class='btn slds-button slds-button--neutral']")
    public static WebElement searchForDiscount;
    @FindBy(how = How.XPATH, using = "(//*[@class='btn slds-button slds-button--neutral']/../../../../..//a)[2]")
    public static WebElement rental_Charge_and_Discount;
    @FindBy(how = How.XPATH, using = "//*[@id='Flex_Plan:Tariff_Selection:Private_APN_0']")
    public static WebElement Does_Have_Private_APN;
    @FindBy(how = How.XPATH, using = "//*[@class=\"slds-button slds-button--neutral btn-next\"]")
    public static WebElement Rate_Card;
    @FindBy(how = How.XPATH, using = "//*[@class=\"slds-button slds-button--neutral btn-previous\"]")
    public static WebElement Flex_Plan;
    @FindBy(how = How.XPATH, using = "//*[@class=\"ng-binding ng-scope\"and text()=' 24 Hour ROW Pass ']")
    public static WebElement BoltOn_Description;
    @FindBy(how = How.XPATH, using = "//*[@class=\"ng-binding ng-scope\"and text()=' 7.50 ']")
    public static WebElement BoltOn_Amount;
    @FindBy(how= How.XPATH, using = "(//*[contains(@class,'btn btn-expand icon-package ng-scope')])[1]")
    public static WebElement grid_icon_one;
    @FindBy(how= How.XPATH, using = "//*[@id='Flex_Plan:Tariff_Selection:Is_TF_Required_0']")
    public static WebElement transformation_fund;
    @FindBy(how= How.XPATH, using = "(//*[text()=' Voice & Data ']/../../..//*[@class='ng-binding ng-scope'])[5]")
    public static WebElement RecurringCharges;
    @FindBy(how= How.XPATH, using = "(//*[text()=' Voice & Data ']/../../..//*[@class='ng-binding ng-scope'])[3]")
    public static WebElement TermOne;

    @FindBy(how= How.XPATH, using = "//*[text()='Term (months)']/../..//*[@class='ng-pristine ng-untouched ng-valid']")
    public static WebElement BasketTerm;
    //@FindBy(how= How.XPATH, using = "//*[text()='Quantity of SIMs']/../..//*[@class='ng-pristine ng-untouched ng-valid']")
    //public static WebElement BasketQuantityOfSIMs;
    @FindBy(how= How.XPATH, using = "//*[text()='Total Connection Quantity']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketQuantityOfSIMs;
    @FindBy(how= How.XPATH, using = "//*[text()='ARPU (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketARPU;
    @FindBy(how= How.XPATH, using = "//*[text()='Total Billed Revenue (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketTotalBilledRevenue;
    @FindBy(how= How.XPATH, using = "//*[text()='Monthly Billed Revenue (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketMonthlyBilledRevenue;
    @FindBy(how= How.XPATH, using = " //*[text()='Transformation Fund as a % of Billed Revenue (%)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketTFPercentage;
    @FindBy(how= How.XPATH, using = "//*[text()='Total Transformation Fund (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketTotalTF;

    @FindBy(how= How.XPATH, using = "//*[text()='Subscription Revenue (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketSubscriptionRevenue;
    @FindBy(how= How.XPATH, using = "//*[text()='TCV (£) (Excluding Interconnect Revenue)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketTCV;

    @FindBy(how= How.XPATH, using = "//*[text()='Contract Term (months)']/../..//*[@class='ng-pristine ng-untouched ng-valid']")
    public static WebElement BasketContractTerm;
    @FindBy(how= How.XPATH, using = "//*[text()='Total O2 Managed Services Revenue (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketManagedServicesRevenue;
    @FindBy(how= How.XPATH, using = "//*[text()='Total O2 Professional Services Revenue (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketProfessionalServicesRevenue;
    @FindBy(how= How.XPATH, using = "//*[text()='ICT Deal Discount (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketICTDealDiscount;
    @FindBy(how= How.XPATH, using = "//*[text()='Net Revenue (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketNetRevenue;

    String a,b,c,d,d1,e,f,f1;
    int x;
    String n,o,o1;


    public void FPConfig(String Standard_or_Bespoke_1, String Standard_or_Bespoke_2, String x, String Term, String Voice_and_Aggregated_Data_SIMs, String Aggregated_Data_Only_SIMs, String Transformation_Fund, String tariff, String discount, String Private_APN) throws InterruptedException, IOException {

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("arguments[0].click()",FP);
        //WebDriverWait wait = new WebDriverWait(driver, 15);
        //wait.until(ExpectedConditions.elementToBeClickable(FP));
        //clickElement(FP);
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.elementToBeClickable(save_product));
        clickElement(save_product);
        //Thread.sleep(40000);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait2 = new WebDriverWait(driver, 500);
        wait2.until(ExpectedConditions.elementToBeClickable(edit_pencil));

        //Thread.sleep(8000);
        if(edit_pencil.isEnabled())
        {
            logger.debug("Flex Plan is present in Basket");
        }
        else
        {
            logger.debug("Flex Plan is not present in Basket");
        }
        //Thread.sleep(8000);
        // ProfitLoss_icon.sendKeys(Keys.ENTER);
        if(edit_pencilOne.isEnabled())
        {
            logger.debug("International or Roaming Bolt On is present in Basket");
            //WebDriverWait waiting = new WebDriverWait(driver, 15);
            //waiting.until(ExpectedConditions.elementToBeClickable(grid_icon));
            //clickElement(grid_icon);
            /*WebElement scanElement =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(grid_icon));
            Actions actiontwo =new Actions(driver);
            actiontwo.moveToElement(scanElement).click().build().perform();

            //check-write wait for grid icon
            Thread.sleep(3000);
            WebDriverWait waiting = new WebDriverWait(driver, 15);
            waiting.until(ExpectedConditions.visibilityOf(BoltOn_Amount));
            if(BoltOn_Description.isDisplayed() && BoltOn_Amount.isDisplayed()) {
                logger.debug("24 hour Row Pass & it's Price value is displayed as expected in the Grid section");
                takeScreenShot("24 hour Row Pass Bolt On");
            }*/
        }
        else
        {
            logger.debug("International or Roaming Bolt On is not present in Basket");
        }

        clickElement(edit_pencil);
        Thread.sleep(5000);

        WebDriverWait wait3 = new WebDriverWait(driver,15);
        wait3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(5000);

        //driver.switchTo().frame(1);
        //Thread.sleep(10000);
        WebDriverWait wait4 = new WebDriverWait(driver, 15);
        wait4.until(ExpectedConditions.elementToBeClickable(Voice_and_Aggregated_Data_Rental_Charge_and_Discount));


        //Configure FP

        this.x=Integer.parseInt(x);
        //int i=1;
        if(this.x==0)
        {
            dropDown(standard_or_Bespoke,Standard_or_Bespoke_1);
            //Thread.sleep(1000);
        }
        else
        {
            dropDown(standard_or_Bespoke,Standard_or_Bespoke_2);
            //Thread.sleep(1000);
        }
        Thread.sleep(2000);
        sendKeys(term, Term);
        Thread.sleep(2000);
        sendKeys(voice_and_Aggregated_Data_SIMs, Voice_and_Aggregated_Data_SIMs);
        Thread.sleep(2000);
        sendKeys(aggregated_Data_Only_SIMs, Aggregated_Data_Only_SIMs);
        Thread.sleep(2000);

        int IntegerTerm= Integer.parseInt(Term);
        if(IntegerTerm >= 24)
        {
            Thread.sleep(2000);
            dropDown(transformation_fund, Transformation_Fund);
        }
        Thread.sleep(2000);
        clickElement(flex_Plan_and_Initial_Data_Allowance);
        Thread.sleep(2000);
        //Thread.sleep(10000);
        WebDriverWait wait5 = new WebDriverWait(driver,30);
        wait5.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frametwo));
        //driver.switchTo().frame(frametwo);
        WebDriverWait wait6 = new WebDriverWait(driver, 20);
        wait6.until(ExpectedConditions.elementToBeClickable(flex_Plan_and_Initial_Data));
        sendKeys(searchTariff, tariff);
        clickElement(searchForTariff);
        //Thread.sleep(5000);

        WebDriverWait wait7 = new WebDriverWait(driver, 10);
        wait7.until(ExpectedConditions.elementToBeClickable(flex_Plan_and_Initial_Data));

        clickElement(flex_Plan_and_Initial_Data);
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        if (discount!="") {

            js2.executeScript("arguments[0].click()",Voice_and_Aggregated_Data_Rental_Charge_and_Discount);
            //clickElement(Voice_and_Aggregated_Data_Rental_Charge_and_Discount);
            Thread.sleep(2000);
            //Thread.sleep(10000);
            WebDriverWait wait8 = new WebDriverWait(driver,30);
            wait8.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framethree));
            //driver.switchTo().frame(framethree);
            sendKeys(searchDiscount, discount);
            clickElement(searchForDiscount);
            //Thread.sleep(8000);
            WebDriverWait wait9 = new WebDriverWait(driver, 10);
            wait9.until(ExpectedConditions.elementToBeClickable(rental_Charge_and_Discount));
            clickElement(rental_Charge_and_Discount);
            Thread.sleep(2000);
            driver.switchTo().parentFrame();
            //Thread.sleep(5000);
        }

        //dropDown(Does_Have_Private_APN, Private_APN);
        Thread.sleep(2000);

        Thread.sleep(2000);
        a= rentalCharge.getText();
        b= dataServiceCharge.getText();
        c= unitCharges.getText();
        d= totalCharge.getText();
        d1 = d.replace(",", "");
        e= minValue.getText();
        f= totalValue.getText();
        f1 = f.replace(",", "");



        double g= Double.parseDouble(a);
        double h= Double.parseDouble(b);
        double j= Double.parseDouble(c);
        double k= Double.parseDouble(d1);
        double l= Double.parseDouble(e);
        double m= Double.parseDouble(f1);
        double p=0.0;
        double q=0.0;

        double uc= g+h;
        if(uc==j)
        {
            logger.debug("Total Charge (Pounds per SIM, monthly) matches with calculations");
        }
        else
        {
            logger.debug("Total Charge (Pounds per SIM, monthly) does not matches with calculations");
        }
        int simNumber= Integer.parseInt(Voice_and_Aggregated_Data_SIMs);
        double tc= uc*simNumber;
        if(tc==k)
        {
            logger.debug("Total Charge (Pounds, total monthly charge) matches with calculations");
        }
        else
        {
            logger.debug("Total Charge (Pounds, total monthly charge) does not matches with calculations");
        }
        double tv= l*simNumber;
        if(tv==m)
        {
            logger.debug("Minimum Committed Value (Pounds, total monthly charge) matches with calculations");
        }
        else
        {
            logger.debug("Minimum Committed Value (Pounds, total monthly charge) does not matches with calculations");
        }
        if(Transformation_Fund.equals("Yes"))
        {
            n= transformationFund.getText();
            o= totalTransformationFund.getText();
            o1= o.replace(",", "");

            p= Double.parseDouble(n);
            q= Double.parseDouble(o1);

            double tf=p*IntegerTerm*simNumber;

            if(tf==q)
            {
                logger.debug("Total Transformation Fund (Pounds, total charge) matches with calculations");
            }
            else
            {
                logger.debug("Total Transformation Fund (Pounds, total charge) does not matches with calculations");
            }
        }

        clickElement(Rate_Card);
        //Thread.sleep(4000);
        logger.debug("Rate Card is displayed");
        WebDriverWait wait10 = new WebDriverWait(driver, 5);
        wait10.until(ExpectedConditions.elementToBeClickable(Flex_Plan));
        clickElement(Flex_Plan);
        Thread.sleep(2000);
        WebDriverWait wait11 = new WebDriverWait(driver, 10);
        wait11.until(ExpectedConditions.elementToBeClickable(finish));
        clickElement(finish);
        //Thread.sleep(5000);
        driver.switchTo().defaultContent();
        logger.debug("FP is added into the basket");

        WebDriverWait wait8 = new WebDriverWait(driver, 110);
        wait8.until(ExpectedConditions.elementToBeClickable(grid_icon_one));
        Thread.sleep(3000);
        String GridTerm= TermOne.getText();
        String Grid_Term = GridTerm.replace(" ", "");
        if(Term.equals(Grid_Term))
        {
            logger.debug("Term value is displayed as expected in Flex Plan Grid");
        }
        else
        {
            logger.debug("Term value is incorrect in Flex Plan Grid");
        }

        String GridRecurringCharges= RecurringCharges.getText();
        String Grid_RecurringCharges = GridRecurringCharges.replace(" ", "");
        Double Grid_Recurring_Charges= Double.parseDouble(Grid_RecurringCharges);
        if(l==Grid_Recurring_Charges)
        {
            logger.debug("Recurring Charge value is displayed as expected in Flex Plan Grid");
        }
        else
        {
            logger.debug("Recurring Charge value is incorrect in Flex Plan Grid");
        }
        //Thread.sleep(2000);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait12 = new WebDriverWait(driver, 500);
        wait12.until(ExpectedConditions.elementToBeClickable(edit_pencilOne));
        clickElement(edit_pencilOne);
        Thread.sleep(2000);
        WebDriverWait wait14 = new WebDriverWait(driver,15);
        wait14.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        WebDriverWait wait15 = new WebDriverWait(driver, 15);
        wait15.until(ExpectedConditions.elementToBeClickable(finishOne));

        //wait14.until(ExpectedConditions.visibilityOf(finishOne));
        //Thread.sleep(3000);
        clickElement(finishOne);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(15000);
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebDriverWait wait17 = new WebDriverWait(driver, 500);
        wait17.until(ExpectedConditions.elementToBeClickable(edit_pencilOne));
        WebDriverWait wait16 = new WebDriverWait(driver, 110);
        wait16.until(ExpectedConditions.visibilityOf(grid_icon_one));
        //Thread.sleep(3000);
        //WebDriverWait wait4 = new WebDriverWait(driver, 100);
        //wait4.until(ExpectedConditions.visibilityOf(grid_icon_one));
        //elementToBeClickable(grid_icon_one)
        //js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement scanElement =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(grid_icon_one));
        Actions action =new Actions(driver);
        action.moveToElement(scanElement).click().build().perform();
        //clickElement(grid_icon_one);
        logger.debug("Flex Plan grid details are displayed in Grid");
        takeScreenShot("Flex Plan grid details");
        Thread.sleep(3000);
        WebDriverWait wait9 = new WebDriverWait(driver, 20);
        wait9.until(ExpectedConditions.elementToBeClickable(compatiblity));
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click()",compatiblity);
        //clickElement(compatiblity);
        Thread.sleep(5000);
        //WebElement scanElementOne =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(cancel));
        //Actions actionOne =new Actions(driver);
        //actionOne.moveToElement(scanElementOne).click().perform();
        //WebDriverWait wait12 = new WebDriverWait(driver, 20);
        //wait12.until(ExpectedConditions.elementToBeClickable(cancel));
        //clickElement(cancel);
        //JavascriptExecutor js2 = (JavascriptExecutor) driver;
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("arguments[0].click()",cancel);
        //Thread.sleep(2000);
        //Basket Validations
        logger.debug("Basket Validation Started");
        Thread.sleep(3000);
        WebDriverWait wait13 = new WebDriverWait(driver, 40);
        wait13.until(ExpectedConditions.visibilityOf(BasketTerm));
        String basketTerm= BasketTerm.getAttribute("value");
        System.out.println("Basket Term is: " +basketTerm);
        if(basketTerm.equals(Term))
        {
            logger.debug("PASS: Term value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Term value is incorrect on Basket page");
        }
        String basketQuantityOfSIMs= BasketQuantityOfSIMs.getAttribute("value");
        System.out.println("Basket Quantity Of SIMs value is: " +basketQuantityOfSIMs);
        String Basket_Quantity_Of_SIMs = basketQuantityOfSIMs.replace(",", "");
        if(Basket_Quantity_Of_SIMs.equals(Voice_and_Aggregated_Data_SIMs))
        {
            logger.debug("PASS: Quantity Of SIMs value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Quantity Of SIMs value is incorrect on Basket page");
        }

        String basketContractTerm= BasketContractTerm.getAttribute("value");
        System.out.println("Basket Contract Term (months) is: " +basketContractTerm);
        if(basketContractTerm.equals(Term)|| basketContractTerm.equals("24"))
        {
            logger.debug("PASS: Contract Term (months) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Contract Term (months) value is incorrect on Basket page");
        }
        if(Transformation_Fund.equals("Yes"))
        {
            String Basket_TotalTF = BasketTotalTF.getAttribute("value");
            if (Basket_TotalTF.equals(o)) {
                logger.debug("PASS: Total Transformation Fund (£) value is correct on Basket page");
            } else {
                logger.debug("Fail: Total Transformation Fund (£) value is incorrect on Basket page");
            }
        }
        String Basket_MonthlyBilledRevenue = BasketMonthlyBilledRevenue.getAttribute("value");
        if(Basket_MonthlyBilledRevenue.equals(f))
        {
            logger.debug("PASS: Monthly Billed Revenue (£) value is correct on Basket page");
        } else
        {
            logger.debug("Fail: Monthly Billed Revenue (£) value is incorrect on Basket page");
        }
        String Basket_SubscriptionRevenue = BasketSubscriptionRevenue.getAttribute("value");
        String Basket_Subscription_Revenue = Basket_SubscriptionRevenue.replace(",", "");
        double basket_Subscription_Revenue = Double.parseDouble(Basket_Subscription_Revenue);
        if(basket_Subscription_Revenue==(m*IntegerTerm))
        {
            logger.debug("PASS: Subscription Revenue (£) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Subscription Revenue (£) value is incorrect on Basket page");
        }
        String Basket_TotalBilledRevenue = BasketTotalBilledRevenue.getAttribute("value");
        String Basket_Total_BilledRevenue = Basket_TotalBilledRevenue.replace(",", "");
        double Basket_Total_Billed_Revenue= Double.parseDouble(Basket_Total_BilledRevenue);
        if(Basket_TotalBilledRevenue.equals(Basket_SubscriptionRevenue))
        {
            logger.debug("PASS: Total Billed Revenue (£) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Total Billed Revenue (£) value is incorrect on Basket page");
        }
        String Basket_TCV = BasketTCV.getAttribute("value");
        String basket_TCV = Basket_TCV.replace(",", "");
        double TCV= Double.parseDouble(basket_TCV);
        if(TCV==(basket_Subscription_Revenue-q))
        {
            logger.debug("PASS: TCV (£) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: TCV (£) value is incorrect on Basket page");
        }
        String Basket_NetRevenue = BasketNetRevenue.getAttribute("value");
        if(Basket_NetRevenue.equals(Basket_TCV))
        {
            logger.debug("PASS: Net Revenue (£) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Net Revenue (£) value is incorrect on Basket page");
        }
        String Basket_ARPU = BasketARPU.getAttribute("value");
        double ARPU= Double.parseDouble(Basket_ARPU);
        double arpu= ((Basket_Total_Billed_Revenue-q)/IntegerTerm)/simNumber;
        if(ARPU==arpu)
        {
            logger.debug("PASS: ARPU (£) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: ARPU (£) value is incorrect on Basket page");
        }
        String Basket_TFPercentage = BasketTFPercentage.getAttribute("value");
        double basket_TFPercentage = Double.parseDouble(Basket_TFPercentage);
        double TFPercentage=(q*100)/Basket_Total_Billed_Revenue;
        DecimalFormat df = new DecimalFormat("##.##");
        String formatted = df.format(TFPercentage);
        double Formatted= Double.parseDouble(formatted);
        if(basket_TFPercentage==Formatted)
        {
            logger.debug("PASS: TF as a % of Billed Revenue (%) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: TF as a % of Billed Revenue (%) value is incorrect on Basket page");
        }
    }
}
