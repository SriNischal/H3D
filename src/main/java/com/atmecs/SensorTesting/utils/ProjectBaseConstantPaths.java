package com.atmecs.SensorTesting.utils;

import java.io.File;

public class ProjectBaseConstantPaths {
	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;

	public final static String CHROME_FILE = USER_HOME + "lib" + File.separator + "chromedriver.exe";
	
	public final static String LOCATOR_FILE = USER_HOME + "src/test/resources" + File.separator + "Locators"
			+ File.separator + "locators.properties";
	
	public final static String CONFIG_FILE = USER_HOME + "src/test/resources" + File.separator + "config.properties";

}
