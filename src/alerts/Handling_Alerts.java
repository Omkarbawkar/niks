package alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Alerts {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();             //maximize the window
		
		WebElement AlertBtn=driver.findElement(By.xpath("//button[@id='alertButton']"));
		AlertBtn.click();
		driver.switchTo().alert().accept();
		
		WebElement TimeAlert=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		TimeAlert.click();
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		WebElement ConfirmAlert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ConfirmAlert);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	
		
		WebElement PromptAlert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		js.executeScript("arguments[0].click();",PromptAlert);
		driver.switchTo().alert().sendKeys("My name is Omkar");
		driver.switchTo().alert().accept();
		
		//Creating Alert
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("alert('You Logged In')");
		
		
		

		
	}

}
