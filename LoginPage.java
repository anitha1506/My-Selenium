package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	public LoginPage(WebDriver chrdriver){
		System.out.println("&&&&&&&&&&"+chrdriver);
		this.ldriver = chrdriver;
		PageFactory.initElements(chrdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement login;
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	public void setUsername(String uName) {
		email.clear();   
		email.sendKeys(uName);
	}
	public void setPassword(String upwd) {
		pwd.clear();
		pwd.sendKeys(upwd);
	}
	public void clicklogin() {
		login.click();
	}
	public void clicklogout() {
		logout.click();
	}
}
