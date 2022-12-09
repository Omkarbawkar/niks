 package webtable_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Browsers Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		//1) How to find the rows in a table?
		
		int Rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("Total No. Of Rows In a Table: "+Rows);
		
		//2) How many columns in a table
		
		int Column = driver.findElements(By.xpath("//table[@id='customers']//tr//th")).size();
		System.out.println("Total No. Of Column In a Table: "+Column);
		
		//3)Retrive the specific row/column data
		
		String Value = driver.findElement(By.xpath("//table[@id='customers']//tr[5]//td[2]")).getText();
		System.out.println("The Value is: "+Value);
		
		//4)Retrive the all the data from the table	
		
		System.out.println("Data from the table......");
		for(int r=2;r<=Rows;r++)
		{
			for(int c=1;c<=Column ;c++)
			{
				String Data = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(Data+" ,  ");
			}
			System.out.println();   
			
			//5) Print the contact and country of amazon
/*			
			for(int p=2;p<=Rows; p++)
			{
				String Language = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+p+"]//td[1]")).getText();
				
			 if(Language.equals("Amazon"))
			 {
				 String Contact = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+p+"]//td[2]")).getText();
				 String Country = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+p+"]//td[3]")).getText();
				 System.out.println(Language+"  "+Contact+"  "+Country);
			 }
			}  */
			
			
		} 
		   
		
		
	}	
		
	} 


