package com.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class YahooLoginPage extends BaseClass {
	public void yahooLoginPage() throws InterruptedException {
		edge();
		// open url
		driver.get("https://login.yahoo.com/");
		// maximize window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// add pgeload time
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// delete coolies
		driver.manage().deleteAllCookies();

		// get text from Login form
		String text = driver.findElement(By.xpath("//strong[@class=\"challenge-heading\"]")).getText();
		System.out.println(text);
		// to check the enabled is displayed or not
		boolean enabled1 = driver.findElement(By.name("username")).isEnabled();
		System.out.println(enabled1);

		// find Elements for emai textbox
		WebElement uName = driver.findElement(By.name("username"));
		uName.sendKeys("asd@gmail.com");

		// to check the enabled is displayed or not
		boolean enabled = driver.findElement(By.name("username")).isEnabled();
		System.out.println(enabled);

		// to check the textbox is displayed or not
		boolean displayed = driver.findElement(By.name("username")).isDisplayed();
		System.out.println(displayed);

		// to check the textbox is selected or not
		boolean selected = driver.findElement(By.name("username")).isSelected();
		System.out.println(selected);

		// add static wait
		Thread.sleep(2000);

		String text2 = driver.findElement(By.name("username")).getText();
		System.out.println(text2);
//		// clear the textbox
//		driver.findElement(By.name("username")).clear();

		String value = uName.getAttribute("value");
		System.out.println(value);

		// add static wait
		Thread.sleep(2000);
		// close browser
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		YahooLoginPage y = new YahooLoginPage();
		y.yahooLoginPage();

	}

}
