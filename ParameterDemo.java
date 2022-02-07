package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterDemo {
  @Test
  @Parameters ({"x","y"})
  public void add(int a, int b) {
	  int c;
	  c=a+b;
	  System.out.println("Add : "+c);
  }
  @Test
  @Parameters ({"x","y"})
  public void sub(int a, int b) {
	  int c;
	  c=a-b;
	  System.out.println("Sub : "+c);
  }
}
