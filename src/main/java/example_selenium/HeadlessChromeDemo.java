package example_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	public static void main(String[] args) {
		test();

	}
	
	public static void test() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resource/chromedriver");
		
        ChromeOptions options = new ChromeOptions();
		
		options.addArguments("----headless");
		options.addArguments("window--size=");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
