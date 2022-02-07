package TestNG;

import org.testng.annotations.Test;

public class PriorityDemo {
  @Test (groups= {"g2"})
  public void f() {
	  System.out.println("f method");
  }
  @Test 
  public void d() {
	  System.out.println("d method");
  }
  @Test (groups= {"g1","g2"})
  public void a() {
	  System.out.println("a method");
  }
  @Test
  public void b() {
	  System.out.println("b method");
  }
  @Test 
  public void c() {
	  System.out.println("c method");
  }
}
