package com.arul.may.repractice.advanceselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> select = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		int size = select.size();
		System.out.println(size);
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.clickAndHold(select.get(0));
		action.clickAndHold(select.get(1));
		action.clickAndHold(select.get(2));
		action.build().perform();
		
	}

}
