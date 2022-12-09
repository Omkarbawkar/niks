package actions_class_ex;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_TipEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));       //wait is compulsory give to that program.
		
		//This Is the example of tool tip element performed by Mouse Over Actions Class.
		
		Actions action = new Actions(driver);
		
		WebElement Hover = driver.findElement(By.xpath("//button[text()='Hover me to see'] "));  //1st we have to mouse over to that element
		action.moveToElement(Hover).perform();
		
		String GetText = driver.findElement(By.xpath("//div[@id='buttonToolTip']")).getText();   //Element of that text to get text and then print that text.
		System.out.println(GetText);
		
		WebElement Contrary = driver.findElement(By.xpath("//a[text()='Contrary']"));  //1st we have to mouse over to that element
		action.moveToElement(Contrary).perform();   
		
		String getTextContrary = driver.findElement(By.xpath("//div[@id='contraryTexToolTip']")).getText();  //for capturing that text of contrary element and we have to give xpath of that dynamic text below show contrary word when we mouse over to that element. this xpath display at the bottom of the page .
		System.out.println(getTextContrary);  //print text		
	}

}
