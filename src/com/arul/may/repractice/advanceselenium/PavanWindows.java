package com.arul.may.repractice.advanceselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PavanWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		//parent
		WebElement newTab = driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		newTab.click();
		
		//child
		WebElement click = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button"));
		click.click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String par : allWindows) {
			
			if(!par.equals(parent)) {
				
				driver.switchTo().window(par);
				driver.close();
			}
				driver.switchTo().window(parent);
			
		}
	}

}
