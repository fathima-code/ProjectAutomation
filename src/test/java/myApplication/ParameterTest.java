package myApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	@Test
	@Parameters({ "url", "Usename", "Password" })

	public void Login(String url, String Username, String Password) {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("Url");
		driver.manage().window().maximize();
		WebElement V = driver.findElement(By.id("txtUsername"));
		V.clear();
		V.sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys("Password");

	}
}
