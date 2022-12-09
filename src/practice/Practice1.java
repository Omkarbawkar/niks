package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;    

public class Practice1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement UserName=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		UserName.sendKeys("7744848218");
		
		WebElement Password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		Password.sendKeys("@Om0051234");
		
		WebElement LoginBtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		LoginBtn.click();
		
		WebElement PowerBank=driver.findElement(By.xpath("//div[text()='Premium PowerBanks']//following-sibling::div[1]"));
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", PowerBank);
//		PowerBank.click();
		
//		WebElement Cut=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		Cut.click();
				
		
//		WebElement Off=driver.findElement(By.xpath("//div[text()=\"Women's Sarees\"]//following-sibling::div[1]"));
//		Off.click();
		
		
	}
	
}
