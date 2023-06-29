package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement wb = driver.findElement(By.id("email"));
		boolean a = wb.isDisplayed(); // texbox is visible
		System.out.println(a);

		boolean b = wb.isEnabled(); // here we can able to perform operation on textbox
		System.out.println(b);

		wb.sendKeys("test@123.com");

		// getAttribute method
		String text = wb.getAttribute("value");
		System.out.println(text);
		Thread.sleep(4000);

		// clear the textbox/entered value
		wb.clear();

		driver.close();

	}

}
