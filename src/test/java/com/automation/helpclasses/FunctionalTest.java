package com.automation.helpclasses;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * <strong>FunctionalTest</strong> handles setup and teardown of WebDriver.
 * @author Kim Schiller
 */
public class FunctionalTest {

	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver.exe");
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile ffprofile = profile.getProfile("default");
		driver = new FirefoxDriver(ffprofile);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void cleanUp(){
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void tearDown(){
		//driver.close();
        driver.close();
	}	
}
