package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Path2usa {
	private WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
	}

	@Test
	public void testFindTravelCompanion() throws IOException, AWTException, InterruptedException {
		WebElement incity = driver.findElement(By.id("form-field-travel_from"));
		incity.sendKeys("Indira Gandhi International Airport  (DEL) Delhi");
		WebElement outcity = driver.findElement(By.id("form-field-travel_to"));
		outcity.sendKeys("Chandigarh Airport (IXC) Chandigarh");
		WebElement w = driver.findElement(By.id("form-field-travel_comp_date_between"));
		w.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Select select = new Select(w);
		select.selectByVisibleText("+-3Weeks");
		Thread.sleep(2000);
		WebElement w1 = driver.findElement(By.id("form-field-travel_comp_airline"));
		w1.click();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Select select1 = new Select(w1);
		select1.selectByVisibleText("Air india");
		Thread.sleep(2000);
		WebElement w2 = driver.findElement(By.id("form-field-travel_comp_airline"));
		w2.click();
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r2.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r2.keyPress(KeyEvent.VK_ENTER);
		Select select2 = new Select(w1);
		select2.selectByVisibleText("Bengali");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"travel_comp_form\"]/div/div[12]/button")).click();
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\Aman Soni\\Desktop\\ScreenShot");
		FileUtils.copyFile(sourceFile, destinationFile);
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearDown() {
// driver.quit();
	}
}
