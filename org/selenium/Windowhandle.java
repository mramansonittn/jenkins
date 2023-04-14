package org.selenium;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Windowhandle {
	private static WebDriver driver;

	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// this is casting here it refer to parent class
		driver.manage().window().maximize();
		WebDriverWait driverWait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/browser-windows");
	}

	@Test
	public void demo() {
//		WebElement ele = driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
//		ele.click();
//		WebElement ele1 = driver.findElement(By.xpath("//button[@id=\"windowButton\"]"));
//		ele1.click();

	}

	@Test
	public void ifram() {
		driver.switchTo().frame(1);
	}

	@Test
	public void tab() {
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		String whandle = driver.getWindowHandle();
		System.out.println(whandle);
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);

		String read = driver.switchTo().window(s.stream().toList().get(1)).findElement(By.id("sampleHeading"))
				.getText();
		Assert.assertEquals(read, "This is a sample page");

	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}

}
