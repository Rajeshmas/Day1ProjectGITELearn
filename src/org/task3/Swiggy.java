package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anbu sony\\eclipse-workspace\\Selenium3\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		WebElement btnSignup =driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[2]"));
		btnSignup.click();
		
		WebElement txtNum =driver.findElement(By.id("mobile"));
		txtNum.sendKeys("9944884499");
		
		WebElement txtName =driver.findElement(By.id("name"));
		txtName.sendKeys("Rajesh");
		
		WebElement txtEmail=driver.findElement(By.id("email"));
		txtEmail.sendKeys("rajesh@mail.com");
	
		WebElement txtPass =driver.findElement(By.id("password"));
		txtPass.sendKeys("12345");
		
		WebElement btnClick =driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[3]/a"));
		btnClick.click();
		
	}

}
