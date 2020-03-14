package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);// to switch to frame
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable")))
		.release()
		.build()
		.perform();

	}

}
