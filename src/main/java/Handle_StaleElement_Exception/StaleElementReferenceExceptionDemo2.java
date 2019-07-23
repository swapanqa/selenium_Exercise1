package Handle_StaleElement_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionDemo2 {

	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resource/chromedriver");
		 
		 
		 WebDriver driver = new ChromeDriver();
		             
		 driver.get("https://www.freecrm.com/index.html");
		
	WebElement username =	 driver.findElement(By.name("username"));
	username.sendKeys("pavanoltraining");
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("xyz");
		 
	driver.navigate().refresh();	

	}

}
