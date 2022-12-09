package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Drop 
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();		
			driver.get("https://www.facebook.com/reg/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Select Day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
			//select by index
			Day.selectByIndex(15);
			
			Select Month =new Select(driver.findElement(By.xpath("//select[@id='month']")));
			//select by value
			Month.selectByValue("3");
			
			Select Year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
			//select By visible text
			Year.selectByVisibleText("1999");
			
		}
}
