package com.atmecs.SensorTesting.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.atmecs.SensorTesting.utils.LoadProperties;
import com.atmecs.SensorTesting.utils.ProjectBaseConstantPaths;

public class TestBase {
	protected WebDriver driver;

	@BeforeTest
	public void baseclass() {
		System.setProperty("webdriver.chrome.driver", ProjectBaseConstantPaths.CHROME_FILE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(LoadProperties.readConfig("URL", ProjectBaseConstantPaths.CONFIG_FILE));

	}
}
