package com.arul.may.repractice.advanceselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement frameOne = driver.findElement(By.id("Click")); 
		frameOne.click();
		
		String gettext = frameOne.getText();
		System.out.println(gettext);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2=driver.findElement(By.id("Click1")); 
		button2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> total = driver.findElements(By.tagName("iframe"));
		int size = total.size(); 
		System.out.println(size);
		
	     
	}

}
