package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.AirtimeDataPage;
import com.qa.pages.LoginPage;
import com.qa.pages.TransactionPage;
import com.qa.utils.TestUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class AirtimeTest extends BaseTest {

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
        airtimeDataPage =loginPage.aSignIn(loginUsers.getJSONObject("validUser").getString("validPassword"));
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
    public void BuyAirtime() throws InterruptedException{
         airtimeDataPage.bigPop();
         Thread.sleep(2000);
        airtimeDataPage.buyAirtimeTab();
    }
    @Test
    public void airtimeTab() throws InterruptedException{
        Thread.sleep(2000);
        airtimeDataPage.airtimeTab();
        Thread.sleep(2000);
        airtimeDataPage.airtimeProvideTab();
    }
    @Test
    public void networkProvider() throws InterruptedException{
        Thread.sleep(2000);
        airtimeDataPage.airtimeNetwork();
    }
    @Test
    public void phoneNumber() throws InterruptedException{
        Thread.sleep(2000);
        airtimeDataPage.phoneNumberField(loginUsers.getJSONObject("airtimeData").getString("phoneNumber"));
    }
    @Test
    public void amount() throws InterruptedException{
        Thread.sleep(2000);
        airtimeDataPage.amountField(loginUsers.getJSONObject("airtimeData").getString("amount"));
    }
    @Test
    public void otherAmountOptions() throws InterruptedException{
        Thread.sleep(2000);
        airtimeDataPage.amountOne();
        Thread.sleep(2000);
        airtimeDataPage.amountTwo();
        Thread.sleep(2000);
        airtimeDataPage.amountThree();
//    }
//        Thread.sleep(2000);
//        airtimeDataPage.next();
//        airtimeDataPage.transactionPin(loginUsers.getJSONObject("airtimeData").getString("transactionPin"));
//        Thread.sleep(2000);
//        airtimeDataPage.returnToDashboard();
    }

}
