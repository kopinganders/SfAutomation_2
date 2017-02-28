package com.automation.pageObjects;

import com.automation.helpclasses.PageObject;
import jdk.internal.dynalink.beans.StaticClass;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by anja01 on 2017-01-17.
 */
public class StartPageSweden extends PageObject {
    //private WebDriver driver;

    //Page URL
  //  private static String PAGE_URL="https://sv-inte.sf.se/";
    private static String PAGE_URL="https://sv-prep.sf.se/";


    //The topbar
    @FindBy(xpath = "html/body/div[1]/nav/div/div[1]/div/a/img")
    private WebElement sfLogga;

    @FindBy(xpath = "html/body/div[1]/nav/div/div[1]/div/div/div/ul/li[1]/a")
    private WebElement filmer;

    @FindBy(xpath = "html/body/div[1]/nav/div/div[1]/div/div/div/ul/li[2]/b")
    private WebElement nyheter;

    @FindBy(xpath = "html/body/div[1]/nav/div/div[1]/div/div/div/ul/li[3]/a")
    private WebElement biografer;

    @FindBy(xpath = "html/body/div[1]/nav/div/div[1]/div/div/div/ul/li[4]/a")
    private WebElement tyckTill;

    @FindBy(xpath = "html/body/div[1]/nav/div/div[1]/div/div/div/ul/li[5]/a")
    private  WebElement kundService;

    @FindBy(xpath = "html/body/div[1]/nav/div/div[1]/div/div/div/ul/li[6]/a")
    private WebElement kundtjanst;

    @FindBy(xpath = "html/body/div[1]/nav/div/div[1]/div/div/div/ul/li[7]/a")
    private WebElement omSfBio;


    //Quick picker
    @FindBy(xpath = "html/body/div[1]/main/div/div[1]/div/div/div/div[2]/section/div/div/div/div[2]/ncg-image-style-group-list/ul/li/ul[1]")
    private WebElement movieListQuick;

    @FindBy(xpath = "html/body/div[1]/main/div/div[1]/div/div/div/div[2]/section/div/div/div/div[1]/div[1]/div/ncg-drop-down-radio-button/div/ncg-button/button")
    private WebElement filterDate;

    @FindBy(xpath = "html/body/div[1]/main/div/div[1]/div/div/div/div[3]/section/div/div/div/div[1]/div[2]/ncg-drop-down-radio-button/div/ncg-button/button")
    private WebElement filterMovies;

   /* @FindBy(xpath = "html/body/div[1]/main/div/div[1]/div/div/div/div[3]/section/div/div/div/div[1]/div[3]/ncg-drop-down-radio-button/div/ncg-button/button")
    private WebElement filterDays;*/

    @FindBy(xpath = "html/body/div[1]/main/div/div[1]/div/div/div/div[2]/section/div/div/div/div[1]/div[1]/div/ncg-drop-down-radio-button/div/div/div/ul/li[2]/ncg-radio-button/label/input")
    private WebElement secondDateInList;

    @FindBy(xpath = "html/body/div[1]/main/div/div[1]/div/div/div/div[3]/section/div/div/div/div[1]/div[4]/div/ncg-drop-down-radio-button/div/ncg-button/button")
    private WebElement filterCinemas;

    @FindBy(xpath = "html/body/div[1]/main/div/div[1]/div/div/div/div[3]/section/div/div/div/div[2]/ncg-image-style-group-list/ul/li/ul[1]/li[1]/a/div")
    private WebElement firstMovie;


    //Feature Movie
    @FindBy(xpath = "html/body/div[1]/main/div/div[1]/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/a/span")
    private WebElement readMore;


    //Adds
    @FindBy(xpath = "html/body/div[1]/main/div/div[1]/div/div/div/div[6]/div/div/div/a/img")
    private WebElement lowerAdd;


    //Button to close cached window

    @FindBy(xpath = "html/body/div[1]/div[1]/div/ncg-button/button")
    private WebElement closeCachedButton;

    //First popup that comes up if not cached
    @FindBy(xpath = "html/body/div[1]/div[3]/div/div/div[2]/ncg-button/button")
    private WebElement closeCityChoser;

    //Change city
    @FindBy(xpath = "html/body/div[1]/nav/div/div[1]/div/ul/li/ncg-button/button/span/span")
    private WebElement chooseAnotherCity;

    @FindBy(xpath ="html/body/div[1]/nav/div/div[2]/ncg-drop-down-radio-button/div/div/div/ul/li[2]/ncg-radio-button/label/input" )
    private WebElement pickSecondCity;


    //Seat picker
    /*@FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li")
    private WebElement plusMinusSection;*/

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]")
    private WebElement modalBooking;

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li/ncg-inc-desc-group/div/div[2]/ncg-inc-desc-button[2]/button")
    private WebElement firstPlus;

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li/ncg-inc-desc-group/div/div[2]/ncg-inc-desc-button[1]/button")
    private WebElement firstMinus;

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li[2]/ncg-inc-desc-group/div/div[2]/ncg-inc-desc-button[2]/button")
    private WebElement secondPlus;

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li[2]/ncg-inc-desc-group/div/div[2]/ncg-inc-desc-button[1]/button")
    private WebElement secondMinus;

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li[3]/ncg-inc-desc-group/div/div[2]/ncg-inc-desc-button[2]/button")
    private WebElement thirdPlus;

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li[3]/ncg-inc-desc-group/div/div[2]/ncg-inc-desc-button[1]/button")
    private WebElement thirdMinus;
        
    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li/ncg-inc-desc-group/div/div[2]/div")
    private WebElement firstQuantityBox;

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li[2]/ncg-inc-desc-group/div/div[2]/div")
    private WebElement secondQuantityBox;

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li[2]/ncg-inc-desc-group/div/div[2]/div")
    private WebElement thirdQuantityBox;

    @FindBy(xpath = "html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[1]/ncg-booking-information/div/div/div/div/div/ncg-input-field/div/div[1]/input")
    private WebElement emailOfUser;

    @FindBy(xpath = "html/body/div[1]/ncg-dialog-box/div/div/div[2]/div[2]/ncg-button/button")
    private WebElement wheelChairWarningButton;

    @FindBy(xpath ="html/body/div[1]/main/div/div[2]/div/div[2]/div[2]/div/ncg-seat-selection-submit-button/div/div/div/div/ncg-button/button")
    private WebElement proceedToPayButton;

    @FindBy(xpath ="html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[5]/ncg-booking-confirm-terms/div/div/div/div[1]/ncg-checkbox/label")
    private WebElement checkBoxApproval;

    @FindBy(xpath ="html/body/div[1]/main/div/div[2]/div/div[2]/div[2]/div/ncg-booking-buy-tickets-submit-button/div/div/div/ncg-button/button")
    private WebElement pressToPayNr2;

    private int newCounterAdult;
    private int newCounterSenior;
    private int newCounterChild;
    private boolean elementClicked;

    //Contructor
    public StartPageSweden(WebDriver driver){

        super(driver);
        driver.manage().deleteAllCookies();
        driver.get(PAGE_URL);
        Assert.assertTrue(sfLogga.isDisplayed());

        if(closeCityChoser.isDisplayed()){
            closeCityChoser.click();
        }

        if(closeCachedButton.isDisplayed()){
            closeCachedButton.click();
        }

    }

    public void changeCity(){

        System.out.print(chooseAnotherCity.getText());
        chooseAnotherCity.click();
        pickSecondCity.click();

    }

    public WebElement getChooseAnotherCity() {
        return chooseAnotherCity;
    }


    public void chooseMovie(){
        //System.out.print(firstMovie.getLocation());

        //Scrolls down to movies in the quick picker,must have otherwise Selenium clicks topbar

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, 250)");


            changeToNextDate();

        firstMovie.click();
    }


 /*   public void numberOfAdult(Integer adults) throws InterruptedException {


        int i=Integer.parseInt(firstQuantityBox.getText());
        while(i>0){
            firstMinus.click();
            i--;
        }

        for(int c=0;c<adults;c++){
            firstPlus.click();
        }
    }

    public void numberOfSeniors(Integer seniors) throws InterruptedException {

        int i=Integer.parseInt(secondQuantityBox.getText());
        while(i>0){
            secondMinus.click();
            i--;
        }

        for(int c=0;c<seniors;c++){
            secondPlus.click();
        }
    }*/

    /*public void numberOfCustomer(Integer seniors,Integer adults) throws InterruptedException {
        if(firstQuantityBox.getAttribute("ncgIncreaseDecreaseCounter")==null){
            Thread.sleep(3000);
        }
        countItemInElement("html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li");

        if (existsElement("html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li[2]/ncg-inc-desc-group/div/div[2]/div")){
            if (seniors != Integer.parseInt(secondQuantityBox.getText())) {

                numberOfSeniors(seniors);
            }
        }
}*/

    private boolean existsElement(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public void numberOfCustomer (Integer adults,Integer seniors,Integer children) throws InterruptedException {
        List<WebElement> elements=driver.findElements(By.xpath("html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-ticket-type-selection/div/div/div/div/div/ul/li"));

        if(firstQuantityBox.getAttribute("ncgIncreaseDecreaseCounter")==null){
            Thread.sleep(3000);
        }

        for(WebElement element:elements)
        {
                String elementText=element.getText();


              if(elementText.matches(".*vuxen.*\\n.*")) {
                  WebElement minusAdult;
                  WebElement plusAdult;
                  WebElement counterAdult;
                   minusAdult= element.findElement(By.cssSelector(".au-target.icon.icon-minus"));
                   plusAdult=element.findElement(By.cssSelector(".au-target.icon.icon-plus"));
                   counterAdult=element.findElement(By.cssSelector(".ncgIncreaseDecreaseCounter"));

                  click(plusAdult,minusAdult,counterAdult,adults);
                  newCounterAdult=Integer.parseInt(element.findElement(By.cssSelector(".ncgIncreaseDecreaseCounter")).getText());
              }
              if(elementText.matches(".*pensionär.*\\n.*")){
                  WebElement minusSenior;
                  WebElement plusSenior;
                  WebElement counterSenior;
                  minusSenior= element.findElement(By.cssSelector(".au-target.icon.icon-minus"));
                  plusSenior=element.findElement(By.cssSelector(".au-target.icon.icon-plus"));
                  counterSenior=element.findElement(By.cssSelector(".ncgIncreaseDecreaseCounter"));

                  click(plusSenior,minusSenior,counterSenior,seniors);
                  newCounterSenior=Integer.parseInt(element.findElement(By.cssSelector(".ncgIncreaseDecreaseCounter")).getText());
        }
              if(elementText.matches(".*barn.*\\n.*")){
                  WebElement minusChild;
                  WebElement plusChild;
                  WebElement counterChild;
                  minusChild= element.findElement(By.cssSelector(".au-target.icon.icon-minus"));
                  plusChild=element.findElement(By.cssSelector(".au-target.icon.icon-plus"));
                  counterChild=element.findElement(By.cssSelector(".ncgIncreaseDecreaseCounter"));

                  click(plusChild,minusChild,counterChild,children);
                  newCounterChild=Integer.parseInt(element.findElement(By.cssSelector(".ncgIncreaseDecreaseCounter")).getText());
             }
        }
    }

    private void click(WebElement plus,WebElement minus,WebElement counter,int numberOfPerson){

        int i=Integer.parseInt(counter.getText());
        while(i>0){
            minus.click();
            i--;
        }

        for(int c=0;c<numberOfPerson;c++){
            plus.click();
        }
    }


    public void bookChair() throws InterruptedException {
        List<WebElement> elements = driver.findElements(By.xpath("html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[2]/ncg-seat-picker/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div[2]/div/div"));
        boolean run = true;
        while (run) {
            for (WebElement element : elements) {
                elementClicked=false;
                if (wheelChairWarningButton.isDisplayed()) {
                    wheelChairWarningButton.click();
                }
                //&&statusOfChair.matches(".*reserved.*")
                //Thread.sleep(500);
                clickedElement(element);
                String statusOfChair = element.getAttribute("class");
                statusOfChair = statusOfChair.toLowerCase();
                if (statusOfChair.matches(".*\\s(valid).*")&&elementClicked) {
                    run = false;
                    break;
                }

                //If status on place don't have string booked in it and that is reserved(have been clicked on:
              /*  if (statusOfChair.matches("(?!.*booked.*).*") && statusOfChair.matches(".*reserved.*")) {
                    run=false;
                    break;*/
                }

            }
        }

    private void clickedElement(WebElement element){
        element.click();
        elementClicked=true;
    }

    public boolean controlCustomerQuantityIsRight(){
        List<WebElement> elements=driver.findElements(By.xpath("html/body/div[1]/main/div/div[2]/div/div[2]/div[1]/div[5]/div[2]/div/div/div/ncg-booking-order/div/ul/li[1]/ul/li"));
        boolean adultCorrect=true;
        boolean seniorCorrect=true;
        boolean childCorrect=true;

        boolean totalCorrect=false;

        for(WebElement element:elements) {

            String text=element.getText();
            if (text.matches(".*vuxen.*")) {
               int quantityAdult=Character.getNumericValue(text.charAt(0));
               if(quantityAdult!=newCounterAdult){
                   adultCorrect=false;
               }
            }
            if (text.matches(".*pensionär.*")) {
                int quantitySenior=Character.getNumericValue(text.charAt(0));
                if(quantitySenior!=newCounterSenior){
                    seniorCorrect=false;
                }
            }
            if (text.matches(".*barn.*")) {
                int quantityChildren=Character.getNumericValue(text.charAt(0));
                if(quantityChildren!=newCounterChild){
                    childCorrect=false;
                }
            }


        }

    if(childCorrect&&adultCorrect&&seniorCorrect){
            totalCorrect=true;
            }


        return totalCorrect;
    }

    public void pressButtonToProceed(){

        proceedToPayButton.click();
    }

    public void enterEmail(String email) throws InterruptedException {
        if(!emailOfUser.isDisplayed()){
            Thread.sleep(3000);
        }
        emailOfUser.clear();
        emailOfUser.sendKeys(email);
    }

    public void pressCheckboxToApprove(){
        checkBoxApproval.click();
    }

    public void pressToPayNets(){
        pressToPayNr2.click();
    }

    private void changeToNextDate(){

        filterDate.click();
        secondDateInList.click();
    }

}