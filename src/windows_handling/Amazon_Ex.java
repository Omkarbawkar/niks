package windows_handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Ex {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		
		
		WebElement Mobiles=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Mobiles.click();
		
		WebElement Search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys("one plus");
		
		WebElement SearchBtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchBtn.click();
		
		String MainWindow = driver.getWindowHandle(); //step:-1st stores Main Window   
		
		WebElement ClickOnMobile=driver.findElement(By.xpath("//span[contains(text(),'OnePlus Nord CE 2 Lite 5G (Black')]//parent::a"));  //Step:-2 Locate The WebElement for opening child window 
		ClickOnMobile.click();
		
		Set<String> ChildWindows = driver.getWindowHandles(); //step:-3 Stores the child Window
		
		Iterator<String> itr = ChildWindows.iterator();   //Step:-4  For Iterate Multiple Child window call iterator
		
		while(itr.hasNext())      //step:-5 For changing multiple window one by one call has next() method in while loop
		{ 
			String childwindow = itr.next();
		if(!MainWindow.equalsIgnoreCase(childwindow))   //Step:-6 For switching child window we take condition in if loop in while loop
		{
			driver.switchTo().window(childwindow);    //switch to child window
			driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();   //perform click operation in that window
		}
		}
		driver.quit();
		
	}

}
