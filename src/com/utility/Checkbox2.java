package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class Checkbox2 extends BaseClass {
	public void checkbox2() throws InterruptedException {
		// start browser
		edge();
		// open Url
		driver.get("https://demo.automationtesting.in/Register.html");
		for (int i = 1; i <= 3; i++) {

			// find elements for check box
			WebElement cbox = driver.findElement(By.id("checkbox" + i));
			Thread.sleep(1000);
			cbox.click();
			Thread.sleep(1000);
			cbox.click();
		}
		tearDown();

	}

	public static void main(String[] args) throws InterruptedException {
		Checkbox2 c = new Checkbox2();
		c.checkbox2();
	}

}
