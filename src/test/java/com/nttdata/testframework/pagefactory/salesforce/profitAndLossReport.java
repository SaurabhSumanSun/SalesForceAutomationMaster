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
import java.text.DecimalFormat;

@Component
public class profitAndLossReport extends PageObject {

    @Autowired
    public profitAndLossReport(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @FindBy(how= How.XPATH, using = "//*[text()=' Profit and Loss ']")
    public static WebElement ProfitLoss_icon;
    @FindBy(how= How.XPATH, using = "//*[@class='btn icon-cancel']")
    public static WebElement Cancel_button;

    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Subscription (Voice And Data) Oneoff']")
    public static WebElement SubscriptionOneOff;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Subscription (Voice And Data) Recurring 1']")
    public static WebElement SubscriptionYearOne;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Subscription (Voice And Data) Recurring 2']")
    public static WebElement SubscriptionYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Subscription (Voice And Data) Recurring 3']")
    public static WebElement SubscriptionYearThree;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Subscription (Voice And Data) Recurring 4']")
    public static WebElement SubscriptionYearFour;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Subscription (Voice And Data) Recurring 5']")
    public static WebElement SubscriptionYearFive;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Subscription (Voice And Data) Ttal']")
    public static WebElement SubscriptionTotal;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Billed Revenue Oneoff']")
    public static WebElement TotalBilledRevenueOneOff;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Billed Revenue Recurring 1']")
    public static WebElement TotalBilledRevenueYearOne;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Billed Revenue Recurring 2']")
    public static WebElement TotalBilledRevenueYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Billed Revenue Recurring 3']")
    public static WebElement TotalBilledRevenueYearThree;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Billed Revenue Recurring 4']")
    public static WebElement TotalBilledRevenueYearFour;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Billed Revenue Recurring 5']")
    public static WebElement TotalBilledRevenueYearFive;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Billed Revenue Ttal']")
    public static WebElement TotalBilledRevenueTotal;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Transformation Fund Oneoff']")
    public static WebElement TransformationFundOneOff;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Transformation Fund Recurring 1']")
    public static WebElement TransformationFundYearOne;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Transformation Fund Recurring 2']")
    public static WebElement TransformationFundYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Transformation Fund Recurring 3']")
    public static WebElement TransformationFundYearThree;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Transformation Fund Recurring 4']")
    public static WebElement TransformationFundYearFour;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Transformation Fund Recurring 5']")
    public static WebElement TransformationFundYearFive;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Transformation Fund Ttal']")
    public static WebElement TransformationFundTotal;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Net Revenue Oneoff']")
    public static WebElement NetRevenueOneOff;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Net Revenue Recurring 1']")
    public static WebElement NetRevenueYearOne;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Net Revenue Recurring 2']")
    public static WebElement NetRevenueYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Net Revenue Recurring 3']")
    public static WebElement NetRevenueYearThree;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Net Revenue Recurring 4']")
    public static WebElement NetRevenueYearFour;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Net Revenue Recurring 5']")
    public static WebElement NetRevenueYearFive;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Net Revenue Ttal']")
    public static WebElement NetRevenueTotal;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Airtime Revenue Oneoff']")
    public static WebElement AirtimeRevenueOneOff;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Airtime Revenue Recurring 1']")
    public static WebElement AirtimeRevenueYearOne;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Airtime Revenue Recurring 2']")
    public static WebElement AirtimeRevenueYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Airtime Revenue Recurring 3']")
    public static WebElement AirtimeRevenueYearThree;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Airtime Revenue Recurring 4']")
    public static WebElement AirtimeRevenueYearFour;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Airtime Revenue Recurring 5']")
    public static WebElement AirtimeRevenueYearFive;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Airtime Revenue Ttal']")
    public static WebElement AirtimeRevenueTotal;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Sim Cost Oneoff']")
    public static WebElement SimCostOneOff;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Sim Cost Recurring 1']")
    public static WebElement SimCostYearOne;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Sim Cost Recurring 2']")
    public static WebElement SimCostYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Sim Cost Recurring 3']")
    public static WebElement SimCostYearThree;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Sim Cost Recurring 4']")
    public static WebElement SimCostYearFour;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Sim Cost Recurring 5']")
    public static WebElement SimCostYearFive;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Sim Cost Ttal']")
    public static WebElement SimCostTotal;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Capita Cost Oneoff']")
    public static WebElement CapitaCostOneOff;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Capita Cost Recurring 1']")
    public static WebElement CapitaCostYearOne;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Capita Cost Recurring 2']")
    public static WebElement CapitaCostYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Capita Cost Recurring 3']")
    public static WebElement CapitaCostYearThree;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Capita Cost Recurring 4']")
    public static WebElement CapitaCostYearFour;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Capita Cost Recurring 5']")
    public static WebElement CapitaCostYearFive;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Capita Cost Ttal']")
    public static WebElement CapitaCostTotal;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Cost Oneoff']")
    public static WebElement TotalCostOneOff;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Cost Recurring 1']")
    public static WebElement TotalCostYearOne;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Cost Recurring 2']")
    public static WebElement TotalCostYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Cost Recurring 3']")
    public static WebElement TotalCostYearThree;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Cost Recurring 4']")
    public static WebElement TotalCostYearFour;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Cost Recurring 5']")
    public static WebElement TotalCostYearFive;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Total Cost Ttal']")
    public static WebElement TotalCostTotal;

    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Margin Oneoff']")
    public static WebElement MarginOneOff;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Margin Recurring 1']")
    public static WebElement MarginYearOne;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Margin Recurring 2']")
    public static WebElement MarginYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Margin Recurring 3']")
    public static WebElement MarginYearThree;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Margin Recurring 4']")
    public static WebElement MarginYearFour;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Margin Recurring 5']")
    public static WebElement MarginYearFive;
    @FindBy(how= How.XPATH, using = "//*[@class='Flex Plan Margin Ttal']")
    public static WebElement MarginTotal;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Revenue Oneoff']")
    public static WebElement OverallTotalRevenueOneOff;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Revenue Recurring 1']")
    public static WebElement OverallTotalRevenueYearOne;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Revenue Recurring 2']")
    public static WebElement OverallTotalRevenueYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Revenue Recurring 3']")
    public static WebElement OverallTotalRevenueYearThree;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Revenue Recurring 4']")
    public static WebElement OverallTotalRevenueYearFour;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Revenue Recurring 5']")
    public static WebElement OverallTotalRevenueYearFive;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal RevenueTotal']")
    public static WebElement OverallTotalRevenueTotal;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Cost Oneoff']")
    public static WebElement OverallTotalCostOneOff;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Cost Recurring 1']")
    public static WebElement OverallTotalCostYearOne;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Cost Recurring 2']")
    public static WebElement OverallTotalCostYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Cost Recurring 3']")
    public static WebElement OverallTotalCostYearThree;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Cost Recurring 4']")
    public static WebElement OverallTotalCostYearFour;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Cost Recurring 5']")
    public static WebElement OverallTotalCostYearFive;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal CostTotal']")
    public static WebElement OverallTotalCostTotal;

    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Margin Oneoff']")
    public static WebElement OverallTotalMarginOneOff;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Margin Recurring 1']")
    public static WebElement OverallTotalMarginYearOne;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Margin Recurring 2']")
    public static WebElement OverallTotalMarginYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Margin Recurring 3']")
    public static WebElement OverallTotalMarginYearThree;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Margin Recurring 4']")
    public static WebElement OverallTotalMarginYearFour;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal Margin Recurring 5']")
    public static WebElement OverallTotalMarginYearFive;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal MarginTotal']")
    public static WebElement OverallTotalMarginTotal;

    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal MarginP Oneoff']")
    public static WebElement MarginPercentageOneOff;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal MarginP Recurring 1']")
    public static WebElement MarginPercentageYearOne;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal MarginP Recurring 2']")
    public static WebElement MarginPercentageYearTwo;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal MarginP Recurring 3']")
    public static WebElement MarginPercentageYearThree;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal MarginP Recurring 4']")
    public static WebElement MarginPercentageYearFour;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal MarginP Recurring 5']")
    public static WebElement MarginPercentageYearFive;
    @FindBy(how= How.XPATH, using = "//*[@id='OverallTotal MarginPTotal']")
    public static WebElement MarginPercentageTotal;

    @FindBy(how= How.XPATH, using = "//*[text()='Contribution (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketContribution;
    @FindBy(how= How.XPATH, using = "//*[text()='Contribution (%)']/../..//*[@class='ng-pristine ng-untouched ng-valid']")
    public static WebElement BasketContributionPercentage;
    @FindBy(how= How.XPATH, using = "//*[text()='Total Margin (%)']/../..//*[@class='ng-pristine ng-untouched ng-valid']")
    public static WebElement BasketTotalMarginPercentage;
    @FindBy(how= How.XPATH, using = "//*[text()='Total Margin (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketTotalMargin;


    int Calc_Subscription, Calc_TotalBilledRevenue, Calc_NetRevenue;
    int Calc_TransformationFund=0;
    int Calc_AirtimeRevenue, Calc_SimCost, Calc_CapitaCost, Calc_TotalCost, Calc_Margin;
    int Calc_OverallTotalRevenue, Calc_OverallTotalCost;
    double Calc_OverallTotalMargin;
    double Calc_MarginPercentageOneOff, Calc_MarginPercentageYearOne, Calc_MarginPercentageYearTwo;
    double Calc_MarginPercentageYearThree, Calc_MarginPercentageYearFour, Calc_MarginPercentageYearFive;
    double Calc_MarginPercentageTotal;

    int Transformation_Fund_One_Off_value, Transformation_Fund_Year_One_value, Transformation_Fund_Year_Two_value, Transformation_Fund_Year_Three_value, Transformation_Fund_Year_Four_value, Transformation_Fund_Year_Five_value;
    int Transformation_Fund_Total_value=0;


    public void profitLoss() throws InterruptedException, IOException {
        Thread.sleep(8000);
       // ProfitLoss_icon.sendKeys(Keys.ENTER);
        clickElement(ProfitLoss_icon);
        Thread.sleep(10000);
        takeScreenShot("Profit and loss");
        Thread.sleep(2000);
        clickElement(Cancel_button);
    }

    public void profitLossFP(String term, String TransformationFund) throws InterruptedException, IOException {
        //Thread.sleep(5000);
        // ProfitLoss_icon.sendKeys(Keys.ENTER);
        clickElement(ProfitLoss_icon);
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        //driver.switchTo().frame(1);
        takeScreenShot("Profit and loss");
        //Thread.sleep(5000);

        //Validate Profit and Loss section

        String Subscription_OneOff = SubscriptionOneOff.getText();
        String Subscription_One_Off= Subscription_OneOff.replace(",", "");
        int Subscription_One_Off_value= Integer.parseInt(Subscription_One_Off);
        String Subscription_YearOne = SubscriptionYearOne.getText();
        String Subscription_Year_One= Subscription_YearOne.replace(",", "");
        int Subscription_Year_One_value= Integer.parseInt(Subscription_Year_One);
        String Subscription_YearTwo = SubscriptionYearTwo.getText();
        String Subscription_Year_Two= Subscription_YearTwo.replace(",", "");
        int Subscription_Year_Two_value= Integer.parseInt(Subscription_Year_Two);
        String Subscription_Total = SubscriptionTotal.getText();
        String subscription_Total= Subscription_Total.replace(",", "");
        int Subscription_Total_value= Integer.parseInt(subscription_Total);
        String Total_BilledRevenueOneOff = TotalBilledRevenueOneOff.getText();
        String Total_Billed_RevenueOneOff= Total_BilledRevenueOneOff.replace(",", "");
        int Total_Billed_Revenue_One_Off_value= Integer.parseInt(Total_Billed_RevenueOneOff);
        String Total_BilledRevenueYearOne = TotalBilledRevenueYearOne.getText();
        String Total_Billed_RevenueYearOne= Total_BilledRevenueYearOne.replace(",", "");
        int Total_Billed_Revenue_Year_One_value= Integer.parseInt(Total_Billed_RevenueYearOne);
        String Total_BilledRevenueYearTwo = TotalBilledRevenueYearTwo.getText();
        String Total_Billed_RevenueYearTwo= Total_BilledRevenueYearTwo.replace(",", "");
        int Total_Billed_Revenue_Year_Two_value= Integer.parseInt(Total_Billed_RevenueYearTwo);
        String TotalBilledRevenue_Total = TotalBilledRevenueTotal.getText();
        String TotalBilled_Revenue_Total= TotalBilledRevenue_Total.replace(",", "");
        int Total_Billed_Revenue_Total_value= Integer.parseInt(TotalBilled_Revenue_Total);
        if(TransformationFund.equals("Yes")) {
            String TransformationFund_OneOff = TransformationFundOneOff.getText();
            String TransformationFund_One_Off = TransformationFund_OneOff.replace(",", "");
            Transformation_Fund_One_Off_value = Integer.parseInt(TransformationFund_One_Off);
            String TransformationFund_YearOne = TransformationFundYearOne.getText();
            String TransformationFund_Year_One = TransformationFund_YearOne.replace(",", "");
            Transformation_Fund_Year_One_value = Integer.parseInt(TransformationFund_Year_One);
            String TransformationFund_YearTwo = TransformationFundYearTwo.getText();
            String TransformationFund_Year_Two = TransformationFund_YearTwo.replace(",", "");
            Transformation_Fund_Year_Two_value = Integer.parseInt(TransformationFund_Year_Two);
            String TransformationFund_Total = TransformationFundTotal.getText();
            String Transformation_Fund_Total = TransformationFund_Total.replace(",", "");
            Transformation_Fund_Total_value = Integer.parseInt(Transformation_Fund_Total);
        }
        String NetRevenue_OneOff = NetRevenueOneOff.getText();
        String NetRevenue_One_Off= NetRevenue_OneOff.replace(",", "");
        int Net_Revenue_One_Off_value=Integer.parseInt(NetRevenue_One_Off);
        String NetRevenue_YearOne = NetRevenueYearOne.getText();
        String NetRevenue_Year_One= NetRevenue_YearOne.replace(",", "");
        int Net_Revenue_Year_One_value=Integer.parseInt(NetRevenue_Year_One);
        String NetRevenue_YearTwo = NetRevenueYearTwo.getText();
        String NetRevenue_Year_Two= NetRevenue_YearTwo.replace(",", "");
        int Net_Revenue_Year_Two_value=Integer.parseInt(NetRevenue_Year_Two);
        String NetRevenue_Total = NetRevenueTotal.getText();
        String Net_Revenue_Total= NetRevenue_Total.replace(",", "");
        int Net_Revenue_Total_value=Integer.parseInt(Net_Revenue_Total);
        String AirtimeRevenue_OneOff = AirtimeRevenueOneOff.getText();
        String AirtimeRevenue_One_Off= AirtimeRevenue_OneOff.replace(",", "");
        int Airtime_Revenue_One_Off_value=Integer.parseInt(AirtimeRevenue_One_Off);
        String AirtimeRevenue_YearOne = AirtimeRevenueYearOne.getText();
        String AirtimeRevenue_Year_One= AirtimeRevenue_YearOne.replace(",", "");
        int Airtime_Revenue_Year_One_value=Integer.parseInt(AirtimeRevenue_Year_One);
        String AirtimeRevenue_YearTwo = AirtimeRevenueYearTwo.getText();
        String AirtimeRevenue_Year_Two= AirtimeRevenue_YearTwo.replace(",", "");
        int Airtime_Revenue_Year_Two_value=Integer.parseInt(AirtimeRevenue_Year_Two);
        String AirtimeRevenue_Total = AirtimeRevenueTotal.getText();
        String Airtime_Revenue_Total= AirtimeRevenue_Total.replace(",", "");
        int Airtime_Revenue_Total_value=Integer.parseInt(Airtime_Revenue_Total);
        String SimCost_OneOff = SimCostOneOff.getText();
        String SimCost_One_Off= SimCost_OneOff.replace(",", "");
        int Sim_Cost_One_Off_value=Integer.parseInt(SimCost_One_Off);
        String SimCost_YearOne = SimCostYearOne.getText();
        String SimCost_Year_One= SimCost_YearOne.replace(",", "");
        int Sim_Cost_Year_One_value=Integer.parseInt(SimCost_Year_One);
        String SimCost_YearTwo = SimCostYearTwo.getText();
        String SimCost_Year_Two= SimCost_YearTwo.replace(",", "");
        int Sim_Cost_Year_Two_value=Integer.parseInt(SimCost_Year_Two);
        String SimCost_Total = SimCostTotal.getText();
        String Sim_Cost_Total= SimCost_Total.replace(",", "");
        int Sim_Cost_Total_value=Integer.parseInt(Sim_Cost_Total);
        String CapitaCost_OneOff = CapitaCostOneOff.getText();
        String CapitaCost_One_Off= CapitaCost_OneOff.replace(",", "");
        int Capita_Cost_One_Off_value=Integer.parseInt(CapitaCost_One_Off);
        String CapitaCost_YearOne = CapitaCostYearOne.getText();
        String CapitaCost_Year_One= CapitaCost_YearOne.replace(",", "");
        int Capita_Cost_Year_One_value=Integer.parseInt(CapitaCost_Year_One);
        String CapitaCost_YearTwo = CapitaCostYearTwo.getText();
        String CapitaCost_Year_Two= CapitaCost_YearTwo.replace(",", "");
        int Capita_Cost_Year_Two_value=Integer.parseInt(CapitaCost_Year_Two);
        String CapitaCost_Total = CapitaCostTotal.getText();
        String Capita_Cost_Total= CapitaCost_Total.replace(",", "");
        int Capita_Cost_Total_value=Integer.parseInt(Capita_Cost_Total);
        String TotalCost_OneOff = TotalCostOneOff.getText();
        String TotalCost_One_Off= TotalCost_OneOff.replace(",", "");
        int Total_Cost_One_Off_value=Integer.parseInt(TotalCost_One_Off);
        String TotalCost_YearOne = TotalCostYearOne.getText();
        String TotalCost_Year_One= TotalCost_YearOne.replace(",", "");
        int Total_Cost_Year_One_value=Integer.parseInt(TotalCost_Year_One);
        String TotalCost_YearTwo = TotalCostYearTwo.getText();
        String TotalCost_Year_Two= TotalCost_YearTwo.replace(",", "");
        int Total_Cost_Year_Two_value=Integer.parseInt(TotalCost_Year_Two);
        String TotalCost_Total = TotalCostTotal.getText();
        String Total_Cost_Total= TotalCost_Total.replace(",", "");
        int Total_Cost_Total_value=Integer.parseInt(Total_Cost_Total);
        String Margin_OneOff = MarginOneOff.getText();
        String Margin_One_Off= Margin_OneOff.replace(",", "");
        int Margin_One_Off_value=Integer.parseInt(Margin_One_Off);
        String Margin_YearOne = MarginYearOne.getText();
        String Margin_Year_One= Margin_YearOne.replace(",", "");
        int Margin_Year_One_value=Integer.parseInt(Margin_Year_One);
        String Margin_YearTwo = MarginYearTwo.getText();
        String Margin_Year_Two= Margin_YearTwo.replace(",", "");
        int Margin_Year_Two_value=Integer.parseInt(Margin_Year_Two);
        String Margin_Total = MarginTotal.getText();
        String margin_Total= Margin_Total.replace(",", "");
        int Margin_Total_value=Integer.parseInt(margin_Total);
        String OverallTotalRevenue_OneOff = OverallTotalRevenueOneOff.getText();
        String OverallTotalRevenue_One_Off= OverallTotalRevenue_OneOff.replace(",", "");
        int Overall_Total_Revenue_One_Off_value=Integer.parseInt(OverallTotalRevenue_One_Off);
        String OverallTotalRevenue_YearOne = OverallTotalRevenueYearOne.getText();
        String OverallTotalRevenue_Year_One= OverallTotalRevenue_YearOne.replace(",", "");
        int Overall_Total_Revenue_Year_One_value=Integer.parseInt(OverallTotalRevenue_Year_One);
        String OverallTotalRevenue_YearTwo = OverallTotalRevenueYearTwo.getText();
        String OverallTotalRevenue_Year_Two= OverallTotalRevenue_YearTwo.replace(",", "");
        int Overall_Total_Revenue_Year_Two_value=Integer.parseInt(OverallTotalRevenue_Year_Two);
        String OverallTotalRevenue_Total = OverallTotalRevenueTotal.getText();
        String OverallTotal_Revenue_Total= OverallTotalRevenue_Total.replace(",", "");
        int Overall_Total_Revenue_Total_value=Integer.parseInt(OverallTotal_Revenue_Total);
        String OverallTotalCost_OneOff = OverallTotalCostOneOff.getText();
        String OverallTotalCost_One_Off= OverallTotalCost_OneOff.replace(",", "");
        int Overall_Total_Cost_One_Off_value=Integer.parseInt(OverallTotalCost_One_Off);
        String OverallTotalCost_YearOne = OverallTotalCostYearOne.getText();
        String OverallTotalCost_Year_One= OverallTotalCost_YearOne.replace(",", "");
        int Overall_Total_Cost_Year_One_value=Integer.parseInt(OverallTotalCost_Year_One);
        String OverallTotalCost_YearTwo = OverallTotalCostYearTwo.getText();
        String OverallTotalCost_Year_Two= OverallTotalCost_YearTwo.replace(",", "");
        int Overall_Total_Cost_Year_Two_value=Integer.parseInt(OverallTotalCost_Year_Two);
        String OverallTotalCost_Total = OverallTotalCostTotal.getText();
        String OverallTotal_Cost_Total= OverallTotalCost_Total.replace(",", "");
        int Overall_Total_Cost_Total_value=Integer.parseInt(OverallTotal_Cost_Total);

        String OverallTotalMargin_OneOff = OverallTotalMarginOneOff.getText();
        String OverallTotalMargin_One_Off= OverallTotalMargin_OneOff.replace(",", "");
        double Overall_Total_Margin_One_Off_value= Integer.parseInt(OverallTotalMargin_One_Off);
        String OverallTotalMargin_YearOne = OverallTotalMarginYearOne.getText();
        String OverallTotalMargin_Year_One= OverallTotalMargin_YearOne.replace(",", "");
        double Overall_Total_Margin_Year_One_value= Integer.parseInt(OverallTotalMargin_Year_One);
        String OverallTotalMargin_YearTwo = OverallTotalMarginYearTwo.getText();
        String OverallTotalMargin_Year_Two= OverallTotalMargin_YearTwo.replace(",", "");
        double Overall_Total_Margin_Year_Two_value= Integer.parseInt(OverallTotalMargin_Year_Two);
        String OverallTotalMargin_Total = OverallTotalMarginTotal.getText();
        String OverallTotal_Margin_Total= OverallTotalMargin_Total.replace(",", "");
        double Overall_Total_Margin_Total_value= Integer.parseInt(OverallTotal_Margin_Total);
        String MarginPercentage_OneOff = MarginPercentageOneOff.getText();
        String MarginPercentage_One_Off= MarginPercentage_OneOff.replace(",", "");
        double Margin_Percentage_One_Off_value= Double.parseDouble(MarginPercentage_One_Off);
        String MarginPercentage_YearOne = MarginPercentageYearOne.getText();
        String MarginPercentage_Year_One= MarginPercentage_YearOne.replace(",", "");
        double Margin_Percentage_Year_One_value= Double.parseDouble(MarginPercentage_Year_One);
        String MarginPercentage_YearTwo = MarginPercentageYearTwo.getText();
        String MarginPercentage_Year_Two= MarginPercentage_YearTwo.replace(",", "");
        double Margin_Percentage_Year_Two_value= Double.parseDouble(MarginPercentage_Year_Two);
        String MarginPercentage_Total = MarginPercentageTotal.getText();
        String Margin_Percentage_Total= MarginPercentage_Total.replace(",", "");
        double Margin_Percentage_Total_value= Double.parseDouble(Margin_Percentage_Total);

        DecimalFormat df = new DecimalFormat("##.##");
        int Term= Integer.parseInt(term);
        if(Term<=24) {
            Calc_Subscription = Subscription_One_Off_value + Subscription_Year_One_value + Subscription_Year_Two_value;
            if (Subscription_Total_value == Calc_Subscription) {
                logger.debug("PASS: Subscription (Voice And Data) value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Subscription (Voice And Data) value is incorrect in Profit and Loss Report");
            }
            Calc_TotalBilledRevenue = Total_Billed_Revenue_One_Off_value + Total_Billed_Revenue_Year_One_value + Total_Billed_Revenue_Year_Two_value;
            if (Total_Billed_Revenue_Total_value == Calc_TotalBilledRevenue) {
                logger.debug("PASS: Total Billed Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Total Billed Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_TransformationFund = Transformation_Fund_One_Off_value + Transformation_Fund_Year_One_value + Transformation_Fund_Year_Two_value;
            if (Transformation_Fund_Total_value == Calc_TransformationFund) {
                logger.debug("PASS: Transformation Fund value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Transformation Fund value is incorrect in Profit and Loss Report");
            }
            Calc_NetRevenue = Net_Revenue_One_Off_value + Net_Revenue_Year_One_value + Net_Revenue_Year_Two_value;
            if (Net_Revenue_Total_value == Calc_NetRevenue) {
                logger.debug("PASS: Net Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Net Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_AirtimeRevenue = Airtime_Revenue_One_Off_value + Airtime_Revenue_Year_One_value + Airtime_Revenue_Year_Two_value;
            if (Airtime_Revenue_Total_value == Calc_AirtimeRevenue) {
                logger.debug("PASS: Airtime Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Airtime Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_SimCost = Sim_Cost_One_Off_value + Sim_Cost_Year_One_value + Sim_Cost_Year_Two_value;
            if (Sim_Cost_Total_value == Calc_SimCost) {
                logger.debug("PASS: Sim Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Sim Cost value is incorrect in Profit and Loss Report");
            }
            Calc_CapitaCost = Capita_Cost_One_Off_value + Capita_Cost_Year_One_value + Capita_Cost_Year_Two_value;
            if (Capita_Cost_Total_value == Calc_CapitaCost) {
                logger.debug("PASS: Capita Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Capita Cost value is incorrect in Profit and Loss Report");
            }
            Calc_TotalCost = Total_Cost_One_Off_value + Total_Cost_Year_One_value + Total_Cost_Year_Two_value;
            if (Total_Cost_Total_value == Calc_TotalCost) {
                logger.debug("PASS: Total Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Total Cost value is incorrect in Profit and Loss Report");
            }
            Calc_Margin = Margin_One_Off_value + Margin_Year_One_value + Margin_Year_Two_value;
            if (Margin_Total_value == Calc_Margin) {
                logger.debug("PASS: Margin value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Margin value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalRevenue = Overall_Total_Revenue_One_Off_value + Overall_Total_Revenue_Year_One_value + Overall_Total_Revenue_Year_Two_value;
            if (Overall_Total_Revenue_Total_value == Calc_OverallTotalRevenue) {
                logger.debug("PASS: Overall Total Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalCost = Overall_Total_Cost_One_Off_value + Overall_Total_Cost_Year_One_value + Overall_Total_Cost_Year_Two_value;
            if (Overall_Total_Cost_Total_value == Calc_OverallTotalCost) {
                logger.debug("PASS: Overall Total Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Cost value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalMargin = Overall_Total_Margin_One_Off_value + Overall_Total_Margin_Year_One_value + Overall_Total_Margin_Year_Two_value;
            if (Overall_Total_Margin_Total_value == Calc_OverallTotalMargin) {
                logger.debug("PASS: Overall Total Margin value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Margin value is incorrect in Profit and Loss Report");
            }
        }
        if(Term>24 && Term<=36)
        {
            String Subscription_YearThree = SubscriptionYearThree.getText();
            String Subscription_Year_Three= Subscription_YearThree.replace(",", "");
            int Subscription_Year_Three_value= Integer.parseInt(Subscription_Year_Three);
            String Total_BilledRevenueYearThree = TotalBilledRevenueYearThree.getText();
            String Total_Billed_RevenueYearThree= Total_BilledRevenueYearThree.replace(",", "");
            int Total_Billed_Revenue_Year_Three_value= Integer.parseInt(Total_Billed_RevenueYearThree);
            if(TransformationFund.equals("Yes")) {
                String TransformationFund_YearThree = TransformationFundYearThree.getText();
                String TransformationFund_Year_Three = TransformationFund_YearThree.replace(",", "");
                Transformation_Fund_Year_Three_value = Integer.parseInt(TransformationFund_Year_Three);
            }
            String NetRevenue_YearThree = NetRevenueYearThree.getText();
            String NetRevenue_Year_Three= NetRevenue_YearThree.replace(",", "");
            int Net_Revenue_Year_Three_value=Integer.parseInt(NetRevenue_Year_Three);
            String AirtimeRevenue_YearThree = AirtimeRevenueYearThree.getText();
            String AirtimeRevenue_Year_Three= AirtimeRevenue_YearThree.replace(",", "");
            int Airtime_Revenue_Year_Three_value=Integer.parseInt(AirtimeRevenue_Year_Three);
            String SimCost_YearThree = SimCostYearThree.getText();
            String SimCost_Year_Three= SimCost_YearThree.replace(",", "");
            int Sim_Cost_Year_Three_value=Integer.parseInt(SimCost_Year_Three);
            String CapitaCost_YearThree = CapitaCostYearThree.getText();
            String CapitaCost_Year_Three= CapitaCost_YearThree.replace(",", "");
            int Capita_Cost_Year_Three_value=Integer.parseInt(CapitaCost_Year_Three);
            String TotalCost_YearThree = TotalCostYearThree.getText();
            String TotalCost_Year_Three= TotalCost_YearThree.replace(",", "");
            int Total_Cost_Year_Three_value=Integer.parseInt(TotalCost_Year_Three);
            String Margin_YearThree = MarginYearThree.getText();
            String Margin_Year_Three= Margin_YearThree.replace(",", "");
            int Margin_Year_Three_value=Integer.parseInt(Margin_Year_Three);
            String OverallTotalRevenue_YearThree = OverallTotalRevenueYearThree.getText();
            String OverallTotalRevenue_Year_Three= OverallTotalRevenue_YearThree.replace(",", "");
            int Overall_Total_Revenue_Year_Three_value=Integer.parseInt(OverallTotalRevenue_Year_Three);
            String OverallTotalCost_YearThree = OverallTotalCostYearThree.getText();
            String OverallTotalCost_Year_Three= OverallTotalCost_YearThree.replace(",", "");
            int Overall_Total_Cost_Year_Three_value=Integer.parseInt(OverallTotalCost_Year_Three);
            String OverallTotalMargin_YearThree = OverallTotalMarginYearThree.getText();
            String OverallTotalMargin_Year_Three= OverallTotalMargin_YearThree.replace(",", "");
            double Overall_Total_Margin_Year_Three_value= Integer.parseInt(OverallTotalMargin_Year_Three);
            String MarginPercentage_YearThree = MarginPercentageYearThree.getText();
            String MarginPercentage_Year_Three= MarginPercentage_YearThree.replace(",", "");
            double Margin_Percentage_Year_Three_value= Double.parseDouble(MarginPercentage_Year_Three);

            Calc_Subscription = Subscription_One_Off_value + Subscription_Year_One_value + Subscription_Year_Two_value + Subscription_Year_Three_value;
            if (Subscription_Total_value == Calc_Subscription) {
                logger.debug("PASS: Subscription (Voice And Data) value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Subscription (Voice And Data) value is incorrect in Profit and Loss Report");
            }

            Calc_TotalBilledRevenue = Total_Billed_Revenue_One_Off_value + Total_Billed_Revenue_Year_One_value + Total_Billed_Revenue_Year_Two_value + Total_Billed_Revenue_Year_Three_value;
            if (Total_Billed_Revenue_Total_value == Calc_TotalBilledRevenue) {
                logger.debug("PASS: Total Billed Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Total Billed Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_TransformationFund = Transformation_Fund_One_Off_value + Transformation_Fund_Year_One_value + Transformation_Fund_Year_Two_value + Transformation_Fund_Year_Three_value;
            if (Transformation_Fund_Total_value == Calc_TransformationFund) {
                logger.debug("PASS: Transformation Fund value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Transformation Fund value is incorrect in Profit and Loss Report");
            }
            Calc_NetRevenue = Net_Revenue_One_Off_value + Net_Revenue_Year_One_value + Net_Revenue_Year_Two_value + Net_Revenue_Year_Three_value;
            if (Net_Revenue_Total_value == Calc_NetRevenue) {
                logger.debug("PASS: Net Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Net Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_AirtimeRevenue = Airtime_Revenue_One_Off_value + Airtime_Revenue_Year_One_value + Airtime_Revenue_Year_Two_value + Airtime_Revenue_Year_Three_value;
            if (Airtime_Revenue_Total_value == Calc_AirtimeRevenue) {
                logger.debug("PASS: Airtime Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Airtime Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_SimCost = Sim_Cost_One_Off_value + Sim_Cost_Year_One_value + Sim_Cost_Year_Two_value + Sim_Cost_Year_Three_value;
            if (Sim_Cost_Total_value == Calc_SimCost) {
                logger.debug("PASS: Sim Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Sim Cost value is incorrect in Profit and Loss Report");
            }
            Calc_CapitaCost = Capita_Cost_One_Off_value + Capita_Cost_Year_One_value + Capita_Cost_Year_Two_value + Capita_Cost_Year_Three_value;
            if (Capita_Cost_Total_value == Calc_CapitaCost) {
                logger.debug("PASS: Capita Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Capita Cost value is incorrect in Profit and Loss Report");
            }
            Calc_TotalCost = Total_Cost_One_Off_value + Total_Cost_Year_One_value + Total_Cost_Year_Two_value + Total_Cost_Year_Three_value;
            if (Total_Cost_Total_value == Calc_TotalCost) {
                logger.debug("PASS: Total Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Total Cost value is incorrect in Profit and Loss Report");
            }
            Calc_Margin = Margin_One_Off_value + Margin_Year_One_value + Margin_Year_Two_value + Margin_Year_Three_value;
            if (Margin_Total_value == Calc_Margin) {
                logger.debug("PASS: Margin value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Margin value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalRevenue = Overall_Total_Revenue_One_Off_value + Overall_Total_Revenue_Year_One_value + Overall_Total_Revenue_Year_Two_value + Overall_Total_Revenue_Year_Three_value;
            if (Overall_Total_Revenue_Total_value == Calc_OverallTotalRevenue) {
                logger.debug("PASS: Overall Total Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalCost = Overall_Total_Cost_One_Off_value + Overall_Total_Cost_Year_One_value + Overall_Total_Cost_Year_Two_value + Overall_Total_Cost_Year_Three_value;
            if (Overall_Total_Cost_Total_value == Calc_OverallTotalCost) {
                logger.debug("PASS: Overall Total Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Cost value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalMargin = Overall_Total_Margin_One_Off_value + Overall_Total_Margin_Year_One_value + Overall_Total_Margin_Year_Two_value + Overall_Total_Margin_Year_Three_value;
            if (Overall_Total_Margin_Total_value == Calc_OverallTotalMargin) {
                logger.debug("PASS: Overall Total Margin value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Margin value is incorrect in Profit and Loss Report");
            }
            if (Overall_Total_Revenue_Year_Three_value != 0) {
                Calc_MarginPercentageYearThree = (Overall_Total_Margin_Year_Three_value * 100) / Overall_Total_Revenue_Year_Three_value;

                String formatted_Calc_MarginPercentageYearThree = df.format(Calc_MarginPercentageYearThree);
                double Calculated_MarginPercentageYearThree = Double.parseDouble(formatted_Calc_MarginPercentageYearThree);
                if (Margin_Percentage_Year_Three_value == Calculated_MarginPercentageYearThree) {
                    logger.debug("PASS: Margin Percentage Year Three value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage Year Three value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage Year Three value is zero in Profit and Loss Report");
            }
        }
        if(Term>36 && Term<=48)
        {
            String Subscription_YearThree = SubscriptionYearThree.getText();
            String Subscription_Year_Three= Subscription_YearThree.replace(",", "");
            int Subscription_Year_Three_value= Integer.parseInt(Subscription_Year_Three);
            String Total_BilledRevenueYearThree = TotalBilledRevenueYearThree.getText();
            String Total_Billed_RevenueYearThree= Total_BilledRevenueYearThree.replace(",", "");
            int Total_Billed_Revenue_Year_Three_value= Integer.parseInt(Total_Billed_RevenueYearThree);
            if(TransformationFund.equals("Yes")) {
                String TransformationFund_YearThree = TransformationFundYearThree.getText();
                String TransformationFund_Year_Three = TransformationFund_YearThree.replace(",", "");
                Transformation_Fund_Year_Three_value = Integer.parseInt(TransformationFund_Year_Three);
                String TransformationFund_YearFour = TransformationFundYearFour.getText();
                String TransformationFund_Year_Four = TransformationFund_YearFour.replace(",", "");
                Transformation_Fund_Year_Four_value = Integer.parseInt(TransformationFund_Year_Four);

            }
            String NetRevenue_YearThree = NetRevenueYearThree.getText();
            String NetRevenue_Year_Three= NetRevenue_YearThree.replace(",", "");
            int Net_Revenue_Year_Three_value=Integer.parseInt(NetRevenue_Year_Three);
            String AirtimeRevenue_YearThree = AirtimeRevenueYearThree.getText();
            String AirtimeRevenue_Year_Three= AirtimeRevenue_YearThree.replace(",", "");
            int Airtime_Revenue_Year_Three_value=Integer.parseInt(AirtimeRevenue_Year_Three);
            String SimCost_YearThree = SimCostYearThree.getText();
            String SimCost_Year_Three= SimCost_YearThree.replace(",", "");
            int Sim_Cost_Year_Three_value=Integer.parseInt(SimCost_Year_Three);
            String CapitaCost_YearThree = CapitaCostYearThree.getText();
            String CapitaCost_Year_Three= CapitaCost_YearThree.replace(",", "");
            int Capita_Cost_Year_Three_value=Integer.parseInt(CapitaCost_Year_Three);
            String TotalCost_YearThree = TotalCostYearThree.getText();
            String TotalCost_Year_Three= TotalCost_YearThree.replace(",", "");
            int Total_Cost_Year_Three_value=Integer.parseInt(TotalCost_Year_Three);
            String Margin_YearThree = MarginYearThree.getText();
            String Margin_Year_Three= Margin_YearThree.replace(",", "");
            int Margin_Year_Three_value=Integer.parseInt(Margin_Year_Three);
            String OverallTotalRevenue_YearThree = OverallTotalRevenueYearThree.getText();
            String OverallTotalRevenue_Year_Three= OverallTotalRevenue_YearThree.replace(",", "");
            int Overall_Total_Revenue_Year_Three_value=Integer.parseInt(OverallTotalRevenue_Year_Three);
            String OverallTotalCost_YearThree = OverallTotalCostYearThree.getText();
            String OverallTotalCost_Year_Three= OverallTotalCost_YearThree.replace(",", "");
            int Overall_Total_Cost_Year_Three_value=Integer.parseInt(OverallTotalCost_Year_Three);
            String OverallTotalMargin_YearThree = OverallTotalMarginYearThree.getText();
            String OverallTotalMargin_Year_Three= OverallTotalMargin_YearThree.replace(",", "");
            double Overall_Total_Margin_Year_Three_value= Integer.parseInt(OverallTotalMargin_Year_Three);
            String MarginPercentage_YearThree = MarginPercentageYearThree.getText();
            String MarginPercentage_Year_Three= MarginPercentage_YearThree.replace(",", "");
            double Margin_Percentage_Year_Three_value= Double.parseDouble(MarginPercentage_Year_Three);

            String Subscription_YearFour = SubscriptionYearFour.getText();
            String Subscription_Year_Four= Subscription_YearFour.replace(",", "");
            int Subscription_Year_Four_value= Integer.parseInt(Subscription_Year_Four);
            String Total_BilledRevenueYearFour = TotalBilledRevenueYearFour.getText();
            String Total_Billed_RevenueYearFour= Total_BilledRevenueYearFour.replace(",", "");
            int Total_Billed_Revenue_Year_Four_value= Integer.parseInt(Total_Billed_RevenueYearFour);

            String NetRevenue_YearFour = NetRevenueYearFour.getText();
            String NetRevenue_Year_Four= NetRevenue_YearFour.replace(",", "");
            int Net_Revenue_Year_Four_value=Integer.parseInt(NetRevenue_Year_Four);
            String AirtimeRevenue_YearFour = AirtimeRevenueYearFour.getText();
            String AirtimeRevenue_Year_Four= AirtimeRevenue_YearFour.replace(",", "");
            int Airtime_Revenue_Year_Four_value=Integer.parseInt(AirtimeRevenue_Year_Four);
            String SimCost_YearFour = SimCostYearFour.getText();
            String SimCost_Year_Four= SimCost_YearFour.replace(",", "");
            int Sim_Cost_Year_Four_value=Integer.parseInt(SimCost_Year_Four);
            String CapitaCost_YearFour = CapitaCostYearFour.getText();
            String CapitaCost_Year_Four= CapitaCost_YearFour.replace(",", "");
            int Capita_Cost_Year_Four_value=Integer.parseInt(CapitaCost_Year_Four);
            String TotalCost_YearFour = TotalCostYearFour.getText();
            String TotalCost_Year_Four= TotalCost_YearFour.replace(",", "");
            int Total_Cost_Year_Four_value=Integer.parseInt(TotalCost_Year_Four);
            String Margin_YearFour = MarginYearFour.getText();
            String Margin_Year_Four= Margin_YearFour.replace(",", "");
            int Margin_Year_Four_value=Integer.parseInt(Margin_Year_Four);
            String OverallTotalRevenue_YearFour = OverallTotalRevenueYearFour.getText();
            String OverallTotalRevenue_Year_Four= OverallTotalRevenue_YearFour.replace(",", "");
            int Overall_Total_Revenue_Year_Four_value=Integer.parseInt(OverallTotalRevenue_Year_Four);
            String OverallTotalCost_YearFour = OverallTotalCostYearFour.getText();
            String OverallTotalCost_Year_Four= OverallTotalCost_YearFour.replace(",", "");
            int Overall_Total_Cost_Year_Four_value=Integer.parseInt(OverallTotalCost_Year_Four);
            String OverallTotalMargin_YearFour = OverallTotalMarginYearFour.getText();
            String OverallTotalMargin_Year_Four= OverallTotalMargin_YearFour.replace(",", "");
            double Overall_Total_Margin_Year_Four_value= Integer.parseInt(OverallTotalMargin_Year_Four);
            String MarginPercentage_YearFour = MarginPercentageYearFour.getText();
            String MarginPercentage_Year_Four= MarginPercentage_YearFour.replace(",", "");
            double Margin_Percentage_Year_Four_value= Double.parseDouble(MarginPercentage_Year_Four);



            Calc_Subscription = Subscription_One_Off_value + Subscription_Year_One_value + Subscription_Year_Two_value + Subscription_Year_Three_value + Subscription_Year_Four_value;
            if (Subscription_Total_value == Calc_Subscription) {
                logger.debug("PASS: Subscription (Voice And Data) value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Subscription (Voice And Data) value is incorrect in Profit and Loss Report");
            }

            Calc_TotalBilledRevenue = Total_Billed_Revenue_One_Off_value + Total_Billed_Revenue_Year_One_value + Total_Billed_Revenue_Year_Two_value + Total_Billed_Revenue_Year_Three_value + Total_Billed_Revenue_Year_Four_value;
            if (Total_Billed_Revenue_Total_value == Calc_TotalBilledRevenue) {
                logger.debug("PASS: Total Billed Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Total Billed Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_TransformationFund = Transformation_Fund_One_Off_value + Transformation_Fund_Year_One_value + Transformation_Fund_Year_Two_value + Transformation_Fund_Year_Three_value + Transformation_Fund_Year_Four_value;
            if (Transformation_Fund_Total_value == Calc_TransformationFund) {
                logger.debug("PASS: Transformation Fund value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Transformation Fund value is incorrect in Profit and Loss Report");
            }
            Calc_NetRevenue = Net_Revenue_One_Off_value + Net_Revenue_Year_One_value + Net_Revenue_Year_Two_value + Net_Revenue_Year_Three_value + Net_Revenue_Year_Four_value;
            if (Net_Revenue_Total_value == Calc_NetRevenue) {
                logger.debug("PASS: Net Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Net Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_AirtimeRevenue = Airtime_Revenue_One_Off_value + Airtime_Revenue_Year_One_value + Airtime_Revenue_Year_Two_value + Airtime_Revenue_Year_Three_value + Airtime_Revenue_Year_Four_value;
            if (Airtime_Revenue_Total_value == Calc_AirtimeRevenue) {
                logger.debug("PASS: Airtime Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Airtime Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_SimCost = Sim_Cost_One_Off_value + Sim_Cost_Year_One_value + Sim_Cost_Year_Two_value + Sim_Cost_Year_Three_value + Sim_Cost_Year_Four_value;
            if (Sim_Cost_Total_value == Calc_SimCost) {
                logger.debug("PASS: Sim Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Sim Cost value is incorrect in Profit and Loss Report");
            }
            Calc_CapitaCost = Capita_Cost_One_Off_value + Capita_Cost_Year_One_value + Capita_Cost_Year_Two_value + Capita_Cost_Year_Three_value + Capita_Cost_Year_Four_value;
            if (Capita_Cost_Total_value == Calc_CapitaCost) {
                logger.debug("PASS: Capita Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Capita Cost value is incorrect in Profit and Loss Report");
            }
            Calc_TotalCost = Total_Cost_One_Off_value + Total_Cost_Year_One_value + Total_Cost_Year_Two_value + Total_Cost_Year_Three_value + Total_Cost_Year_Four_value;
            if (Total_Cost_Total_value == Calc_TotalCost) {
                logger.debug("PASS: Total Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Total Cost value is incorrect in Profit and Loss Report");
            }
            Calc_Margin = Margin_One_Off_value + Margin_Year_One_value + Margin_Year_Two_value + Margin_Year_Three_value + Margin_Year_Four_value;
            if (Margin_Total_value == Calc_Margin) {
                logger.debug("PASS: Margin value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Margin value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalRevenue = Overall_Total_Revenue_One_Off_value + Overall_Total_Revenue_Year_One_value + Overall_Total_Revenue_Year_Two_value + Overall_Total_Revenue_Year_Three_value + Overall_Total_Revenue_Year_Four_value;
            if (Overall_Total_Revenue_Total_value == Calc_OverallTotalRevenue) {
                logger.debug("PASS: Overall Total Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalCost = Overall_Total_Cost_One_Off_value + Overall_Total_Cost_Year_One_value + Overall_Total_Cost_Year_Two_value + Overall_Total_Cost_Year_Three_value + Overall_Total_Cost_Year_Four_value;
            if (Overall_Total_Cost_Total_value == Calc_OverallTotalCost) {
                logger.debug("PASS: Overall Total Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Cost value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalMargin = Overall_Total_Margin_One_Off_value + Overall_Total_Margin_Year_One_value + Overall_Total_Margin_Year_Two_value + Overall_Total_Margin_Year_Three_value + Overall_Total_Margin_Year_Four_value;
            if (Overall_Total_Margin_Total_value == Calc_OverallTotalMargin) {
                logger.debug("PASS: Overall Total Margin value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Margin value is incorrect in Profit and Loss Report");
            }
            if (Overall_Total_Revenue_Year_Three_value != 0) {
                Calc_MarginPercentageYearThree = (Overall_Total_Margin_Year_Three_value * 100) / Overall_Total_Revenue_Year_Three_value;

                String formatted_Calc_MarginPercentageYearThree = df.format(Calc_MarginPercentageYearThree);
                double Calculated_MarginPercentageYearThree = Double.parseDouble(formatted_Calc_MarginPercentageYearThree);
                if (Margin_Percentage_Year_Three_value == Calculated_MarginPercentageYearThree) {
                    logger.debug("PASS: Margin Percentage Year Three value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage Year Three value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage Year Three value is zero in Profit and Loss Report");
            }
            if (Overall_Total_Revenue_Year_Four_value != 0) {
                Calc_MarginPercentageYearFour = (Overall_Total_Margin_Year_Four_value * 100) / Overall_Total_Revenue_Year_Four_value;

                String formatted_Calc_MarginPercentageYearFour = df.format(Calc_MarginPercentageYearFour);
                double Calculated_MarginPercentageYearFour = Double.parseDouble(formatted_Calc_MarginPercentageYearFour);
                if (Margin_Percentage_Year_Four_value == Calculated_MarginPercentageYearFour) {
                    logger.debug("PASS: Margin Percentage Year Four value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage Year Four value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage Year Four value is zero in Profit and Loss Report");
            }
        }

        if(Term>48 && Term<=60)
        {
            String Subscription_YearThree = SubscriptionYearThree.getText();
            String Subscription_Year_Three= Subscription_YearThree.replace(",", "");
            int Subscription_Year_Three_value= Integer.parseInt(Subscription_Year_Three);
            String Total_BilledRevenueYearThree = TotalBilledRevenueYearThree.getText();
            String Total_Billed_RevenueYearThree= Total_BilledRevenueYearThree.replace(",", "");
            int Total_Billed_Revenue_Year_Three_value= Integer.parseInt(Total_Billed_RevenueYearThree);
            if(TransformationFund.equals("Yes")) {
                String TransformationFund_YearThree = TransformationFundYearThree.getText();
                String TransformationFund_Year_Three = TransformationFund_YearThree.replace(",", "");
                Transformation_Fund_Year_Three_value = Integer.parseInt(TransformationFund_Year_Three);
                String TransformationFund_YearFour = TransformationFundYearFour.getText();
                String TransformationFund_Year_Four= TransformationFund_YearFour.replace(",", "");
                Transformation_Fund_Year_Four_value= Integer.parseInt(TransformationFund_Year_Four);
                String TransformationFund_YearFive = TransformationFundYearFive.getText();
                String TransformationFund_Year_Five= TransformationFund_YearFive.replace(",", "");
                Transformation_Fund_Year_Five_value= Integer.parseInt(TransformationFund_Year_Five);
            }
            String NetRevenue_YearThree = NetRevenueYearThree.getText();
            String NetRevenue_Year_Three= NetRevenue_YearThree.replace(",", "");
            int Net_Revenue_Year_Three_value=Integer.parseInt(NetRevenue_Year_Three);
            String AirtimeRevenue_YearThree = AirtimeRevenueYearThree.getText();
            String AirtimeRevenue_Year_Three= AirtimeRevenue_YearThree.replace(",", "");
            int Airtime_Revenue_Year_Three_value=Integer.parseInt(AirtimeRevenue_Year_Three);
            String SimCost_YearThree = SimCostYearThree.getText();
            String SimCost_Year_Three= SimCost_YearThree.replace(",", "");
            int Sim_Cost_Year_Three_value=Integer.parseInt(SimCost_Year_Three);
            String CapitaCost_YearThree = CapitaCostYearThree.getText();
            String CapitaCost_Year_Three= CapitaCost_YearThree.replace(",", "");
            int Capita_Cost_Year_Three_value=Integer.parseInt(CapitaCost_Year_Three);
            String TotalCost_YearThree = TotalCostYearThree.getText();
            String TotalCost_Year_Three= TotalCost_YearThree.replace(",", "");
            int Total_Cost_Year_Three_value=Integer.parseInt(TotalCost_Year_Three);
            String Margin_YearThree = MarginYearThree.getText();
            String Margin_Year_Three= Margin_YearThree.replace(",", "");
            int Margin_Year_Three_value=Integer.parseInt(Margin_Year_Three);
            String OverallTotalRevenue_YearThree = OverallTotalRevenueYearThree.getText();
            String OverallTotalRevenue_Year_Three= OverallTotalRevenue_YearThree.replace(",", "");
            int Overall_Total_Revenue_Year_Three_value=Integer.parseInt(OverallTotalRevenue_Year_Three);
            String OverallTotalCost_YearThree = OverallTotalCostYearThree.getText();
            String OverallTotalCost_Year_Three= OverallTotalCost_YearThree.replace(",", "");
            int Overall_Total_Cost_Year_Three_value=Integer.parseInt(OverallTotalCost_Year_Three);
            String OverallTotalMargin_YearThree = OverallTotalMarginYearThree.getText();
            String OverallTotalMargin_Year_Three= OverallTotalMargin_YearThree.replace(",", "");
            double Overall_Total_Margin_Year_Three_value= Integer.parseInt(OverallTotalMargin_Year_Three);
            String MarginPercentage_YearThree = MarginPercentageYearThree.getText();
            String MarginPercentage_Year_Three= MarginPercentage_YearThree.replace(",", "");
            double Margin_Percentage_Year_Three_value= Double.parseDouble(MarginPercentage_Year_Three);

            String Subscription_YearFour = SubscriptionYearFour.getText();
            String Subscription_Year_Four= Subscription_YearFour.replace(",", "");
            int Subscription_Year_Four_value= Integer.parseInt(Subscription_Year_Four);
            String Total_BilledRevenueYearFour = TotalBilledRevenueYearFour.getText();
            String Total_Billed_RevenueYearFour= Total_BilledRevenueYearFour.replace(",", "");
            int Total_Billed_Revenue_Year_Four_value= Integer.parseInt(Total_Billed_RevenueYearFour);

            String NetRevenue_YearFour = NetRevenueYearFour.getText();
            String NetRevenue_Year_Four= NetRevenue_YearFour.replace(",", "");
            int Net_Revenue_Year_Four_value=Integer.parseInt(NetRevenue_Year_Four);
            String AirtimeRevenue_YearFour = AirtimeRevenueYearFour.getText();
            String AirtimeRevenue_Year_Four= AirtimeRevenue_YearFour.replace(",", "");
            int Airtime_Revenue_Year_Four_value=Integer.parseInt(AirtimeRevenue_Year_Four);
            String SimCost_YearFour = SimCostYearFour.getText();
            String SimCost_Year_Four= SimCost_YearFour.replace(",", "");
            int Sim_Cost_Year_Four_value=Integer.parseInt(SimCost_Year_Four);
            String CapitaCost_YearFour = CapitaCostYearFour.getText();
            String CapitaCost_Year_Four= CapitaCost_YearFour.replace(",", "");
            int Capita_Cost_Year_Four_value=Integer.parseInt(CapitaCost_Year_Four);
            String TotalCost_YearFour = TotalCostYearFour.getText();
            String TotalCost_Year_Four= TotalCost_YearFour.replace(",", "");
            int Total_Cost_Year_Four_value=Integer.parseInt(TotalCost_Year_Four);
            String Margin_YearFour = MarginYearFour.getText();
            String Margin_Year_Four= Margin_YearFour.replace(",", "");
            int Margin_Year_Four_value=Integer.parseInt(Margin_Year_Four);
            String OverallTotalRevenue_YearFour = OverallTotalRevenueYearFour.getText();
            String OverallTotalRevenue_Year_Four= OverallTotalRevenue_YearFour.replace(",", "");
            int Overall_Total_Revenue_Year_Four_value=Integer.parseInt(OverallTotalRevenue_Year_Four);
            String OverallTotalCost_YearFour = OverallTotalCostYearFour.getText();
            String OverallTotalCost_Year_Four= OverallTotalCost_YearFour.replace(",", "");
            int Overall_Total_Cost_Year_Four_value=Integer.parseInt(OverallTotalCost_Year_Four);
            String OverallTotalMargin_YearFour = OverallTotalMarginYearFour.getText();
            String OverallTotalMargin_Year_Four= OverallTotalMargin_YearFour.replace(",", "");
            double Overall_Total_Margin_Year_Four_value= Integer.parseInt(OverallTotalMargin_Year_Four);
            String MarginPercentage_YearFour = MarginPercentageYearFour.getText();
            String MarginPercentage_Year_Four= MarginPercentage_YearFour.replace(",", "");
            double Margin_Percentage_Year_Four_value= Double.parseDouble(MarginPercentage_Year_Four);
            String Subscription_YearFive = SubscriptionYearFive.getText();
            String Subscription_Year_Five= Subscription_YearFive.replace(",", "");
            int Subscription_Year_Five_value= Integer.parseInt(Subscription_Year_Five);
            String Total_BilledRevenueYearFive = TotalBilledRevenueYearFive.getText();
            String Total_Billed_RevenueYearFive= Total_BilledRevenueYearFive.replace(",", "");
            int Total_Billed_Revenue_Year_Five_value= Integer.parseInt(Total_Billed_RevenueYearFive);

            String NetRevenue_YearFive = NetRevenueYearFive.getText();
            String NetRevenue_Year_Five= NetRevenue_YearFive.replace(",", "");
            int Net_Revenue_Year_Five_value=Integer.parseInt(NetRevenue_Year_Five);
            String AirtimeRevenue_YearFive = AirtimeRevenueYearFive.getText();
            String AirtimeRevenue_Year_Five= AirtimeRevenue_YearFive.replace(",", "");
            int Airtime_Revenue_Year_Five_value=Integer.parseInt(AirtimeRevenue_Year_Five);
            String SimCost_YearFive = SimCostYearFive.getText();
            String SimCost_Year_Five= SimCost_YearFive.replace(",", "");
            int Sim_Cost_Year_Five_value=Integer.parseInt(SimCost_Year_Five);
            String CapitaCost_YearFive = CapitaCostYearFive.getText();
            String CapitaCost_Year_Five= CapitaCost_YearFive.replace(",", "");
            int Capita_Cost_Year_Five_value=Integer.parseInt(CapitaCost_Year_Five);
            String TotalCost_YearFive = TotalCostYearFive.getText();
            String TotalCost_Year_Five= TotalCost_YearFive.replace(",", "");
            int Total_Cost_Year_Five_value=Integer.parseInt(TotalCost_Year_Five);
            String Margin_YearFive = MarginYearFive.getText();
            String Margin_Year_Five= Margin_YearFive.replace(",", "");
            int Margin_Year_Five_value=Integer.parseInt(Margin_Year_Five);
            String OverallTotalRevenue_YearFive = OverallTotalRevenueYearFive.getText();
            String OverallTotalRevenue_Year_Five= OverallTotalRevenue_YearFive.replace(",", "");
            int Overall_Total_Revenue_Year_Five_value=Integer.parseInt(OverallTotalRevenue_Year_Five);
            String OverallTotalCost_YearFive = OverallTotalCostYearFive.getText();
            String OverallTotalCost_Year_Five= OverallTotalCost_YearFive.replace(",", "");
            int Overall_Total_Cost_Year_Five_value=Integer.parseInt(OverallTotalCost_Year_Five);
            String OverallTotalMargin_YearFive = OverallTotalMarginYearFive.getText();
            String OverallTotalMargin_Year_Five= OverallTotalMargin_YearFive.replace(",", "");
            double Overall_Total_Margin_Year_Five_value= Integer.parseInt(OverallTotalMargin_Year_Five);
            String MarginPercentage_YearFive = MarginPercentageYearFive.getText();
            String MarginPercentage_Year_Five= MarginPercentage_YearFive.replace(",", "");
            double Margin_Percentage_Year_Five_value= Double.parseDouble(MarginPercentage_Year_Five);

            Calc_Subscription = Subscription_One_Off_value + Subscription_Year_One_value + Subscription_Year_Two_value + Subscription_Year_Three_value + Subscription_Year_Four_value + Subscription_Year_Five_value;
            if (Subscription_Total_value == Calc_Subscription) {
                logger.debug("PASS: Subscription (Voice And Data) value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Subscription (Voice And Data) value is incorrect in Profit and Loss Report");
            }

            Calc_TotalBilledRevenue = Total_Billed_Revenue_One_Off_value + Total_Billed_Revenue_Year_One_value + Total_Billed_Revenue_Year_Two_value + Total_Billed_Revenue_Year_Three_value + Total_Billed_Revenue_Year_Four_value + Total_Billed_Revenue_Year_Five_value;
            if (Total_Billed_Revenue_Total_value == Calc_TotalBilledRevenue) {
                logger.debug("PASS: Total Billed Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Total Billed Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_TransformationFund = Transformation_Fund_One_Off_value + Transformation_Fund_Year_One_value + Transformation_Fund_Year_Two_value + Transformation_Fund_Year_Three_value + Transformation_Fund_Year_Four_value + Transformation_Fund_Year_Five_value;
            if (Transformation_Fund_Total_value == Calc_TransformationFund) {
                logger.debug("PASS: Transformation Fund value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Transformation Fund value is incorrect in Profit and Loss Report");
            }
            Calc_NetRevenue = Net_Revenue_One_Off_value + Net_Revenue_Year_One_value + Net_Revenue_Year_Two_value + Net_Revenue_Year_Three_value + Net_Revenue_Year_Four_value + Net_Revenue_Year_Five_value;
            if (Net_Revenue_Total_value == Calc_NetRevenue) {
                logger.debug("PASS: Net Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Net Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_AirtimeRevenue = Airtime_Revenue_One_Off_value + Airtime_Revenue_Year_One_value + Airtime_Revenue_Year_Two_value + Airtime_Revenue_Year_Three_value + Airtime_Revenue_Year_Four_value + Airtime_Revenue_Year_Five_value;
            if (Airtime_Revenue_Total_value == Calc_AirtimeRevenue) {
                logger.debug("PASS: Airtime Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Airtime Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_SimCost = Sim_Cost_One_Off_value + Sim_Cost_Year_One_value + Sim_Cost_Year_Two_value + Sim_Cost_Year_Three_value + Sim_Cost_Year_Four_value + Sim_Cost_Year_Five_value;
            if (Sim_Cost_Total_value == Calc_SimCost) {
                logger.debug("PASS: Sim Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Sim Cost value is incorrect in Profit and Loss Report");
            }
            Calc_CapitaCost = Capita_Cost_One_Off_value + Capita_Cost_Year_One_value + Capita_Cost_Year_Two_value + Capita_Cost_Year_Three_value + Capita_Cost_Year_Four_value + Capita_Cost_Year_Five_value;
            if (Capita_Cost_Total_value == Calc_CapitaCost) {
                logger.debug("PASS: Capita Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Capita Cost value is incorrect in Profit and Loss Report");
            }
            Calc_TotalCost = Total_Cost_One_Off_value + Total_Cost_Year_One_value + Total_Cost_Year_Two_value + Total_Cost_Year_Three_value + Total_Cost_Year_Four_value + Total_Cost_Year_Five_value;
            if (Total_Cost_Total_value == Calc_TotalCost) {
                logger.debug("PASS: Total Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Total Cost value is incorrect in Profit and Loss Report");
            }
            Calc_Margin = Margin_One_Off_value + Margin_Year_One_value + Margin_Year_Two_value + Margin_Year_Three_value + Margin_Year_Four_value + Margin_Year_Five_value;
            if (Margin_Total_value == Calc_Margin) {
                logger.debug("PASS: Margin value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Margin value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalRevenue = Overall_Total_Revenue_One_Off_value + Overall_Total_Revenue_Year_One_value + Overall_Total_Revenue_Year_Two_value + Overall_Total_Revenue_Year_Three_value + Overall_Total_Revenue_Year_Four_value + Overall_Total_Revenue_Year_Five_value;
            if (Overall_Total_Revenue_Total_value == Calc_OverallTotalRevenue) {
                logger.debug("PASS: Overall Total Revenue value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Revenue value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalCost = Overall_Total_Cost_One_Off_value + Overall_Total_Cost_Year_One_value + Overall_Total_Cost_Year_Two_value + Overall_Total_Cost_Year_Three_value + Overall_Total_Cost_Year_Four_value + Overall_Total_Cost_Year_Five_value;
            if (Overall_Total_Cost_Total_value == Calc_OverallTotalCost) {
                logger.debug("PASS: Overall Total Cost value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Cost value is incorrect in Profit and Loss Report");
            }
            Calc_OverallTotalMargin = Overall_Total_Margin_One_Off_value + Overall_Total_Margin_Year_One_value + Overall_Total_Margin_Year_Two_value + Overall_Total_Margin_Year_Three_value + Overall_Total_Margin_Year_Four_value + Overall_Total_Margin_Year_Five_value;
            if (Overall_Total_Margin_Total_value == Calc_OverallTotalMargin) {
                logger.debug("PASS: Overall Total Margin value is correct in Profit and Loss Report");
            } else {
                logger.debug("Fail: Overall Total Margin value is incorrect in Profit and Loss Report");
            }
            if (Overall_Total_Revenue_Year_Three_value != 0) {
                Calc_MarginPercentageYearThree = (Overall_Total_Margin_Year_Three_value * 100) / Overall_Total_Revenue_Year_Three_value;

                String formatted_Calc_MarginPercentageYearThree = df.format(Calc_MarginPercentageYearThree);
                double Calculated_MarginPercentageYearThree = Double.parseDouble(formatted_Calc_MarginPercentageYearThree);
                if (Margin_Percentage_Year_Three_value == Calculated_MarginPercentageYearThree) {
                    logger.debug("PASS: Margin Percentage Year Three value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage Year Three value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage Year Three value is zero in Profit and Loss Report");
            }
            if (Overall_Total_Revenue_Year_Four_value != 0) {
                Calc_MarginPercentageYearFour = (Overall_Total_Margin_Year_Four_value * 100) / Overall_Total_Revenue_Year_Four_value;

                String formatted_Calc_MarginPercentageYearFour = df.format(Calc_MarginPercentageYearFour);
                double Calculated_MarginPercentageYearFour = Double.parseDouble(formatted_Calc_MarginPercentageYearFour);
                if (Margin_Percentage_Year_Four_value == Calculated_MarginPercentageYearFour) {
                    logger.debug("PASS: Margin Percentage Year Four value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage Year Four value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage Year Four value is zero in Profit and Loss Report");
            }
            if (Overall_Total_Revenue_Year_Five_value != 0) {
                Calc_MarginPercentageYearFive = (Overall_Total_Margin_Year_Five_value * 100) / Overall_Total_Revenue_Year_Five_value;

                String formatted_Calc_MarginPercentageYearFive = df.format(Calc_MarginPercentageYearFive);
                double Calculated_MarginPercentageYearFive = Double.parseDouble(formatted_Calc_MarginPercentageYearFive);
                if (Margin_Percentage_Year_Five_value == Calculated_MarginPercentageYearFive) {
                    logger.debug("PASS: Margin Percentage Year Five value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage Year Five value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage Year Five value is zero in Profit and Loss Report");
            }
        }

            if (Overall_Total_Revenue_One_Off_value != 0) {
                Calc_MarginPercentageOneOff = (Overall_Total_Margin_One_Off_value * 100) / Overall_Total_Revenue_One_Off_value;

                String formatted_Calc_MarginPercentageOneOff = df.format(Calc_MarginPercentageOneOff);
                double Calculated_MarginPercentageOneOff = Double.parseDouble(formatted_Calc_MarginPercentageOneOff);
                if (Margin_Percentage_One_Off_value == Calculated_MarginPercentageOneOff) {
                    logger.debug("PASS: Margin Percentage One Off value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage One Off value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage One Off value is zero in Profit and Loss Report");
            }
            if (Overall_Total_Revenue_Year_One_value != 0) {
                Calc_MarginPercentageYearOne = (Overall_Total_Margin_Year_One_value *100) / Overall_Total_Revenue_Year_One_value ;

                String formatted_Calc_MarginPercentageYearOne = df.format(Calc_MarginPercentageYearOne);
                double Calculated_MarginPercentageYearOne = Double.parseDouble(formatted_Calc_MarginPercentageYearOne);
                if (Margin_Percentage_Year_One_value == Calculated_MarginPercentageYearOne) {
                    logger.debug("PASS: Margin Percentage Year One value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage Year One value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage Year One value is zero in Profit and Loss Report");
            }
            if (Overall_Total_Revenue_Year_Two_value != 0) {
                Calc_MarginPercentageYearTwo = (Overall_Total_Margin_Year_Two_value * 100) / Overall_Total_Revenue_Year_Two_value;

                String formatted_Calc_MarginPercentageYearTwo = df.format(Calc_MarginPercentageYearTwo);
                double Calculated_MarginPercentageYearTwo = Double.parseDouble(formatted_Calc_MarginPercentageYearTwo);
                if (Margin_Percentage_Year_Two_value == Calculated_MarginPercentageYearTwo) {
                    logger.debug("PASS: Margin Percentage Year Two value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage Year Two value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage Year Two value is zero in Profit and Loss Report");
            }
            if (Overall_Total_Revenue_Total_value != 0) {
                Calc_MarginPercentageTotal = (Overall_Total_Margin_Total_value * 100) / Overall_Total_Revenue_Total_value;

                String formatted_Calc_MarginPercentageTotal = df.format(Calc_MarginPercentageTotal);
                double Calculated_MarginPercentageTotal = Double.parseDouble(formatted_Calc_MarginPercentageTotal);
                if (Margin_Percentage_Total_value == Calculated_MarginPercentageTotal) {
                    logger.debug("PASS: Margin Percentage Total value is correct in Profit and Loss Report");
                } else {
                    logger.debug("Fail: Margin Percentage Total value is incorrect in Profit and Loss Report");
                }
            } else {
                logger.debug("Margin Percentage Total value is zero in Profit and Loss Report");
            }

        Thread.sleep(10000);
        driver.switchTo().defaultContent();
        clickElement(Cancel_button);

        String Basket_Contribution = BasketContribution.getAttribute("value");
        String basket_Contribution = Basket_Contribution.replace(",", "");
        double Contribution= Double.parseDouble(basket_Contribution);
        if(Overall_Total_Margin_Total_value==Contribution)
        {
            logger.debug("PASS: Contribution (£) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Contribution (£) value is incorrect on Basket page");
        }

        String Basket_ContributionPercentage = BasketContributionPercentage.getAttribute("value");
        double ContributionPercentage= Double.parseDouble(Basket_ContributionPercentage);
        if(Margin_Percentage_Total_value==ContributionPercentage)
        {
            logger.debug("PASS: Contribution Percentage (£) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Contribution Percentage (£) value is incorrect on Basket page");
        }

        String Basket_TotalMargin = BasketTotalMargin.getAttribute("value");
        if(Basket_Contribution.equals(Basket_TotalMargin))
        {
            logger.debug("PASS: Total Margin (£) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Total Margin (£) value is incorrect on Basket page");
        }

        String Basket_TotalMarginPercentage = BasketTotalMarginPercentage.getAttribute("value");
        if(Basket_ContributionPercentage.equals(Basket_TotalMarginPercentage))
        {
            logger.debug("PASS: Total Margin Percentage (£) value is correct on Basket page");
        }
        else
        {
            logger.debug("Fail: Total Margin Percentage (£) value is incorrect on Basket page");
        }

    }

}
