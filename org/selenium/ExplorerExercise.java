package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class ExplorerExercise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver","C:\\Users\\Aman Soni\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		// Q1. Write a script to open the Explorer browser and open https://www.google.com/ URL.
		driver.get("https://www.google.com/");
		
		
	
	}

}
