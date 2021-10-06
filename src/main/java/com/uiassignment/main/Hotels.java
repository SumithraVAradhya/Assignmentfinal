package com.uiassignment.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(xpath ="//ul[@id='ui-id-1']/li[2]/a") //"//ul[@id='ui-id-1']/li"
    WebElement selectCity;


    @FindBy(id = "CheckInDate")
    WebElement checkIn;

    @FindBy(xpath = "(//a[@class='ui-state-default '])[2]")
    WebElement checkInClick;

    //Check-out
    @FindBy(id = "CheckOutDate")
    WebElement checkOut;

    @FindBy(xpath = "(//a[@class='ui-state-default '])[3]")
    WebElement checkOutClick;
    //Search ui.Flights
    @FindBy(id = "SearchHotelsButton")
    WebElement searchHotels;

    @FindBy(xpath="(//h2[@id=\"perRoomPrDisp\"])[3]")
    WebElement price;

    public void where(String city) {
        where.sendKeys(city);
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(selectCity));
        where.sendKeys(Keys.ENTER);
    }
    public void checkIn() {
       checkIn.click();
        checkInClick.click();
    }
    public void checkout() {
        checkOut.click();
        checkOutClick.click();
    }

    public void searchHotel(){
        searchHotels.click();
    }
    public String getPrice()
    {
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(price));
        return price.getText();
    }
}
