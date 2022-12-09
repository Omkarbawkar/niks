package paralleltesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {
	public WebDriver driver;
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		driver =new ChromeDriver();
	}	
  @Test
  public void Chromelaunch() { 
	  System.out.println("Thread Id of ChromeTest is: "+Thread.currentThread().getId());
	  driver.get("https://www.fnp.com/");
	  driver.manage().window().maximize();		 
  }
  @AfterTest
  public void aftertest() {
	  driver.close(); 
  }
}
