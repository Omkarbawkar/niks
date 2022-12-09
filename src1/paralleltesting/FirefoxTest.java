package paralleltesting;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxTest {
	public WebDriver driver;
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\geckodriver.exe");
		driver =new FirefoxDriver();
	}	
  @Test
  public void Firefoxlaunch() { 
	  System.out.println("Thread Id of FirefoxTest is: "+Thread.currentThread().getId());
	  driver.get("https://www.fnp.com/");
	  driver.manage().window().maximize();		 
  }
  @AfterTest
  public void aftertest() {
	  driver.close(); 
  }
}
