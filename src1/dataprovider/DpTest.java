package dataprovider;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DpTest {
	
  @Test(dataProvider = "dp")
  public void f(String userid, String password) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
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

  @DataProvider(name="dp" , parallel = true) //to run parallely
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "omkarbawkar@gmail.com", "a12567" },
      new Object[] { "omkarbawkar123@gmail.com", "1456b" },
      new Object[] { "8845795213", "14gs56b" },
      new Object[] { "omkar123@gmail.com", "14lfj56b" },
      new Object[] { "ravibawkar123@gmail.com", "@123546" },
    };
  }
}
