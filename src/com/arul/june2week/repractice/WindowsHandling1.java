package com.arul.june2week.repractice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriverException;

import com.arul.may.repractice.advanceselenium.ChromeDriver;
import com.arul.may.repractice.advanceselenium.WebDriver;

public class WindowsHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverException driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
