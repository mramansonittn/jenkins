package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Headless testing here we doing also 
// Also finding the Dob count of any person in the wikepedia
public class ParallelBrowser {

	private static WebDriver driver;

	@BeforeClass
	public void launch() {
		System.out.println("Parallel browser");

	}

	@Test
	public void brow1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Sidharth_Shukla");

	}

	@Test
	public void brow2() {

		// firefox
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Aman Soni\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Sidharth_Shukla");

	}

	@Test
	public void brow3() {

		// edge
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Aman Soni\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Sidharth_Shukla");

	}

	@AfterClass
	public void closebrowser() {
//		driver.close();
	}

}
