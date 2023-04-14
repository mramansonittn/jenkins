package org.seleniumLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
	}
	
	@Test
	public void Alerts() {
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		
		Alert al = driver.switchTo().alert();
		
		// here we accepting the alert
		al.accept();
		
		
	}
	@AfterMethod
	public void aftermethod() {
		
	}

}
