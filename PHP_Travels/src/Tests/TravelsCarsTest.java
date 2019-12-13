package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsCarsPage;

public class TravelsCarsTest extends LoginTest {
	private String baseURL = "https://www.phptravels.net/admin";

	@Test(priority = 5)
	public void checkCars() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin/cars");
		Thread.sleep(2000);
		TravelsCarsPage tcp = new TravelsCarsPage(driver);
		tcp.isCars10();
		Assert.assertEquals(tcp.isCars10(), false);


	}

	@Test(priority = 10)
	public void checkCars2() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin/cars");
		Thread.sleep(2000);
		TravelsCarsPage tcp = new TravelsCarsPage(driver);
		tcp.isOrdersMoreThen50();
		Assert.assertFalse(tcp.isOrdersMoreThen50());
	}
	@Test(priority = 20)
	public void AddCar() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin/cars");
		Thread.sleep(2000);
		TravelsCarsPage tcp = new TravelsCarsPage(driver);
		tcp.clickUpload();
		Thread.sleep(2000);
		tcp.clickAdd();
		Thread.sleep(2000);
		tcp.clickOnUpload();
	}

}
