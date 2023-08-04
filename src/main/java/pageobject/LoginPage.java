package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login-button")
	private WebElement submitButton;
	
	public WebElement userName() {
		return userName;
	}
	
	public WebElement passwordField() {
		return passwordField;
	}
	
	public WebElement submitButton() {
		return submitButton;
	}

}
