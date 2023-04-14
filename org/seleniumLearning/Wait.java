package org.seleniumLearning;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Wait {

	WebDriver driver;

	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void Waitcommand() {

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // here it wait for 10 sec to move forward

		Alert al = driver.switchTo().alert();

		// here we accepting the alert
		al.accept();

	}
	@Test
	public void Waitcommand2() {
				
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		
		FluentWait<WebDriver> w= new FluentWait<WebDriver>(driver);
		w.withTimeout(Duration.ofSeconds(10));
		w.pollingEvery(Duration.ofSeconds(10));
		
		Alert al = driver.switchTo().alert();
		// here we accepting the alert
		al.accept();
		
	}

	@AfterMethod
	public void aftermethod() {

	}

}
