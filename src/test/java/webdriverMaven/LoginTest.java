package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\puja\\eclipse-workspace\\webdriverMaven\\src\\test\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@Test
	//
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("puja.holy@gmail.com");
	driver.findElement(By.id("Passwd")).sendKeys("pujaPuja1@3");
	driver.findElement(By.id("SignIn")).click();
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
