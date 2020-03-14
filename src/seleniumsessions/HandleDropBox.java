package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\www.facebook.com");
		
		 driver.findElement(By.id("u_0_l")).sendKeys("sarika");
	     driver.findElement(By.id("u_0_n")).sendKeys("thota");
		
		
		//handle drop box
	     Select select= new Select(driver.findElement(By.id("month")));
		 select.selectByVisibleText("Sept");
		
	}

}
