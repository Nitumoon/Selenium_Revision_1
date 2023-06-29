package com.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class Facebook extends BaseClass {
	public void fbook() {
		edge();
		// open url
		driver.get("https://www.facebook.com/");
		// maximize window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// add pgeload time
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// delete coolies
		driver.manage().deleteAllCookies();
		// find Elements for emai textbox
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nitu123@gmail.com");

		String accessibleName = email.getAttribute("value");
		System.out.println(accessibleName);
		driver.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook f = new Facebook();
		f.fbook();

	}

}
