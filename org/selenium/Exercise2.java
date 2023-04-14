package org.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Q5. Write a script to get the title of the “Contact Us” page.
		driver.get("https://www.tothenew.com/contact-us");
		System.out.println(driver.getTitle());

	}

}
