package com.qa.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	

	@Test
	public void addreebookTest() throws InterruptedException
	{
		// Open chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		// open the url on the browser - get()
		
		driver.get("http://34.136.191.145:49153/addressbook/");
		
		// Maximize browser window
		
		driver.manage().window().maximize();
		
	// Test any element on webpage:
		// find the element to be tested and then perform action on it
		
	//	driver.findElement(address of element).action();
		// locators --attributes of element
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")).click();
		
	Thread.sleep(2000)	;
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[3]/input")).sendKeys("Sonal");
		
	Thread.sleep(2000)	;
		
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/input")).sendKeys("Mittal");
		
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[5]/td[3]/input")).sendKeys("abc@gmail.com");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[6]/td[3]/div/input")).sendKeys("5/19/21,");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")).click();
	
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());
	
	driver.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	}

}
