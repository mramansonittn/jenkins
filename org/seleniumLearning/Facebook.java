package org.seleniumLearning;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {
	private WebDriver driver;
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();

	}

	
	@Test
	public void demo() throws AWTException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		Select s= new Select(driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]")));
		
		s.selectByValue("option3");
		
		
		
	}
	
	@AfterMethod
	public void closing() {
//		driver.close();
	}
	
	
}
