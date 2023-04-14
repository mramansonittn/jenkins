package org.selenium;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollttn {
	public static void main(String[] args) throws InterruptedException, AWTException {

		// 4. Go to TTN website https://www.tothenew.com/ and perform all scrolling
		// operations.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.tothenew.com/");

		// Scroll throw javascript executer
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1550)");
//        Thread.sleep(2000);

		// Scroll throw CSS selector
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

		// Scroll throw Robot
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}
}
