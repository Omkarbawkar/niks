package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EdgeTest {
	public WebDriver driver;
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\msedgedriver.exe");
		driver =new EdgeDriver();
	}
	
  @Test
  public void Edgelaunch() { 
	  System.out.println("Thread Id of EdgeTest is: "+Thread.currentThread().getId());
	  driver.get("https://utkarshaaacademy.com/");
	  driver.manage().window().maximize();	
	 
  }
  @AfterTest
  public void aftertest() 
  {
	  driver.close(); 
  }
}
