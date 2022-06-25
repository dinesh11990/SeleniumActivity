package com.arul.may.repractice.advanceselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//parent window
		
		String parent = driver.getWindowHandle();
		WebElement Fbutton = driver.findElement(By.id("home"));
		Fbutton.click();
		
		Set<String> child = driver.getWindowHandles();
		
		Thread.sleep(3000);
		
		for (String nWindow : child) {
			
			driver.switchTo().window(nWindow);
			
		}
		
		Thread.sleep(3000);
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		editBox.click();
		
		driver.close();
		
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		WebElement multipleWindow = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multipleWindow.click();
		
		int noWindows = driver.getWindowHandles().size();
		
		System.out.println(noWindows);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		
		Thread.sleep(3000);
		
		WebElement dontCloseMe=driver.findElement(By.id("color"));
		dontCloseMe.click();
		
		Set<String> final1 = driver.getWindowHandles();
		
		for (String allwindows : final1) {
			
			if(!allwindows.equals(parent)) {
				
				driver.switchTo().window(allwindows);
				driver.close();
			}
			
			driver.switchTo().window(parent);
		}
	}

}
