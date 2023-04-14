package org.seleniumLearning;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class Actiontest {

	WebDriver driver;

	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void Actions() {

		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.linkText("Get started free"));
		
		Actions a= new Actions(driver);
		a.moveToElement(element).click().perform();
		
	}

	@AfterMethod
	public void aftermethod() {

	}

}
