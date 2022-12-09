package handling_frames;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;                                //By using Three Ways we switch the frame
import org.openqa.selenium.chrome.ChromeDriver;                       //1)Index 2)Name or Id its return type is string 3)WebElement
                                                                      //We not use 1)index beacause indexing contineosly changes.
public class FramesDemo1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\eclipse-workspace\\May2022\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demoqa.com/frames");
		
		
		driver.switchTo().frame("frame1");                //Frame switched By using Frame id its return type is string.
		WebElement Frame1Heading=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(Frame1Heading.getText());
		
		driver.switchTo().parentFrame();                 //This method used for switching from frame 1 to frame 2 but 1st Switched from frame 1 to parent frame and then switched parent frame to 2nd frame. this is applicable for all frames                 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']"))); //Frame switched By using WebElement.		
		WebElement Frame12Heading=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(Frame12Heading.getText());
		
		
		
		
		driver.switchTo().parentFrame();                 //For 2nd Frame ,Parent Frame switched to the Frame 2.(parent frame means all page)                  
		driver.switchTo().frame("frame2");				 //Frame Handled By using Frame id.
		WebElement Frame2Heading=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(Frame2Heading.getText());
		
		
		
	}

}
