package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoanPage extends BaseTest {

    @AndroidFindBy(accessibility = "Loan")
    public WebElement loanIconBtn;

    @AndroidFindBy(accessibility = "Apply now")
    public WebElement apply;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@index='17']")
    public WebElement loanCheckbox;

    @AndroidFindBy(accessibility = "Continue")
    public WebElement next;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
    public WebElement accessLocation;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement allowSMS;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='3']")
    public WebElement loanAmount;

    @AndroidFindBy(accessibility = "Select loan purpose")
    public WebElement loanPurpose;

    @AndroidFindBy(accessibility = "Side Hustle")
    public WebElement loanPurposeChosen;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Apply now\"])[1]")
    public WebElement personalApply;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View")
    public WebElement nextPage;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='2']")
    public WebElement homeAddress;

    @AndroidFindBy(accessibility = "Single")
    public WebElement maritalStatus;

    @AndroidFindBy(accessibility = "Married")
    public WebElement chosenStatus;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='6']")
    public WebElement state;

    @AndroidFindBy(accessibility = "Sokoto")
    public WebElement chosenState;

    @AndroidFindBy(accessibility = "Select LGA")
    public WebElement lga;

    @AndroidFindBy(accessibility = "Wamako")
    public WebElement chosenLGA;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='10']")
    public WebElement educationStatus;

    @AndroidFindBy(accessibility = "Graduate")
    public WebElement chosenEducation;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='6']")
    public WebElement nok;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='8']")
    public WebElement nokRelationship;

    @AndroidFindBy(accessibility = "Sibling")
    public WebElement chosenNOK;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='10']")
    public WebElement nokPhoneNumber;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[9]/android.view.View")
    public WebElement nokNext;

    @AndroidFindBy(accessibility = "Self-Employed")
    public WebElement employmentStatus;

    @AndroidFindBy(accessibility = "Employed\n" +
            "I earn a salary every month")
    public WebElement chosenEmployment;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    public WebElement companyName;

    @AndroidFindBy(xpath = "//android.view.View[@index='6']")
    public WebElement dateJoined;

    @AndroidFindBy(accessibility = "OK")
    public WebElement dateOK;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='8']")
    public WebElement sector;

    @AndroidFindBy(accessibility = "Financial Services")
    public WebElement chosenSector;

    @AndroidFindBy(accessibility = "Select Industry")
    public WebElement industry;

    @AndroidFindBy(accessibility = "Asset management")
    public WebElement chosenIndustry;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='4']")
    public WebElement monthlySalary;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='6']")
    public WebElement companyAddress;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='8']")
    public WebElement companyState;

    @AndroidFindBy(accessibility = "Bayelsa")
    public WebElement chosenCompanyState;

    @AndroidFindBy(accessibility = "Select LGA")
    public WebElement companyLGA;

    @AndroidFindBy(accessibility = "Southern Ijaw")
    public WebElement chosenCompanyLGA;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[8]/android.view.View")
    public WebElement lgaNext;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text, 'Select bank')]")
    public WebElement bank;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Search')]")
    public WebElement searchBank;

    @AndroidFindBy(accessibility = "GT Bank")
    public WebElement chosenBank;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Account number')]")
    public WebElement accountNumber;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Phone number')]")
    public WebElement linkedPhone;

    @AndroidFindBy(accessibility = "Ok")
    public WebElement ok;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[11]/android.view.View")
    public WebElement detailsNext;

    @AndroidFindBy(accessibility = "Submit")
    public WebElement submit;

    @AndroidFindBy(xpath = "android.widget.Button[contains(@text,'Phone number')]")
    public WebElement monoContinue;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]/android.widget.Button[1]")
    public WebElement choseGtB;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[6]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.widget.Button")
    public WebElement mobileBanking;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View[3]/android.view.View[1]/android.widget.EditText")
    public WebElement enterAccount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View[3]/android.view.View[2]/android.widget.EditText")
    public WebElement enterPin;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View[3]/android.widget.Button")
    public WebElement mobileLogIn;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Apply now\"])[2]")
    public WebElement businessApply;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"How did you hear about us?\"]")
    public WebElement heardRenMoney;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Social media\"]/android.widget.CheckBox")
    public WebElement socialMedia;
    @AndroidFindBy(accessibility = "Confirm")
    public WebElement confirmBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView")
    public WebElement backBtn;

    /*  Loan Offer   */

    @AndroidFindBy(accessibility = " \uD83C\uDF89 Hey, your loan offers are ready!")
    public WebElement loanOfferBtn;

    @AndroidFindBy(accessibility = "Select amount")
    public WebElement offerAmount;

    @AndroidFindBy(xpath = "//android.view.View[@index='0']")
    public WebElement offerSelected;

    @AndroidFindBy(accessibility = "Select tenure")
    public WebElement offeredTenure;

    @AndroidFindBy(xpath = "//android.view.View[@index='0']")
    public WebElement chosenOffer;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[19]/android.view.View")
    public WebElement offerAccepted;


    public LoanPage loanIconBtn() {
        click(loanIconBtn, "Loan button");
        return new LoanPage();
    }

    public LoanPage apply() {
        click(apply, "click Loan");
        return new LoanPage();
    }

    public LoanPage loanCheckbox() {
        click(loanCheckbox, "check button");
        return new LoanPage();
    }

    public LoanPage next() {
        click(next, "Loan button");
        return new LoanPage();
    }

    public LoanPage accessLocation() {
        click(accessLocation, "location check");
        return new LoanPage();
    }

    public LoanPage allowSMS() {
        click(allowSMS, "Allow sms");
        return new LoanPage();
    }

    public LoanPage loanAmount() {
        click(loanAmount, "loan request");
        return new LoanPage();
    }

    public LoanPage loanPurpose() {
        click(loanPurpose, "Loan purpose");
        return new LoanPage();
    }

    public LoanPage loanPurposeChosen() {
        click(loanPurposeChosen, "purpose chosen");
        return new LoanPage();
    }

    public LoanPage personalApply() {
        click(personalApply, "Loan button");
        return new LoanPage();
    }

    public LoanPage nextPage() {
        click(nextPage, "Loan button");
        return new LoanPage();
    }

    public LoanPage homeAddress() {
        click(homeAddress, "Loan button");
        return new LoanPage();
    }

    public LoanPage maritalStatus() {
        click(maritalStatus, "Loan button");
        return new LoanPage();
    }

    public LoanPage chosenStatus() {
        click(chosenStatus, "Loan button");
        return new LoanPage();
    }

    public LoanPage state() {
        click(state, "what state");
        return new LoanPage();
    }

    public LoanPage chosenState() {
        click(chosenState, "chosen state");
        return new LoanPage();
    }
    public LoanPage lga() {
        click(lga, "chose LGA");
        return new LoanPage();
    }

    public LoanPage chosenLGA() {
        click(chosenLGA, "Local govt.");
        return new LoanPage();
    }

    public LoanPage educationStatus() {
        click(educationStatus, "education status");
        return new LoanPage();
    }

    public LoanPage chosenEducation() {
        click(chosenEducation, "chosen education");
        return new LoanPage();
    }

    public LoanPage nok() {
        click(nok, "next-of-kin");
        return new LoanPage();
    }

    public LoanPage nokRelationship() {
        click(nokRelationship, "n-o-k relationship");
        return new LoanPage();
    }

    public LoanPage chosenNOK() {
        click(chosenNOK, "chosen n-o-k");
        return new LoanPage();
    }

    public LoanPage nokPhoneNumber() {
        click(nokPhoneNumber, "Loan button");
        return new LoanPage();
    }

    public LoanPage nokNext() {
        click(nokNext, "Loan button");
        return new LoanPage();
    }

    public LoanPage employmentStatus() {
        click(employmentStatus, "Loan button");
        return new LoanPage();
    }

    public LoanPage chosenEmployment() {
        click(chosenEmployment, "Loan button");
        return new LoanPage();
    }

    public LoanPage companyName() {
        click(companyName, "Loan button");
        return new LoanPage();
    }

    public LoanPage dateJoined() {
        click(dateJoined, "Loan button");
        return new LoanPage();
    }

    public LoanPage dateOK() {
        click(dateOK, "Loan button");
        return new LoanPage();
    }

    public LoanPage sector() {
        click(sector, "Loan button");
        return new LoanPage();
    }

    public LoanPage chosenSector() {
        click(chosenSector, "Loan button");
        return new LoanPage();
    }

    public LoanPage industry() {
        click(industry, "Loan button");
        return new LoanPage();
    }

    public LoanPage chosenIndustry() {
        click(chosenIndustry, "Loan button");
        return new LoanPage();
    }

    public LoanPage monthlySalary() {
        click(monthlySalary, "Loan button");
        return new LoanPage();
    }

    public LoanPage companyAddress() {
        click(companyAddress, "Loan button");
        return new LoanPage();
    }

    public LoanPage companyState() {
        click(companyState, "Loan button");
        return new LoanPage();
    }

    public LoanPage chosenCompanyState() {
        click(chosenCompanyState, "Loan button");
        return new LoanPage();
    }

    public LoanPage companyLGA() {
        click(companyLGA, "Loan button");
        return new LoanPage();
    }

    public LoanPage chosenCompanyLGA() {
        click(chosenCompanyLGA, "Loan button");
        return new LoanPage();
    }

    public LoanPage lgaNext() {
        click(lgaNext, "Loan button");
        return new LoanPage();
    }

    public LoanPage bank() {
        click(bank, "Loan button");
        return new LoanPage();
    }

    public LoanPage searchBank() {
        click(searchBank, "Loan button");
        return new LoanPage();
    }

    public LoanPage chosenBank() {
        click(chosenBank, "Loan button");
        return new LoanPage();
    }

    public LoanPage accountNumber() {
        click(accountNumber, "Loan button");
        return new LoanPage();
    }

    public LoanPage linkedPhone() {
        click(linkedPhone, "Loan button");
        return new LoanPage();
    }

    public LoanPage ok() {
        click(ok, "Loan button");
        return new LoanPage();
    }

    public LoanPage detailsNext() {
        click(detailsNext, "Loan button");
        return new LoanPage();
    }

    public LoanPage submit() {
        click(submit, "Loan button");
        return new LoanPage();
    }

    public LoanPage monoContinue() {
        click(monoContinue, "Loan button");
        return new LoanPage();
    }

    public LoanPage choseGtB() {
        click(choseGtB, "Loan button");
        return new LoanPage();
    }

    public LoanPage mobileBanking() {
        click(mobileBanking, "Loan button");
        return new LoanPage();
    }

    public LoanPage enterAccount() {
        click(enterAccount, "Loan button");
        return new LoanPage();
    }

    public LoanPage enterPin() {
        click(enterPin, "Loan button");
        return new LoanPage();
    }

    public LoanPage mobileLogIn() {
        click(mobileLogIn, "Loan button");
        return new LoanPage();
    }

    public LoanPage businessApply() {
        click(businessApply, "Loan button");
        return new LoanPage();
    }

    public LoanPage heardRenMoney() {
        click(heardRenMoney, "Loan button");
        return new LoanPage();
    }

    public LoanPage socialMedia() {
        click(socialMedia, "Loan button");
        return new LoanPage();
    }

    public LoanPage confirmBtn() {
        click(confirmBtn, "Loan button");
        return new LoanPage();
    }

    public LoanPage backBtn() {
        click(backBtn, "Loan button");
        return new LoanPage();
    }

    public LoanPage loanOfferBtn() {
        click(loanOfferBtn, "Loan button");
        return new LoanPage();
    }

    public LoanPage offerAmount() {
        click(offerAmount, "Loan button");
        return new LoanPage();
    }

    public LoanPage offerSelected() {
        click(offerSelected, "Loan button");
        return new LoanPage();
    }

    public LoanPage offeredTenure() {
        click(offeredTenure, "Loan button");
        return new LoanPage();
    }

    public LoanPage chosenOffer() {
        click(chosenOffer, "Loan button");
        return new LoanPage();
    }

    public LoanPage offerAccepted() {
        click(offerAccepted, "Loan button");
        return new LoanPage();
    }

}
