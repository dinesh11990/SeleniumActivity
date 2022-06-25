package com.arul.may.repractice.advanceselenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadLink = driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		Thread.sleep(3000);
		
		File fileloc = new File("C:\\Users\\Dinesh_Banu\\Downloads");
		File[] totalfiles = fileloc.listFiles();
		
		for (File file : totalfiles) {
			
			if(file.getName().equals("testleaf.xlsx")) {
				
				System.out.println("File is downloaded");
				break;
			}
		}

	}

}
