package read_propertis;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Properties {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Proprties_File\\data.properties");  //To read data from file selenium provide us FileinputStream class //here u give to path of that data.properties file path
		
		Properties prop = new Properties();  //Call pr 
		prop.load(fis);       //Load The file
		
		System.setProperty(prop.getProperty("driverkey"), prop.getProperty("driverpath")); //Read data from properties file use method prop.getproperty("key")
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.xpath(prop.getProperty("userid_xpath"))).sendKeys(prop.getProperty("userid"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginbtn_xpath"))).click();
		
	}

}
