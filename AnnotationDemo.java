package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationDemo {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("in F" +n+s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("in afterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("in beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("in afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("in beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("in afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	  System.out.println("in beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("in afterSuite");
  }

}
