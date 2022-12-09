package TestNgPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodEx {
	public WebDriver driver;
	  @Test
	  public void Launch_Chrome() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("http://www.testyou.in/Login.aspx");
		  driver.manage().window().maximize();
	  }
	  @Test(dependsOnMethods = "Launch_Chrome")
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
	  @Test(dependsOnMethods = "Check_Test")
	  public void Check_Title() {
		  String ExpectedTitle ="Login Page | Test Creator - TestYou";
		  String ActalTitle = driver.getTitle();
		  Assert.assertEquals(ActalTitle, ExpectedTitle);
		  Reporter.log("Actual Title Test Get Pass When Title Matches",true);   //Index.HTML-->> Reporter output When Above method get failed(i.e. Assert get failed) it will be skipped by method.
		  Reporter.log(ActalTitle);                           //Reporter output
		  Reporter.log(driver.getCurrentUrl());              //Reporter output
	  }
	  @Test(dependsOnMethods = "Check_Test")
	  public void Forgot_Password() {
		  WebElement forgotpass = driver.findElement(By.xpath("//a[@id='ctl00_CPHContainer_hprlnkForgetPassword']"));
		  forgotpass.click();
	  }	  
	  @Test(dependsOnMethods = {"Forgot_Password", "Check_Test" })
	  public void Tear_down() {
		  driver.close();
	  }
}
