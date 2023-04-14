package org.seleniumLearning;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selectpractice {
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test
	public void testServicesDropdown() throws InterruptedException {
		// Getting element and maximize the screen
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				
				Select sl =new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
				// here we selecting through the index
//				sl.selectByIndex(2);
				
				// here we selecting through the text
//				sl.selectByVisibleText("INDIA");
				// here we selecting through the value 
//				sl.selectByValue("INDIA");
				// HERE we checking the multiple
//				System.out.println(sl.isMultiple());
				Thread.sleep(500);
				 
		

	}

	@AfterClass
	public void tearDown() {
driver.quit();
	}
}
