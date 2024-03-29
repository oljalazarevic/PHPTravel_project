package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCarsPage extends BasicPage {
	public TravelsCarsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By cars = By.cssSelector(".xcrud-row");
	private List<WebElement> listCars = driver.findElements(this.cars);
	private By orders = By.cssSelector(".form-control.input-sm");
	private By uploadfoto = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[9]/a");
	private By addFoto = By.cssSelector("a.btn.btn-success");
	private By foto = By.cssSelector("input.dz-hidden-input");
	
	public boolean isCars10() {
		boolean cars1 = false;
		WebElement cars = driver.findElement(this.cars);
		if (listCars.size() == 10) {
			cars1 = true;
		}
		return cars1;
	}

	public boolean isOrdersMoreThen50() {
		boolean orders = false;
		int sumOrder = 0;
		WebElement orderNumbr = driver.findElement(this.orders);
		List<WebElement> cars = driver.findElements(this.orders);
		for (int i = 0; i < cars.size(); i++) {
			String str = cars.get(i).getAttribute("value");
			int number = Integer.valueOf(str);
			sumOrder += number;
		}
		if (sumOrder > 50) {
			orders = true;
		}
		return orders;
	}
	public void clickUpload() {
		this.driver.findElement(this.uploadfoto).click();
	}
	public void clickAdd() {
		this.driver.findElement(this.addFoto).click();
	}
	public void clickOnUpload() {
		WebElement uploadPicture = driver.findElement(By.cssSelector("input.dz-hidden-input"));
		uploadPicture.sendKeys("C:\\Users\\Portal\\Desktop\\kauc.jpg");
	}


}
