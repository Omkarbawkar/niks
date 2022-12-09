package javaScriptexecutorex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1. To Click on a Button
		
		WebElement PromptBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
//		PromptBtn.click();
		//a)By using argument[0] //9.To find a hidden element in selenium using JavaScriptExecutor
//		js.executeScript("arguments[0].click();", PromptBtn);
        //b)by Using id
		js.executeScript("document.getElementById('promtButton').click();");
		driver.switchTo().alert().accept(); 
		
		//2. To Type Text in a Text Box without using sendKeys() method
		
		driver.get("https://www.instarem.com/signin");
		//a)By using id
//		js.executeScript("document.getElementById('email-input').value='Omkarbawkar1996@gmail.com'");
		//b)By using argument[0].value
		WebElement Email = driver.findElement(By.xpath("//input[@id='email-input']"));
		js.executeScript("arguments[0].value='onkarbawkar1996@gmail.com'", Email);
		
		//3.To generate Alert Pop window in Selenium Webdriver
		
		driver.get("https://www.facebook.com");
		js.executeScript("alert('Welcome To Selenium Testing');");
		driver.switchTo().alert().accept();
		
		//4.To refresh browser window using Javascript
		driver.get("https://www.instarem.com/signin");
		js.executeScript("history.go(0)");
		
		//5.To get the innertext of the entire webpage in Selenium
		driver.get("https://www.instagram.com/");
		String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
		System.out.println(innerText);
		
		//6.To get the Title of our webpage
		String Titletext = js.executeScript("return document.domain;").toString();
		System.out.println(Titletext);
		
		//* To get the domain name
		String domainName=  js.executeScript("return document.domain;").toString();
		System.out.println(domainName);
		
		//7.To get the URL of a webpage
		
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
		
		//8.To get the Height and Width of a web page
		String innerHeight = js.executeScript("return window.innerHeight;").toString();
		System.out.println(innerHeight);
		
		String innerWidth =  js.executeScript("return window.innerWidth;").toString();
		System.out.println(innerWidth);
		
		//10.To navigate to a different page using Javascript
		js.executeScript("window.location = 'https://www.facebook.com'");
		
		//11. To perform Scroll on an application using Selenium

		//a) To scroll the page vertically for 500px
		js.executeScript("window.scrollBy(0,500)");
		//b) To scroll the page vertically till the end

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				
		//12.ScrollIntoView 
		driver.get("https://www.amazon.in");
		WebElement LastElement = driver.findElement(By.xpath("//a[contains(text(),'Merchants')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", LastElement);		
		
		//13.To Handle Checkbox by passing the value as true or false
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement Reading = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		js.executeScript("document.getElementById('hobbies-checkbox-2').checked=true;");     //to click use true To not click use false
		
		//b)BY using argument [0]
		WebElement SportCheckbox = driver.findElement(By.xpath("//label[text()='Sports']"));
		js.executeScript("arguments[0].click();", SportCheckbox);
		
		
	}

}
