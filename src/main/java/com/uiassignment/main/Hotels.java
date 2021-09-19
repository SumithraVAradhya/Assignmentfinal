package com.uiassignment.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Hotels extends PageIntilization {
    public static WebDriver driver;
    public Hotels (WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }
    //Where
          @FindBy (id= "Tags")
          WebElement where;


    //Check-in
          @FindBy(xpath = "//input[@title ='Check-in date']")
          WebElement checkIn;
    //Date Selector for CheckIn
         @FindBy(xpath ="(//td[@class= \' weekEnd \'])[4]")
         WebElement dateSelectionCheckIn;
    //Check-out
          @FindBy(xpath = "//input[@title ='Check-out date']")
          WebElement checkOut;
    //Date Selector for CheckOut
         @FindBy(xpath = "(//td[@data-handler ='selectDay'])[3]")
         WebElement dateSelectionCheckOut;
    //Search Flights
          @FindBy(id ="SearchHotelsButton")
          WebElement searchHotels;
    //Get the price
          @FindBy(xpath="(//h2[@id=\"perRoomPrDisp\"])[3]")
          WebElement price;

    public void where(String city) {
        where.sendKeys(city);

    }
    public void Search(String location){

    }
    public void checkIn(String date) {
        checkIn.click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", dateSelectionCheckIn);
    }
    public void checkout(String date) {
        checkOut.click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", dateSelectionCheckOut);
    }

    public void searchHotels(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", searchHotels );
    }
    public String getPrice()
    {
        return price.getText();
    }
}
