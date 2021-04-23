package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anbu sony\\eclipse-workspace\\Selenium3\\Lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement text =driver.findElement(By.xpath("//input[@id='email']"));
		text.sendKeys("rajesh12");
		
		WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("1234567");
		
		WebElement login =driver.findElement(By.xpath("//input[@id='submit']"));
		login.click();
	
	}
}
