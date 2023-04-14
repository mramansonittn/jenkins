/*Q1- Launch Firefox browser & navigate to https://rahulshettyacademy.com/AutomationPractice/
Try to Fetch the alert popup text.
Try to Dismiss the popup.
Try to enter some data on an alert popup.
Try to accept the popup.*/

package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// Selenium day2 assignment
public class Exercise5 {
	public static void main(String[] args) throws InterruptedException {
		
		// this was working on firefox 
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Aman Soni\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Going to this URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Click on the alert button to trigger the alert popup
		driver.findElement(By.id("alertbtn")).click();

		// Try to Fetch the alert popup text
		Alert alert = driver.switchTo().alert();// Fetching the alert
		String alertText = alert.getText();
		System.out.println(alertText);
		Thread.sleep(5000);

		// Try to Dismiss the popup
		alert.dismiss();

		Thread.sleep(5000);
		// Try to enter some data on an alert popup
		WebElement confirm = driver.findElement(By.xpath("//input[@id='name']"));
		confirm.sendKeys("Aman");

		// clicking on the confirm
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(4000);

		// Try to accept the popup
		alert.accept();

		driver.quit();// for closing the all browser tab
	}
}
