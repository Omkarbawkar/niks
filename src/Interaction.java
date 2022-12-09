import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interaction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement EmailAddress= driver.findElement(By.id("email"));
		EmailAddress.sendKeys("onkarbawkar1996@gmail.com");
		
		WebElement Password= driver.findElement(By.id("pass"));
		Password.sendKeys("@Om976769");

	//	WebElement LoginBtn=driver.findElement(By.name("login"));
//		LoginBtn.click();
		
//		WebElement Fpass= driver.findElement(By.linkText("Forgotten password?"));
//		Fpass.click();
		
	//	WebElement Facc=driver.findElement(By.linkText("Forgotten account?"));
	//	Facc.click();
		
	//	WebElement contact=driver.findElement(By.linkText("Contact uploading and non-users"));
	//	contact.click();
		
	//	WebElement contact=driver.findElement(By.partialLinkText("non-users"));
	//	contact.click();
		
	//	WebElement Loginb=driver.findElement(By.tagName("button"));   //if we find the single element
	//	Loginb.click();
		
//		List<WebElement> links=driver.findElements(By.tagName("div")); //find out the number of links
//		System.out.println(links.size());
		
//		List<WebElement> link=driver.findElements(By.tagName("img")); //find out the number of links
//		System.out.println(link.size());

	}

}
