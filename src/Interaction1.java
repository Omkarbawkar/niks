import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Interaction1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://kite.zerodha.com");
		
		driver.findElement(By.id("userid")).sendKeys("ABHg54");
		driver.findElement(By.id("password")).sendKeys("001234546");
		
		WebElement LoginBtn=driver.findElement(By.className("button-orange"));
		LoginBtn.click();
		
		

	}

}
