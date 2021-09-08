package org.selmei;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerLogin {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Vinith\\eclipse-workspace\\'selenium mei'\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	 WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
	findElement.sendKeys("instragram");
	driver.close();
	
	
	
	}

}
