package com.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class DropDownHandle2 extends BaseClass {

	public void selectFromDD() {
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement year = driver.findElement(By.id("yearbox"));
		WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement day = driver.findElement(By.id("daybox"));

		// get date from user
		String s = "3-February-2011";
		String d[] = s.split("-");

		selectDate(day, d[0]);
		selectDate(month, d[1]);
		selectDate(year, d[2]);
	}

	public void selectDate(WebElement e, String value) {
		Select sel = new Select(e);
		sel.selectByVisibleText(value);

	}

	public static void main(String[] args) {
		//
		DropDownHandle2 d = new DropDownHandle2();
		d.edge();
		d.selectFromDD();
	}

}
