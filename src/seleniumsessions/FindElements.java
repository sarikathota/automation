package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		//1.to get the count links on the page
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i=0;i<linklist.size();i++)
		{
		String linktext= linklist.get(i).getText();
		System.out.println(linktext);
		}
			
		

	}

}
