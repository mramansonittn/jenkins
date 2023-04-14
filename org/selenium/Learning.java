package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Learning {
	private WebDriver driver;

	@BeforeClass
	public void BeforeClasses() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

	}

	@Test
	public void demo() {

		/*
		 * String mainwindow = driver.getWindowHandle()
		   // It stores parent window value in a unique identifier of string type. 
		   Set<String> s = driver.getWindowHandles()
		   // All child windows are stored in a set of strings.
		  Iterator<String> i = s.iterator() 
		   //  Here we will iterate through all child windows.
		 */
	}

	@AfterClass
	public void AfterClasses() {
		driver.quit();
	}

}
