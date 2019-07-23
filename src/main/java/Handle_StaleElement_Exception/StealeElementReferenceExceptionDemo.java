package Handle_StaleElement_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StealeElementReferenceExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resource/chromedriver");
		 
		 
		 WebDriver driver = new ChromeDriver();
		             
		  driver.get("http://www.pavantestingtools.com");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		 WebElement link = driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[6]/a"));
		 link.click();
		 
		 driver.navigate().back();
		 Thread.sleep(4000);
		 
		 
		try
		{
		 
		 link.click();
		 
		}
		catch (StaleElementReferenceException e) {
			
			  link = driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[6]/a"));
			 link.click();
			
		}
		

	}

}
