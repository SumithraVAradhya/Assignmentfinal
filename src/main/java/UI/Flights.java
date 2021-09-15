package UI;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flights extends PageIntilization {
    public static WebDriver driver;
    public Flights(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }
    //From
        @FindBy (xpath= "//input[@class = 'field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null']")
        WebElement from;
    //To
        @FindBy(xpath = "//input[@class ='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8']")
        WebElement to;
    //Search Flights
        @FindBy(xpath ="//button[@class = 'px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")
        WebElement searchFlights;
    //FlightPrice
        @FindBy(xpath ="(//div[@class ='flex flex-column pl-2 flex-bottom'])[1]")
        WebElement flightPrice;



    public void departure(String city) {
        from.sendKeys(city);
    }
    public void arrival(String city) {
        to.sendKeys(city);
    }
    public void searchFlights() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", searchFlights );
        Thread.sleep(10000);
    }

    public String getPrice() {
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(flightPrice));
        return flightPrice.getText();
    }
}
