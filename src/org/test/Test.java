package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Set up the Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokul L\\eclipse-workspace\\Gokul Flipkart Page\\driver\\chromedriver.exe");
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//go to the url
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
	
		
		WebElement textUserid = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		textUserid.sendKeys("8489165569");
		
		WebElement textPassword = driver.findElement(By.xpath("//input[@type='password']"));
		textPassword.sendKeys("Gx@9033");
		
		WebElement btnSubmit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnSubmit.click();
		
		Thread.sleep(5000);
		
		WebElement textIphone = driver.findElement(By.xpath("//input[@name='q']"));
		textIphone.sendKeys("iphone13 pro max");
		
		Thread.sleep(7000);
		
		WebElement btnSearch = driver.findElement(By.xpath("//button[@type='submit']"));
		btnSearch.click();
		
		Thread.sleep(5000);
		
		WebElement textPro = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro Max (Graphite, 128 GB)']"));
		textPro.click();
		
		Thread.sleep(5000);
		
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		WebElement textAdd = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
		jk.executeScript("arguments[0].scrollIntoView('true')", textAdd);
		
		
		
		
		
	}

}
