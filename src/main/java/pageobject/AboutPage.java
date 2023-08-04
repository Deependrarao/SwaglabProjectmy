package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	WebDriver driver;
    
	public AboutPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement button;
	
	@FindBy(id="about_sidebar_link")
	private WebElement aboutPage;
	
	@FindBy(xpath="//*[@id=\"__next\"]/header/div/div/div[2]/div/div[2]/a/button")
	private WebElement requestDemo;
	
	public WebElement button() {
		return button;
	}
	public WebElement aboutPage() {
		return aboutPage;
	}
	public WebElement requestDemo() {
		return requestDemo;
	}

}
