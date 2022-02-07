package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	WebDriver driver;
	@BeforeTest
	public void systemProp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.amazon.com";
		driver.get(url);
	}
  @Test
  public void openAmazon() throws InterruptedException {
	  driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
	  Actions act = new Actions(driver);
	  
	  Thread.sleep(2000);
	  driver.findElement(By.id("ap_email")).sendKeys("Test@gmail.com");
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("ap_password")).sendKeys("12345");
	  act.doubleClick(driver.findElement(By.id("signInSubmit"))).click().perform();
  }
 
  @Test
  public void regAmazon() throws InterruptedException {
	  driver.navigate().to("https://www.amazon.com");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Start here.")).click();
	  driver.findElement(By.id("ap_customer_name")).sendKeys("Test1");
	  driver.findElement(By.id("ap_email")).sendKeys("aa@gmail.com");
	  driver.findElement(By.id("ap_password")).sendKeys("12344");
	  driver.findElement(By.id("ap_password_check")).sendKeys("12344");
	  driver.findElement(By.id("continue")).click();
	  
  }
}
	  
