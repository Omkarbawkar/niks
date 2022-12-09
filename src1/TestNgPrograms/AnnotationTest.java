package TestNgPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
  @Test
  public void f() {
	  System.out.println("First Test Ng Class");
  }
  @Test 
  public void s() {
	  System.out.println("Second TestNg Class");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod: This will be executed before every @test annotated method and ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod: This will be executed after every @test annotated method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass starts execute after @BeforeTest method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass starts execute before @AfterTest method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest starts execute after @BeforeSuite");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest starts execute before @AfterSuite");
  }

  @BeforeSuite
  public void beforeSuite() {
	 System.out.println("@BeforeSuite: It will run only once, before all tests in the suite are executed"); 
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite:A method with this annotation will run once after the execution of all tests in the suite is complete");
  }

}
