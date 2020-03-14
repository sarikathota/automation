package seleniumsessions;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//launch firefox;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\chromedriver.exe");
		//WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();//to maximaze the window
		

		driver.get("https:\\www.google.com");
	
		String title = driver.getTitle();

		System.out.println("title");
		if(title.equals("Google")) {
				System.out.println("correct title");
	}
		else {
			
		
			System.out.println("in correct title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();//to quit the browsers to close single window or parent window
		//driver.close();//it will close all tabs in the browser
	}

}
