package selenium_waits_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Demo2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//Implicit Wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement Create=driver.findElement(By.xpath("//a[contains(text(),'Create N')]"));
		Create.click();
		
//		WebElement First=driver.findElement(By.xpath("//input[@name='firstname']"));
//		First.sendKeys("Omkar");
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastname']")));
		WebElement Last=driver.findElement(By.xpath("//input[@name='lastname']"));
		Last.sendKeys("Bawkar");

	}

}
