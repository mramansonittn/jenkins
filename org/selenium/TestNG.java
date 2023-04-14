package org.selenium;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestNG {
	private static WebDriver driver;
	
	@BeforeMethod
	 public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// this is casting here it refer to parent class
		driver.manage().window().maximize();
		WebDriverWait driverWait=new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/automation-practice-form");
	}
//	@Parameters("browser")
	@Test
	public void demo() {//here we write enable=false is won't run
		String e="DEMOQA1"; // here it match so dont print any thing 
		String sTitle =driver.getTitle();
		System.out.println(sTitle);
		Assert.assertEquals(sTitle, e,"Title doesnt match");
//		WebElement el=driver.findElement(By.xpath("//label[text()='Female']")));
		Actions action = new Actions(driver);
//		action.moveToElement(el).click().perform();
//		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.id("firstName"));
		name.sendKeys("Amand");
		String fname= name.getText();
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("SSoni");
		String flname= lname.getText();
		WebElement check=driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
		check.sendKeys("aman.soni@gmail.com");
		String email =check.getTagName();
		
		Assert.assertEquals(fname, "Aman","FirstName was not expected");
		Assert.assertEquals(flname, "Soni","LastName was not expected");
		Assert.assertEquals(email, "aman.soni@tothenew.com","Email was not expected");
		
		
		WebElement st=driver.findElement(By.xpath("//h5"));
		st.isDisplayed();
		String s= st.getText();
		Assert.assertEquals(s, "Student Registration Form");
		
		System.out.println(st.getText());
		
	}
	@Test
	public void demo1() {
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
