package parametersdemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx2 {
	public WebDriver driver;
  @BeforeTest
  @Parameters("browser")
  public void IntializedBrowser(String Browser) {
	  switch (Browser.toLowerCase()) {
	  case "chrome":
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  break;
	  case "edge":
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\msedgedriver.exe");
		  driver =new EdgeDriver();
		  driver.manage().window().maximize();
		  break;
	  case "firefox":
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\geckodriver.exe");
		  driver =new FirefoxDriver();
		  driver.manage().window().maximize();
		  break;	
	default:
		System.err.println("Browser Name is Invalid");
		break;
	}
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void TearDown() {
	  driver.close();
  }
  @Test
  @Parameters("url")
  public void LaunchApp(String URL) {
	  driver.get(URL);
  }
  @Test
  @Parameters({"username","password"})
  public void EnterLoginDetails(String Uname, String Pass) throws InterruptedException {
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Uname);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pass);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(2000);
  }
}
