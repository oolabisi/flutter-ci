package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TransactionPage extends BaseTest {

    @AndroidFindBy(accessibility = "Home")
    public WebElement homeIconBtn;

    @AndroidFindBy(accessibility = "Send money")
    public WebElement sendMoneyBtn;

    @AndroidFindBy(accessibility = "Amount")
    public WebElement hideKey;

    @AndroidFindBy(accessibility = "Send to a new person")
    public WebElement newBeneficiary;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Choose transfer type\"]")
    public WebElement chooseBank;

    @AndroidFindBy(accessibility = "Transfer to other banks")
    public WebElement selectType;

    // android.view.View[contains(@text, 'Select bank')]
    @AndroidFindBy(xpath = "// android.view.View[contains(@text, 'Select bank')]")
    public WebElement bankDrop;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Search')]")
    public WebElement searchField;

    @AndroidFindBy(accessibility = "GT Bank")
    public WebElement bankName;

    @AndroidFindBy(accessibility = "Transfer to Renmoney MFB")
    public WebElement renmoney;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='6']")
    public WebElement amountField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    public WebElement amountFieldRen;

    @AndroidFindBy(xpath="//android.widget.EditText[@index='8']")
    public WebElement recipientAccount;

    @AndroidFindBy(xpath="//android.widget.EditText[@index='6']")
    public WebElement recipientAccountRen;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='11']")
    public WebElement narration;

    @AndroidFindBy(className = "android.widget.CheckBox")
    public WebElement saveBeneficiary;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Refer a friend to earn ₦500\n" +
            " Instantly earn cash in your account when they successfully get a loan. \"]/android.widget.ImageView")
    public WebElement popUP;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]")
    public WebElement bigPop;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View")
    public WebElement transfer;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View")
    public WebElement renSend;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='9']")
    public WebElement transactionPin;

    public WebElement savedBeneficiary;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Send money\n" +
            "Your saved beneficiaries\"]/android.widget.ImageView[2]")
    public WebElement searchBeneficiary;

    @AndroidFindBy(accessibility = "OJ\n" +
            "OGUNSANYA JOHN\n" +
            "Renmoney Microfinance Bank 3580021961")
    public WebElement searchedBeneficiary;

    @AndroidFindBy(accessibility = "Return to Home")
    public WebElement backToInvestmentPage;

    public TransactionPage homeIconBtn() {
        click(homeIconBtn, "Homepage");
        return new TransactionPage();
    }
    public TransactionPage sendMoneyBtn() {
        click(sendMoneyBtn, "send money");
        return new TransactionPage();
    }

    public TransactionPage hideKey() {
        click(hideKey);
        return new TransactionPage();
    }

    public TransactionPage newBeneficiary() {
        click(newBeneficiary);
        return new TransactionPage();
    }

    public TransactionPage chooseBank() {
        click(chooseBank);
        return new TransactionPage();
    }

    public TransactionPage selectType() {
        click(selectType);
        return new TransactionPage();
    }

    public TransactionPage bankDrop() {
        click(bankDrop);
        return new TransactionPage();
    }

    public TransactionPage searchField() {
        click(searchField);
        return new TransactionPage();
    }

    public TransactionPage bankName() {
        click(bankName);
        return new TransactionPage();
    }

    public TransactionPage renmoney() {
        click(renmoney);
        return new TransactionPage();
    }

    public TransactionPage amountField(String amount) {
        click(amountField);
        sendKeys(amountFieldRen, amount);
        return this;
    }

    public TransactionPage amountFieldRen(String amount) {
        click(amountFieldRen);
        sendKeys(amountFieldRen, amount);
        return this;
    }

    public TransactionPage recipientAccount(String recipient) {
        click(recipientAccount);
        sendKeys(recipientAccount,recipient);
        return this;
    }

    public TransactionPage transfer() {
        click(transfer);
        return new TransactionPage();
    }

    public TransactionPage transactionPin(String pin) {
        click(transactionPin);
        sendKeys(transactionPin, pin);
        return this;
    }

    public TransactionPage recipientAccountRen(String recipient) {
        click(recipientAccountRen);
        sendKeys(recipientAccount, recipient);
        return this;
    }

    public TransactionPage narration() {
        click(narration);
        return new TransactionPage();
    }

    public TransactionPage saveBeneficiary() {
        click(saveBeneficiary);
        return new TransactionPage();
    }

    public TransactionPage popUP() {
        click(popUP);
        return new TransactionPage();
    }

    public TransactionPage renSend() {
        click(renSend);
        return new TransactionPage();
    }

    public TransactionPage backToInvestmentPage() {
        click(backToInvestmentPage);
        return new TransactionPage();
    }

}
