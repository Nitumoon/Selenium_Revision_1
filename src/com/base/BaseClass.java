package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// globaly WebDriver declaire
	public WebDriver driver;

	public void chrome() {
		// chrome browser initialization
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		// maximize window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// add pgeload time
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// delete coolies
		driver.manage().deleteAllCookies();

	}

	public void edge() {
		// edge browser initialization
		WebDriverManager.edgedriver().setup();
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(eo);
		// maximize window
//		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// add pgeload time
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// delete coolies
		driver.manage().deleteAllCookies();
	}

	public void firefox() {
		// firefox browser initialization
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--remote-allow-origins=*");
		// maximize window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// add pgeload time
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		// delete coolies
		driver.manage().deleteAllCookies();
	}

	public void tearDown() {
		// close browser
		driver.close();
		driver.quit();

	}

//	public static void main(String[] args) {
	// call methods
//		chrome();
//		edge();
//		firefox();

//	}

}
