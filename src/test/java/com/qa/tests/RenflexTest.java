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

public class RenflexTest extends BaseTest {

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
//        loginUsers.getJSONObject("validUser").getString("validEmail") ,

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
    public void Renflex() throws InterruptedException{
        investmentPage.popUP();
        Thread.sleep(3000);
        investmentPage.saveIconBtn();
    }

    @Test
    public void planOption() throws InterruptedException{
        Thread.sleep(3000);
        investmentPage.newPlan();
        Thread.sleep(1000);
        investmentPage.renflex();
    }

    @Test
    public void flexAmount() throws InterruptedException{
        Thread.sleep(3000);
        investmentPage.amount(loginUsers.getJSONObject("investment").getString("flex"));
        investmentPage.hideKeyboard3();
        Thread.sleep(3000);
//        investmentPage.renFlexNext();
//        investmentPage.backToInvestmentPage();
    }

}
