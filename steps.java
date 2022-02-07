package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class steps {
	public WebDriver driver;
	public LoginPage logpg;
	@Given("User lauch chrome browser")
	public void user_lauch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("************" +driver);
		logpg = new LoginPage(driver);
		
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		System.out.println("ww############"+url);
	   driver.get(url);
	   driver.manage().window().maximize();
	}

	@When("User enter email as {string} and pwd as {string}")
	public void user_enter_email_as_and_pwd_as(String email, String pwd) {
	  logpg.setUsername(email);
	  logpg.setPassword(pwd);
	}

	@When("clicks login button")
	public void clicks_login_button() {
	    logpg.clicklogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("user clicks logout link")
	public void user_clicks_logout_link() throws InterruptedException {
		logpg.clicklogout();
		Thread.sleep(3000);
	   
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

}
