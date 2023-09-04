package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.TransactionPage;
import com.qa.utils.TestUtils;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class RenmoneyTransferTest extends BaseTest {

    LoginPage loginPage;
    JSONObject loginUsers;
    TransactionPage transactionPage;
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
        transactionPage = loginPage.tSignIn(loginUsers.getJSONObject("validUser").getString("validPassword"));
        //        loginUsers.getJSONObject("validUser").getString("validEmail") ,
    }
    @AfterMethod
    public void afterMethod() {}

    @Test
    public void RenmoneyBankTransfer() throws InterruptedException {
        transactionPage.popUP();
        transactionPage.sendMoneyBtn();
        Thread.sleep(2000);
        transactionPage.newBeneficiary();
        Thread.sleep(2000);
        transactionPage.chooseBank();
        Thread.sleep(2000);
        transactionPage.renmoney();
        Thread.sleep(2000);
        transactionPage.amountFieldRen(loginUsers.getJSONObject("transfer").getString("amountExceeding")); // Amount exceeding balance
        Thread.sleep(2000);
        transactionPage.amountFieldRen(loginUsers.getJSONObject("transfer").getString("amount")); // Test amount
        Thread.sleep(2000);
        transactionPage.recipientAccountRen(loginUsers.getJSONObject("transfer").getString("ren_account")); // Wrong recipient
        Thread.sleep(2000);
        // hide keyboard
        transactionPage.renSend();
        Thread.sleep(2000);
        transactionPage.transactionPin(loginUsers.getJSONObject("transfer").getString("pin"));
        Thread.sleep(2000);
        transactionPage.backToInvestmentPage();

    }

}
