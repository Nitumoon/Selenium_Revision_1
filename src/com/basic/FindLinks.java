package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class FindLinks extends BaseClass {
	public void findLinks() throws InterruptedException {
		chrome();
		driver.get("https://practice.automationtesting.in/");
		// find webelements
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// static wait
		Thread.sleep(2000);
		// total no of links
		System.out.println("Total no of Links : " + links.size());

		for (WebElement e : links) {
			Thread.sleep(2000);
			System.out.println(e.getText());

		}

		tearDown();
	}

	public static void main(String[] args) throws InterruptedException {
		FindLinks f = new FindLinks();
		f.findLinks();

	}

}
