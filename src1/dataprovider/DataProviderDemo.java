 package dataprovider;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  @Test(dataProvider = "add")
  public void f(Integer n, Integer s) {
	  
	  Integer sum = n+s;
	  System.out.println(sum);
  }

  @DataProvider
  public Object[][] add() {
    return new Object[][] {
      new Object[] { 1, 2 },
      new Object[] { 2, 3 },
      new Object[] { 3, 4 },
      new Object[] { 4, 5 },
      new Object[] { 5, 6 },
      new Object[] { 6, 7 },
    };
  }
}
