package com.vtiger.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.genericLib.DataUtility;

public class CreateNewProduct {
	public static void main(String[] args) throws IOException {

		DataUtility du = new DataUtility();

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get(du.getDataFromProperty("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Login to Vtiger
		driver.findElement(By.name("user_name")).sendKeys(du.getDataFromProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(du.getDataFromProperty("password"));
		driver.findElement(By.id("SubmitButton")).click();

		// Navigate to product
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.cssSelector("img[title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(du.getDataFromExcel("Products", 1, 1), Keys.ENTER);

	}

}
