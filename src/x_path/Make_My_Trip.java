package x_path;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_My_Trip {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //By using Implicit wait....
		
		String MainWindow = driver.getWindowHandle();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement BookNow=driver.findElement(By.xpath("//p[text()='INTRODUCED: ‘Zero Cancellation’!']"));
		js.executeScript("arguments[0].click();", BookNow);
		
		Set<String> ChildWindows = driver.getWindowHandles();
		
		Iterator<String> itr = ChildWindows.iterator();
		
		while(itr.hasNext())
		{
			String childwin =itr.next();
		if(!MainWindow.equalsIgnoreCase(childwin))
		{
			driver.switchTo().window(childwin);
			driver.findElement(By.xpath("//a[text()='BOOK NOW']")).click();
		}
		}
		driver.quit();
		
	}

}
