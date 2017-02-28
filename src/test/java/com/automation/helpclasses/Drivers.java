package com.automation.helpclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

/**
 * Created by anja01 on 2017-01-17.
 */
public class Drivers {

    public static WebDriver driver=null;

    public WebDriver startdriver(String browser){

        if(browser.equalsIgnoreCase("Chrome")){

            System.setProperty("webdriver.chrome.driver", "/home/vicky/Documents/Jars/chromedriver");

            driver=new ChromeDriver();

        }else if(browser.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver.exe");

            ProfilesIni profile = new ProfilesIni();
            FirefoxProfile ffprofile = profile.getProfile("default");
            driver=new FirefoxDriver();

        }

        else if(browser.equals("IE"))
        {
            System.setProperty("webdriver.ie.driver",
                    "D:/Softwares/Selenium softwares/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;

    }

    }

