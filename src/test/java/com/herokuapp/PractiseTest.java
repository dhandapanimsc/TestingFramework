package com.herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PractiseTest {
	@Test
	public void practice()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='row1']//button[@id='add_btn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='row2']//input[@type='text']")).sendKeys("dfadsf");
		driver.findElement(By.xpath("//div[@id='row2']//button[@id='save_btn']")).click();
		driver.quit();
	}
}
