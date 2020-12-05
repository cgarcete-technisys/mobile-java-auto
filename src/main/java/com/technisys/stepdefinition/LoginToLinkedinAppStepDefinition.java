//package com.technisys.stepdefinition;
//
//import java.net.URL;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.springframework.util.Assert;
//
//import com.technisys.pageobject.LoginPage;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//
//public class LoginToLinkedinAppStepDefinition {
//
//	private static AndroidDriver<?> driver;
//	private LoginPage loginPage = null;
//	private DesiredCapabilities cap = new DesiredCapabilities();
//	
//	@Before
//	public void setUp() {
//		cap.setCapability("deviceName", "tester");
//		cap.setCapability("udid", "emulator-5554");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platformVersion", "9");
//		
//		cap.setCapability("appPackage", "com.linkedin.android");
//		cap.setCapability("appActivity", "com.linkedin.android.authenticator.LaunchActivity");
//
//	}
//
//	@When("^I enter to the LinkedIN app$")
//	public void i_enter_to_the_LinkedIN_app() throws Exception{
//		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		this.waitSpecificTime(2000);
//
//		MobileElement clickElement = (MobileElement) driver.findElement(By.id("com.linkedin.android:id/growth_prereg_fragment_account_exists"));
//		clickElement.click();
//		
//		this.waitSpecificTime(2000);
//		
//		loginPage = new LoginPage(driver);
//	}
//
//	@When("^The required fields are filled with valid data\\.$")
//	public void the_required_fields_are_filled_with_valid_data(DataTable table){
//	    List<Map<String, String>> list = table.asMaps(String.class, String.class);
//		
//	    loginPage.sendEmailAndPasswordToLogin(list.get(0).get("Email"), list.get(0).get("Password"));
//	}
//
//	@When("^The button is pressed\\.$")
//	public void the_button_is_pressed() {
//		loginPage.clickButtonToLogin();
//		
//		this.waitSpecificTime(2000);
//	}
//
//	@Then("^The user logs successfully\\.$")
//	public void the_user_logs_successfully() {
//		MobileElement clickElement = (MobileElement) driver.findElement(By.id("com.linkedin.android:id/me_launcher"));
//		
//		Assert.notNull(clickElement, "Not null element.");
//
//	}
//
//	@When("^The required fields are filled with invalid data\\.$")
//	public void the_required_fields_are_filled_with_invalid_data(DataTable table) {
//	    List<Map<String, String>> list = table.asMaps(String.class, String.class);
//		
//	    loginPage.sendEmailAndPasswordToLogin(list.get(0).get("Email"), list.get(0).get("Password"));
//	}
//
//	@Then("^The system display an error message\\.$")
//	public void the_system_display_an_error_message() {
//		
//		MobileElement clickElement = (MobileElement) driver.findElement(By.id("android:id/message"));
//		
//		Assert.notNull(clickElement, "Not null element.");
//	}
//
//	@After
//	public void tearDown() {
//		driver.quit();
//	}
//	
//	
//	private void waitSpecificTime(int timeToWait) {
//		try {
//			Thread.sleep(timeToWait);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//}
