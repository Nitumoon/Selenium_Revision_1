package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class Checkbox extends BaseClass {
	public void checkbox() throws InterruptedException {
		// start browser
		edge();
		// open Url
		driver.get("https://demo.automationtesting.in/Register.html");
		// find elements for check box
		WebElement cbox1 = driver.findElement(By.id("checkbox1"));
		cbox1.click();
		Thread.sleep(1000);
		cbox1.click();
		// close Browser
		tearDown();
	}

	public static void main(String[] args) throws InterruptedException {
		Checkbox c = new Checkbox();
		c.checkbox();

	}

}
