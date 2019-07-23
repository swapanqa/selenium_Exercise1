package example_selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatBot_Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resource/chromedriver");	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	try {	
	List<WebElement> element = driver.findElements(By.xpath("//div[@id='corover-close-btn']"));	
		
	System.out.println("Found chat bot");
	
	if(element.size()>0)
	{
		element.get(0).click();
		System.out.println("Closing chat bot");
	}
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
		
		
		
		
		
		

	}

}
