package actions_class_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_DropEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
			
		WebElement SourceElement = driver.findElement(By.xpath("//div[text()='Drag me']"));		
		WebElement TargetElement = driver.findElement(By.xpath("//div[text()='Drag me']//following-sibling::div"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(SourceElement, TargetElement).perform();

	}

}
