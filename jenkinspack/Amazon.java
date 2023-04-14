/*
 * Q3- Create a TestNg base project for amazon (at least create test cases for the homepage, search page, and add to cart) with Assertions 

*/

package jenkinspack;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon {

	private static WebDriver driver;

	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aman Soni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// this is casting here it refer to parent class
		driver.manage().window().maximize();
		//
		WebDriverWait driverWait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

	}

	@Test(priority = 1)
	public void TestHomepagetitle() {
		// Get the title
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 2)
	public void TestSearch() {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("apple watch");
		searchBox.submit();
		String expectedTitle = "Amazon.in : apple watch";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 3)
	public void TestAddcart() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple watch");
        driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> ee=driver.findElements(By.xpath("//a[@class=\"a-link-normal s-no-outline\"]"));
        ee.get(0).click(); 
        Set<String>handle=driver.getWindowHandles();
        driver.switchTo().window(handle.stream().toList().get(1));
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.id("nav-cart")).click();
//        Thread.sleep(5000);
	}

	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}
