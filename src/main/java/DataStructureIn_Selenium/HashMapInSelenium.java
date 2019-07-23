package DataStructureIn_Selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {
	
	
	static HashMap<String, String> loginData()
	
	{
	HashMap<String,String> hmap = new HashMap<String,String>();
	hmap.put("x", "shifa@gmail.com");
	hmap.put("y", "shifa1@gmail.com");
	hmap.put("z", "shifa2@gmailcom");
	
	return hmap;
	
	
	
	}
	
	public static void main(String [] args) {
		
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resource/chromedriver");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://newtours.demoaut.com/");
		
		//login as x
		
		String credentials =loginData().get("y");
		
		String arr []  = credentials.split("@");
		
		driver.findElement(By.name("userName")).sendKeys(arr[0]);
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		
		driver.findElement(By.name("login")).click();
		
		//validation
		
		if(driver.getTitle().equals("Welcome:Mercury Tours")) {
			System.out.println("Test Passed");
		}
		else {
			
			System.out.println("Test failed");
		}
		
		driver.findElement(By.linkText("Home")).click();
		
	}
	
	
	
	
	
	
	

}
