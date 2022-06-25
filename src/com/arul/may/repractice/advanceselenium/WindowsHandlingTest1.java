package com.arul.may.repractice.advanceselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parentWindow = driver.getWindowHandle();
		
		WebElement Fbutton = driver.findElement(By.id("home"));
		Fbutton.click();
		
		Thread.sleep(3000);
		
		Set<String> cWindow = driver.getWindowHandles();
		
		for (String newWindow : cWindow) {
			
			driver.switchTo().window(parentWindow);			
		}
		
		Thread.sleep(3000);
		
		WebElement dontCloseMe=driver.findElement(By.id("color"));
		dontCloseMe.click();
		
		Set<String> closeall = driver.getWindowHandles();
		
		for (String allwindows : closeall) {
			
			if(!allwindows.equals(parentWindow)) {
				
				driver.switchTo().window(allwindows);
				driver.close();
				
			}
			driver.switchTo().window(parentWindow);
			
		}
		driver.quit();		
		
		
	}

}
