package com.atmecs.SensorTesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.SensorTesting.testsuite.TestBase;
import com.atmecs.SensorTesting.utils.LoadProperties;
import com.atmecs.SensorTesting.utils.Pageactions;

public class FirstSensorTest extends TestBase {

	@Test
	public void firstsensor() {
		Pageactions page = new Pageactions();
		driver.findElement(By.xpath("//div[@data-type='2']")).click();
		LoadProperties.sensordata(driver.findElement(By.xpath("(//div[@class='NBZP0e xbmkib'])[2]/div[1]")), 10, 60 * 1000);
		//LoadProperties.sensordata(locator, 10,
					//60 * 1000);
			driver.quit();
	}
}
