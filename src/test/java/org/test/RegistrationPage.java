package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class RegistrationPage extends BaseClass {
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Create new account']")
	private WebElement createBtn;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastname;
	
	@FindBy(xpath="(//span[text()='Submit'])[2]")
	private WebElement signUp;
	
	public WebElement getCreateBtn() {
		return createBtn;
	}
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getSignUp() {
		return signUp;
	}

}
