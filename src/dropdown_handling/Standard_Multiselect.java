package dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Standard_Multiselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://output.jsbin.com/osebed/2");
		
		Select StdMul= new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		
		//find the options present in the dropdown menu
		List<WebElement> options = StdMul.getOptions();
		System.out.println(options.size()); 
		
		//print the options
		for(WebElement e:options)
		{
			System.out.println("The Values are"+e.getText());
		}
		
		//select By value
		StdMul.selectByValue("banana");
		
		//Select By Index
		StdMul.selectByIndex(2);
		
		//select By visibleText()
		StdMul.selectByVisibleText("Grape");
		
	}

}
