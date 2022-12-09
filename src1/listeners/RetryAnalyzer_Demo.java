package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzer_Demo {
  @Test
  public void launchchrome() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  WebDriver	driver =new ChromeDriver();
	  driver.get("https://www.nseindia.com/");
	  String ExpectedTitle ="nSE - National Stock Exchange of India Ltd: Live Share/Stock Market News & Updates, Quotes- Nseindia.com";
	  String ActualTitle = driver.getTitle();
      Assert.assertEquals(ExpectedTitle, ActualTitle, "Titles of the website do not match");
      System.out.println("Chrome Thread id is "+Thread.currentThread().getId());
      driver.close();
  }
}
