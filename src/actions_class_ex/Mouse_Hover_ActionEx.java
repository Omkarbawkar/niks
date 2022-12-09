package actions_class_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_ActionEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
				
		WebElement Companies = driver.findElement(By.xpath("//div[text()='Companies']"));
		action.moveToElement(Companies).perform();
		
		WebElement Foremp = driver.findElement(By.xpath("//div[text()='For employers']"));
		WebElement HiringSl=driver.findElement(By.xpath("//div[text()='Hiring solutions']"));
		action.moveToElement(Foremp).moveToElement(HiringSl).click().perform();
	}

}
