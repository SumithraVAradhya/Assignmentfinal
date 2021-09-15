import UI.Hotels;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HotelsTest  {
    public static WebDriver driver;
    @Test
    public void flights()
    {
        WebDriverManager.chromedriver().setup();


        // Creating chrome browser instance and launching it
        driver = new ChromeDriver();

        //URL
        String BaseURl= "https://www.cleartrip.com/hotels";

        //Initialising to search the flights
        driver.get(BaseURl);

        Hotels hotel= new Hotels(driver);
        hotel.where("Mumbai");
        hotel.checkin("15092021");
        hotel.checkout("17092021");
        hotel.searchhotels();
        driver.close();
    }
}