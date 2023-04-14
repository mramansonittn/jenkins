package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		//Q4: Write a script to open http://www.tothenew.com/ and then navigate to the contact us page using 1) XPath 2) ID
		driver.get("https://www.tothenew.com/");
		WebElement add = driver.findElement(By.xpath("(//a[@id=\"h-contact-us\"])[2]"));
		add.click();
		
		WebElement add1 =driver.findElement(By.id("(h-contact-us)[2]"));// this is doutb 
		add1.click();

	}

}
