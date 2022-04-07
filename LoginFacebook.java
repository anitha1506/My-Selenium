package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFacebook {
	WebDriver driver;
	@BeforeSuite
	public void launchBrowser() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe"); driver = new
		 * ChromeDriver(); driver.get("https://www.facebook.com/");
		 */
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
	}
	@Given("^Open the FB in Chrome$")
	public void open_the_fb_in_chrome(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anitha\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook launched");
		driver.manage().window().maximize();
	}
	@When("^Enter UserID and Password$")
	public void enter_userid_and_password(){
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@1234");
		System.out.println("UserID and Pwd entered");
	}
	@Then("^Validate login$")
	public void validate_login() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		System.out.println("Logged in successfully");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println("Logged in djfasjdklasjdklasjl");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'mount_0_0_Ne\']/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]")).click();
	}
	@Then("^Logout$")
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		/*
		 * driver.switchTo().alert().dismiss(); driver.findElement(By.
		 * cssSelector("#mount_0_0_vC > div > div:nth-child(1) > div > div:nth-child(4) > div.ehxjyohh.kr520xx4.poy2od1o.b3onmgus.hv4rvrfc.n7fi1qx3 > div:nth-child(2) > div > div:nth-child(2) > div.j34wkznp.qp9yad78.pmk7jnqg.kr520xx4 > div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p > div > div > div > div > div > div > div > div > div.rq0escxv.pmk7jnqg.du4w35lb.pedkr2u6.oqq733wu.ms05siws.pnx7fd3z.b7h9ocf4.j9ispegn.kr520xx4.k4urcfbm > div > div.a8nywdso.sj5x9vvc.rz4wbd8a.ecm0bbzt > div > div:nth-child(4) > div > div.ow4ym5g4.auili1gw.rq0escxv.j83agx80.buofh1pr.g5gj957u.i1fnvgqd.oygrvhab.cxmmr5t8.hcukyx3x.kvgmc6g5.nnctdnn4.hpfvmrgz.qt6c0cv9.jb3vyjys.l9j0dhe7.du4w35lb.bp9cbjyn.btwxx1t3.dflh9lhu.scb9dxdr > div.ow4ym5g4.auili1gw.rq0escxv.j83agx80.buofh1pr.g5gj957u.i1fnvgqd.oygrvhab.cxmmr5t8.hcukyx3x.kvgmc6g5.tgvbjcpo.hpfvmrgz.qt6c0cv9.rz4wbd8a.a8nywdso.jb3vyjys.du4w35lb.bp9cbjyn.btwxx1t3.l9j0dhe7 > div > div > div > div > span"
		 * )).click(); System.out.println("Logged out successfully");
		 */
	}

}
