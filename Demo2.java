package TestNG;

import org.testng.annotations.Test;

public class Demo2 {
  @Test(groups= {"g1"})
  public void f() {
	  System.out.println("in Demo2");
  }
}
