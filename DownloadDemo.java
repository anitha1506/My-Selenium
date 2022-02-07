package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadDemo {
  @Test
  public void f() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://www.java2s.com/Code/Jar/t/Downloadtestng685jar.htm";
		driver.get(url);
		JavascriptExecutor window = (JavascriptExecutor)driver;
		window.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.cssSelector("body > div > div > div.col-sm-9.col-md-9 > p:nth-child(13) > a")).click();
  }
}
			
