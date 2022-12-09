package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class InvocationCountEx {
  @Test(invocationCount = 5, threadPoolSize = 5 , timeOut = 15000) //Thread pool size used for runs the test method parallel
  public void Chromelaunch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
	  WebDriver	driver =new ChromeDriver();
	  System.out.println("Thread Id of ChromeTest is: "+Thread.currentThread().getId());
	  driver.get("https://www.fnp.com/");
	  driver.manage().window().maximize();
	  driver.close();
  }
}
