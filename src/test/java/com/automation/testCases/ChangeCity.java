package com.automation.testCases;

import com.automation.helpclasses.Drivers;
import com.automation.helpclasses.FunctionalTest;
import com.automation.pageObjects.StartPageSweden;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import java.util.concurrent.TimeUnit;

/**
 * Created by anja01 on 2017-01-18.
 */
public class ChangeCity extends FunctionalTest {


    @Test
    public void changeCity(){

        StartPageSweden startPageSweden=new StartPageSweden(driver);
        String beforeChange=startPageSweden.getChooseAnotherCity().getText();
        startPageSweden.changeCity();
        String afterChange=startPageSweden.getChooseAnotherCity().getText();


        //Check that city has changed
        Assert.assertNotEquals(beforeChange,afterChange);
    }



}


