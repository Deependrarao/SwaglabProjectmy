package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewResource {
	WebDriver driver;

	public ViewResource(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button)[7]")
	private WebElement viewResource;
	
	@FindBy(xpath="(//span[text()='See resources'])[last()-1]")
	private WebElement seleniumResource;
	
	public WebElement viewResource() {
		return viewResource;
	}
	
	public WebElement seleniumResource() {
		return seleniumResource;
	}

}
