package actions_class_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_DownEx {
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();		
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			Actions action = new Actions(driver);  //calls actions class
			
			WebElement AmazonScience = driver.findElement(By.xpath("//a[text()='Amazon Science']"));
			action.moveToElement(AmazonScience).perform();       //perform scroll down action
			
			
		}
}
