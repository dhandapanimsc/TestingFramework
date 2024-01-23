package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {
	@Test
	public void login()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		System.out.println("Log in");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button/i")).click();
		System.out.println(driver.findElement(By.cssSelector(".flash")).getText());
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
}
