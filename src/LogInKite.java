import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInKite {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com");
		
		WebElement userid=driver.findElement(By.id("userid"));
		WebElement password=driver.findElement(By.id("password"));
		
		userid.sendKeys("ABC133");
		password.sendKeys("123456987");
		
//		WebElement LoginBtn=driver.findElement(By.className("button-orange"));
//		LoginBtn.click();
		
		WebElement  Forgot= driver.findElement(By.linkText("Forgot user ID or password?"));
		Forgot.click();
		
//		WebElement back=driver.findElement(By.linkText("Back to login"));
//		back.click();
		
		WebElement id= driver.findElement(By.className("su-radio-label"));
		id.click();

	}

}
