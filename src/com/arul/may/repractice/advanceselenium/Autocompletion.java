package com.arul.may.repractice.advanceselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Autocompletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement button1=driver.findElement(By.id("tags"));
		button1.sendKeys("s");
		
		List<WebElement> select = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
		System.out.println(select.size());
		
		for (WebElement webElement : select) {
			
			if(webElement.getText().equals("Selenium")){
				
				webElement.click();
				
				//System.out.println("Selecting :"+webElement.getText());
				System.out.println("If part");
				break;
				
			}else {
				
				System.out.println("else part");
				
		
				
			}
		}

	}

}
