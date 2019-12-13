package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsCarsExtras;

public class TravelsCarsExtrasTest extends LoginTest {
private String baseURL = "https://www.phptravels.net/admin";
	
	@Test (priority = 0)
	public void extras() throws InterruptedException {
		driver.get ("https://www.phptravels.net/admin/cars/extras");
		Thread.sleep(2000);
		TravelsCarsExtras tce = new TravelsCarsExtras(driver);
		tce.clickAdd();
		Thread.sleep(1000);
		tce.setName("Yugo");
		Thread.sleep(1000);
		tce.setPrice("456");
		tce.clickStatus();
		Thread.sleep(1000);
		tce.clickOnUpload();
		Thread.sleep(3000);
		tce.clickOnSave();
		Thread.sleep(4000);		
		Assert.assertTrue(tce.getRow().getText().contains("Yugo"));
		Thread.sleep(2000);
		Assert.assertTrue(tce.getRow().getText().contains("456"));
	}

}
