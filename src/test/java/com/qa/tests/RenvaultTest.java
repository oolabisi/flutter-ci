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
    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeMethod
    public void beforeMethod(Method m) {
        utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
        loginPage = new LoginPage();
        investmentPage = loginPage.iSignIn(loginUsers.getJSONObject("validUser").getString("validEmail"),loginUsers.getJSONObject("validUser").getString("validPassword"));
    }

    @AfterMethod
    public void afterMethod() {}

    @Test
    public void Renvault() throws InterruptedException {
        investmentPage.popUP();
        Thread.sleep(2000);
        investmentPage.saveIconBtn();
        Thread.sleep(2000);
        investmentPage.newPlan();
        Thread.sleep(2000);
        investmentPage.renvault();
        Thread.sleep(2000);
        investmentPage.amount(loginUsers.getJSONObject("investment").getString("amount"));
        Thread.sleep(2000);
        investmentPage.investmentDurationR();
        investmentPage.chosenDuration();
        investmentPage.hideKeyboard();
        Thread.sleep(2000);
        investmentPage.scrollDown();
        investmentPage.scrollR();
        investmentPage.checkBox();
        investmentPage.next();
        Thread.sleep(2000);
        investmentPage.planName(loginUsers.getJSONObject("investment").getString("vaultName"));
        investmentPage.hideKeyboard2();
        investmentPage.confirmBtn();
        Thread.sleep(2000);
//        investmentPage.continueBtn();
//        Thread.sleep(4000);



    }

}