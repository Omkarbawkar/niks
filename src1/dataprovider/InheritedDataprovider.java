package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InheritedDataprovider {
	public WebDriver driver;
	  @Test(dataProvider = "dp" , dataProviderClass = DpDemo.class)
	  public void f(String userid, String password) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.testyou.in/Login.aspx");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement UserName1 = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtUserLogin']"));
		  WebElement Password1 = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtPassword']"));
		  WebElement StaySignIn = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_chkRememberMe']"));
		  WebElement LogInBtn = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_btnLoginn']"));
		  UserName1.sendKeys(userid);
		  Password1.sendKeys(password);
		  StaySignIn.click();
		  LogInBtn.click();
	  }
}
