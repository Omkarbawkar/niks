package javaScriptexecutorex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg_Element_Handling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		//How to Locate the <svg Tag Element
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement Checkbox = driver.findElement(By.xpath("//*[local-name()='svg' and @class='rct-icon rct-icon-uncheck']"));
		Checkbox.click();
//		js.executeScript("arguments[0].click();",Checkbox);
		
		
	}

}
