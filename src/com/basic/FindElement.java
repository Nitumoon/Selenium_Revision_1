package com.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.base.BaseClass;

public class FindElement extends BaseClass {

	public void facebookLogin() {
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
		driver.findElement(By.id("email")).sendKeys("nitu123@gmail.com");
		// find elements for password
		driver.findElement(By.id("pass")).sendKeys("admin");
		// find elemements for login btn
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
		System.out.println("click on login sucessfully");
		// close browser
		driver.close();
	}

	public static void main(String[] args) {
		FindElement f = new FindElement();
		f.facebookLogin();
	}

}
