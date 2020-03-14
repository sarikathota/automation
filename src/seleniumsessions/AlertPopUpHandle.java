package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
class AlertPopUpHandle {
	
	public static void main(String[] args) throws InterruptedException {
	//to lauch browser
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL1\\eclipse-workspace\\sample project\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");//url link
			driver.findElement(By.name("proceed")).click();
			Thread.sleep(5000);
			
			Alert alert = driver.switchTo().alert();
			System.out.println("alert.getText()");
			String text= alert.getText();
			if(text.equals("please enter the user name"))// validation
			{
				System.out.println("correct msg");
			}
			else
			{
				System.out.println("wrong msg");
			}
		
		
			alert.accept();//to accept 
			//alert.dismiss();//to cancel
	
		

	}

}
