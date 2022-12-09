package dependency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildTest extends ParentTest
{
	 @Test
	  public void VarifyTitle() {
		  String ExpectedTitle ="NSE - National Stock Exchange of India Ltd: Live Share/Stock Market News & Updates, Quotes- Nseindia.com";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, ExpectedTitle);	  
	  }
	  @Test(dependsOnMethods = "launch_Browser")
	  public void ClickOnInvest() {
		  WebElement Invest = driver.findElement(By.xpath("//a[text()='Invest']"));
		  Invest.click();
	  }	
	
}
