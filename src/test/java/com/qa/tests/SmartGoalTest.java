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

public class SmartGoalTest extends BaseTest {

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
        investmentPage = loginPage.iSignIn(loginUsers.getJSONObject("validUser").getString("validPassword"));
//        loginUsers.getJSONObject("validUser").getString("validEmail") ,
    }

    @AfterMethod
    public void afterMethod() {}

    @Test
    public void SmartGoal() throws InterruptedException {
        investmentPage.popUP();
        Thread.sleep(3000);
        investmentPage.saveIconBtn();
        Thread.sleep(3000);
        investmentPage.newPlan();
        Thread.sleep(2000);
        investmentPage.smartGoal();
        Thread.sleep(2000);
        investmentPage.amount(loginUsers.getJSONObject("investment").getString("amount"));
        Thread.sleep(2000);
        investmentPage.investmentDuration();
        Thread.sleep(2000);
        investmentPage.chosenTenure();
        Thread.sleep(2000);
        investmentPage.smartTenure();
        Thread.sleep(2000);
        investmentPage.smartChose();
        investmentPage.hideKeyboard4();
        investmentPage.scrolLdown();
        investmentPage.scrollS();
        investmentPage.checkBox();
        investmentPage.next();
        investmentPage.planName(loginUsers.getJSONObject("investment").getString("smartName"));
        investmentPage.hideKeyboard2();
        investmentPage.confirmBtn();
//        Thread.sleep(2000);
//        investmentPage.continueBtn();
//        Thread.sleep(4000);

    }


}
