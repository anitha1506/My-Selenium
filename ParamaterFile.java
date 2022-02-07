package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaterFile {
  @Test
  @Parameters ({"uid","pwd"})
  public void login(String uname,String pwd) {
	  System.out.println(uname);
	  System.out.println(pwd);
  }
  
}
