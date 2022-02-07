package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoItDemo {
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();			
	    driver.get("http://demo.guru99.com/test/autoit.html");			
	    driver.findElement(By.id("postjob")).click();			
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"input_3\"]")).sendKeys("Gaurav");                                 					
	    driver.findElement(By.id("id_4")).sendKeys("test.test@gmail.com");					
	    driver.findElement(By.id("input_4")).click();			
	    // below line execute the AutoIT script .
	     Runtime.getRuntime().exec("C:\\Users\\Anitha\\Desktop\\Selenium\\uploadcomd.exe");		
	    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
	    //driver.findElement(By.id("input_2")).click();
	    driver.close();
  }
}
