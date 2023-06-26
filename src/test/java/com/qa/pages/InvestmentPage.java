package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class InvestmentPage extends BaseTest {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Save\"]")
    public WebElement saveIconBtn;

    @AndroidFindBy(accessibility = " Start New ")
    public WebElement newPlan;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    public WebElement BigPop;

    @AndroidFindBy(accessibility = "Smart Goal")
    public WebElement smartGoal;

    @AndroidFindBy(accessibility = "Renflex Savings")
    public WebElement renflex;

    @AndroidFindBy(accessibility = "RenVault")
    public WebElement renvault;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='2']")
    public WebElement planName;

    @AndroidFindBy(accessibility = "Amount")
    public WebElement hideKeyboard;

    @AndroidFindBy(accessibility = "End date")
    public WebElement scrollRenvault;

    @AndroidFindBy(accessibility = "Frequency")
    public WebElement scrollSmart;

    @AndroidFindBy(accessibility = "Enter Plan Name")
    public WebElement hideKeyboard2;

    @AndroidFindBy(accessibility = "Minimum: ₦100.00")
    public WebElement hideKeyboard3;

    @AndroidFindBy(accessibility = "Minimum: ₦1,000.00")
    public WebElement hideKeyboard4;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View")
    public WebElement next;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='7']")
    public WebElement amount;

    @AndroidFindBy(accessibility = "How long do you want to invest for?")
    public WebElement investmentDurationR;

    @AndroidFindBy(accessibility = "How long do you want to save for?")
    public WebElement investmentDuration;

    @AndroidFindBy(accessibility = "1 month(s)  (12.0%)")
    public WebElement chosenDuration;

    @AndroidFindBy(accessibility = "Confirm")
    public WebElement confirmBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox")
    public WebElement checkBox;

    @AndroidFindBy(accessibility = "Continue")
    public WebElement continueBtn;

    @AndroidFindBy(accessibility = "Return to Home")
    public WebElement backToInvestmentPage;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"History\"]")
    public WebElement history;

    @AndroidFindBy(accessibility = "  Withdraw ")
    public WebElement withdrawal;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"  Withdraw \"])[1]")
    public WebElement smartWithdrawal;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView")
    public WebElement cancelBtn;

    @AndroidFindBy(accessibility = "1 month")
    public WebElement chosenTenure;

    @AndroidFindBy(accessibility = "How often do you want to save?")
    public WebElement smartTenure;

    @AndroidFindBy(accessibility = "Daily")
    public WebElement smartChose;

    @AndroidFindBy(accessibility = " Add ")
    public WebElement addRenFlex;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='7']")
    public WebElement renFlexAmount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View")
    public WebElement renFlexNext;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"  Withdraw \"])[2]")
    public WebElement withdrawRenFlex;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Enter amount')]")
    public WebElement renFlexWithdrawAmount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View")
    public WebElement withdrawalContinue;



public InvestmentPage newPlan() {
    click(newPlan);
    return new InvestmentPage();
}

public InvestmentPage smartGoal() {
    click(smartGoal);
    return new InvestmentPage();
}

public InvestmentPage  popUP() {
    click(BigPop, "Ad");
    return new InvestmentPage();
}

public InvestmentPage renflex() {
    click(renflex);
    return new InvestmentPage();
}

public InvestmentPage planName(String name) {
    click(planName);
    sendKeys(planName, name);
    return this;
}

public InvestmentPage renvault() {
    click(renvault);
    return new InvestmentPage();
}

public InvestmentPage hideKeyboard() {
    click(hideKeyboard);
    return new InvestmentPage();
}

public InvestmentPage scrollR() {
    click(scrollRenvault);
    return new InvestmentPage();
}

public InvestmentPage scrollDown() {
    scrollToRenvault();
    return this;
}

public InvestmentPage scrollS() {
    click(scrollSmart);
    return new InvestmentPage();
}

public InvestmentPage scrolLdown() {
    scrollToSmart();
    return this;
}


    public InvestmentPage hideKeyboard2() {
    click(hideKeyboard2);
    return new InvestmentPage();
}

public InvestmentPage hideKeyboard3() {
    click(hideKeyboard3);
    return new InvestmentPage();
}

public InvestmentPage next() {
    click(next);
    return new InvestmentPage();
}

public InvestmentPage amount(String amount) {
    click(this.amount);
    sendKeys(this.amount, amount);
    return this;
}

public InvestmentPage investmentDurationR() {
    click(investmentDurationR);
    return new InvestmentPage();
}

public InvestmentPage investmentDuration() {
    click(investmentDuration);
    return new InvestmentPage();
}

public InvestmentPage chosenDuration() {
    click(chosenDuration);
    return new InvestmentPage();
}

public InvestmentPage confirmBtn() {
    click(confirmBtn);
    return new InvestmentPage();
}

public InvestmentPage checkBox() {
    click(checkBox);
    return new InvestmentPage();
}

public InvestmentPage continueBtn() {
    click(continueBtn);
    return new InvestmentPage();
}

public InvestmentPage backToInvestmentPage() {
    click(backToInvestmentPage);
    return new InvestmentPage();
}

public InvestmentPage history() {
    click(history);
   return new InvestmentPage();
}

public InvestmentPage withdrawal() {
    click(withdrawal);
    return new InvestmentPage();
}

public InvestmentPage smartWithdrawal() {
    click(smartWithdrawal);
    return new InvestmentPage();
}

public InvestmentPage cancelBtn() {
    click(cancelBtn);
    return new InvestmentPage();
}

public InvestmentPage smartTenure() {
    click(smartTenure);
    return new InvestmentPage();
}

public InvestmentPage chosenTenure() {
    click(chosenTenure);
    return new InvestmentPage();
}

public InvestmentPage smartDuration() {
    click(smartTenure);
    return new InvestmentPage();
}

public InvestmentPage smartChose() {
    click(smartChose);
    return new InvestmentPage();
}

public InvestmentPage addRenFlex() {
    click(addRenFlex);
    return new InvestmentPage();
}

public InvestmentPage renFlexAmount() {
    click(renFlexAmount);
    return this;
}

public InvestmentPage renFlexNext() {
    click(renFlexNext);
    return new InvestmentPage();
}

public InvestmentPage withdrawRenFlex() {
    click(withdrawRenFlex);
    return new InvestmentPage();
}

public InvestmentPage renFlexWithdrawAmount() {
    click(renFlexWithdrawAmount);
    return new InvestmentPage();
}

public InvestmentPage withdrawalContinue() {
    click(withdrawalContinue);
    return new InvestmentPage();
}

public InvestmentPage saveIconBtn() {
    click(saveIconBtn);
    return new InvestmentPage();
}

public InvestmentPage hideKeyboard4() {
    click(hideKeyboard4);
    return new InvestmentPage();
    }

}
