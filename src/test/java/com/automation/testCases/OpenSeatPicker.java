package com.automation.testCases;

import com.automation.helpclasses.FunctionalTest;
import com.automation.pageObjects.StartPageSweden;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static com.automation.helpclasses.Drivers.driver;

/**
 * Created by anja01 on 2017-01-20.
 */
public class OpenSeatPicker extends FunctionalTest {

    @Test
    public void openSeatPicker() throws InterruptedException {
    StartPageSweden startPageSweden=new StartPageSweden(driver);

           startPageSweden.chooseMovie();
           startPageSweden.numberOfCustomer(8,1,0);
           startPageSweden.bookChair();
           startPageSweden.controlCustomerQuantityIsRight();
           Assert.assertTrue(startPageSweden.controlCustomerQuantityIsRight());
           startPageSweden.pressButtonToProceed();
           startPageSweden.enterEmail("test@mail.com");
           startPageSweden.pressCheckboxToApprove();
           startPageSweden.pressToPayNets();


    }
}
