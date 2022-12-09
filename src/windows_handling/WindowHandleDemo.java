package windows_handling;

import java.time.Duration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String MainWindow=driver.getWindowHandle();         //step:-1st stores Main Window   
		
		WebElement Services = driver.findElement(By.xpath("//div[text()='Services']"));   //Step:-2 Locate The WebElement for opening child window 
		Services.click();                                                                 //perform click() action.
		
		Set<String> ChildWindows = driver.getWindowHandles();        //step:-3 Stores the child Window
		
		Iterator<String> itr = ChildWindows.iterator();              //Step:-4 For Multiple Child window call iterator
		
		while(itr.hasNext())                                         //step:-5 For changing multiple window one by one call has next() method in while loop
		{
			String childWindow = itr.next();
						
		if(!MainWindow.equalsIgnoreCase(childWindow))        //Step:-6 For switching child window we take condition in if loop in while loop
		{
			driver.switchTo().window(childWindow);            //switch to child window
			System.out.println(driver.getTitle());                  //print text in child window
			driver.findElement(By.xpath("//span[text()='LOGIN']")).click();  //open another window in child window
		}
		driver.switchTo().window(MainWindow);             //For Switch to child window to main window (1st we get out of if loop)
		System.out.println(driver.getTitle());            //Print text in main window
		}
		driver.close();          //Outside while loop we use this method to close the main window but child window is still open               
		driver.quit();           //This method is used to close al the tab i.e. main window , child window and also exit from browser.
		
	}

}
