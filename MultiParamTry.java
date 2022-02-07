package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class MultiParamTry {
  @Test(dataProvider = "dp")
  public void f(String email, String pwd) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fs25.formsite.com/form_app/FormSite?FormId=LoadNewUserSignUp");
		driver.manage().window().maximize();
	  System.out.println("email "+email);
	  System.out.println("Password "+pwd);
	  Thread.sleep(2000);
	  driver.findElement(By.id("UserEmail")).sendKeys(email);
	  driver.findElement(By.id("Password1")).sendKeys(pwd);
	  driver.findElement(By.cssSelector("#signupForm > div:nth-child(3) > button")).click();
	  
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "bbb@gmail.com", "bbb@1234" },
      new Object[] { "ccc@gmail.com", "bbb@1234" },
      new Object[] { "ddd@gmail.com", "bbb@1234" },
      new Object[] { "eee@gmail.com", "bbb@1234" },
    };
  }
}
