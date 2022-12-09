package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Practice1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement FullName=driver.findElement(By.xpath("//input[@id='user_full_name']"));
		FullName.sendKeys("Omkar Bawkar");
		
		WebElement Business=driver.findElement(By.xpath("//input[@id='user_email_login']"));
		Business.sendKeys("omk45r1996@gmail.com");
		
		WebElement Password=driver.findElement(By.xpath("//input[@id='user_password']"));
		Password.sendKeys("@Ok00213");	
		
//		WebElement CheckBox=driver.findElement(By.xpath("//input[@id='user_submit']//ancestor::div//input[@type='checkbox']"));		
//		CheckBox.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement SignUp=driver.findElement(By.xpath("//input[@id='user_submit']"));
		js.executeScript("arguments[0].click();",SignUp );
		
		driver.findElement(By.xpath("//a[@class='bs-alert-close']")).click();
		

		 
		
		
		
		
				
		

	}

}
