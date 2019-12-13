package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelsMenuPage extends BasicPage {
	public TravelsMenuPage(WebDriver driver) {
		super(driver);
	}
	private By dashboard = By.cssSelector("ul#social-sidebar-menu li a");
	private By updates = By.cssSelector("#social-sidebar-menu > li:nth-child(2) > a");
	private By modules = By.cssSelector("#social-sidebar-menu > li:nth-child(3)");
	private By tours = By.cssSelector("#social-sidebar-menu > li:nth-child(9)");
	private By cupons = By.cssSelector("#social-sidebar-menu > li:nth-child(15)");
	private By addNew = By.xpath("//*[@id=\"Tours\"]/li[2]/a");
	private By newsletter = By.cssSelector("#social-sidebar-menu > li:nth-child(16)");
	private By bookings = By.cssSelector("#social-sidebar-menu > li:nth-child(17)");
	private By cars = By.cssSelector("#social-sidebar-menu > li:nth-child(10)");
	private By carsCars = By.cssSelector("#Cars > li:nth-child(1)");
	private By carsExtras = By.cssSelector("#Cars > li:nth-child(2)");
	private By customers = By.cssSelector("#ACCOUNTS > li:nth-child(3) > a");
	
	public void clickCustomers() {
		this.driver.findElement(this.customers).click();
	}
	public void clickDashboard() {
		this.driver.findElement(this.dashboard).click();
	}
	public void clickUpdates() {
		this.driver.findElement(this.updates).click();
	}
	public void clickModules() {
		this.driver.findElement(this.modules).click();
	}
	public void clickTours() {
		this.driver.findElement(this.tours).click();
	}
	public void clickAddNew() {
		this.driver.findElement(this.addNew).click();
	}
	public void clickCupons() {
		this.driver.findElement(this.cupons).click();
	}
	public void clickNewsletter() {
		this.driver.findElement(this.newsletter).click();
	}
	public void clickBooking() {
		this.driver.findElement(this.bookings).click();
	}
	public void clickCars() {
		this.driver.findElement(this.cars).click();
	}
	public void clickCarsCars() {
		this.driver.findElement(this.carsCars).click();
	}
	public void clickCarsExtras() {
		this.driver.findElement(this.carsExtras).click();
	}

}
