package br.localiza.app.runners;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			instalarCompletae();
			createDriver();
		}
		return driver;
	}
	
	private static void instalarCompletae() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("app","C:\\Users\\195869\\eclipse-workspace\\CompletaeTest\\APK\\Combustivel-v2.0.2(202)-debug.apk");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appPackage", "com.localiza.combustivelapp");
		desiredCapabilities.setCapability("appActivity", "com.localiza.combustivelapp.ui.main.MainActivity");
		desiredCapabilities.setCapability("deviceName", "Nexus 6 API 29");
		desiredCapabilities.setCapability("platformVersion", "7");
		desiredCapabilities.setCapability("autoGrantPermissions", true);
		desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	private static void createDriver() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("app","C:\\Users\\195869\\eclipse-workspace\\CompletaeTest\\APK\\Menu-hmg-v2.1.6(216)-debug.apk");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appPackage", "com.localiza.menuapp");
		desiredCapabilities.setCapability("appActivity", "com.localiza.menuapp.ui.main.MainActivity");
		desiredCapabilities.setCapability("deviceName", "Nexus 6 API 29");
		desiredCapabilities.setCapability("platformVersion", "7");
		desiredCapabilities.setCapability("autoGrantPermissions", true);
		desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
