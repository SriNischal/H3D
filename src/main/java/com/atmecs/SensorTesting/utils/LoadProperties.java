package com.atmecs.SensorTesting.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoadProperties {
	static WebDriver driver;
	private static ScheduledExecutorService scheduler;

	public static String readPropertiesFile(String key, String path) {
	        Properties prop = new Properties();

	        try (FileInputStream fis = new FileInputStream(path)) {
	            prop.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return prop.getProperty(key);
	}

	public static String readConfig(String elements, String configFile) {
		Properties prop = new Properties();
		FileInputStream input;
		try {
			input = new FileInputStream(ProjectBaseConstantPaths.CONFIG_FILE);
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}

	public static void sensordata(WebElement data, int timeinterval, int totaltime) {
		scheduler = Executors.newSingleThreadScheduledExecutor();
		scheduler.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println("Executing code...");
				String values = data.getText();
				System.out.println("Element value: " + values);
				if (values.equals("Some Value")) {
					System.out.println("Element value matches the condition: " + values);
				} else {
					System.out.println("Element value does not match the condition: " + values);
				}

				System.out.println("Task executed!");
			}
		}, 0, timeinterval, TimeUnit.SECONDS);
		try {
			Thread.sleep(totaltime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		scheduler.shutdown();

	}

}
