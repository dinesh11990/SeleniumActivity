package com.arul.may.repractice.advanceselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		  driver.switchTo().frame(0);
		  
		  WebElement frameOne = driver.findElement(By.id("Click")); 
		  frameOne.click();
		  
		  
		  String Text=driver.findElement(By.id("Click")).getText(); //Here I am getting
		  //the value of the "Click" button. So I'm using
		  driver.findElement(By.id("Click")).getText();
		  System.out.println(Text);
		  
		  Thread.sleep(3000);
		 
		  //driver.switchTo().frame(arg0);
		
		/*
		 * driver.switchTo().frame(1); //here 1 denotes the second iframe..since we dont
		 * //have [id] very very important. driver.switchTo().frame("frame2"); //this
		 * //denotes the nested iframe. here "frame2" denotes the id of nested frame.
		 * WebElement button2=driver.findElement(By.id("Click1")); button2.click();
		 * 
		 * 
		 * List<WebElement> total = driver.findElements(By.tagName("iframe")); int size
		 * = total.size(); System.out.println(size);
		 */

	}

}
