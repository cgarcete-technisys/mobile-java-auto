package com.technisys.pageobject;

import io.appium.java_client.android.AndroidDriver;

public class HomePage extends PageObject{

	public HomePage(AndroidDriver<?> driver) {
		super(driver);
	}
	
	public void helloHome() {
		System.out.println("Estoy en el home");
	}

}
