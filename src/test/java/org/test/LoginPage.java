package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(name="email")
	private WebElement username;
	

	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement loginBtn;
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
