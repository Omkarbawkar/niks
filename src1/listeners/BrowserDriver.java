package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.ListenersTestng.class)
public class BrowserDriver  
{

	public WebDriver driver;
	@Test  //Success Test
	public void CloseBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test //Failed Test
	public void OpenBrowser() {
			driver = new ChromeDriver();
			driver.get("https://www.nseindia.com/");
			String ExpectedTitle ="nSE - National Stock Exchange of India Ltd: Live Share/Stock Market News & Updates, Quotes- Nseindia.com";
			  String ActualTitle = driver.getTitle();
	        Assert.assertEquals(ExpectedTitle, ActualTitle, "Titles of the website do not match");
  }
	private int i = 1;
	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void AccountTest() {
			if(i < 2)
				Assert.assertEquals(i , i);
		i++;
	}
	@Test //skip test failed
	public void Skiptest() {
		throw new SkipException("Skipping The Test Method ");
	}
}
