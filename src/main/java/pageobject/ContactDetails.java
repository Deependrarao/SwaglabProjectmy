package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactDetails {
	WebDriver driver;

	public ContactDetails(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="FirstName")
	private WebElement firstName;

	@FindBy(id="LastName")
	private WebElement lastName;

	@FindBy(id="Email")
	private WebElement emailField;

	@FindBy(id="Company")
	private WebElement companyName;

	@FindBy(id="Country")
	private WebElement countryCode;

	@FindBy(id="Phone")
	private WebElement phoneNumber;

	@FindBy(id="Solution_Interest__c")
	private WebElement inquiry;
	
	@FindBy(xpath="(//label)[10]")
	private WebElement checkBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitContact;

	public WebElement firstName() {
		return firstName;
	}

	public WebElement lastName() {
		return lastName;
	}

	public WebElement emailField() {
		return emailField;
	}
	
	
	public WebElement companyName() {
		return companyName;
	}

	public WebElement countryCode() {
		Select select = new Select(countryCode);
		select.selectByVisibleText("India");
		return countryCode;
	}

	public WebElement phoneNumber() {
		return phoneNumber;
	}

	public WebElement inquiry() {
		Select select = new Select(inquiry);
		select.selectByVisibleText("Sauce Low Code ");
		return inquiry;
	}
	
	
	public WebElement checkBox() {
		return checkBox;
	}
	public WebElement submitContact() {
		return submitContact;
	}
	//ScrollingDown
		public static void scrollPageDown(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,100)");
		}

}
