package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNG2 {
	
private static WebDriver driver;
	
	@BeforeClass
	 public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// this is casting here it refer to parent class
		driver.manage().window().maximize();
		//
		WebDriverWait driverWait=new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test(priority = -1)
	public void logindemo() {
		WebElement Chlogin= driver.findElement(By.xpath("//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]"));
		String log=Chlogin.getText();
		Assert.assertEquals(log, "Login");
		
	}
	@Test (priority = 0)
	public void demo() throws InterruptedException {
		WebElement UserName= driver.findElement(By.xpath("//input[@name=\"username\"]"));
		UserName.sendKeys("Admin");
		WebElement password= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		WebElement dashboard= driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]"));
		String dash= dashboard.getText();
		
		Assert.assertEquals(dash, "Dashboard");

		
	}
	@Test (priority = 1)
	public void adminDemo() throws AWTException {
		
		WebElement adminbtn = driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item\"][1]"));
		adminbtn.click();
		WebElement add = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
		add.click();
		
		WebElement opt1 = driver.findElement(By.xpath("//label[@class=\"oxd-label oxd-input-field-required\"][1]"));
		Select s=new Select(opt1); s.selectByVisibleText("INDIA");
		s.selectByIndex(2);
		
		//Drop down method of this site in add 
//		Robot r=new Robot();// different from the selenium action
		
		
		WebElement E_name= driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
		E_name.sendKeys("Aman Soni");
		WebElement P_name= driver.findElement(By.xpath("//input[@type=\"password\"][1]"));
		P_name.sendKeys("Aman@1234");
		WebElement P_name1= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
		P_name1.sendKeys("Aman@1234");
		
		
	}
	@AfterClass
	public void closebrowser() {
//		driver.close();
	}


}
