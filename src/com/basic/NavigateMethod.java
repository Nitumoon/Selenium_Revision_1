package com.basic;

import com.base.BaseClass;

public class NavigateMethod extends BaseClass {
//	static WebDriver driver;

	public void navigation() throws InterruptedException {
		chrome();
		// open url
		driver.get("https://www.linkedin.com/");

		// maximize window
		driver.manage().window().maximize();
		// get title
		String title = driver.getTitle();
		// check Title name of webPage is present in current Url or not
//		System.out.println(title);
		if (title.contains("LinkedIn")) {
			System.out.println("Test case pass : we are in Linkedin webpage");
		} else {
			System.out.println("Test case failed : we are not in Linkedin webpage");
		}
		System.out.println("************************************");

		// add static wait
		Thread.sleep(2000);

		// navigate to other webpage
		driver.navigate().to("https://www.salesforce.com/in/");

		// get title
		String title2 = driver.getTitle();

		// check Title name of webPage is present in current Url or not
		if (title2.contains("Salesforce")) {
			System.out.println("Test case pass : we are in Salesforce webpage");
		} else {
			System.out.println("Test case fail : we are not in Salesforce webpage");
		}

		System.out.println("************************************");

		// add static wait
		Thread.sleep(2000);

		// back to previous webpage
		driver.navigate().back();

		// get Title of previous webpage Title
		String title3 = driver.getTitle();

		// check we navigate to previous webpage or not
		if (title3.contains("LinkedIn")) {
			System.out.println("Test case pass : we are sucessfully back to previous Linkedin WebPage");
		} else {
			System.err.println("Test case fail : we are not back to the previous Linkedin WebPage");
		}

		System.out.println("************************************");

		// add static wait
		Thread.sleep(2000);

		// forword to next page
		driver.navigate().forward();

		// get Title of previous webpage Title
		String title4 = driver.getTitle();

		// check we forword to previous webpage or not
		if (title4.contains("Salesforce")) {
			System.out.println("Test case pass : we are sucessfully forworded to previous Salesforce WebPage");
		} else {
			System.err.println("Test case fail : we are not forworded to the previous Salesforce WebPage");

		}
		System.out.println("************************************");

		// add static wait
		Thread.sleep(2000);

		// refresh the Webpage
		driver.navigate().refresh();

		// close browser
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		// call from browsers class

		NavigateMethod nv = new NavigateMethod();
		nv.navigation();

	}

}
