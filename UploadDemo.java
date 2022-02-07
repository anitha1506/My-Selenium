package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UploadDemo {
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://postimages.org/";
		driver.get(url);
	/* code for autoIt editor
	 * WinWaitActive("Open")
	 * Send("C:\Users\Anitha\Pictures\Saved Pictures\img1.JPG") Send("{ENTER}")
	 */
		//driver.findElement(By.cssSelector("#uploadFile")).sendKeys("C:\\Users\\Anitha\\Desktop\\Selenium\\AutoItUpld\\upldImg.exe");
		driver.findElement(By.cssSelector("#uploadFile")).click();
		Runtime.getRuntime().exec("C:\\Users\\Anitha\\Desktop\\Selenium\\AutoItUpld\\upldImg.exe");	
  }
}
