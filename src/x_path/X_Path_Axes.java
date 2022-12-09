package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_Axes {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		WebElement UserId1=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
//		WebElement Password1=driver.findElement(By.xpath("//input[@id='email']//following::input[1]"));
//		WebElement LogInBtn=driver.findElement(By.xpath("//input[@id='email']//following::button"));
			
//		UserId1.sendKeys("7744848218");
//		Password1.sendKeys("12365479");
//		LogInBtn.click();
		
		//2)Ancestor:
		
//		WebElement Login=driver.findElement(By.xpath("//a[text()='Log in']//ancestor::li"));
//		Login.click();
		
		//3)child:-
//		WebElement Plus=driver.findElement(By.xpath("//ul[contains(@class,'uiList l')]//child::li[12]"));
//		Plus.click();4
		
		//4)Preceding:-
//		WebElement UserId1=driver.findElement(By.xpath("//button[@name='login']//preceding::input[4]"));
//		WebElement Password1=driver.findElement(By.xpath("//button[@name='login']//preceding::input[3]"));
		
//		UserId1.sendKeys("7744848218");
//		Password1.sendKeys("12365479");
		
		//5)Following-sibling:-
//		WebElement MetaPay=driver.findElement(By.xpath("//a[text()='Places']//parent::li//following-sibling::li[3]"));
//		MetaPay.click();
		
		//6)Preceding-sibling
//		WebElement Watch=driver.findElement(By.xpath("//a[text()='Places']//parent::li//preceding-sibling::li[1]"));
//		Watch.click();
		
		//7)Parent:-
//		WebElement Places=driver.findElement(By.xpath("//a[text()='Places']//parent::li"));
//		Places.click();
		
		//8)Self:-
		WebElement UserId=driver.findElement(By.xpath("//input[@id='email']//self::input"));
		UserId.sendKeys("456979231");
		
		//9)Descendant:-
		WebElement Password=driver.findElement(By.xpath("//form[@class='_9vtf']//descendant::input[4]"));
		Password.sendKeys("456979231");
	}

}
