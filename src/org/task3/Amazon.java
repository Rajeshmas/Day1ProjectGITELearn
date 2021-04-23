package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anbu sony\\eclipse-workspace\\Selenium3\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement text =driver.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("iphone");
		
		WebElement submit =driver.findElement(By.id("nav-search-submit-button"));
		submit.click();
		
	}

}
