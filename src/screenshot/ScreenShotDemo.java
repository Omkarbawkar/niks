package screenshot;

import java.io.File;

import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public record ScreenShotDemo() {

	public static void main(String[] args) throws IOException {         //By usig timestamp method
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;       //This is type casting
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\Omkar\\eclipse-workspace\\May2022\\screenshots"+timestamp()+".jpeg"));
		
	}
	public static String timestamp()
	{
		return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
		
	}

}
