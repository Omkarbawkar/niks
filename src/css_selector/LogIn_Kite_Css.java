package css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_Kite_Css {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com");
		
//	1)	//CSS Selector with id(#)
		//Syntax=input#userid
		
//		WebElement UserId=driver.findElement(By.cssSelector("input#userid"));
//		UserId.sendKeys("ADFR123");
				
//		WebElement Password= driver.findElement(By.cssSelector("input#password"));
//		Password.sendKeys("123698456");

//	2)	//CSS Selector with Class(.)
		//Syntax:- tagname.classvalue (iF Spaces are there then remove space and add .)
		
//		WebElement Button=driver.findElement(By.cssSelector("button.button-orange.wide"));
//		Button.click();
		
//	3)	//CSS Selector with Other attributes
		//Syntax:- tagname[attribute='attribute value']
		
//		WebElement UserId1=driver.findElement(By.cssSelector("input[autofocus='autofocus']"));
//		UserId1.sendKeys("ASD12365");
		
//		WebElement Button1=driver.findElement(By.cssSelector("button[class='button-orange wide']"));  //In css selector with other attributes we are paste as it is value of attributes we are not remove spaces in it.
//		Button1.click();
		
// 4)	//CSS Selector i.e Combine Multiple Css Selector
		
		//A)CSS Selector with id and other attributes
		//Syntax:- tagname#id value[other attribute='other attribute value']
		
//		WebElement UserId2=driver.findElement(By.cssSelector("input#userid[placeholder='User ID (eg: AB0001)']")); //Sometimes it does not work but then you use other i.e id with other attributes as shown in below
//		UserId2.sendKeys("ASDE7895");
		
//		WebElement UserId2=driver.findElement(By.cssSelector("input#userid[maxlength='6']"));
//		UserId2.sendKeys("ASDE7895");
		
		//B)CSS Selector with class and other attributes
		//SyntaX:- tagname.classvalue[other attribute='other attribute value']
		
//		WebElement Button2=driver.findElement(By.cssSelector("button.button-orange.wide[type='submit']"));
//		Button2.click();
		
// 5)	//Css Selector with Parent/child 	
		//A)How to locate a web element when one element is the direct parent/child of another element?
		//Syntax:-Parent_Locator>child_Locator
		
//		WebElement UserId=driver.findElement(By.cssSelector("div[class='uppercase su-input-group']>input[id='userid']"));
//		UserId.sendKeys("ADFR123");
		
//		WebElement Password4= driver.findElement(By.cssSelector("div.su-input-group>input#password"));
//		Password4.sendKeys("123698456");
		
		//B)How to locate a web element when the element exists in the hierarchy?(i.e.nth-of-type(index))
		//Syantax:- Parent_Locator>child tagname :nth-of-type(index)
		
//		driver.get("https:demoqa.com/select-menu");
		
//		WebElement Select_Voilet=driver.findElement(By.cssSelector("div>select#oldSelectMenu :nth-of-type(8)"));
//		Select_Voilet.click(); 
		
// 6)  	//css Selector with substring
		//A)How to locate a web element using the starting text?
		//Syntax:- tagname[attribute^='starting text']
		
		WebElement UserId=driver.findElement(By.cssSelector("input[id^='use']"));
		UserId.sendKeys("ADFR123");
		
		//B)How to locate a web element using the Ending text?
		//Syntax:- tagname[attribute$='Ending text']
		WebElement Password= driver.findElement(By.cssSelector("input[id$='ord']"));
		Password.sendKeys("123698456");
		
		//C)How to locate a web element using the contains text?
		//Syntax:- tagname[attribute*='Middle text']
		WebElement Button2=driver.findElement(By.cssSelector("button[class*='ora']"));
		Button2.click();
		
		
		
		
		
		
		
	}

}
