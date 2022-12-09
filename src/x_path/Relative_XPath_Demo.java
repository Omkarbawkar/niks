package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_XPath_Demo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement UserId=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		UserId.sendKeys("7744848218");
		
		WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("12365479");
		
		WebElement LoginButton=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		LoginButton.click();
		
		

	}

}
