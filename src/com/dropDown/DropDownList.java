package com.dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class DropDownList extends BaseClass {
	public void getValueFromDropDown() throws InterruptedException {
		edge();
		// open url
		driver.get("https://demo.automationtesting.in/Register.html");
		String lang = "Urdu,Hindi,English";
		String l[] = lang.split(",");

//		System.out.println(l[2]);

		WebElement a = driver.findElement(By.id("msdd"));
		a.click();

		List<WebElement> ele = driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		System.out.println("Total Language available :" + ele.size());
		Thread.sleep(1000);
		for (WebElement w : ele) {

			if (w.getText().contains(l[2])) {
				w.click();
				String p = a.getText();
				System.out.println(p + " Language selected");
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		DropDownList d = new DropDownList();
		d.getValueFromDropDown();
	}

}
