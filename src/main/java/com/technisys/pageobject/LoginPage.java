package com.technisys.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends PageObject{

	public LoginPage(AndroidDriver<?> driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.linkedin.android:id/growth_login_join_fragment_email_address")
	public MobileElement emailField;
	
	@AndroidFindBy(id = "com.linkedin.android:id/growth_login_join_fragment_password")
	public MobileElement passwordFIeld;
	
	@AndroidFindBy(id = "com.linkedin.android:id/growth_login_fragment_sign_in")
	public MobileElement loginButton;

	public LoginPage sendEmailAndPasswordToLogin(String validEmail, String validPassword) {
		emailField.sendKeys(validEmail);

		passwordFIeld.sendKeys(validPassword);

		return this;
	}

	public LoginPage clickButtonToLogin() {

		loginButton.click();

		return this;
	}
}
