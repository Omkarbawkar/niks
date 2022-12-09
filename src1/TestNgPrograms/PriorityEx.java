package TestNgPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityEx {
	public WebDriver driver;
  @Test(priority=1)
  public void Launch_Chrome() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://www.testyou.in/Login.aspx");
	  driver.manage().window().maximize();
  }
  @Test(priority=2)
  public void Check_Test() {
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtUserLogin']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtPassword']"));
	  WebElement StaySignIn = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_chkRememberMe']"));
	  WebElement LogInBtn = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_btnLoginn']"));
	  UserName.sendKeys("omkarbawkar@gmail.com");
	  Password.sendKeys("1236571");
	  StaySignIn.click();
	  LogInBtn.click();	  
  }
  @Test(priority=3)
  public void Check_Title() {
	  String ExpectedTitle ="Login Page | Test Creator - TestYou";
	  String ActalTitle = driver.getTitle();
	  Assert.assertEquals(ActalTitle, ExpectedTitle);
  }
  @Test(priority=4)
  public void Tear_down() {
	  driver.close();
  }
  
  
}

