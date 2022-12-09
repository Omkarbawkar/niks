package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Handling Static Dropdown
		
//		Select ColourSelect = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
//		ColourSelect.selectByIndex(3);       //Indexing Always starts from 0.
//		ColourSelect.selectByValue("4");     //Return  type is string
//		ColourSelect.selectByVisibleText("Magenta");

		//Handling Dynamic Dropdown 
		//1)Select option
		
//		WebElement DynaDD = driver.findElement(By.xpath("//div[text()='Select Option']"));
//		DynaDD.click();
		
//		WebElement Option2 =driver.findElement(By.xpath("//div[text()='Group 1, option 1']"));
//		Option2.click();
		
//		WebElement Option3 =driver.findElement(By.xpath("//div[text()='Group 2, option 1']"));
//		Option3.click();
		//2)select Title
		
//		WebElement Title = driver.findElement(By.xpath("//div[text()='Select Title']"));
//		Title.click();
		
//		WebElement Mrs = driver.findElement(By.xpath("//div[text()='Mrs.']"));
//		Mrs.click();
		//3)Multiselect Dropdown
		
//		Actions act = new Actions(driver);           //This is action class
//		WebElement Progressbar = driver.findElement(By.xpath("//span[text()='Progress Bar']")); //for that action class we give element below the multiselect dropdown 
//		act.moveToElement(Progressbar).perform();                                               //Then we call act and moveToElemnt class so that page is scroll down and we click on multiselect dropdown menu
		
//		WebElement MultiSelect = driver.findElement(By.xpath("//div[text()='Select...']"));
//		MultiSelect.click();
		
//		driver.findElement(By.xpath("//div[text()='Blue']")).click();          //Because of advertisement its not click due to this we call action class
//		driver.findElement(By.xpath("//div[text()='Black']")).click();
		
		//Standard Multiselect Dropdown(Static DropDown)
		
		Actions act = new Actions(driver);           //This is action class
		WebElement Tools = driver.findElement(By.xpath("//span[text()='Tool Tips']")); //for that action class we give element below the multiselect dropdown 
		act.moveToElement(Tools).perform();
	
		Select StdMulti = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
		StdMulti.selectByIndex(0);
		StdMulti.selectByValue("saab");
		StdMulti.selectByVisibleText("Audi");
		
		
	}		

}
