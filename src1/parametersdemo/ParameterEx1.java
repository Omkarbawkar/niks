package parametersdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx1 {
	public WebDriver driver;
  @Test
  @Parameters ("browser")
  public void setup(String Browser){
	  if(Browser.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  }
	  else if(Browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\msedgedriver.exe");
		  driver =new EdgeDriver(); driver.manage().window().maximize();		 		  		 
	  }
	  else if (Browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\geckodriver.exe");
		  driver =new FirefoxDriver();
		  driver.manage().window().maximize();
	  }
  }
  @Test
  @Parameters("url")
  public void website(String URL) {
	  driver.get(URL);	 
  }
  @Test
  @Parameters({"url","username","password"})
  public void SignIn(String URL,String UserName,String Password) {
	  WebElement UserName1 = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtUserLogin']"));
	  WebElement Password1 = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtPassword']"));
	  WebElement StaySignIn = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_chkRememberMe']"));
	  WebElement LogInBtn = driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_btnLoginn']"));
	  UserName1.sendKeys(UserName);
	  Password1.sendKeys(Password);
	  StaySignIn.click();
	  LogInBtn.click(); 
  } 
  
}
