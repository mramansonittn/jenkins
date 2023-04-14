package org.seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptEx {

	WebDriver driver;

	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void jsScript() {

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 1000)");
		
        WebElement Element = driver.findElement(By.linkText("Linux"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	@AfterMethod
	public void aftermethod() {

	}

}
