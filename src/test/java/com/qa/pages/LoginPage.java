package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;


public class LoginPage extends BaseTest {

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
	private WebElement errTxt;


	/*    RENMONEY  */
	@AndroidFindBy(accessibility = "Get Started")
	@iOSXCUITFindBy(accessibility = "Get Started")
	public WebElement getStarted;

	@AndroidFindBy(accessibility = "Get started")
	@iOSXCUITFindBy(accessibility = "Get started")
	public WebElement welcomeText;

	@AndroidFindBy(accessibility = "Enter your email")
	@iOSXCUITFindBy(accessibility = "Get Started")
	public WebElement escape;

	@AndroidFindBy(accessibility = "Welcome back, Olabisi!")
	@iOSXCUITFindBy(accessibility = "Get Started")
	public WebElement escape2;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Enter email address\"]")
	public WebElement emailAddressField;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Renmoney\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	public WebElement nextBtn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Enter password\"]")
	public WebElement passwordField;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText/android.widget.Button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Renmoney\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeButton")
	public WebElement showPassword;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Renmoney\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]")
	public WebElement submitBtn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
	@iOSXCUITFindBy(accessibility = "")
	public WebElement modalPopUp;

	@AndroidFindBy(accessibility = "Log out")
	@iOSXCUITFindBy()
	public WebElement logOutBtn;

	@AndroidFindBy(accessibility = "More")
	public WebElement moreIconPage;

	public LoginPage enterEmail(String email) {
		switch(getPlatform()) {
			case "Android" :
				clear(emailAddressField);
				click(emailAddressField);
				sendKeys(emailAddressField, email, "enter " + email);
				break;
			case "iOS" :
				tapByCoordinates(142, 217);
				clear(emailAddressField);
				click(emailAddressField);
				sendKeys(emailAddressField, email, "enter " + email);
		}
//	clear(emailAddressField);
//		click(emailAddressField);
//		sendKeys(emailAddressField, email, "enter " + email);
//		clear(emailAddressField);
//		click(emailAddressField);
//		tapByCoordinates(194, 264);
//		sendKeys(emailAddressField, email, "enter " + email);
		return this;
	}

	public LoginPage nextBtn() {
		click(nextBtn, "next button");
		return new LoginPage();
	}

	public LoginPage escape() {
		click(escape, "hide keyboard");
		return new LoginPage();
	}

	public LoginPage escape2() {
		click(escape2, "hide keyboard");
		return new LoginPage();
	}

	public LoginPage validatePassword(String password) {
		clear(passwordField);
		click(passwordField);
		sendKeys(passwordField, password, "enter " + password);
		return this;
	}

	public DashboardPage submit() {
		click(submitBtn, "submit button");
		return new DashboardPage();
	}

	public DashboardPage signIn(String email, String password) {
	enterEmail(email);
	escape();
	nextBtn();
	validatePassword(password);
	escape2();
	return submit();
	}

	public DashboardPage modalPopUp() {
		click(modalPopUp, "close modal");
		return new DashboardPage();
	}

//  Login instance to other modules

//	1. Login instance to all Investments

	public InvestmentPage iSubmit() {
		click(submitBtn, "submit button");
		return new InvestmentPage();
	}

	public InvestmentPage iSignIn(String password) {
	/*enterEmail(email);
	escape();
	nextBtn();*/
		validatePassword(password);
		escape2();
		return iSubmit();
	}

	public TransactionPage tSubmit() {
		click(submitBtn, "submit button");
		return new TransactionPage();
	}

	public TransactionPage tSignIn(String password) {
	/*enterEmail(email);
	escape();
	nextBtn();*/
		validatePassword(password);
		escape2();
		return tSubmit();
	}

	public AirtimeDataPage aSubmit() {
		click(submitBtn, "submit button");
		return new AirtimeDataPage();
	}

	public AirtimeDataPage aSignIn(String password) {
	/*enterEmail(email);
	escape();
	nextBtn();*/
	validatePassword(password);
	escape2();
	return aSubmit();
	}

	public LoanPage lSubmit() {
		click(submitBtn, "submit button");
		return new LoanPage();
	}

	public LoanPage lSignIn(String password) {
	/*enterEmail(email);
	escape();
	nextBtn();*/
		validatePassword(password);
		escape2();
		return lSubmit();
	}

}