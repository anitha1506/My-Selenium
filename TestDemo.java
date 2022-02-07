package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo {
	
  @Test (groups= {"g1","g2"})
  public void facebok() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("in Facebook");
		
}
  @Test  (groups= {"g2"})
  public void google() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("in google");
}
  @Test 
  public void amazon() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.Amazon.com/");
		System.out.println("in Amazon");
	  
}
}
