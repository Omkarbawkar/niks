package parametersdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx {
  @Test
  @Parameters({"val1","val2"})
  public void Add(int v1,int v2) {
	  int sum =v1+v2;
	  System.out.println(sum);
  }
  @Test
  @Parameters({"val1","val2"})
  public void Sub(int v1,int v2) {
	  int sub =v1-v2;
	  System.out.println(sub);
  }
  @Test
  @Parameters({"val1","val2"})
  public void Mul(int v1,int v2) {
	  int mul =v1*v2;
	  System.out.println(mul);
  }
  @Test
  @Parameters({"val1","val2"})
  public void Div(int v1,int v2) {
	  int div =v1/v2;
	  System.out.println(div);
  }
}
