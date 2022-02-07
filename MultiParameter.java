package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class MultiParameter {
  @Test(dataProvider = "dp")
  public void f(String uname, String pwd) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	  System.out.println("uname "+uname);
	  System.out.println("Password "+pwd);
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
	  driver.findElement(By.id("ap_email")).sendKeys(uname);
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("ap_password")).sendKeys(pwd);
	  driver.findElement(By.id("signInSubmit")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Test1", "123" },
      new Object[] { "Test2", "456" },
      new Object[] { "Test3", "789" },
    };
  }
}
