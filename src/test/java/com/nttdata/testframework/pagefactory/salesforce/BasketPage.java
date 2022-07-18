package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
public class BasketPage extends PageObject {
    @Autowired
    public BasketPage(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @FindBy(how= How.XPATH, using = "//*[text()='TCV (£) (Excluding Interconnect Revenue)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketTCV;
    @FindBy(how= How.XPATH, using = "//*[text()='ARPU (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketARPU;
    //contribution
    @FindBy(how= How.XPATH, using = "//*[text()='Transformation Fund as a % of Billed Revenue (%)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketTFPercentage;
    @FindBy(how= How.XPATH, using = "//*[text()='Account Credit as a % of the Total Transformation Fund (%)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketTFPercentageOfAR;

    @FindBy(how= How.XPATH, using = "//*[text()='Contribution (£)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement BasketContribution;

    @FindBy(how= How.XPATH, using = "//*[text()='Difference in Connection Volume (%)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement DifferenceInConnectionVolume;

    @FindBy(how= How.XPATH, using = "//*[text()='ARPU Dilution (%)']/../..//*[@class='ng-pristine ng-untouched ng-valid ng-isolate-scope']")
    public static WebElement ARPUdilutionPercentage;

    @FindBy(how= How.XPATH, using = "//*[text()='Level of Approval Required at ATP']/../..//input")
    public static WebElement LevelOfApprovalRequiredAtATP;


    //Difference in connection volume
    //ARPU Dilution Profile
    //TF % of airtime revenue



    public void CaptureValues() throws InterruptedException {
        String Basket_TCV = BasketTCV.getAttribute("value");
        String basket_TCV = Basket_TCV.replace(",", "");
        double TCV= Double.parseDouble(basket_TCV);
        System.out.println("TCV is: " +TCV);
        String Basket_ARPU = BasketARPU.getAttribute("value");
        double ARPU= Double.parseDouble(Basket_ARPU);
        System.out.println("ARPU is: " +ARPU);
        String Basket_TFPercentage = BasketTFPercentage.getAttribute("value");
        double basket_TFPercentage = Double.parseDouble(Basket_TFPercentage);
        System.out.println("Transformation Fund as a % of Billed Revenue (%) is: " +basket_TFPercentage);
        //Thread.sleep(5000);
        String Basket_TFPercentageOfAR = BasketTFPercentageOfAR.getAttribute("value");
        double basket_TFPercentageOfAR = Double.parseDouble(Basket_TFPercentageOfAR);
        System.out.println("Account Credit as a % of the Total Transformation Fund (%) is: " +basket_TFPercentageOfAR);

        String Basket_Contribution = BasketContribution.getAttribute("value");
        String contribution = Basket_Contribution.replace(",", "");
        double Contribution= Double.parseDouble(contribution);
        System.out.println("Contribution = "+Contribution);
        String Basket_URL= driver.getCurrentUrl();
        System.out.println("Basket Link = "+Basket_URL);
        String Level_OfApprovalRequiredAtATP = LevelOfApprovalRequiredAtATP.getAttribute("value");
        System.out.println("Level of Approval Required at ATP is: " +Level_OfApprovalRequiredAtATP);

    }



    public void CaptureResignDetails()
    {
        String Difference_InConnectionVolume = DifferenceInConnectionVolume.getAttribute("value");
        String Difference_In_ConnectionVolume = Difference_InConnectionVolume.replace(",", "");
        double Difference_In_Connection_Volume= Double.parseDouble(Difference_In_ConnectionVolume);
        System.out.println("Difference In Connection Volume is: " +Difference_In_Connection_Volume);

        String ARPU_DilutionPercentage = ARPUdilutionPercentage.getAttribute("value");
        String ARPU_Dilution_Percentage = ARPU_DilutionPercentage.replace(",", "");
        double Basket_ARPU_Dilution_Percentage= Double.parseDouble(ARPU_Dilution_Percentage);
        System.out.println("ARPU Dilution Percentage is "+Basket_ARPU_Dilution_Percentage);
    }
}
