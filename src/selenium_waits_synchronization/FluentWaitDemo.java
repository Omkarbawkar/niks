package selenium_waits_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\Browsers Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement willenableafter5=driver.findElement(By.xpath("//button[text()='Will enable 5 seconds']"));
		System.out.println(willenableafter5.isEnabled());
		
		WebElement ColourchangeBtn=driver.findElement(By.xpath("//button[@id='colorChange']"));
		System.out.println(ColourchangeBtn.getCssValue("colour"));
		
		Wait<WebDriver> wait1 =new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(TimeoutException.class);
				
		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Visible After 5 Seconds']")));
		WebElement Willbevisibleafter5 =driver.findElement(By.xpath("//button[text()='Visible After 5 Seconds']"));
		System.out.println(willenableafter5.isEnabled());
		System.out.println(ColourchangeBtn.getCssValue("colour"));

	}

}
