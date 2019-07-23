package ExceptionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_ElementNotClickable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resource/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		
		
		
		
		
		

	}

}
