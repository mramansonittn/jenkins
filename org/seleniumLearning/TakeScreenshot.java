package org.seleniumLearning;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakeScreenshot {

	WebDriver driver;
	private TakesScreenshot webdriver;

	@BeforeMethod
	public void beforemethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@Test
	public void screenshot() {

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		TakesScreenshot ss =((TakesScreenshot)webdriver);
		
		File src= ss.getScreenshotAs(OutputType.FILE);
		
//		File des = new File(filepath);
		
//		FileUtils.copyFile(src, des);
	}

	@AfterMethod
	public void aftermethod() {

	}

}
