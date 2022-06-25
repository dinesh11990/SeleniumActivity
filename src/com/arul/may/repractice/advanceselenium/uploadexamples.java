package com.arul.may.repractice.advanceselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadexamples {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		Thread.sleep(3000);
		WebElement uploadButton = driver.findElement(By.xpath("//input[@name='filename']"));
		uploadButton.click();
		
		Thread.sleep(3000);
		String src = "C:\\Users\\Dinesh_Banu\\Downloads\\teatleaf.xlsx";
		
		StringSelection obj = new StringSelection(src);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
		
		
		
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
