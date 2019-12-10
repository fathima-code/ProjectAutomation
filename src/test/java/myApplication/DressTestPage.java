package myApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DressTestPage {

	WebDriver driver;

	@BeforeMethod
		public void lunch() {
			
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
			 WebDriver driver =new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			 driver.manage().window().maximize();
	}

	@DataProvider(name = "ValidLogin")

	public Object[][] getdata() {
		Object[][] data = new Object[3][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "fathima";
		data[1][1] = "admin123";

		data[2][0] = "Admin";
		data[2][1] = "admin123";

		return data;
	}

	@Test(dataProvider = "ValidLogin")

	public void verifypara(String Username, String Password) {
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
	}
}
