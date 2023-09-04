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



public class LoginTests extends BaseTest{
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
	  }

	  @AfterMethod
	  public void afterMethod() {		  
	  }
	  
//	  @Test
	/*  public void invalidUserName() {
		  loginPage.enterUserName(loginUsers.getJSONObject("invalidUser").getString("username"));
		  loginPage.enterPassword(loginUsers.getJSONObject("invalidUser").getString("password"));
		  loginPage.pressLoginBtn();
		  
		  String actualErrTxt = loginPage.getErrTxt();
		  String expectedErrTxt = getStrings().get("err_invalid_username_or_password");
		  
		  Assert.assertEquals(actualErrTxt, expectedErrTxt);
	  }*/


	@Test
	public void unregisteredEmail() throws InterruptedException {
		loginPage.enterEmail(loginUsers.getJSONObject("invalidUser").getString("username"));
		Thread.sleep(3000);
		loginPage.escape();
	}

	  @Test
	  public void validEmail() throws InterruptedException {
		  loginPage.enterEmail(loginUsers.getJSONObject("validUser").getString("validEmail"));
		  Thread.sleep(3000);
		  loginPage.escape();
		  loginPage.nextBtn();
		  loginPage.validatePassword(loginUsers.getJSONObject("validUser").getString("validPassword"));
		  Thread.sleep(3000);
		  loginPage.escape2();
		  dashboardPage = loginPage.submit();
		  Thread.sleep(7000);

	}

	@Test
	public void invalidPassword() throws InterruptedException {
		loginPage.validatePassword(loginUsers.getJSONObject("invalidUser").getString("validPassword"));
		Thread.sleep(3000);
		loginPage.escape2();
	}

	@Test
	public void validPassword() throws InterruptedException {
		loginPage.validatePassword(loginUsers.getJSONObject("validUser").getString("validPassword"));
		Thread.sleep(3000);
		loginPage.escape2();
	}
}
