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

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='3']")
    public WebElement planName;

    @AndroidFindBy(accessibility = "December Turnup")
    public WebElement suggestedName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View")
    public WebElement nexT;

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

    @AndroidFindBy(accessibility = "Start date")
    public WebElement startDate;

    @AndroidFindBy(accessibility = "OK")
    public WebElement dateOk;

    @AndroidFindBy(accessibility = "Minimum: ₦1,000.00")
    public WebElement hideKeyboard4;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View")
    public WebElement next;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='7']")
    public WebElement amount;

    @AndroidFindBy(accessibility = "How long do you want to invest for?")
    public WebElement investmentDurationR;

    @AndroidFindBy(accessibility = "How long do you want to save for?")
    public WebElement investmentDuration;

    @AndroidFindBy(accessibility = "1 month")
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
    click(newPlan,"Start a plan");
    return new InvestmentPage();
}

public InvestmentPage smartGoal() {
    click(smartGoal,"Smart Goal option");
    return new InvestmentPage();
}

public InvestmentPage popUP() {
    click(BigPop, "Ad");
    return new InvestmentPage();
}

public InvestmentPage renflex() {
    click(renflex,"Renflex option");
    return new InvestmentPage();
}

public InvestmentPage planName(String name) {
    click(planName,"Give your plan a name");
    sendKeys(planName, name);
    clear(planName);
    return this;
}

public InvestmentPage suggestedName() {
    click(suggestedName, "suggestedName");
    return new InvestmentPage();
}

public InvestmentPage renvault() {
    click(renvault,"Renvault option");
    return new InvestmentPage();
}

public InvestmentPage hideKeyboard() {
    click(hideKeyboard,"Hide keypad");
    return new InvestmentPage();
}

public InvestmentPage scrollR() {
    click(scrollRenvault,"Scroll down please");
    return new InvestmentPage();
}

    public InvestmentPage startDate() {
        click(startDate,"Start date");
        return new InvestmentPage();
    }

    public InvestmentPage dateOk() {
        click(dateOk,"Confirm date");
        return new InvestmentPage();
    }

public InvestmentPage scrollDown() {
    scrollToRenvault();
    return this;
}

public InvestmentPage scrollS() {
    click(scrollSmart,"Kindly scroll down");
    return new InvestmentPage();
}

public InvestmentPage scrolLdown() {
    scrollToSmart();
    return this;
}


    public InvestmentPage hideKeyboard2() {
    click(hideKeyboard2,"Hide keypad");
    return new InvestmentPage();
}

public InvestmentPage hideKeyboard3() {
    click(hideKeyboard3,"Hide keypad");
    return new InvestmentPage();
}

    public InvestmentPage nexT() {
        click(nexT,"Next page please");
        return new InvestmentPage();
    }

public InvestmentPage next() {
    click(next,"Next page please");
    return new InvestmentPage();
}

public InvestmentPage amount(String amount) {
    click(this.amount,"Amount to save");
    sendKeys(this.amount, amount);
    return this;
}

public InvestmentPage investmentDurationR() {
    click(investmentDurationR,"Duration to save");
    return new InvestmentPage();
}

public InvestmentPage investmentDuration() {
    click(investmentDuration,"Duration to save");
    return new InvestmentPage();
}

public InvestmentPage chosenDuration() {
    click(chosenDuration,"Set duration");
    return new InvestmentPage();
}

public InvestmentPage confirmBtn() {
    click(confirmBtn,"Confirm to agree");
    return new InvestmentPage();
}

public InvestmentPage checkBox() {
    click(checkBox,"Checkbox ticked");
    return new InvestmentPage();
}

public InvestmentPage continueBtn() {
    click(continueBtn,"Continue to save");
    return new InvestmentPage();
}

public InvestmentPage backToInvestmentPage() {
    click(backToInvestmentPage,"Save landing!");
    return new InvestmentPage();
}

public InvestmentPage history() {
    click(history,"History to deeds");
   return new InvestmentPage();
}

public InvestmentPage withdrawal() {
    click(withdrawal,"Withdraw my money");
    return new InvestmentPage();
}

public InvestmentPage smartWithdrawal() {
    click(smartWithdrawal,"Withdraw my money");
    return new InvestmentPage();
}

public InvestmentPage cancelBtn() {
    click(cancelBtn,"Cancel cos I can");
    return new InvestmentPage();
}

public InvestmentPage smartTenure() {
    click(smartTenure,"Tenure options");
    return new InvestmentPage();
}

public InvestmentPage chosenTenure() {
    click(chosenTenure,"Tenure I chose");
    return new InvestmentPage();
}

public InvestmentPage smartDuration() {
    click(smartTenure,"Duration option");
    return new InvestmentPage();
}

public InvestmentPage smartChose() {
    click(smartChose,"Option I chose");
    return new InvestmentPage();
}

public InvestmentPage addRenFlex() {
    click(addRenFlex,"Renflex anyone?");
    return new InvestmentPage();
}

public InvestmentPage renFlexAmount() {
    click(renFlexAmount,"Name your price!");
    return this;
}

public InvestmentPage renFlexNext() {
    click(renFlexNext,"Next please");
    return new InvestmentPage();
}

public InvestmentPage withdrawRenFlex() {
    click(withdrawRenFlex,"Gimme ma moneeeeeey");
    return new InvestmentPage();
}

public InvestmentPage renFlexWithdrawAmount() {
    click(renFlexWithdrawAmount,"All or nothing");
    return new InvestmentPage();
}

public InvestmentPage withdrawalContinue() {
    click(withdrawalContinue,"Moving on");
    return new InvestmentPage();
}

public InvestmentPage saveIconBtn() {
    click(saveIconBtn,"Saving aboard");
    return new InvestmentPage();
}

public InvestmentPage hideKeyboard4() {
    click(hideKeyboard4,"Hide keypad");
    return new InvestmentPage();
    }

}
