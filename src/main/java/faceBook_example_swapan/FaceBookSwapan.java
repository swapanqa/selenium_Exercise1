package faceBook_example_swapan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSwapan {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resource/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.id("email")).sendKeys("mamunny79@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("shifa2015");
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		 js.executeScript("arguments[0].click();", loginbutton);
		 
		 js.executeScript("alert('Welcome to swapanFaceBook!');");
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 try {
		 String DomainName = js.executeScript("return document.domain;").toString();
		 
		 
		 
		 
	        System.out.println("Domain name of the site = "+DomainName);
		 }catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		   js.executeScript("window.scrollBy(0,900)");
		 

	}

}
