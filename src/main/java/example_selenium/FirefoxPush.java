package example_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxPush {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.gecko.driver", "/Users/mamun79/Downloads/geckodriver");
		
       FirefoxOptions options = new FirefoxOptions();
		
		options.addPreference("dom.webnotifications.enabled", false);
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://redbus.in/");
		
		}
		catch (Exception e) {
		
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
		
		

	}

}
