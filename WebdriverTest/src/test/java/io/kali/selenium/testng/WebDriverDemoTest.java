package io.kali.selenium.testng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class WebDriverDemoTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		//Thread.sleep(5000);  // Let the user actually see something!
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@name='btnK']")).submit();
		
		Assert.assertTrue(title.contains("Google"));
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "c:\\temp\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
