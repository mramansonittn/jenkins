package org.selenium;

//Day 1 selenium
import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// this is casting here it refer to parent class
		driver.manage().window().maximize();
//				
//		//DROP DOWN MENU
		// here we change site for drop down menu

		// Here we working on the select API OF THE SELENIUM
		/*
		 * driver.get("https://demo.guru99.com/test/newtours/register.php"); 
		  WebElement address = driver.findElement(By.xpath("//select[@name=\"country\"]")); Select
		  s=new Select(address); s.selectByVisibleText("INDIA");//here we enter the
		  element s.selectByIndex(2);//here we use index
		 */

		driver.get("https://demoqa.com/alerts");

		WebElement d = driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
		d.click();
		// Alert
		Alert a = driver.switchTo().alert();
		a.accept(); 
		

		// click three
		WebElement d1 = driver.findElement(By.xpath("//button[@id=\"confirmButton\"]"));
		d1.click();
		a.accept();

		// click four
		WebElement d2 = driver.findElement(By.xpath("//button[@id=\"promtButton\"]"));
		d2.click();
		a.sendKeys("Aman");
		a.accept();

	}

}
