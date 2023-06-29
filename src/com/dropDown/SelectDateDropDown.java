package com.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class SelectDateDropDown extends BaseClass {
	public void start() throws InterruptedException {
		driver.get("https://www.facebook.com/reg");
		// Step 1: find drop down element and create WebElemnt
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		// det data from Excel or user
		String dob = "24-Jan-2002";
		String split[] = dob.split("-");

		selectDateFromDropDown(day, split[0]);
		selectDateFromDropDown(month, split[1]);
		selectDateFromDropDown(year, split[2]);
	}

	public void selectDateFromDropDown(WebElement ele, String value) throws InterruptedException {
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}

	public static void main(String args[]) throws InterruptedException {
		SelectDateDropDown s = new SelectDateDropDown();
		// open Browser
		s.edge();
		s.start();
		s.tearDown();

	}

}
