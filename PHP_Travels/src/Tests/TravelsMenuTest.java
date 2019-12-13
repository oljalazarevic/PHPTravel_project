package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsMenuPage;

public class TravelsMenuTest extends LoginTest {
	private String baseURL = "https://www.phptravels.net/admin";

	@Test (priority = 5)
	public void clickUpdates() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(2000);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickUpdates();
		Assert.assertEquals(driver.getTitle(), "Updates");
		Thread.sleep(1000);
	}
	@Test (priority = 10)
	public void clickCars() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(2000);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickCars();
		Thread.sleep(1000);
		tmp.clickCarsCars();
		Assert.assertEquals(driver.getTitle(), "Cars Management");
	}
	@Test (priority = 15)
		public void clickBooking() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(2000);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickBooking();
		Assert.assertEquals(driver.getTitle(), "Booking Management");
	}
	@Test (priority = 20)
		public void clickCupons() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(2000);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);	
		tmp.clickCupons();
		Assert.assertEquals(driver.getTitle(), "Coupon Codes Management");
		Thread.sleep(1000);
	}
	@Test (priority = 25)
		public void clickModules() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(2000);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickModules();
		Assert.assertEquals(driver.getTitle(), "Modules");
		Thread.sleep(1000);
	}
	@Test (priority = 30)
		public void clickNewsletter() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(2000);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickNewsletter();
		Assert.assertEquals(driver.getTitle(), "Newsletter Management");
		Thread.sleep(1000);
	}
	@Test (priority = 35)
		public void clickTours() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(2000);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickTours();
		Thread.sleep(1000);
		tmp.clickAddNew();
		Assert.assertEquals(driver.getTitle(), "Add Tour");
	}
	

}
