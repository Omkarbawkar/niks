package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenersParallelTest {	
	@Test
	  public void ChromeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		  WebDriver  driver =new ChromeDriver();
		  System.out.println("Thread Id of ChromeTest  is: "+Thread.currentThread().getId());
		  driver.get("https://utkarshaaacademy.com/");
		  driver.close();
	  }
	  @Test
	  public void EdgeTest() {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\msedgedriver.exe");
		  WebDriver driver =new EdgeDriver(); 
		  System.out.println("Thread Id of EdgeTest is: "+Thread.currentThread().getId());
		  driver.get("https://utkarshaaacademy.com/");
		  driver.close();
	  }
	  @Test
	  public void FirefoxTest() {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\geckodriver.exe");
		  WebDriver driver =new FirefoxDriver();
		  System.out.println("Thread Id of FirefoxTest is: "+Thread.currentThread().getId());
		  driver.get("https://utkarshaaacademy.com/");
		  driver.close();
	  }
}
