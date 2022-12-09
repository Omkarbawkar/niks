package windows_handling;

import java.time.Duration; 
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleEx {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		driver.switchTo().alert().dismiss();
//		WebElement Close = driver.findElement(By.xpath("//a[@class='close_o_pp']"));
//		Close.click();
		
		String MainWindow = driver.getWindowHandle();
		
		
		WebElement JoinEMTPRO=driver.findElement(By.xpath("//a[@class='pro-icon-h topbtnhead_pro b2cpanel']"));
		JoinEMTPRO.click();
		
		Set<String> ChildWindow = driver.getWindowHandles();
		
		Iterator<String> itr = ChildWindow.iterator();
		
		while(itr.hasNext())
		{
			String Childwin = itr.next();
		if(!MainWindow.equalsIgnoreCase(Childwin))
		{
			driver.switchTo().window(Childwin);
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//div[@class='pro-logo']//a")).click();
			
		}		
		}
		driver.quit();
	}
}
