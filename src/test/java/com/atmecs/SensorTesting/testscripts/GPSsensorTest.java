package com.atmecs.SensorTesting.testscripts;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GPSsensorTest {
	public WebDriver driver;
	String browsername;
	private static ScheduledExecutorService schedule;

	@Test
	public void invokeBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationAPI\\SensorTesting\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/finance/");
		schedule = Executors.newSingleThreadScheduledExecutor();
		schedule.scheduleAtFixedRate(new Runnable() {
			public void run() {
				//driver.findElement(By.xpath("//div[@data-type='2']")).click();
				WebElement data = driver.findElement(By.xpath("(//div[@class='vReuC GEykwb'])[1]"));
				String values = data.getText(); 
				System.out.println("Element value: " + values);
				if (values.equals("Some Value")) {
					System.out.println("Element value matches the condition: " + values);
				} else {
					System.out.println("Element value does not match the condition: " + values);
				}

				System.out.println("Task executed!");
			}
		}, 0, 20, TimeUnit.SECONDS);
		try {
			Thread.sleep(60 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}