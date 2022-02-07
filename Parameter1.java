package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	
  @Test
  @Parameters ({"uid","pwd"})
  public void login(String username,String pwd) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	  System.out.println("Username "+username);
	  System.out.println("Password "+pwd);
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
	  driver.findElement(By.id("ap_email")).sendKeys(username);
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("ap_password")).sendKeys(pwd);
	  driver.findElement(By.id("signInSubmit")).click();
  }
}
