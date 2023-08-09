package org.pagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefn.CommonMethods;

public class LoginPageRepository {
	public LoginPageRepository() {
		PageFactory.initElements(CommonMethods.driver, this);
	}
	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;	
	@FindBy(xpath = "//h2[@class='_8eso']")
	private WebElement fbtext;
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getFbtext() {
		return fbtext;
	}

}
