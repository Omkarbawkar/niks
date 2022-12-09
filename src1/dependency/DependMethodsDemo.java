package dependency;

import org.testng.annotations.Test;

public class DependMethodsDemo {
  @Test
  public void startcar() {
	  System.out.println("Car Started");
  }
  @Test(dependsOnMethods = "startcar")
  public void drivecar() {
	  System.out.println("Car dirving");
  }
  @Test(dependsOnMethods = "drivecar")
  public void stopcar() {
	  System.out.println("Car Stopped");
  }
  @Test(dependsOnMethods = {"drivecar","stopcar"},alwaysRun = true)
  public void parkcar() {
	  System.out.println("Car Parked");
  }
}
