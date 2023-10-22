package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.LoanPage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class LoanTest extends BaseTest {

    LoginPage loginPage;
    JSONObject loginUsers;
    LoanPage loanPage;
    TestUtils utils = new TestUtils();

    @BeforeClass
    public void beforeClass() throws Exception {
        InputStream datais = null;
        try {
            String dataFileName = "data/storedData.json";
            datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
            JSONTokener tokener = new JSONTokener(datais);
            loginUsers = new JSONObject(tokener);
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        finally {
            if (datais != null) {
                datais.close();
            }
        }
        closeApp();
        launchApp();

        loginPage = new LoginPage();
        loanPage = loginPage.lSignIn(loginUsers.getJSONObject("validUser").getString("validPassword"));
        //        loginUsers.getJSONObject("validUser").getString("validEmail") ,

    }

    @AfterClass
    public void afterClass() {}

    @BeforeMethod
    public void beforeMethod(Method m) {
        utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
    }
    @AfterMethod
    public void afterMethod() {}

    @Test
    public void InstaLoan() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.loanIconBtn();
    }

    @Test
    public void applyToInstaLoan() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.apply();
    }

    @Test
    public void loanCheckBox() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.loanCheckbox();
        loanPage.next();
    }

    @Test
    public void phoneChecks() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.accessLocation();
        loanPage.allowSMS();
    }

    @Test
    public void LoanAmount() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.loanAmount();
    }

    @Test
    public void LoanPurpose() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.loanAmount();
    }

    @Test
    public void UserAddress() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.homeAddress();
    }

    @Test
    public void maritalStatus() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.maritalStatus();
    }

    @Test
    public void maritalChosen() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenStatus();
    }

    @Test
    public void UserState() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.state();
    }

    @Test
    public void chosenState() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenState();
    }

    @Test
    public void lga() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenLGA();
    }

    @Test
    public void education() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.educationStatus();
    }

    @Test
    public void chosenEducation() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenEducation();
    }

    @Test
    public void nok() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.nok();
    }

    @Test
    public void nokRelation() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.nokRelationship();
    }

    @Test
    public void chosenNOK() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenNOK();
    }

    @Test
    public void nokPhone() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.nokPhoneNumber();
        loanPage.nokNext();
    }

    @Test
    public void employmentStatus() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.employmentStatus();
    }

    @Test
    public void chosenEmployment() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenEmployment();
    }

    @Test
    public void company() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.companyName();
    }

    @Test
    public void dateJoined() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.dateJoined();
    }

    @Test
    public void confirmDate() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.dateOK();
    }

    @Test
    public void sector() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.sector();
    }

    @Test
    public void chosenSector() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenSector();
    }

    @Test
    public void industry() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.industry();
    }

    @Test
    public void chosenIndustry() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenIndustry();
    }

    @Test
    public void monthlySalary() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.monthlySalary();
    }

    @Test
    public void companyAddress() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.companyAddress();
    }

    @Test
    public void companyState() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.companyState();
    }

    @Test
    public void chosenCompanyState() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenCompanyState();
    }

    @Test
    public void companyLGA() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.companyLGA();
    }

    @Test
    public void chosenCompanyLGA() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenCompanyLGA();
        loanPage.lgaNext();
    }

    @Test
    public void userBank() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.bank();
    }

    @Test
    public void searchBank() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.searchBank();
    }

    @Test
    public void chosenBank() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.chosenBank();
    }

    @Test
    public void accountNumber() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.accountNumber();
    }

    @Test
    public void linkedPhone() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.linkedPhone();
        loanPage.ok();
    }

    @Test
    public void nextDetails() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.detailsNext();
    }

    @Test
    public void submit() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.submit();
    }

    @Test
    public void mono() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.monoContinue();
    }

    @Test
    public void bankName() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.choseGtB();
    }

    @Test
    public void mobileBanking() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.mobileBanking();
    }

    @Test
    public void enterAccount() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.enterAccount();
    }

    @Test
    public void enterPin() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.enterPin();
    }

    @Test
    public void mobileLogin() throws InterruptedException {
        Thread.sleep(2000);
        loanPage.mobileLogIn();
    }


}
