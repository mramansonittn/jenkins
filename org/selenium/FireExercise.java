package org.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireExercise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aman Soni\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// Q1. Write a script to open the Firefox browser and open https://www.google.com/ URL.
		driver.get("https://www.google.com/");
		
		
	
	}

}
