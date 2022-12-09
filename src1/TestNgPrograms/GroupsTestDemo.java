package TestNgPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTestDemo {
	public WebDriver driver;
  @Test(priority=1,groups ={"sanity","regression"})
  public void launch_browser()  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.naukri.com/");
  }	  
 @Test(priority=2,groups = "regression")
 public void VerifyTitle() {
	 String ExpectedTitle ="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
	 String ActualTitle = driver.getTitle();
	 Assert.assertEquals(ActualTitle, ExpectedTitle);
 }
 @Test(priority=3,groups = "regression")
 public void ClickOnRemote() {
	 WebElement Remote = driver.findElement(By.xpath("//span[text()='Remote']"));
	 Remote.click();
 }
	 
 
	  
	  
  
}
