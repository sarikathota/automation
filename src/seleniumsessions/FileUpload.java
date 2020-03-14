package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(5000);
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\DELL1\\Downloads\\Career @ Sasken_files");

	}

}
