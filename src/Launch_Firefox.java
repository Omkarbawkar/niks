import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Launch_Firefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\Browsers Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://google.com/");
		driver.get("https://www.facebook.com");
		driver.get("https://www.utkarshaaacademy.com");
		
		String facebook="https://www.facebook.com";    //2nd option
		driver.get(facebook);
		
		driver.navigate().to(facebook);
		driver.navigate().to("https://www.yahoo.com");
		driver.navigate().to("https://www.utkarshaaacademy.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		

	}

}