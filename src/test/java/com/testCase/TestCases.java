package com.testCase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.desired_capability.desiredCapability;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestCases extends desiredCapability{
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException {
		
	 driver = capabilties();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  
	}
	@Test
	public void search1() throws InterruptedException {
		System.out.print("App is oppend");
		Thread.sleep(2000);
	}
	@Test(enabled = true, priority = 1)
	public void testCase_1() throws InterruptedException {
		driver.findElement(MobileBy.className("android.view.View")).click();

		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("Mobile");
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
	}
	@Test(enabled = true, priority = 2)
	public void testCase_2() throws InterruptedException {
		driver.findElement(MobileBy.className("android.view.View")).click();

		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("Asus");
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	@Test(enabled = false, priority = 3)
	public void testCase_3() throws InterruptedException {
		driver.findElement(MobileBy.className("android.view.View")).click();
		
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("");
	
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
	}
	@Test(enabled = false, priority = 4)
	public void testCase_4() throws InterruptedException {
		driver.findElement(MobileBy.className("android.view.View")).click();

		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("Pooma Running Shoes");
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
	}
	@Test(enabled = false, priority = 5)
	public void testCase_5() throws InterruptedException {
		driver.findElement(MobileBy.className("android.view.View")).click();
	
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("UPSC bok");
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(2000);
		
	}
	@Test(enabled = false, priority = 6)
	public void testCase_6() throws InterruptedException {
		driver.findElement(MobileBy.className("android.view.View")).click();
	
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("Redmi note 13 pro + 5G");
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(3000);
	}
	@Test(enabled = false, priority = 7)
	public void testCase_7() throws InterruptedException {
		driver.findElement(MobileBy.className("android.view.View")).click();
		
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("fitbit");
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(3000);
		
	}
}
