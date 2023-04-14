package org.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();// this is casting here it refer to parent class

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// it wait for 30 seconds this is implicit wait
		/*
		 * Implicit - it use for a full page
		 *  explicit - it use for particular element
		 * and it have two type- a) web driver wait
		 * 						 b) fluent wait
		 */
		
		//Web driver wait object
		WebDriverWait w= new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/");
		driver.get("https://demoqa.com/automation-practice-form");// here we use this site because it for getting id in
		
		// here we change site for drop down menu		
		
		// here we use id
//		driver.findElement(By.id("firstName")).sendKeys("Aman"); //"By" here is a class
		// here we use class
//		driver.findElement(By.className("practice-form-wrapper"));
		// here we use css
//		driver.findElement(By.cssSelector("input#firstName[type=\"text\"]")).sendKeys("Aman");
//		Thread.sleep(5000); // here we use thread sleep to stop it for 5 sec to watch what happen		
		WebElement fname=driver.findElement(By.xpath("//input[@id=\firstName\"]"));
		w.until(ExpectedConditions.visibilityOf(fname));
		fname.sendKeys("Aman");

//		driver.getCurrentUrl();// ye yahi bata raha hai ki hum isi page pe hai ya nhi get kahi or toh nhi bhej raha

		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Aman");// enter the first name
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Soni");// enter the last name
		driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]")).sendKeys("soniaman@gmail.com");// here
																													// entering
																													// the
																													// mail
		driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();// click on the option
//		driver.findElement(By.xpath("//label[text()='male']")).click();
		// *[contains(text(),'Female')]
		// *[starts-with(text(),'Female')]
		// *[end-with(text(),'Female')]

		driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("9119362907");// enter the no.
		driver.findElement(By.xpath("//input[@id=\"subjectsInput\"]")).sendKeys("This is for demo purpose");// enter
																											// subject

//		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click();// Not working presently

		driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("This is for demo purpose");

//		Thread.sleep(5000); // here we use thread sleep to stop it for 5 sec to watch what happen
//		driver.close();// it close the web page

		
//		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(5, TimeUnit.SECONDS).ignoring(ElementClickInterceptedException.class);// here .class igonre kerta hai jis class ko ignore kerna hai
		// type 2 of doing upper work
//		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(ElementClickInterceptedException.class);// here .class igonre kerta hai jis class ko ignore kerna hai
		
		
		//Drop down
		
		
		
		
		/*
		 * Absoult - full path is called Absoult we generally don't use it because
		 */
		
		

	}

}
