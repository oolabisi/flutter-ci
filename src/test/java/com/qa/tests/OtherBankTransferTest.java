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

public class OtherBankTransferTest extends BaseTest {

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

        loginPage = new LoginPage();
        transactionPage = loginPage.tSignIn(loginUsers.getJSONObject("validUser").getString("validPassword"));
        //        loginUsers.getJSONObject("validUser").getString("validEmail") ,

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
    public void OtherBankTransfer() throws InterruptedException {
        transactionPage.popUP();
        Thread.sleep(2000);
        transactionPage.sendMoneyBtn();
        Thread.sleep(2000);
        transactionPage.newBeneficiary();
        Thread.sleep(2000);
        transactionPage.chooseBank();
        Thread.sleep(2000);
        transactionPage.selectType();
        Thread.sleep(2000);
        transactionPage.bankDrop();
        Thread.sleep(2000);
        transactionPage.searchField();
        // hide Keyboard
        Thread.sleep(1000);
        transactionPage.bankName();
        Thread.sleep(2000);
        transactionPage.amountField(loginUsers.getJSONObject("transfer").getString("amountExceedingamountExceeding")); // Amount exceeding balance
        Thread.sleep(2000);
        transactionPage.amountField(loginUsers.getJSONObject("transfer").getString("amount")); // Test amount
        Thread.sleep(2000);
        transactionPage.recipientAccount(loginUsers.getJSONObject("transfer").getString("account")); // wrong recipient
        // hide keyboard
        Thread.sleep(2000);
        transactionPage.transfer();
        Thread.sleep(2000);
        transactionPage.transactionPin(loginUsers.getJSONObject("transfer").getString("pin"));
        Thread.sleep(2000);
        transactionPage.backToInvestmentPage();

    }

}
