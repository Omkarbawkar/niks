package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo2 
{

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1)How to capture Screenshot of Full page ? screenshot
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File file1 = ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file1, new File("C:\\Users\\Omkar\\eclipse-workspace\\May2022\\screenshots"+timestamp()+".jpeg"));
		
		//2)How To capture Screenshot of ScreenShot of section/portion of the page
		
//		WebElement SectionScr = driver.findElement(By.xpath("//div[@class='category-grid home-page-category-grid']"));
//		File file2 = SectionScr.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file2, new File("C:\\Users\\Omkar\\eclipse-workspace\\May2022\\screenshots"+timestamp()+".jpeg"));
		
		//3)How to capture ScreenShot Of Element of the page ?
		WebElement Element1 = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File file3= Element1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file3, new File("C:\\\\Users\\\\Omkar\\\\eclipse-workspace\\\\May2022\\\\screenshots"+timestamp()+".jpeg"));
		
	}
		public static String timestamp()
		{
			return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
			
		}

}
