package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsCarsExtras;
import pages.TravelsCarsPage;
import pages.TravelsLoginPage;

public class LoginTest extends BasicTest {
private String baseURL = "https://www.phptravels.net/admin";
	
	@Test (priority = 0)
	public void loginTest() throws InterruptedException, IOException {
		driver.get(baseURL);
		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
		
		TravelsLoginPage tlp = new TravelsLoginPage(driver);
		File file = new File("Username.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String email = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		tlp.setEmail(email);
		tlp.setPassword(password);
		Thread.sleep(2000);
//		tlp.setEmail("admin@phptravels.com");
//		tlp.setPassword("demoadmin");
		tlp.clickOnRemember();
//		tlp.clickOnForget();
		tlp.clickOnLoginBtn();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Dashboard");
	}

}
