package com.arul.may.repractice.advanceselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		
		/*
		 * WebElement OpenHP = driver.findElement(By.id("home")); OpenHP.click();
		 * 
		 * Set<String> allWindows = driver.getWindowHandles();
		 * 
		 * for (String newWindow : allWindows) {
		 * 
		 * driver.switchTo().window(newWindow);
		 * 
		 * }
		 * 
		 * WebElement editBox =
		 * driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"
		 * )); editBox.click();
		 * 
		 * driver.close();
		 * 
		 * driver.switchTo().window(parent);
		 * 
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * 
		 * WebElement OpenMulti = driver.findElement(By.xpath(
		 * "//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		 * OpenMulti.click();
		 * 
		 * int numberOfWindows = driver.getWindowHandles().size();
		 * System.out.println("Number of Windows Opened: "+numberOfWindows);
		 * driver.close();
		 */
		
		WebElement dontCloseMe=driver.findElement(By.id("color"));
		dontCloseMe.click();
		
		Thread.sleep(3000);
		
		Set<String> newWindow = driver.getWindowHandles();
		
		for (String allWindow : newWindow) {
			
			if(!allWindow.equals(parent)) {
				
				driver.switchTo().window(allWindow);
				driver.close();
			}
			
			
		}
		
		driver.switchTo().window(parent);

	}

}
