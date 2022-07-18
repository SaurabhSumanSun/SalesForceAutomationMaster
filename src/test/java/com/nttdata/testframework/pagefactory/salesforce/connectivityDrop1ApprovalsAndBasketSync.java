package com.nttdata.testframework.pagefactory.salesforce;

import com.nttdata.testframework.drivers.CustomWebDriver;
import com.nttdata.testframework.utils.Configuration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.Reporter;

import java.awt.*;
import java.io.IOException;
import java.util.List;

@Component
public class connectivityDrop1ApprovalsAndBasketSync extends PageObject {

    @Autowired
    public connectivityDrop1ApprovalsAndBasketSync(CustomWebDriver customWebDriver) throws AWTException {
        super(customWebDriver);
    }

    @Autowired
    Configuration configuration;
    @FindBy(how = How.XPATH, using = "(//*[@class='select2-chosen'])[2]")
    public static WebElement Mobile_finance_dropdown;
    @FindBy(how = How.XPATH, using = "(//*[@class='select2-chosen'])[4]")
    public static WebElement ICT_finance_dropdown;
    @FindBy(how = How.XPATH, using = "(//*[text()='ICT Sales Stage']/../..//a/span)[1]")
    public static WebElement ICT_Sales_Stage;
    @FindBy(how = How.XPATH, using = "(//span[@class='select2-match'])[1]/..")
    public static WebElement stageSearchBox;

    @FindBy(how = How.XPATH, using = "//html/body/div[4]/div/input")
    public static WebElement Finance_Textbox;
    @FindBy(how = How.XPATH, using = "//html/body/div[3]/div/input")
    public static WebElement Finance_Textbox1;
    @FindBy(how = How.XPATH, using = "//html/body/div[1]/div[2]/table/tbody/tr/td[2]/div/span/div/div[3]/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div[10]/div/div[2]/div/a/span[1]")
    public static WebElement mobDropdown;
    @FindBy(how = How.XPATH, using = "//html/body/div[3]/div/input")
    public static WebElement mobSearchBox_SIT;
    @FindBy(how = How.XPATH, using = "//*/div[4]/div/input")
    public static WebElement mobSearchBox;
    @FindBy(how = How.XPATH, using = "//*/div[3]/div/input")
    public static WebElement mobSearchBoxOne;
    @FindBy(how = How.XPATH, using = "//*[@class='ng-binding ng-isolate-scope label icon icon-save btn-save btn-basic']")
    public static WebElement Save_button;
    @FindBy(how = How.XPATH, using = "//*[@class='btn-basic dropdown-arrow icon-toggle-expanded ng-scope']")
    public static WebElement Clauses_dropdown;
    @FindBy(how = How.XPATH, using = "//*[text()=' Submit For Approval ']")
    public static WebElement Submit_approval;
    @FindBy(how = How.XPATH, using = "//*[@value='Confirm']")
    public static WebElement Confirm_approval;
    @FindBy(how = How.XPATH, using = "//*[@class='btn icon-cancel']")
    public static WebElement Cancel_Approval;
    @FindBy(how = How.XPATH, using = "//*[@id=\"userNavLabel\"]")
    public static WebElement logout;
    @FindBy(how = How.XPATH, using = "//*[@id=\"userNav-menuItems\"]/a[5]")
    public static WebElement logoutclick;
    @FindBy(how = How.XPATH, using = "//*[@id=\"phSearchInput\"]")
    public static WebElement inputbox;
    @FindBy(how = How.XPATH, using = "//*[@id=\"phSearchButton\"]")
    public static WebElement search;
    @FindBy(how = How.XPATH, using = "//a[text()=\"Finance Manager.E2E\"]")
    public static WebElement finance_manager;
    @FindBy(how = How.XPATH, using = "//a[text()=\"ICT Finance Manager.E2E\"]")
    public static WebElement ict_finance_manager;
    @FindBy(how = How.XPATH, using = "//*[@id=\"moderatorMutton\"]")
    public static WebElement dropdown;
    @FindBy(how = How.XPATH, using = "//*[@id=\"USER_DETAIL\"]")
    public static WebElement userdetail;
    @FindBy(how = How.XPATH, using = "//*[@id=\"topButtonRow\"]/input[4]")
    public static WebElement loginuser;
    @FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
    public static WebElement username;
    @FindBy(how = How.XPATH, using = "(//*[@id='password'])")
    public static WebElement password;
    @FindBy(how = How.XPATH, using = "//*[@id=\"Login\"]")
    public static WebElement login;
    @FindBy(how = How.XPATH, using = "//*[text()=' Discount ']")
    public static WebElement Discount_icon;
    @FindBy(how = How.XPATH, using = "(//iframe)[4]")
    public static WebElement frame1;
    @FindBy(how = How.XPATH, using = "(//*[@class='slds-button slds-button_neutral'])[2]")
    public static WebElement Approve_basket;
    @FindBy(how = How.XPATH, using = "//*[@class='btn icon-cancel']")
    public static WebElement Discount_cancel;
    @FindBy(how = How.XPATH, using = "//*[text()=' Sync with Opportunity ']")
    public static WebElement Sync_Opp;
    @FindBy(how = How.XPATH, using = "//a[text()=\"Ankur Shivaji Sait\"]")
    public static WebElement Rotageek_PM;
    @FindBy(how = How.XPATH, using = "//a[text()=\"Pricing Desk Mobility .E2E\"]")
    public static WebElement Pricing_Desk;
    @FindBy(how = How.XPATH, using = "(//*[@title='Save discounts'])[1]")
    public static WebElement Save_discounts;
    @FindBy(how = How.XPATH, using = "(//*[@class='btn-basic ng-binding ng-scope ng-isolate-scope icon'])[1]")
    public static WebElement Call_mix_icon;

    @FindBy(how = How.XPATH, using = "//*[text()=' Refresh DOA ']")
    public static WebElement Refresh_DOA;
    @FindBy(how = How.XPATH, using = "//*[@class='dataCol  first  last ']/b")
    public static WebElement approval_text;
    @FindBy(how = How.XPATH, using = "//*[@class='dataCol  first  last ']/pre/span")
    public static WebElement approval_text_one;
    @FindBy(how= How.XPATH, using = "//*[text()='Level of Approval Required for Mobile Pricing']/../..//a/span[@class='select2-chosen']")
    public static WebElement LevelOfApprovalRequiredForMobilePricing;


    static int i = 0;

    public void approval(String Basket_Link) throws InterruptedException, IOException {
        Thread.sleep(5000);
        clickElement(Mobile_finance_dropdown);
        Thread.sleep(2000);
        System.out.println(i);
        if (i == 1) {
            sendKeys(Finance_Textbox, "Finance Manager.E2E");
            Thread.sleep(2000);
            Finance_Textbox.sendKeys(Keys.ENTER);
        }

        if (i == 0) {
            sendKeys(mobSearchBox, "Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBox.sendKeys(Keys.ENTER);
        }
        Thread.sleep(2000);
        clickElement(Save_button);
        Thread.sleep(15000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        clickElement(Clauses_dropdown);
        clickElement(Submit_approval);
        Thread.sleep(8000);
        driver.switchTo().frame(1);
        clickElement(Confirm_approval);
        driver.switchTo().defaultContent();
        clickElement(Cancel_Approval);
        Thread.sleep(2000);
        clickElement(logout);
        clickElement(logoutclick);
        try {
            inputbox.isDisplayed();
        } catch (Exception e) {
            String url = configuration.getProperty("salesforceBaseUrl");
            String userName = configuration.getProperty("username");
            String passWord = configuration.getProperty("password");
            driver.get(url);
            sendKeys(username, userName);
            sendKeys(password, passWord);
            clickElement(login);
        }

        sendKeys(inputbox, "Finance Manager.E2E");
        clickElement(search);
        clickElement(finance_manager);
        clickElement(dropdown);
        clickElement(userdetail);
        clickElement(loginuser);
        driver.get(Basket_Link);
        clickElement(Discount_icon);
        Thread.sleep(10000);
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        driver.switchTo().frame(3);
        clickElement(Approve_basket);
        takeScreenShot("Basket approval");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        clickElement(Discount_cancel);
        Thread.sleep(5000);
        clickElement(Clauses_dropdown);
        clickElement(Sync_Opp);
    }

    public void approvalHostedMI(String Basket_Link) throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(ICT_finance_dropdown));
        clickElement(ICT_finance_dropdown);
        Thread.sleep(2000);

        try {
            WebDriverWait wait3 = new WebDriverWait(driver, 5);
            wait3.until(ExpectedConditions.visibilityOf(mobSearchBox));
            sendKeys(mobSearchBox, "ICT Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBox.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            sendKeys(mobSearchBoxOne, "ICT Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBoxOne.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }

       /* WebDriverWait wait3 = new WebDriverWait(driver, 10);
        wait3.until(ExpectedConditions.visibilityOf(mobSearchBox));
        sendKeys(mobSearchBox, "Finance Manager.E2E");
        Thread.sleep(2000);
        mobSearchBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);*/

        clickElement(ICT_Sales_Stage);
        Thread.sleep(2000);
        WebDriverWait wait3 = new WebDriverWait(driver, 5);
        wait3.until(ExpectedConditions.visibilityOf(stageSearchBox));
        clickElement(stageSearchBox);
        Thread.sleep(2000);
        //ICT_Sales_Stage.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        clickElement(Save_button);
        Thread.sleep(12000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        driver.navigate().refresh();
        /*Thread.sleep(5000);
        clickElement(mobDropdown);
        Thread.sleep(8000);
        sendKeys(Finance_Textbox1, "ICT Finance Manager.E2E");
        Thread.sleep(2000);
        mobSearchBox.sendKeys(Keys.ENTER);
        i = 1;*/
    }

    public void DWApproval(String Basket_Link) throws InterruptedException {

        Thread.sleep(5000);
        clickElement(Mobile_finance_dropdown);
        Thread.sleep(2000);


        try {
            WebDriverWait wait3 = new WebDriverWait(driver, 5);
            wait3.until(ExpectedConditions.visibilityOf(mobSearchBox));
            sendKeys(mobSearchBox, "Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBox.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        } catch (Exception e) {
            sendKeys(mobSearchBoxOne, "Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBoxOne.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }
        clickElement(ICT_Sales_Stage);
        Thread.sleep(2000);
        WebDriverWait wait3 = new WebDriverWait(driver, 5);
        wait3.until(ExpectedConditions.visibilityOf(stageSearchBox));
        clickElement(stageSearchBox);
        Thread.sleep(2000);
        //ICT_Sales_Stage.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        clickElement(Save_button);
        Thread.sleep(15000);
        //WebDriverWait wait = new WebDriverWait(driver, 300);
        // wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        driver.navigate().refresh();

        Thread.sleep(5000);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(ICT_finance_dropdown));
        clickElement(ICT_finance_dropdown);
        Thread.sleep(2000);

        try {
            WebDriverWait wait4 = new WebDriverWait(driver, 5);
            wait4.until(ExpectedConditions.visibilityOf(mobSearchBox));
            sendKeys(mobSearchBox, "ICT Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBox.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        } catch (Exception e) {
            sendKeys(mobSearchBoxOne, "ICT Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBoxOne.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }


        //sendKeys(mobSearchBox, "Finance Manager.E2E");
        //Thread.sleep(2000);
        //mobSearchBox.sendKeys(Keys.ENTER);
        //Thread.sleep(2000);
        clickElement(Save_button);
        //Thread.sleep(15000);

        Thread.sleep(15000);
        WebDriverWait wait5 = new WebDriverWait(driver, 60);
        wait5.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        driver.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(3000);
        WebDriverWait wait4 = new WebDriverWait(driver, 30);
        wait4.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", Clauses_dropdown);
        //clickElement(Clauses_dropdown);
        Thread.sleep(3000);
        clickElement(Refresh_DOA);
        Thread.sleep(5000);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, 0)");
        clickElement(Clauses_dropdown);
        clickElement(Submit_approval);
        Thread.sleep(10000);
        driver.switchTo().frame(1);
        clickElement(Confirm_approval);
        driver.switchTo().defaultContent();
        clickElement(Cancel_Approval);
        Thread.sleep(2000);
        //for (int i = 0; i <= 1; i++) {
            Thread.sleep(5000);
            clickElement(logout);
            clickElement(logoutclick);
            try {
                inputbox.isDisplayed();
            }
            catch (Exception e) {
                String url = configuration.getProperty("salesforceBaseUrl");
                String userName = configuration.getProperty("username");
                String passWord = configuration.getProperty("password");
                driver.get(url);
                sendKeys(username, userName);
                sendKeys(password, passWord);
                clickElement(login);
            }
           // if (i == 0) {
                Thread.sleep(2000);
                sendKeys(inputbox, "Ankur Shivaji Sait");
                clickElement(search);
                clickElement(Rotageek_PM);
                clickElement(dropdown);
                clickElement(userdetail);
                clickElement(loginuser);

           // }
           /* if (i == 1) {
                sendKeys(inputbox, "Pricing Desk Mobility .E2E");
                clickElement(search);
                clickElement(Pricing_Desk);
                clickElement(dropdown);
                clickElement(userdetail);
                clickElement(loginuser);
               // driver.get(Basket_Link);
            }*/
     //   }
        driver.get(Basket_Link);
        Thread.sleep(2000);
        clickElement(Discount_icon);
        Thread.sleep(15000);
        //if (i == 0) {
            List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
            Reporter.log("Size= "+iframeElements.size(),true);
            driver.switchTo().frame(3);
       // }
       /* if (i == 1) {
            List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
            driver.switchTo().frame(3);
        }*/
        Thread.sleep(20000);
        clickElement(Approve_basket);
        Thread.sleep(20000);
        clickElement(Approve_basket);
        Thread.sleep(10000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        clickElement(Discount_cancel);
        Thread.sleep(5000);
    //}
        clickElement(Clauses_dropdown);
        clickElement(Sync_Opp);

    }

    public void UCApproval(String Basket_Link) throws InterruptedException, TimeoutException, IOException {

        //Thread.sleep(5000);
        Thread.sleep(5000);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(Mobile_finance_dropdown));
        clickElement(Mobile_finance_dropdown);
        Thread.sleep(2000);

        try {
            WebDriverWait wait3 = new WebDriverWait(driver, 5);
            wait3.until(ExpectedConditions.visibilityOf(mobSearchBox));
            sendKeys(mobSearchBox, "Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBox.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            sendKeys(mobSearchBoxOne, "Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBoxOne.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }
        clickElement(Save_button);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        driver.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(3000);
        WebDriverWait wait4 = new WebDriverWait(driver, 30);
        wait4.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", Clauses_dropdown);
        //clickElement(Clauses_dropdown);
        Thread.sleep(3000);
        clickElement(Refresh_DOA);
        Thread.sleep(5000);
        wait4.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(5000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click()", Clauses_dropdown);
        Thread.sleep(5000);
        clickElement(Submit_approval);
        Thread.sleep(5000);

        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(5000);

        String approval_message = approval_text.getText();
        clickElement(Confirm_approval);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        clickElement(Cancel_Approval);
        driver.navigate().refresh();
        Thread.sleep(3000);

        System.out.println("Approval Message = " + approval_message);

        clickElement(Clauses_dropdown);
        try {
            WebDriverWait wait5 = new WebDriverWait(driver, 10);
            wait5.until(ExpectedConditions.elementToBeClickable(Sync_Opp));
            Thread.sleep(2000);
            if (Sync_Opp.isEnabled()) {
                clickElement(Sync_Opp);
            }
        }
        catch (TimeoutException f)
        {
            //Thread.sleep(2000);
            clickElement(logout);
            clickElement(logoutclick);
            try {
                inputbox.isDisplayed();
            } catch (Exception e) {
                String url = configuration.getProperty("salesforceBaseUrl");
                String userName = configuration.getProperty("username");
                String passWord = configuration.getProperty("password");
                driver.get(url);
                sendKeys(username, userName);
                sendKeys(password, passWord);
                clickElement(login);
            }


            sendKeys(inputbox, "ICT Finance Manager.E2E");
            clickElement(search);
            clickElement(ict_finance_manager);
            clickElement(dropdown);
            clickElement(userdetail);
            clickElement(loginuser);
            Thread.sleep(2000);
            driver.get(Basket_Link);
            Thread.sleep(5000);
            clickElement(Discount_icon);
            Thread.sleep(8000);
            try {
                List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
                System.out.println("The total number of iframes are " + iframeElements.size());
                int size = iframeElements.size();
                //Thread.sleep(2000);
                driver.switchTo().frame(size - 1);
                clickElement(Approve_basket);
            }
            catch(Exception e)
            {
                driver.switchTo().frame(1);
                clickElement(Approve_basket);
            }
            takeScreenShot("Basket approval");
            Thread.sleep(2000);
            driver.switchTo().defaultContent();
            clickElement(Discount_cancel);
            Thread.sleep(3000);
            //driver.navigate().refresh();
            //Thread.sleep(9000);
            clickElement(Clauses_dropdown);

            try {
                WebDriverWait wait5 = new WebDriverWait(driver, 10);
                wait5.until(ExpectedConditions.elementToBeClickable(Sync_Opp));
                Thread.sleep(2000);
                if (Sync_Opp.isEnabled()) {
                    clickElement(Sync_Opp);
                }
            }
            catch (TimeoutException g) {
                //Thread.sleep(2000);
                clickElement(logout);
                clickElement(logoutclick);
                try {
                    inputbox.isDisplayed();
                } catch (Exception e) {
                    String url = configuration.getProperty("salesforceBaseUrl");
                    String userName = configuration.getProperty("username");
                    String passWord = configuration.getProperty("password");
                    driver.get(url);
                    sendKeys(username, userName);
                    sendKeys(password, passWord);
                    clickElement(login);
                }


                sendKeys(inputbox, "Finance Manager.E2E");
                clickElement(search);
                clickElement(finance_manager);
                clickElement(dropdown);
                clickElement(userdetail);
                clickElement(loginuser);
                Thread.sleep(2000);
                driver.get(Basket_Link);
                Thread.sleep(5000);
                clickElement(Discount_icon);
                Thread.sleep(8000);
                try {
                    List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
                    System.out.println("The total number of iframes are " + iframeElements.size());
                    int size = iframeElements.size();
                    //Thread.sleep(2000);
                    driver.switchTo().frame(size - 1);
                    clickElement(Approve_basket);
                } catch (Exception e) {
                    driver.switchTo().frame(1);
                    clickElement(Approve_basket);
                }
                takeScreenShot("Basket approval");
                Thread.sleep(2000);
                driver.switchTo().defaultContent();
                clickElement(Discount_cancel);
                Thread.sleep(3000);
                //driver.navigate().refresh();
                //Thread.sleep(9000);
                clickElement(Clauses_dropdown);
                //clickElement(Sync_Opp);
                WebDriverWait wait5 = new WebDriverWait(driver, 20);
                wait5.until(ExpectedConditions.elementToBeClickable(Sync_Opp));
                Thread.sleep(2000);
                if (Sync_Opp.isEnabled())
                {
                    clickElement(Sync_Opp);
                }
            }
        }


    }
    public void UCApprovalOne(String Basket_Link) throws InterruptedException, TimeoutException, IOException {

        //Thread.sleep(5000);
        /*Thread.sleep(5000);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(Mobile_finance_dropdown));
        clickElement(Mobile_finance_dropdown);
        Thread.sleep(2000);

        try {
            WebDriverWait wait3 = new WebDriverWait(driver, 5);
            wait3.until(ExpectedConditions.visibilityOf(mobSearchBox));
            sendKeys(mobSearchBox, "Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBox.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            sendKeys(mobSearchBoxOne, "Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBoxOne.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }
        clickElement(Save_button);
        Thread.sleep(5000);*/
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        driver.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(3000);
        WebDriverWait wait4 = new WebDriverWait(driver, 30);
        wait4.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", Clauses_dropdown);
        //clickElement(Clauses_dropdown);
        Thread.sleep(3000);
        clickElement(Refresh_DOA);
        Thread.sleep(5000);
        wait4.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(5000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click()", Clauses_dropdown);
        Thread.sleep(5000);
        clickElement(Submit_approval);
        Thread.sleep(5000);

        WebDriverWait wait1 = new WebDriverWait(driver, 40);
        wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(5000);

        String approval_message = approval_text.getText();
        clickElement(Confirm_approval);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        clickElement(Cancel_Approval);
        driver.navigate().refresh();
        Thread.sleep(3000);

        System.out.println("Approval Message = " + approval_message);

        clickElement(Clauses_dropdown);
        try {
            WebDriverWait wait5 = new WebDriverWait(driver, 10);
            wait5.until(ExpectedConditions.elementToBeClickable(Sync_Opp));
            Thread.sleep(2000);
            if (Sync_Opp.isEnabled()) {
                clickElement(Sync_Opp);
            }
        }
        catch (TimeoutException f)
        {
            //Thread.sleep(2000);
            clickElement(logout);
            clickElement(logoutclick);
            try {
                inputbox.isDisplayed();
            } catch (Exception e) {
                String url = configuration.getProperty("salesforceBaseUrl");
                String userName = configuration.getProperty("username");
                String passWord = configuration.getProperty("password");
                driver.get(url);
                sendKeys(username, userName);
                sendKeys(password, passWord);
                clickElement(login);
            }


            sendKeys(inputbox, "ICT Finance Manager.E2E");
            clickElement(search);
            clickElement(ict_finance_manager);
            clickElement(dropdown);
            clickElement(userdetail);
            clickElement(loginuser);
            Thread.sleep(2000);
            driver.get(Basket_Link);
            Thread.sleep(5000);
            clickElement(Discount_icon);
            Thread.sleep(8000);
            try {
                List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
                System.out.println("The total number of iframes are " + iframeElements.size());
                int size = iframeElements.size();
                //Thread.sleep(2000);
                driver.switchTo().frame(size - 1);
                clickElement(Approve_basket);
            }
            catch(Exception e)
            {
                driver.switchTo().frame(1);
                clickElement(Approve_basket);
            }
            takeScreenShot("Basket approval");
            Thread.sleep(2000);
            driver.switchTo().defaultContent();
            clickElement(Discount_cancel);
            Thread.sleep(3000);
            //driver.navigate().refresh();
            //Thread.sleep(9000);
            clickElement(Clauses_dropdown);

            try {
                WebDriverWait wait5 = new WebDriverWait(driver, 10);
                wait5.until(ExpectedConditions.elementToBeClickable(Sync_Opp));
                Thread.sleep(2000);
                if (Sync_Opp.isEnabled()) {
                    clickElement(Sync_Opp);
                }
            }
            catch (TimeoutException g) {
                //Thread.sleep(2000);
                clickElement(logout);
                clickElement(logoutclick);
                try {
                    inputbox.isDisplayed();
                } catch (Exception e) {
                    String url = configuration.getProperty("salesforceBaseUrl");
                    String userName = configuration.getProperty("username");
                    String passWord = configuration.getProperty("password");
                    driver.get(url);
                    sendKeys(username, userName);
                    sendKeys(password, passWord);
                    clickElement(login);
                }


                sendKeys(inputbox, "Finance Manager.E2E");
                clickElement(search);
                clickElement(finance_manager);
                clickElement(dropdown);
                clickElement(userdetail);
                clickElement(loginuser);
                Thread.sleep(2000);
                driver.get(Basket_Link);
                Thread.sleep(5000);
                clickElement(Discount_icon);
                Thread.sleep(8000);
                try {
                    List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
                    System.out.println("The total number of iframes are " + iframeElements.size());
                    int size = iframeElements.size();
                    //Thread.sleep(2000);
                    driver.switchTo().frame(size - 1);
                    clickElement(Approve_basket);
                } catch (Exception e) {
                    driver.switchTo().frame(1);
                    clickElement(Approve_basket);
                }
                takeScreenShot("Basket approval");
                Thread.sleep(2000);
                driver.switchTo().defaultContent();
                clickElement(Discount_cancel);
                Thread.sleep(3000);
                //driver.navigate().refresh();
                //Thread.sleep(9000);
                clickElement(Clauses_dropdown);
                //clickElement(Sync_Opp);
                WebDriverWait wait5 = new WebDriverWait(driver, 20);
                wait5.until(ExpectedConditions.elementToBeClickable(Sync_Opp));
                Thread.sleep(2000);
                if (Sync_Opp.isEnabled())
                {
                    clickElement(Sync_Opp);
                }
            }
        }


    }




    public void FPApproval(String Basket_Link) throws InterruptedException, TimeoutException, IOException {

        //Thread.sleep(5000);
        Thread.sleep(5000);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(Mobile_finance_dropdown));
        clickElement(Mobile_finance_dropdown);
        Thread.sleep(2000);

        try {
            WebDriverWait wait3 = new WebDriverWait(driver, 5);
            wait3.until(ExpectedConditions.visibilityOf(mobSearchBox));
            sendKeys(mobSearchBox, "Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBox.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }
        catch(Exception e) {
            sendKeys(mobSearchBoxOne, "Finance Manager.E2E");
            Thread.sleep(2000);
            mobSearchBoxOne.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }
        clickElement(Save_button);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        driver.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(3000);
        WebDriverWait wait4 = new WebDriverWait(driver, 30);
        wait4.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", Clauses_dropdown);
        //clickElement(Clauses_dropdown);
        Thread.sleep(3000);
        clickElement(Refresh_DOA);
        Thread.sleep(5000);
        wait4.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(5000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click()", Clauses_dropdown);
        Thread.sleep(5000);
        clickElement(Submit_approval);
        Thread.sleep(5000);

        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(5000);

        String approval_message = approval_text.getText();
        clickElement(Confirm_approval);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        clickElement(Cancel_Approval);
        driver.navigate().refresh();
        Thread.sleep(3000);

        System.out.println("Approval Message = " + approval_message);

        clickElement(Clauses_dropdown);
        try {
            WebDriverWait wait5 = new WebDriverWait(driver, 10);
            wait5.until(ExpectedConditions.elementToBeClickable(Sync_Opp));
            Thread.sleep(2000);
            if (Sync_Opp.isEnabled()) {
                clickElement(Sync_Opp);
            }
        }
        catch (TimeoutException f)
        {
            //Thread.sleep(2000);
            clickElement(logout);
            clickElement(logoutclick);
            try {
                inputbox.isDisplayed();
            } catch (Exception e) {
                String url = configuration.getProperty("salesforceBaseUrl");
                String userName = configuration.getProperty("username");
                String passWord = configuration.getProperty("password");
                driver.get(url);
                sendKeys(username, userName);
                sendKeys(password, passWord);
                clickElement(login);
            }


            sendKeys(inputbox, "Finance Manager.E2E");
            clickElement(search);
            clickElement(finance_manager);
            clickElement(dropdown);
            clickElement(userdetail);
            clickElement(loginuser);
            Thread.sleep(2000);
            driver.get(Basket_Link);
            Thread.sleep(5000);
            clickElement(Discount_icon);
            Thread.sleep(8000);
            try {
                List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
                System.out.println("The total number of iframes are " + iframeElements.size());
                int size = iframeElements.size();
                //Thread.sleep(2000);
                driver.switchTo().frame(size - 1);
                clickElement(Approve_basket);
            }
            catch(Exception e)
            {
                driver.switchTo().frame(1);
                clickElement(Approve_basket);
            }
            takeScreenShot("Basket approval");
            Thread.sleep(2000);
            driver.switchTo().defaultContent();
            clickElement(Discount_cancel);
            Thread.sleep(3000);
            //driver.navigate().refresh();
            //Thread.sleep(9000);
            clickElement(Clauses_dropdown);
                //clickElement(Sync_Opp);
                WebDriverWait wait5 = new WebDriverWait(driver, 10);
                wait5.until(ExpectedConditions.elementToBeClickable(Sync_Opp));
                Thread.sleep(2000);
                if (Sync_Opp.isEnabled())
                {
                    clickElement(Sync_Opp);
                }
            }
        }


        //Thread.sleep(9000);
        //clickElement(Clauses_dropdown);
        //clickElement(Sync_Opp);



    public void FPApprovalSIT() throws InterruptedException, TimeoutException, IOException {

        //Thread.sleep(5000);
        clickElement(Mobile_finance_dropdown);
        Thread.sleep(3000);
        sendKeys(mobSearchBox_SIT, "Finance Manager.E2E");
        Thread.sleep(3000);
        mobSearchBox_SIT.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        clickElement(Save_button);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        driver.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(3000);
        WebDriverWait wait3 = new WebDriverWait(driver, 30);
        wait3.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", Clauses_dropdown);
        //clickElement(Clauses_dropdown);
        Thread.sleep(3000);
        clickElement(Refresh_DOA);
        Thread.sleep(5000);

        wait3.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(5000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click()", Clauses_dropdown);
        //clickElement(Clauses_dropdown);
        Thread.sleep(5000);
        clickElement(Submit_approval);
        Thread.sleep(5000);


        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(5000);
        //driver.switchTo().frame(1);

        String approval_message = approval_text.getText();

        clickElement(Confirm_approval);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        clickElement(Cancel_Approval);
        driver.navigate().refresh();
        Thread.sleep(3000);
        System.out.println("Approval Message = " + approval_message);
    }

    public void DDPApproval(String Basket_Link) throws InterruptedException, TimeoutException, IOException {

        Thread.sleep(5000);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(Mobile_finance_dropdown));
        clickElement(Mobile_finance_dropdown);
        Thread.sleep(2000);
        //clickElement(Mobile_finance_dropdown);
        try {
            WebDriverWait wait3 = new WebDriverWait(driver, 3);
            wait3.until(ExpectedConditions.visibilityOf(mobSearchBox));
            sendKeys(mobSearchBox, "Finance Manager.E2E");
        }
        catch(Exception e)
        {
            sendKeys(mobSearchBoxOne, "Finance Manager.E2E");
        }
        Thread.sleep(2000);
        mobSearchBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        WebDriverWait wait4 = new WebDriverWait(driver, 20);
        wait4.until(ExpectedConditions.elementToBeClickable(Save_button));
        clickElement(Save_button);
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        //driver.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(3000);
        WebDriverWait wait3 = new WebDriverWait(driver, 30);
        wait3.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", Clauses_dropdown);
        //clickElement(Clauses_dropdown);
        Thread.sleep(3000);
        clickElement(Refresh_DOA);
        Thread.sleep(5000);
        wait3.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(5000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click()", Clauses_dropdown);
        Thread.sleep(5000);
        clickElement(Submit_approval);
        Thread.sleep(5000);

        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(5000);

        String approval_message = approval_text.getText();
        String approval_message_one="";
        try {
            if (approval_text_one.isDisplayed()) {
                approval_message_one = approval_text_one.getText();
            }
        }
        catch(Exception e)
        {

        }
        //clickElement(Confirm_approval);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        clickElement(Cancel_Approval);
        driver.navigate().refresh();
        Thread.sleep(3000);

        System.out.println("Approval Message = " + approval_message);
        System.out.println("Approval is required because = " + approval_message_one);

    }


    public void GPTApproval(String Basket_Link) throws InterruptedException, TimeoutException, IOException {

        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(Mobile_finance_dropdown));
        clickElement(Mobile_finance_dropdown);
        Thread.sleep(2000);
        //clickElement(Mobile_finance_dropdown);
        try {
            WebDriverWait wait3 = new WebDriverWait(driver, 3);
            wait3.until(ExpectedConditions.visibilityOf(mobSearchBox));
            sendKeys(mobSearchBox, "Finance Manager.E2E");
        }
        catch(Exception e)
        {
            sendKeys(mobSearchBoxOne, "Finance Manager.E2E");
        }
        Thread.sleep(2000);
        mobSearchBox.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebDriverWait wait4 = new WebDriverWait(driver, 20);
        wait4.until(ExpectedConditions.elementToBeClickable(Save_button));
        clickElement(Save_button);
        Thread.sleep(9000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(Call_mix_icon));
        //driver.navigate().refresh();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(3000);
        WebDriverWait wait3 = new WebDriverWait(driver, 30);
        wait3.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", Clauses_dropdown);
        //clickElement(Clauses_dropdown);
        Thread.sleep(3000);
        clickElement(Refresh_DOA);
        Thread.sleep(5000);
        wait3.until(ExpectedConditions.elementToBeClickable(Clauses_dropdown));
        Thread.sleep(5000);



        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click()", Clauses_dropdown);
        Thread.sleep(5000);
        clickElement(Submit_approval);
        Thread.sleep(5000);

        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        Thread.sleep(5000);

        String approval_message = approval_text.getText();
        String approval_message_one="";
        try {
            if (approval_text_one.isDisplayed()) {
                approval_message_one = approval_text_one.getText();
            }
        }
        catch(Exception e)
        {

        }
        clickElement(Confirm_approval);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        clickElement(Cancel_Approval);
        driver.navigate().refresh();
        Thread.sleep(3000);

        String Level_OfApprovalRequiredForMobilePricing = LevelOfApprovalRequiredForMobilePricing.getAttribute("innerHTML");
        //JavascriptExecutor j = (JavascriptExecutor) driver;
        //String s = (String) j.executeScript("LevelOfApprovalRequiredForMobilePricing.value");
        System.out.println("Level of Approval Required for Mobile Pricing is: " + Level_OfApprovalRequiredForMobilePricing);
        //System.out.print("Value entered in hidden field: " +s);

        System.out.println("Approval Message = " + approval_message);
        System.out.println("Approval is required because = " + approval_message_one);



        clickElement(Clauses_dropdown);
        try {
            WebDriverWait wait5 = new WebDriverWait(driver, 10);
            wait5.until(ExpectedConditions.elementToBeClickable(Sync_Opp));
            Thread.sleep(2000);
            if (Sync_Opp.isEnabled()) {
                clickElement(Sync_Opp);
            }
        } catch (TimeoutException f) {
            Thread.sleep(5000);
            clickElement(logout);
            clickElement(logoutclick);
            try {
                inputbox.isDisplayed();
            } catch (Exception e) {
                String url = configuration.getProperty("salesforceBaseUrl");
                String userName = configuration.getProperty("username");
                String passWord = configuration.getProperty("password");
                driver.get(url);
                sendKeys(username, userName);
                sendKeys(password, passWord);
                clickElement(login);
            }

            Thread.sleep(2000);
            sendKeys(inputbox, "Finance Manager.E2E");
            clickElement(search);
            clickElement(finance_manager);
            clickElement(dropdown);
            clickElement(userdetail);
            clickElement(loginuser);
            Thread.sleep(2000);
            driver.get(Basket_Link);
            //Thread.sleep(12000);
            clickElement(Discount_icon);
            Thread.sleep(10000);
            List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
            System.out.println("The total number of iframes are " + iframeElements.size());
            int size = iframeElements.size();
            Thread.sleep(5000);
            driver.switchTo().frame(frame1);
            Thread.sleep(7000);
            clickElement(Approve_basket);
            takeScreenShot("Basket approval");
            Thread.sleep(2000);
            driver.switchTo().defaultContent();
            clickElement(Discount_cancel);
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(10000);
            clickElement(Clauses_dropdown);
            clickElement(Sync_Opp);
        }


    }
}
