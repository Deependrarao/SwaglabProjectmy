package tests;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobject.AboutPage;
import pageobject.ContactDetails;
import pageobject.LoginPage;
import pageobject.ViewResource;
import resources.Base;

public class Login extends Base {
	public WebDriver driver;
	@BeforeClass
	public void openApplication() throws Exception {
		driver =  openBrowser() ;
		driver.get(prop.getProperty("url"));
	}
	@Test(priority = 1)
	public void login() {

		LoginPage loginpage = new LoginPage(driver);
		loginpage.userName().sendKeys(prop.getProperty("Username"));
		loginpage.passwordField().sendKeys(prop.getProperty("Password"));
		loginpage.submitButton().click();
	}

	@Test(priority = 2)
	public void about() {
		AboutPage aboutpage = new AboutPage(driver);
		aboutpage.button().click();
		aboutpage.aboutPage().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		aboutpage.requestDemo().click();	
	}
	@Test(priority = 3)
	public void contact() throws InterruptedException   {
		ContactDetails contactobj = new ContactDetails(driver);
		contactobj.firstName().sendKeys("dipu");
		contactobj.lastName().sendKeys("rao");
		contactobj.emailField().sendKeys("deependra12345@gmail.com");
		contactobj.companyName().sendKeys("mindtree");
		contactobj.countryCode().click();
		contactobj.phoneNumber().sendKeys("8208745475");
		Thread.sleep(2000);
		contactobj.scrollPageDown(driver);
	     Thread.sleep(2000);
		contactobj.inquiry().click();
		contactobj.checkBox().click();
		contactobj.submitContact().click();
	}
	@Test(priority = 4)
	public void view() {
		ViewResource viewpage = new ViewResource(driver);
		viewpage.viewResource().click();
		viewpage.seleniumResource().click();
		System.out.println(driver.getTitle());
	}


	@AfterClass
	public void close() {
		driver.close();
	}
}
