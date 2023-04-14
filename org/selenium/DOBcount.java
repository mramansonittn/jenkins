package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Headless testing here we doing also 
// Also finding the Dob count of any person in the wikepedia
public class DOBcount {

	private static WebDriver driver;

	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//
		WebDriverWait driverWait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://en.wikipedia.org/wiki/Sidharth_Shukla");

	}

	@Test(priority = 0)
	public void FindDoB() {
		List<WebElement> ct = driver.findElements(By.xpath("//*[contains(text(),'12 December 1980')]"));

		int count = ct.size();
		System.out.println(count);
	}

	@AfterClass
	public void closebrowser() {
//		driver.close();
	}

}
