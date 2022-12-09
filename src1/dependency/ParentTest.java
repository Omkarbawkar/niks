package dependency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParentTest {
	public WebDriver driver;
	@Test
	  public void launch_Browser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.nseindia.com/");
		  driver.manage().window().maximize();
}
}