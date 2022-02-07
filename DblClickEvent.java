package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DblClickEvent {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.google.com";
		driver.get(url);
		Actions act = new Actions(driver);
		//act.doubleClick(driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span"))).build().perform();
		driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys("Piano");
		driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys(Keys.ENTER);
  }
}
