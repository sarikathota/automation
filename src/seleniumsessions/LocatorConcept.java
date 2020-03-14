package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\www.facebook.com");
		//id
		//driver.findElement(By.id("u_0_l")).sendKeys("sarika");
		//driver.findElement(By.id("u_0_n")).sendKeys("thota");
		
		//xpath
		
		
		//driver.findElement(By.xpath(xpathExpression))).sendKeys("sarika");
		//driver.findElement(By.xpath(xpathExpression)).sendKeys("thota");
		
		
		//class
		
		
		driver.findElement(By.name("firstname")).sendKeys("sarika");
		driver.findElement(By.name("lastname")).sendKeys("thota");
		
		//linktext
		//driver.findElement(By.linkText("Create a Page")).click();
		
		//partiallinktext
		//driver.findElement(By.partialLinkText("Cookie")).click();
		
		
		//CSSselector
		//driver.findElement(By.cssSelector("#u_0_l")).sendKeys("sarika");
		
		//class name
		driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();
		
		
		
		
	}

}
