package TestNgPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodsTestDemo {
	public WebDriver driver;
  @Test(priority=1)
  public void VarifyTitle() {
	  String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  }
  @Test(priority=2)
  public void ClickOn() {
	  WebElement Electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	  Electronics.click();
  }
  @BeforeMethod
  public void lanuch_browser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Omkar\\\\eclipse-workspace\\\\May2022\\\\Binary\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
  }
  @AfterMethod
  public void close_browser() {
	  driver.close();
  }
}
