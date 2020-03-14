package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("clothes");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("clothes");
		Thread.sleep(5000);
        //driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("clothes");
        //id=1234
        //id=4567
        //id =8909
        //driver.findElement(By.xpath("//input[contains(@id,'test_')])")).sendKeys("dress");
        //id= test_test-5678_t
        //driver.findElement(By.xpath("//input[starts-with(@id,'test_test_')])")).sendKeys("dress");
        //id= 1234_test_t
        //id=5678_test-t
       // driver.findElement(By.xpath("//input[ends-with(@id,'_test_t)]")).sendKeys("dress");
        
        //for link text
        driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
	}
}

        
        
        
	

