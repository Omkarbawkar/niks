package TestNgPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void launch_chrome() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.instagram.com/");	  
  }
  @Test
  public void launch_edge() {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\msedgedriver.exe");
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.instagram.com/");
  }
  @Test
  public void launch_firefox() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.instagram.com/");
  }
}
