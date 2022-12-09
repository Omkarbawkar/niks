package selenium_waits_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Demo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement SignUp=driver.findElement(By.xpath("//span[text()='Sign up']//parent::a"));
		SignUp.click();
		
//		WebElement Email=driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
//		Email.sendKeys("omkarbawkar@gmail.com");
		
		WebElement Email=driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));		
		Email.sendKeys("omkarbawkar@gmail.com");
		
		WebElement FullName=driver.findElement(By.xpath("//input[@name='fullName']"));
		FullName.sendKeys("Omkar Bawkar");
		
		WebElement UserName=driver.findElement(By.xpath("//input[@name='username']"));
		UserName.sendKeys("Jay001");
		
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("Jay001");
		
		WebElement Button=driver.findElement(By.xpath("//button[text()='Sign up']"));
		Button.click();
		

	}

}
