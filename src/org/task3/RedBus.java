package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anbu sony\\eclipse-workspace\\Selenium3\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement btnsignin = driver.findElement(By.id("sign-in-icon-down"));
		btnsignin.click();
		
		WebElement linksignin = driver.findElement(By.id("hc"));
		linksignin.click();
		
		WebElement txtnumber = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		txtnumber.sendKeys("34567892");
		
	}
}
