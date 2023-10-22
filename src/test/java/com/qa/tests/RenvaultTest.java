package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.InvestmentPage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class RenvaultTest extends BaseTest {

    LoginPage loginPage;

    JSONObject loginUsers;

    InvestmentPage investmentPage;
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
        catch(Exception e) {
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
        investmentPage = loginPage.iSignIn(loginUsers.getJSONObject("validUser").getString("validPassword"));
//        loginUsers.getJSONObject("validUser").getString("validEmail"),

    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeMethod
    public void beforeMethod(Method m) {
        utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
    }

    @AfterMethod
    public void afterMethod() {}

    @Test
    public void Renvault() throws InterruptedException {
        investmentPage.popUP();
        Thread.sleep(2000);
        investmentPage.saveIconBtn();
    }
    @Test
    public void investmentOption() throws InterruptedException {
        Thread.sleep(2000);
        investmentPage.newPlan();
        }
        @Test
        public void renvaultButton() throws InterruptedException {
            Thread.sleep(2000);
            investmentPage.renvault();
        }

    @Test
    public void planName() throws InterruptedException {
        Thread.sleep(2000);
        investmentPage.planName(loginUsers.getJSONObject("investment").getString("vaultName"));
        investmentPage.hideKeyboard2();
        investmentPage.nexT();
        Thread.sleep(2000);
    }
        @Test
        public void renvaultAmount() throws InterruptedException {
            Thread.sleep(2000);
            investmentPage.amount(loginUsers.getJSONObject("investment").getString("amount"));
        }
        @Test
        public void renvaultDuration() throws InterruptedException {
            Thread.sleep(2000);
            investmentPage.investmentDurationR();
            investmentPage.chosenDuration();
            investmentPage.hideKeyboard();
        }
        @Test
        public void checkBox() throws InterruptedException {
            Thread.sleep(2000);
            investmentPage.scrollDown();
            investmentPage.scrollR();
            investmentPage.checkBox();
            investmentPage.confirmBtn();
        }

    @Test
    public void confirmAndContinue() throws InterruptedException {
        Thread.sleep(2000);
        investmentPage.confirmBtn();
        Thread.sleep(2000);
        investmentPage.continueBtn();
    }

}
