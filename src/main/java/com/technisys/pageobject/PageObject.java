package com.technisys.pageobject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageObject {

	private AndroidDriver<?> driver;
	
	public PageObject (AndroidDriver<?> driver) {
		this.setDriver(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public AndroidDriver<?> getDriver() {
		return driver;
	}

	public void setDriver(AndroidDriver<?> driver) {
		this.driver = driver;
	}
	
	public void waitSpecificTime(int timeToWait) {
		try {
			Thread.sleep(timeToWait);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
