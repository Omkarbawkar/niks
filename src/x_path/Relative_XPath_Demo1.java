package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_XPath_Demo1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement FullName=driver.findElement(By.xpath("//input[@name='FullName']"));
		FullName.sendKeys("Omkar Bawkar");
		
		WebElement BusinessEmail=driver.findElement(By.xpath("//input[@class='email text']"));
		BusinessEmail.sendKeys("Omkarbawkar33@gmail.com");
		
		WebElement Country=driver.findElement(By.cssSelector("div.middleColumn>select :nth-of-type(10)"));
		Country.click();
		
		WebElement MobNo =driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']"));
		MobNo.sendKeys("8668769491");
		
				
		WebElement Submit=driver.findElement(By.xpath("//input[@id='Form_getForm_action_submitForm']"));
		Submit.click();
		
		

	}

}
