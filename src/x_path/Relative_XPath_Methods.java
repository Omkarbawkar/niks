package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_XPath_Methods {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");		
		
		
			//Relative XPath
		
			// 1)Basic XPath
			//Syntax:- //tagname[@attribute='attribute value']
		
//			WebElement UserId1=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
//			UserId1.sendKeys("7744848218");
				
//			WebElement Password1=driver.findElement(By.xpath("//input[@name='pass']"));
//			Password1.sendKeys("12365479");
			
			//2) XPath With  Contains():
			//Synatx:- //tagname[contains(@Attribute,'Attribute partial value')]
		
//			WebElement CreateNewAcc=driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]"));  //we can take any value from attribute value i.e middle ,end or start
//			CreateNewAcc.click();			
		
//			WebElement LogIn=driver.findElement(By.xpath("//button[contains(@class,'_42ft')]"));
//			LogIn.click();
			
		
			// b) Relative XPath with contains text()
			//Syntax:- //tagname[contains(text(),'text partial value')]
		

//			WebElement ForgotP= driver.findElement(By.xpath("//a[contains(text(),'sswor')]"));
//			ForgotP.click();
		
//			WebElement CreateAcc = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
//			CreateAcc.click();
		
		    //3)Relative XPath with Using OR & AND: 
			// A) In OR expression, two conditions are used, whether 1st condition OR 2nd condition should be true. 
			//  -It is also applicable if any one condition is true or maybe both. Means any one condition should be true to find the element. 
			// Syntax:- //tagname[@1st attribute='1st attribute value' or @2nd attribute='2nd attribute value']
		
//			WebElement UserId1=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy' or @placeholder='Email a']"));
//			UserId1.sendKeys("onkarbawkar1996@gmail.com");
				
			//B)In AND expression, two conditions are used, both conditions should be true to find the element. 
			//  -It fails to find element if any one condition is false.
			//Syntax:- //tagname[@1st attribute='1st attribute value' and @2nd attribute='2nd attribute value']
				
//			WebElement Password1=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi' or @data-testid='royal_pass']"));
//			Password1.sendKeys("123654995");
		
			//4) Relative Xpath Starts-with:-
			//-In this method, the starting text of the attribute is matched to find the element whose attribute value changes dynamically. 
			//-You can also find elements whose attribute value is static (not changes).
		        // Syntax:- //tagname[starts-wih(@Attribute,'attribute starting value')]
		
//			WebElement UserId=driver.findElement(By.xpath("//input[starts-with(@id,'em')]"));
//			UserId.sendKeys("Onkarbawkar1996@gmail.com");
		
//			WebElement LogIn=driver.findElement(By.xpath("//button[starts-with(@id,'u_0')]"));
//			LogIn.click();
		
			//5)Relative XPath With text()
			//Syntax- //tagname[taxt()='set of text nodes'] -->> The elements to be located should be in string form.
		
//			WebElement ForgotPassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//			ForgotPassword.click();
		
//			WebElement Login=driver.findElement(By.xpath("//a[text()='Log in']"));
//			Login.click();
		
			
			
		

	}

}
