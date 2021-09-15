package UI;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class Hotels extends PageIntilization {
    public static WebDriver driver;
    public Hotels (WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }
    //Where
          @FindBy (xpath= "//input[@title ='Where do you want to go']")
          WebElement Where;
    //Check-in
          @FindBy(xpath = "//input[@title ='Check-in date']")
          WebElement CheckIn;
    //Check-out
          @FindBy(xpath = "//input[@title ='Check-out date']")
          WebElement CheckOut;
    //Search Flights
          @FindBy(id ="SearchHotelsButton")
          WebElement searchHotels;


    public void where(String city) {
        Where.sendKeys(city);
    }
    public void checkin(String date) {
        CheckIn.sendKeys("date");
    }
    public void checkout(String date) {
        CheckOut.sendKeys("date");
    }

    public void searchhotels(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", searchHotels );
    }
}
