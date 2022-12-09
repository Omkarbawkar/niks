package TestNgPrograms;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
	public WebDriver driver;
	
	@Test(groups="sanity")
	public void firsttest() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Omkar\\\\eclipse-workspace\\\\May2022\\\\Binary\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lbsnaa.gov.in/");
	}
	@Test(groups="sanity")
	public void secondtest() {
	String ExpectedTitle = "Lal Bahadur Shastri National Academy of Administration, Mussoorie-248179 (Uttarakhand),Govt of India";
	String ActualTitle = driver.getTitle();
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	@Test(groups="sanity")
	public void thirdtest() {
	System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void fourthtest() {
		System.out.println(driver.getPageSource());
	}
}

