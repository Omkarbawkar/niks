package actions_class_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons_Ex {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement DoubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		WebElement RightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		WebElement DynamicClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions action = new Actions(driver);                               //calls action class
		action.doubleClick(DoubleClick).perform();  //doubleclick action
		action.contextClick(RightClick).perform();  //Right click action
		action.click(DynamicClick).perform();       //Dynamic click acton
	}
	

}
