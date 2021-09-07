package org.selmei;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittest {
	static WebDriver driver;
	@BeforeClass
	public static void Beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinith\\eclipse-workspace\\'selenium mei'\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	  }
	@Before
	public void before() {
		Date date=new Date();
		System.out.println("starting date is"+date);

	}
	@After
	public void after() {
		Date date=new Date();
		System.out.println("ending date is "+date);
		

	}
	@Test
	public void test() {
		WebElement findElement = driver.findElement(By.xpath("//input[@ype='text']"));
		findElement.sendKeys("india@gmail.com");
		

	}
	
		

	
	@AfterClass
	public static void af() {
		driver.quit();

	}
	

	
	
	
	

}
