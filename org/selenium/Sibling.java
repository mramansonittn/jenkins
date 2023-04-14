package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sibling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver = new ChromeDriver();// this is casting here it refer to parent class
		driver.manage().window().maximize();
		// Going to this URL
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		
		
		Thread.sleep(5000);
		driver.quit();// for closing the all browser tab
	}

}
