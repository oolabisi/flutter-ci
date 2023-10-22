package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.AirtimeDataPage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class DataTest extends BaseTest {

    LoginPage loginPage;
    JSONObject loginUsers;
    AirtimeDataPage airtimeDataPage;
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
        airtimeDataPage = loginPage.aSignIn(loginUsers.getJSONObject("validUser").getString("validPassword"));
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
    public void BuyDataBundle() throws InterruptedException {
        Thread.sleep(2000);
        airtimeDataPage.bigPop();
        airtimeDataPage.buyAirtimeTab();
    }

    @Test
    public void dataTab() throws InterruptedException {
        Thread.sleep(2000);
        airtimeDataPage.dataTab();
    }

    @Test
    public void dataProvider() throws InterruptedException {
        Thread.sleep(2000);
        airtimeDataPage.airtimeProvideTab();
    }

    @Test
    public void dataNetwork() throws InterruptedException {
        Thread.sleep(2000);
        airtimeDataPage.dataNetwork();
    }

    @Test
    public void phoneNumber() throws InterruptedException {
        Thread.sleep(2000);
        airtimeDataPage.phoneNumberField(loginUsers.getJSONObject("airtimeData").getString("phoneNumber"));
    }

    @Test
    public void dataOption() throws InterruptedException {
        Thread.sleep(2000);
        airtimeDataPage.dataOption();
    }

    @Test
    public void dataBundle() throws InterruptedException {
        Thread.sleep(2000);
        airtimeDataPage.scrollDown();
        Thread.sleep(2000);
        airtimeDataPage.dataBundle();
    }
    @Test
    public void transactionPin() throws InterruptedException {
//         hide keyboard
        Thread.sleep(2000);
        airtimeDataPage.next();
//        airtimeDataPage.transactionPin(loginUsers.getJSONObject("airtimeData").getString("transactionPin"));
//        Thread.sleep(2000);
//        airtimeDataPage.returnToDashboard();
    }

}
