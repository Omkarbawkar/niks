package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement SimpleAlert=driver.findElement(By.xpath("//button[@name='alertbox']"));
		SimpleAlert.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		WebElement ConfirmAlert=driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		ConfirmAlert.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		WebElement PromptAlert=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		PromptAlert.click();
		driver.switchTo().alert().sendKeys("No");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}

}
