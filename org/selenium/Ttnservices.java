package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ttnservices {
	private WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.tothenew.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void testServicesDropdown() throws InterruptedException {

		WebElement opt = driver.findElement(By.xpath("(//a[@id=\"h-Services\"])[2]"));
		Assert.assertTrue(opt.isDisplayed());
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearDown() {
driver.quit();
	}
}
