package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Qkart {
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://crio-qkart-frontend-qa.vercel.app/register");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void Registertitle() {
		WebElement Regtitle = driver.findElement(By.xpath("//h2[@class=\"title\"]"));
		Assert.assertTrue(Regtitle.isDisplayed());
	}

	@Test(priority = 1)
	public void checkingDetails() {
		WebElement Name = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		Name.sendKeys("Aman");
		Assert.assertTrue(Name.isEnabled());
		WebElement Password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		Assert.assertTrue(Password.isEnabled());
		Password.sendKeys("");

		WebElement RPassword = driver.findElement(By.xpath("//input[@id=\"confirmPassword\"]"));
		Assert.assertTrue(RPassword.isEnabled());
		RPassword.sendKeys("");

	}

	@Test(priority = 2)
	public void Registerbtn() {
		WebElement Registerbutton = driver.findElement(By.xpath("//button[@type=\"button\"]"));
		Assert.assertTrue(Registerbutton.isEnabled());
	}

	@Test(priority = 3)
	public void Loginherebtn() {
		WebElement loginhere = driver.findElement(By.xpath("//a[@class=\"link\"]"));
		Assert.assertTrue(loginhere.isEnabled());
	}

	@Test(priority = 4)
	public void BackPageNavigator() {
		WebElement backpage = driver.findElement(By.xpath(
				"//button[@class=\"MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root explore-button css-1urhf6j\"]"));
		Assert.assertTrue(backpage.isEnabled());
	}

	@AfterClass
	public void tearDown() {
//		driver.quit();
	}
}
