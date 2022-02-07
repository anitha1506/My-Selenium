package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotaionTest {
	WebDriver driver;
	
	@BeforeTest
	public void systemProp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
  @Test
  public void openGoogle() {
	  String url = "https://www.google.com";
	  driver.get(url);
  }
  @Test
  public void openAmazon() {
	  String url = "https://www.amazon.com";
	  driver.get(url);
  }
}
