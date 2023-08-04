package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class testOne extends Base{
	public WebDriver driver;
	@Test
	public void oneTest() throws Exception  {
		System.out.println("======execute one test=======");
		driver = openBrowser();
		driver.get(prop.getProperty("url"));
		testOne obj =new testOne();
		obj.takeScreenShot("oneTest", driver);
		
		
	}
}
