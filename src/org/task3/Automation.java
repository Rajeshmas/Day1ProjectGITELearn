package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anbu sony\\eclipse-workspace\\Selenium3\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement txtFirstName =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		txtFirstName.sendKeys("rajesh");
		
		WebElement txtLastName =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		txtLastName.sendKeys("Kumar");
		
		WebElement txtAdd =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		txtAdd.sendKeys("23/2A Main Road Omr Chennai");
		
		WebElement txtEmail =driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		txtEmail.sendKeys("rajesh@mail.com");
		
		WebElement txtNum =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		txtNum.sendKeys("8877665544");
		
		WebElement btnRadio =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		btnRadio.click();
		
		WebElement BtnBox =driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		BtnBox.click();
		
		Thread.sleep(3000);
		
		WebElement TxtSkills =driver.findElement(By.id("Skills"));
		TxtSkills.click();
		TxtSkills.sendKeys(Keys.ARROW_DOWN);
		TxtSkills.click();
		
		WebElement txtCountry =driver.findElement(By.id("countries"));
		txtCountry.click();
		txtCountry.sendKeys(Keys.ARROW_DOWN);
		txtCountry.click();
		
		WebElement txtPass =driver.findElement(By.id("firstpassword"));
		txtPass.sendKeys("12345");
		
		WebElement txtConfirmPass =driver.findElement(By.id("secondpassword"));
		txtConfirmPass.sendKeys("12345");
		
	
		
	
	}

}