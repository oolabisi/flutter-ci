package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BaseTest {

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Home")
    public WebElement homeIconBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    @iOSXCUITFindBy(accessibility = "")
    public WebElement modalPopUp;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView")
    public WebElement backBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Navigate up")
    public WebElement navigateUp;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='1']")
    public WebElement chatRenmoney;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
    public WebElement notification;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Invest and Earn\n" +
            "Invest for the future, earn up to 18% interest p.a.")
    public WebElement investAndEarnBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "History")
    public WebElement historyBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Refer a friend to earn N500")
    public WebElement referAFriend;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Add money")
    public WebElement addMoneyBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Send money")
    public WebElement sendMoneyBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Buy Airtime")
    public WebElement buyAirtimeBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Pay Bills")
    public WebElement payBillsBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Save\"]")
    public WebElement saveBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    public WebElement popUP;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    public WebElement BigPop;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Apply")
    public WebElement loanApplyBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Airtime, Data & Bills\n" +
            "Pay bills, buy airtime - whenever, wherever")
    public WebElement purchaseAirtimeBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Debit Cards\n" +
            "Pay, spend, shop anywhere")
    public WebElement debitCardBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Save\"]")
    public WebElement saveIconBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Loan")
    public WebElement loanIconBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Pay")
    public WebElement payIconBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "More")
    public WebElement moreIconBtn;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Pay your bills and\n" +
            "stay ahead\n" +
            "Pay bills")
    public WebElement payBillOption;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Cable TV\n" +
            "Pay your DSTV, GoTV & other cable subscriptions")
    public WebElement cableTab;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Choose provider")
    public WebElement chooseAgent;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "GOTv (MultiChoice) Subscr")
    public WebElement chosenAgent;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Smart Card Number')]")
    public WebElement cardNumber;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Select cable")
    public WebElement selectCable;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "GOtv Smallie - monthly")
    public WebElement chosenCable;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "Select plan")
    public WebElement planAmount;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(accessibility = "2  months at ₦2,200")
    public WebElement chosenAmount;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[7]/android.view.View")
    public WebElement next;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[8]/android.view.View")
    public WebElement billNext;


    public DashboardPage modalPopUp() {
        click(modalPopUp, "close modal");
        return new DashboardPage();
    }

public DashboardPage chatRenmoney() {
    click(chatRenmoney, "chat customer");
    return new DashboardPage();
}

public DashboardPage backButton() {
    click(backBtn, "Go back");
    return new DashboardPage();
}

public DashboardPage addMoneyBtn() {
    click(addMoneyBtn, "Go back");
    return new DashboardPage();
}

public DashboardPage navigateUp() {
    click(navigateUp, "navigate back");
    return new DashboardPage();
}

public DashboardPage homeIconBtn() {
    click(homeIconBtn, "home page");
    return new DashboardPage();
}

public DashboardPage historyBtn() {
    click(historyBtn, "show history");
    return new DashboardPage();
    }
    public DashboardPage notification() {
        click(notification, "view notifications");
        return new DashboardPage();
    }

    public DashboardPage investAndEarnBtn() {
         click(investAndEarnBtn, "view savings");
        return new DashboardPage();
    }

    public DashboardPage referAFriend() {
        click(referAFriend, "refer friends");
        return new DashboardPage();
    }

    public DashboardPage sendMoneyBtn() {
        click(sendMoneyBtn, "send money");
        return new DashboardPage();
    }

    public DashboardPage buyAirtimeBtn() {
        click(buyAirtimeBtn, "buy airtime and data");
        return new DashboardPage();
    }

    public DashboardPage payBillsBtn() {
        click(payBillsBtn, "pay bills");
        return new DashboardPage();
    }

    public DashboardPage saveBtn() {
        click(saveBtn, "Saving plan");
        return new DashboardPage();
    }

    public DashboardPage  popUP() {
        click(BigPop, "Ad");
        return new DashboardPage();
    }

    public DashboardPage loanApplyBtn() {
        click(loanApplyBtn, "loan");
        return new DashboardPage();
    }

    public DashboardPage purchaseAirtimeBtn() {
        click(purchaseAirtimeBtn, "airtime/data tab");
        return new DashboardPage();
    }

    public DashboardPage debitCardBtn() {
        click(debitCardBtn, "debitCard tab");
        return new DashboardPage();
    }

    public DashboardPage saveIconBtn() {
        click(saveIconBtn, "savings plan tab");
        return new DashboardPage();
    }

    public DashboardPage loanIconBtn() {
        click(loanIconBtn, "loan tab");
        return new DashboardPage();
    }

    public DashboardPage payIconBtn() {
        click(payIconBtn, "pay tab");
        return new DashboardPage();
    }

    public DashboardPage moreIconBtn() {
        click(moreIconBtn, "more tab");
        return new DashboardPage();
    }

    public DashboardPage payBillOption() {
        click(payBillOption, "pay bills tab");
        return new DashboardPage();
    }

    public DashboardPage cableTab() {
        click(cableTab, "cable tab");
        return new DashboardPage();
    }

    public DashboardPage chooseAgent() {
        click(chooseAgent, "choose agent");
        return new DashboardPage();
    }

    public DashboardPage chosenAgent() {
        click(chosenAgent, "chosen agent");
        return new DashboardPage();
    }

    public DashboardPage cardNumber() {
        click(cardNumber, "card number");
        return new DashboardPage();
    }

    public DashboardPage selectCable() {
        click(selectCable, "select cable");
        return new DashboardPage();
    }

    public DashboardPage chosenCable() {
        click(chosenCable, "chosen cable");
        return new DashboardPage();
    }

    public DashboardPage planAmount() {
        click(planAmount, "plan amount");
        return new DashboardPage();
    }

    public DashboardPage chosenAmount() {
        click(chosenAmount, "chosen amount");
        return new DashboardPage();
    }

    public DashboardPage next() {
        click(next, "next");
        return new DashboardPage();
    }

    public DashboardPage billNext() {
        click(billNext, "bill-next");
        return new DashboardPage();
    }

}
