package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelsLoginPage extends BasicPage {
	public TravelsLoginPage(WebDriver driver) {
		super(driver);
	}
	private By email = By.name("email");
	private By password = By.name("password");
	private By remeberMe = By.className("checkbox");
	private By forgetPass = By.cssSelector(".forget-password a");
	private By login = By.cssSelector("button.btn");
	
	public void setEmail(String email) {
		this.driver.findElement(this.email).sendKeys(email);
	}
	
	public void setPassword(String password) {
		this.driver.findElement(this.password).sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		this.driver.findElement(this.login).click();
	}
	
	public void clickOnRemember() {
		this.driver.findElement(this.remeberMe).click();
	}
	public void clickOnForget() {
		this.driver.findElement(this.forgetPass).click();
	}

}
