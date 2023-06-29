package com.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	// initalize webdriver globally
	public static WebDriver driver;

	public static void startBrowser() {
		// browser initialization
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);

		// open Url
		driver.get("https://www.facebook.com/");

		// maximize browser
//		driver.manage().window().maximize();

		// delete cookies
		driver.manage().deleteAllCookies();

		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// add page load timeunit
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// get the webpage Url
		String currentUrl = driver.getCurrentUrl();
		// print url
		System.out.println("URL : " + currentUrl);

		// get the Tile of webpage
		String title = driver.getTitle();

		// print title
		System.out.println("Title : " + title);

		// close the browser
		driver.close();

	}

	public static void main(String[] args) {
		// call method
		startBrowser();

	}

}
