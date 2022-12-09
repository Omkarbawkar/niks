package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Axes_Ex {          


	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		
		
		WebElement Mobiles=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Mobiles.click();
		
		WebElement Search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys("one plus");
		
		WebElement SearchBtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchBtn.click();
		
		WebElement ClickOnMobile=driver.findElement(By.xpath("//span[text()='Samsung Galaxy S20 FE']//parent::a"));
		ClickOnMobile.click();
		
		WebElement BuyNow=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		BuyNow.click();
		
////div[@id='newAccordionRow']//following::span[@id='submit.buy-now']		
		
//		WebElement Samsung=driver.findElement(By.xpath("//span[text()='Samsung']//preceding-sibling::div"));
//		Samsung.click();
		
//		WebElement Fashion=driver.findElement(By.xpath("//img[@alt='Amazon Fashion']//parent::a"));
//		Fashion.click();
		
		
//		driver.get("https://www.amazon.in/");

		
//		WebElement Realme=driver.findElement(By.xpath("//span[text()='realme']//preceding-sibling::div"));
//		Realme.click();
		
//		WebElement Clothing=driver.findElement(By.xpath("//div[@id='desktop-grid-4']//span[text()='Clothing']"));
//		Clothing.click();
		
//		WebElement Seealloffers=driver.findElement(By.xpath("//span[text()='Decors & Planters for your garden']//parent::h2//following-sibling::span//a"));
//		Seealloffers.click();
		
//		WebElement Seealloffers2=driver.findElement(By.xpath("//div[@id='desktop-btf-grid-11']//a[@class='a-link-normal see-more truncate-1line']"));
//		Seealloffers2.click();
		
		WebElement Clothing=driver.findElement(By.xpath("//div[@id='desktop-grid-5']//span[text()='Win a OnePlus phone every hour']"));
		Clothing.click();
		
	}

}
