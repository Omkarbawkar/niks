package actions_class_ex;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_ActionEx {

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/text-box/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		
		Actions action = new Actions(driver);          				 //calls action class give action as obj.
		//Full Name
		action.sendKeys(FullName, "Omkar Bawkar").perform();      //using sendkeys enter the full name
		//Email Id
		action.keyDown(Keys.TAB).perform();            				 //click on tab button
		action.sendKeys("omkarbawkar33@gmail.com").perform();     //enter the email id
		//Address
		action.keyDown(Keys.TAB).perform();             				//click on tab button
		action.sendKeys("At. Post Awad Shirpura Tq. Kalamb Dist.Osmanabad Pin Code:- 413528").perform();  //enter the full address
		//Select all address
		action.keyDown(Keys.CONTROL);         //For Select all text i.e. address we have to press clr + A ON Key board           
		action.sendKeys("a");
		action.build().perform();                       //build for perform action clr + A
		action.keyUp(Keys.CONTROL).perform();                    //For up(release) the  clr key that above we down
		
		//Copy All text that we selected above
		action.keyDown(Keys.CONTROL);                 //here we press clr + c to copy the text
		action.sendKeys("c");
		action.build().perform();
		action.keyUp(Keys.CONTROL).perform();          //release clr key
		
		action.sendKeys(Keys.TAB).perform();
		//Paste the all text we copy above
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.build().perform();
		action.keyUp(Keys.CONTROL).perform();
		
		//To click on submit button
		action.keyDown(Keys.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		// for Refreshing the page
		//*)by using actions class
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();  //sometimes it work sometimes it is fails
		
		//1)
		driver.navigate().refresh();
		
		//2)by using Robot class		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_F5);
//		robot.keyRelease(KeyEvent.VK_F5);
	   //3)
//		driver.get(driver.getCurrentUrl());
	  //4)by using java script executor
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("history.go(0)");
		
		
		
		   
		
		
		
		

	}

}
