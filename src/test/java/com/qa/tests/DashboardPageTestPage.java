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

        loginPage = new LoginPage();
//        dashboardPage = loginPage.signIn(loginUsers.getJSONObject("validUser").getString("validPassword"));
        dashboardPage = loginPage.signIn(loginUsers.getJSONObject("validUser").getString("validEmail"), loginUsers.getJSONObject("validUser").getString("validPassword"));

    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeMethod
    public void beforeMethod(Method m) {
        utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
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
       /* Thread.sleep(3000);
        dashboardPage.moreIconBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();*/
    }

    @Test
    public void modalPopUp() throws InterruptedException {
        dashboardPage.modalPopUp();
        Thread.sleep(4000);
    }
    @Test
    public void historyTab() throws InterruptedException {
        dashboardPage.historyBtn();
        Thread.sleep(3000);
        dashboardPage.backButton();
    }
    @Test
    public void notification() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage =dashboardPage.chatRenmoney();
        Thread.sleep(3000);
        dashboardPage =dashboardPage.navigateUp();
    }
    @Test
    public void addMoney() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage.addMoneyBtn();
        Thread.sleep(3000);
        dashboardPage.backButton();
    }

    @Test
    public void sendMoney() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage.sendMoneyBtn();
        Thread.sleep(3000);
        dashboardPage.backButton();
    }

    @Test
    public void buyAirtime() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage.buyAirtimeBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
    }

    @Test
    public void investAndEarn() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage.investAndEarnBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
    }

    @Test
    public void loanIcon() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage.loanIconBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
    }

    @Test
    public void purchaseAirtime() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage.purchaseAirtimeBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
    }

    @Test
    public void saveIcon() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage.saveIconBtn();
        Thread.sleep(3000);
        dashboardPage.homeIconBtn();
    }

    @Test
    public void moreIcon() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage.payIconBtn();
    }

    @Test
    public void hideAndShowTransaction() throws InterruptedException {}

}
