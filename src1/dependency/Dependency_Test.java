package dependency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Test {
	public WebDriver driver;
  @Test
  public void launch_Browser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.nseindia.com/");
	  driver.manage().window().maximize();
  }
  @Test
  public void VarifyTitle() {
	  String ExpectedTitle ="NSE - National Stock Exchange of India Ltd: Live Share/Stock Market News & Updates, Quotes- Nseindia.com";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);	  
  }
  @Test(dependsOnMethods = "launch_Browser")
  public void ClickOnInvest() {
	  WebElement Invest = driver.findElement(By.xpath("//a[text()='Invest']"));
	  Invest.click();
  }
}
