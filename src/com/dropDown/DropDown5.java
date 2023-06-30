package com.dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class DropDown5 extends BaseClass {
	public void selectSkills() {
		edge();
		driver.get("https://demo.automationtesting.in/Register.html");
		List<WebElement> opn = driver.findElements(By.tagName("option"));
		System.out.println(opn.size());
		int count = 1;
		for (WebElement e : opn) {
			if (!e.equals("XHTML")) {
				if (count != 78)
					System.out.println(e.getText());
				count++;
			}

		}

	}

	public static void main(String[] args) {
		DropDown5 d = new DropDown5();
		d.selectSkills();
	}

}
