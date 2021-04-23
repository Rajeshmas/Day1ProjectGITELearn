package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anbu sony\\Pictures\\Land Details\\Selenium Courses\\Project\\FeatureBranch\\ProjectClassApr9.30AMOnline\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		driver.manage().window().maximize();
		
		WebElement txtFrom =driver.findElement(By.xpath("//*[@id=\"from_station\"]"));
		txtFrom.sendKeys("chennai");
		
		WebElement txtTo =driver.findElement(By.id("to_station"));
		txtTo.sendKeys("Madurai");
		
		WebElement btnSubmit =driver.findElement(By.id("trainFormButton"));
		btnSubmit.click();
		
	
	}

}
