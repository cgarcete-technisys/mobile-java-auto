//package com.technisys.mobile_qa_automation;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Ignore;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//public class TestCases {
//
////	private WebDriver myDriver = null;
//	public static AndroidDriver<?> myDriver;
//	@Test
//	public void openLinkedinOnMotoZPlay() throws Exception {
////		DesiredCapabilities cap = new DesiredCapabilities();
////		cap.setCapability("deviceName", "XT1635-02");
////		cap.setCapability("udid", "ZY22447CPN");
////		cap.setCapability("platformName", "Android");
////		cap.setCapability("platformVersion", "8");
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("deviceName", "tester");
//		cap.setCapability("udid", "emulator-5554");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platformVersion", "9");
//		
//		cap.setCapability("appPackage", "com.linkedin.android");
//		cap.setCapability("appActivity", "com.linkedin.android.authenticator.LaunchActivity");
//		
//		myDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//		myDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//		Thread.sleep(4000);
//
//		MobileElement clickElement = (MobileElement) myDriver.findElement(By.id("com.linkedin.android:id/growth_prereg_fragment_account_exists"));
//		clickElement.click();
//		Thread.sleep(2000);
////		MobileElement ningunaDeLasAnteriores = (MobileElement) myDriver.findElement(By.id("com.google.android.gms:id/cancel"));
////		ningunaDeLasAnteriores.click();
//		
//		
//		
//		MobileElement emailData = (MobileElement) myDriver.findElement(By.id("com.linkedin.android:id/growth_login_join_fragment_email_address"));
//		emailData.sendKeys("cgarcete@technisys.com");
//		MobileElement passwordData = (MobileElement) myDriver.findElement(By.id("com.linkedin.android:id/growth_login_join_fragment_password"));
//		passwordData.sendKeys("linkedintester");
//		MobileElement buttonLogin = (MobileElement) myDriver.findElement(By.id("com.linkedin.android:id/growth_login_fragment_sign_in"));
//		buttonLogin.click();
//		
//		Thread.sleep(9000);
//		
////		myDriver.quit();
//	}
//
//
//	// APK PURE
//
//	@Test
//	@Ignore
//	public void testearCalculadora() {
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("deviceName", "tester");
//		cap.setCapability("udid", "emulator-5554");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platformVersion", "9");
//
//		//cap.setCapability("browserName", "BROWSER_NAME");
//		cap.setCapability("appPackage", "com.android.calculator2");
//		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
//
//		// Open browser.
//		WebDriver driver = null;
//		try {
//			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//			Thread.sleep(6000);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		driver.quit();
//		
//	}// FIN testearCalculadora
//
//	WebDriver driver = null;
//
//
//
//	@Test
//	@Ignore
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", 
//				"/home/cgarcete/Descargas/chromedriver");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get("https://www.google.com/");
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//
//	WebDriver driver2 = null;
//
//
//	@Test
//	@Ignore
//	public void testearChromeBrowser() {
//		DesiredCapabilities cap = new DesiredCapabilities();
//
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("deviceName", "tester");
//
//
//		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
//		cap.setCapability(CapabilityType.VERSION, "9");
//
//		// Open browser.
//
//		try {
//			driver2 = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//			driver2.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//			// Navigate to the page and interact with the elements on the guinea-pig page using id.
//			driver2.get("http://saucelabs.com/test/guinea-pig");
//			Thread.sleep(6000);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		//		driver2.quit();
//	}// FIN testearCalculadora
//}
