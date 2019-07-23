package example_selenium;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class VerifyDropDownSortedOptions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resource/chromedriver");
		
		WebDriver driver = new ChromeDriver();
        
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("animals"));
		 Select select = new Select(element);
		 
		 List originalList = new ArrayList();
		 List tempList = new ArrayList();
		 
		 
		 List<WebElement> options = select.getOptions();
		 
		 
		 for(WebElement e:options) {
			 
			 originalList.add(e.getText());
			 tempList.add(e.getText());
		 }
		
		System.out.println("Before sorting Original list :" + originalList);
		
		//List tempList = new ArrayList();
		
		// tempList = originalList;
		 
		 System.out.println("Before sorting temp list :" +tempList);
		
		 Collections.sort(tempList);
		
		System.out.println("After sorting original list :" + originalList);
		System.out.println("After sorting temp list :" + tempList);
		
		
		if(originalList == tempList)
		{
			System.out.println("Dropdown sorted");
		}
		
		else
		{
			System.out.println("Dropdown Not sorted");
		}
		
		driver.close();
		
	}

}
