import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_Chrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
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

