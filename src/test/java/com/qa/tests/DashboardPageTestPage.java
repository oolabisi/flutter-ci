package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class DashboardPageTestPage extends BaseTest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    JSONObject loginUsers;
    TestUtils utils = new TestUtils();

    @BeforeClass
    public void beforeClass() throws Exception {
        InputStream datais = null;
        try {
            String dataFileName = "data/storedData.json";
            datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
            JSONTokener tokener = new JSONTokener(datais);
            loginUsers = new JSONObject(tokener);
        } catch(Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if(datais != null) {
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
        dashboardPage = loginPage.signIn( loginUsers.getJSONObject("validUser").getString("validEmail"),loginUsers.getJSONObject("validUser").getString("validPassword"));
    }

    @AfterMethod
    public void afterMethod() {
//        loginPage = dashboard.pressSettingsBtn(); // Logout action
//        loginPage = settingsPage.pressLogoutBtn();loginPage
    }

    @Test
    public void Dashboard() throws InterruptedException {
        dashboardPage.popUP();
        Thread.sleep(3000);
        dashboardPage.historyBtn();
        Thread.sleep(3000);
        dashboardPage.backButton();
        Thread.sleep(3000);
        dashboardPage.chatRenmoney();
        Thread.sleep(3000);
        dashboardPage.navigateUp();
        Thread.sleep(3000);
        dashboardPage.addMoneyBtn();
        Thread.sleep(3000);
        dashboardPage.backButton();
        Thread.sleep(3000);
        dashboardPage.sendMoneyBtn();
        Thread.sleep(3000);
        dashboardPage.backButton();
        Thread.sleep(3000);
        dashboardPage.buyAirtimeBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
        dashboardPage.investAndEarnBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
        Thread.sleep(3000);
        dashboardPage.loanIconBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
        Thread.sleep(3000);
        dashboardPage.purchaseAirtimeBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
        Thread.sleep(3000);
        dashboardPage.saveIconBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
        Thread.sleep(3000);
        dashboardPage.payIconBtn();
        Thread.sleep(3000);
        dashboardPage.moreIconBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
    }

}
