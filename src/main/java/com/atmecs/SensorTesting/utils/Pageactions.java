package com.atmecs.SensorTesting.utils;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;

public class Pageactions {
	WebDriver driver;
	Browser browser;

	public WebElement getLocator(String locatorType) {
		String[] locator = locatorType.split(":");

		System.out.println("In Select locators::***************");
		System.out.println("Key::" + locator[0]);
		System.out.println("value::" + locator[1]);

		WebElement webElement = null;

		switch (locator[0]) {
		case "id":
			webElement = driver.findElement(By.id(locator[1]));
			break;
		case "name":
			webElement = driver.findElement(By.name(locator[1]));
			break;
		case "className":
			webElement = driver.findElement(By.className(locator[1]));
			break;
		case "linkText":
			webElement = driver.findElement(By.linkText(locator[1]));
			break;
		case "partialLinkText":
			webElement = driver.findElement(By.partialLinkText(locator[1]));
			break;
		case "tagName":
			webElement = driver.findElement(By.tagName(locator[1]));
			break;
		case "cssSelector":
			webElement = driver.findElement(By.cssSelector(locator[1]));
			break;
		case "xpath":
			webElement = driver.findElement(By.xpath(locator[1]));
			break;
		}
		return webElement;
	}

	public void clickOnElement(String element) {
		try {
			WebElement webElement = getLocator(element);
			webElement.click();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public String getText(String element) {
		WebElement webElement = getLocator(element);
		return webElement.getText();
	}

	public String getCssValue(String element, String value) {
		WebElement webElement = getLocator(element);
		return webElement.getCssValue(value);
	}

	public void mouseOver(String element) {
//			try {
//				Actions action = new Actions(browser.getDriver());
//				WebElement webElement = getLocator(element);
//				action.moveToElement(webElement).perform();
//			}catch (Exception exception) {
//				//log.info("element is not displayed and enable to mouse hover");
//			}
	}

	public String randomnumber(String locator) throws Exception {
		return locator;
//			int randomnumber = random.generateRandomNumber();
//			String number = Integer.toString(randomnumber);
//			String locatorvalue = ReadLocators.getPropertyvalue(locator, ProjectBaseConstantPaths.LOCATORS_FILE);
//			String Locator = locatorvalue.replace("*", number);
//			return Locator;
	}

	public void windowHandle() {
//			Set<String> allWindowHandles = browser.getDriver().getWindowHandles();
//
//			for (String handle : allWindowHandles) {
//				browser.getDriver().switchTo().window(handle);
	}
}
