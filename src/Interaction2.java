import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Interaction2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.instagram.com");

		driver.findElement(By.name("username")).sendKeys("ABHg54");
		driver.findElement(By.name("password")).sendKeys("001234546");
		
		

	}

}
