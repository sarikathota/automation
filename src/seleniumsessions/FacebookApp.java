package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookApp {

	public static void main(String[] args) throws InterruptedException {
		//to lauch browser
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		
		
		
		driver.get("https:\\www.facebook.com");//url link
// id
		driver.findElement(By.id("u_0_l")).sendKeys("sarika");
		driver.findElement(By.id("u_0_n")).sendKeys("thota");
		driver.findElement(By.id("u_0_q")).sendKeys("7234567890");
		driver.findElement(By.id("u_0_x")).sendKeys("teddy@123");
		//handle drop box
		Select selectday = new Select(driver.findElement(By.id("day")));
		selectday.selectByIndex(17);
		Select selectmonth = new Select(driver.findElement(By.id("month")));
		selectmonth.selectByVisibleText("Sept");
		Select selectyear = new Select(driver.findElement(By.id("year")));
		selectyear.selectByVisibleText("1994");
		Thread.sleep(3000);
		
		
		//radio button
		driver.findElement(By.id("u_0_5")).click();
		
		
		driver.findElement(By.id("u_0_15")).click();
	}
	
	
}
