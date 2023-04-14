package org.selenium;
/*
 * <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Q3: Write a script to search the “To The New” string in google.
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys("To The New");
		driver.findElement(By.xpath("//input[@class=\"gNO89b\"]")).submit();


	}

}
