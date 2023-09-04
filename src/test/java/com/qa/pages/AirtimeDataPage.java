package com.qa.pages;

import com.beust.ah.A;
import com.qa.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AirtimeDataPage extends BaseTest {

    @AndroidFindBy(accessibility = "Buy Airtime")
    public WebElement buyAirtimeTab;

    @AndroidFindBy(accessibility = "Top-up your line for\n" +
            "calls and SMS\n" +
            "Buy airtime")
    public WebElement airtimeTab;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    public WebElement bigPop;

    @AndroidFindBy(accessibility = "Buy data to stay\n" +
            "connected\n" +
            "Buy data")
    public WebElement dataTab;

    @AndroidFindBy(accessibility = "Please select provider")
    public WebElement airtimeProvideTab;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Search')]")
    public WebElement searchForAirtime;

    @AndroidFindBy(accessibility = "Airtel Nigeria Airtime")
    public WebElement airtimeNetwork;

    @AndroidFindBy(accessibility = "MTN Nigeria Data")
    public WebElement dataNetwork;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")
    public WebElement phoneNumberField;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")
    public WebElement amountField;

    @AndroidFindBy(accessibility = "₦500")
    public WebElement amountOne;

    @AndroidFindBy(accessibility = "₦1,000")
    public WebElement amountTwo;

    @AndroidFindBy(accessibility = "₦2,000")
    public WebElement amountThree;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View")
    public WebElement next;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='3']")
    public WebElement transactionPin;

    @AndroidFindBy(accessibility = "Return to Home")
    public WebElement returnToDashboard;

    @AndroidFindBy(accessibility = "Select Data Options")
    public WebElement dataOption;

    @AndroidFindBy(accessibility = "7GB for Weekly - Weekly - ₦1,800.00")
    public WebElement dataBundle;

    public AirtimeDataPage buyAirtimeTab() {
        click(buyAirtimeTab);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage airtimeTab() {
        click(airtimeTab);
        return new AirtimeDataPage();
    }

    public DashboardPage  bigPop() {
        click(bigPop, "Ad");
        return new DashboardPage();
    }

    public AirtimeDataPage dataTab() {
        click(dataTab);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage airtimeProvideTab() {
        click(airtimeProvideTab);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage searchForAirtime() {
        click(searchForAirtime);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage airtimeNetwork() {
        click(airtimeNetwork);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage dataNetwork() {
        click(dataNetwork);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage phoneNumberField(String phone) {
        click(phoneNumberField);
        sendKeys(phoneNumberField, phone);
        return this;
    }

    public AirtimeDataPage amountField(String amount) {
        click(amountField);
        sendKeys(amountField, amount);
        return this;
    }

    public AirtimeDataPage amountOne() {
        click(amountOne);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage amountTwo() {
        click(amountTwo);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage amountThree() {
        click(amountThree);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage next() {
        click(next);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage transactionPin(String pin) {
        click(transactionPin);
        sendKeys(transactionPin, pin);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage returnToDashboard() {
        click(returnToDashboard);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage dataOption() {
        click(dataOption);
        return new AirtimeDataPage();
    }

    public AirtimeDataPage dataBundle() {
        click(dataBundle);
        return new AirtimeDataPage();
    }

}
