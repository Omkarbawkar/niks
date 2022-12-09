package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Trip {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		WebElement From=driver.findElement(By.xpath("//div[@class='dropdown-container h-13 bc-neutral-100 flex ba  ']//descendant::input[1]"));
		From.sendKeys("PNQ - Pune, IN");
		
		WebElement To=driver.findElement(By.xpath("//div[@class='dropdown-container h-13 bc-neutral-100 flex ba  ']//descendant::input[2]"));
		To.sendKeys("BOM - Mumbai, IN");
		
		WebElement Search=driver.findElement(By.xpath("//div[@class='col flex flex-middle w-100p']//following-sibling::div[@style='height: 52px; padding-top: 12px; border-radius: 6px;']"));
		Search.click();
		
//		WebElement ClearTrip=driver.findElement(By.xpath("//div[text()='Cleartrip for Work']"));
//		ClearTrip.click();
	}

}
