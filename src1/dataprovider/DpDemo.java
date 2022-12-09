package dataprovider;

import org.testng.annotations.DataProvider;

public class DpDemo {
	 @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {{ "omkarbawkar@gmail.com", "a12567" },{ "omkarbawkar123@gmail.com", "1456b" },{ "8845795213", "14gs56b" },
	    	{ "omkar123@gmail.com", "14lfj56b" },{ "ravibawkar123@gmail.com", "@123546" },};
	  }
}
