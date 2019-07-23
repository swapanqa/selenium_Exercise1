package example_selenium;

import javax.accessibility.AccessibleRelationSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleChatBot1 {
	
	/**
	 * A chatbot is an artificial intelligence (Al) software /service that can simulate a conversation (or a chat) wirh
	 * a user in natural language through messageing application,websites,mobile apps or through the telephone.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resource/chromedriver");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		System.out.println("waiting for the frame");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@style,'height') and contains(@class,'intercom')]")));
		
		System.out.println("frame found and Switched");
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Sign up the team')]"))).build().perform();
		
		System.out.println("mouse hover");
		
		driver.findElement(By.xpath("//div[contains(@class,'dismiss-button')]")).click();
		
		System.out.println("Closing chat bot");
		
	}

}
