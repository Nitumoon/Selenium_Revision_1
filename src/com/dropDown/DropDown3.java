package com.dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class DropDown3 extends BaseClass {
	String a;

	public void multiSelectDropDown() throws InterruptedException {
		// open url
		driver.get("https://demo.automationtesting.in/Register.html");

		String lang = "English,Spanish";
		String splt[] = lang.split(",");

		for (int i = 0; i <= 1; i++) {
			a = splt[i];

		}

		// find elements for multi language selection box
		driver.findElement(By.id("msdd")).click();
//		List<WebElement> msdd = driver.findElements(
//				By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));

		List<WebElement> msdd = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		System.out.println("Number of language Present in This DropDown : " + msdd.size());
		for (WebElement e : msdd) {
//			System.out.println(e.getText());
			Thread.sleep(2000);
			if (e.getText().equals("English")) {

				e.click();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		DropDown3 d = new DropDown3();
		d.edge();
		d.multiSelectDropDown();
	}

}
