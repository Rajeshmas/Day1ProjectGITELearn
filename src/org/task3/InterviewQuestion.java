package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anbu sony\\eclipse-workspace\\Selenium3\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement dropClick =driver.findElement(By.xpath("//*[@id=\"heading20\"]/i"));
		dropClick.click();
		
		WebElement DropCts =driver.findElement(By.xpath("//*[@id=\"collapse20\"]/div/div/ul/li[6]/a"));
		DropCts.click();
		
	}

}
