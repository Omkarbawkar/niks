 package assertdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; 
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx2 {
	public WebDriver driver;
	public SoftAssert Softassert;
	  @Test
	  public void launch_Browser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.nseindia.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }
	  @Test(priority=1)
	  public void checkTitle() {
		  
		  String exectedTitle ="nSE - National Stock Exchange of India Ltd: Live Share/Stock Market News & Updates, Quotes- Nseindia.com";
		  String actualTitle = driver.getTitle();
		  Softassert = new SoftAssert();
		  Softassert.assertEquals(actualTitle, exectedTitle);
		  System.out.println("Test is passed");
		  
		  WebElement logo = driver.findElement(By.xpath("//img[@alt='NSE India']"));
		  Softassert.assertTrue(logo.isDisplayed());
		  System.out.println("Logo is displayed on website homepage");
		  Softassert.assertAll();        //whenever we are going to use soft assert we compulsory use AsserAll(); for proper console result.
	  }
	  @Test(priority=2)
	  public void checkURL()
	  {
		  String exectedTitle ="https://www.nseindia.com/";
		  String actualTitle = driver.getCurrentUrl();
		  Assert.assertEquals(actualTitle, exectedTitle);
		  System.out.println("Check URL test passed");
	  }
}
