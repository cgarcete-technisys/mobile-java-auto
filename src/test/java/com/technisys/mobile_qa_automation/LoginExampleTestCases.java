package com.technisys.mobile_qa_automation;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Resources;

import io.appium.java_client.android.AndroidDriver;

public class LoginExampleTestCases {
	public static AndroidDriver<?> myDriver;
	@Test
	public void testThis() throws Exception{
		System.out.println("Hola mundoooo");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("deviceName", "tester");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		
		File file = new File("apps/loginExample.apk");
		String absolutePath = file.getAbsolutePath();
		
		
		cap.setCapability("app", absolutePath);
		cap.setCapability("appPackage", "com.loginexample");
		cap.setCapability("appActivity", "com.loginexample.MainActivity");
		
		myDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		myDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		Thread.sleep(4000);
		
		myDriver.quit();

	}
	

}

//mvn clean install
// mvn -Dtest=LoginExampleTestCases test