/*Q4-Open this URL(https://demoqa.com/) and perform drag and drop, right-click using the Action class 


*/
package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//  Drag and drop
		driver.get("https://demoqa.com/droppable/");

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		Thread.sleep(5000);

		// Right click
//		driver.get("https://demoqa.com/");
//
//		WebElement element = driver.findElement(By.xpath("//div[@class=\"card-up\"][1]"));
//
//		Actions actions = new Actions(driver);
//		actions.contextClick(element).perform();
//		Thread.sleep(5000);

		driver.quit();
	}
}
