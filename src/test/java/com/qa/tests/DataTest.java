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
    }

    @AfterClass
    public void afterClass() {}

    @BeforeMethod
    public void beforeMethod(Method m) {
        utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
        loginPage = new LoginPage();
        airtimeDataPage = loginPage.aSignIn(loginUsers.getJSONObject("validUser").getString("validEmail") , loginUsers.getJSONObject("validUser").getString("validPassword"));
        // loginUsers.getJSONObject("validUser").getString("validEmail") ,
    }
    @AfterMethod
    public void afterMethod() {}

    @Test
    public void BuyDataBundle() throws InterruptedException {
        airtimeDataPage.bigPop();
        airtimeDataPage.buyAirtimeTab();
        Thread.sleep(2000);
        airtimeDataPage.dataTab();
        Thread.sleep(2000);
        airtimeDataPage.airtimeProvideTab();
        Thread.sleep(2000);
        airtimeDataPage.dataNetwork();
        Thread.sleep(2000);
        airtimeDataPage.phoneNumberField(loginUsers.getJSONObject("airtimeData").getString("phoneNumber"));
        Thread.sleep(2000);
        airtimeDataPage.dataOption();
        Thread.sleep(2000);
        scrollToData();
        airtimeDataPage.dataBundle();
        // hide keyboard
      /*  Thread.sleep(2000);
        airtimeDataPage.next();
        airtimeDataPage.transactionPin(loginUsers.getJSONObject("airtimeData").getString("transactionPin"));
        Thread.sleep(2000);
        airtimeDataPage.returnToDashboard();*/
    }

}
