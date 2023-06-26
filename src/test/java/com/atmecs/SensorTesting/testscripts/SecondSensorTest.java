package com.atmecs.SensorTesting.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.SensorTesting.testsuite.TestBase;
import com.atmecs.SensorTesting.utils.LoadProperties;

public class SecondSensorTest extends TestBase {

	@Test
	public void secondsensors() {
		driver.findElement(By.xpath("//div[@data-type='2']")).click();
		LoadProperties.sensordata(driver.findElement(By.xpath("(//div[@class='NBZP0e xbmkib'])[2]/div[2")), 10, 60 * 1000);
		driver.quit();
	}

}
