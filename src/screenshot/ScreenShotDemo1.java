package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;      //type casting with interface
		File srcfile = ts.getScreenshotAs(OutputType.FILE);  //Temporarly saving screenshot in srcfile
		FileUtils.copyFile(srcfile, new File("C:\\Users\\Omkar\\eclipse-workspace\\May2022\\screenshots\\amazon.jpeg")); //For copying and storing the file in local machine //give path to that folder and Name of image \\ format of that image i.e. jpeg
	}

}
