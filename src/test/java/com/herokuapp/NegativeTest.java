package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
	@Test
	public void negativeTests()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		System.out.println("Log Out");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecret");
		driver.findElement(By.xpath("//button/i")).click();
		Assert.assertTrue(true);
		driver.quit();
	}
}
