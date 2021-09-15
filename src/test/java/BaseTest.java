import UI.Flights;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public String FlightSearch() {
        WebDriverManager.chromedriver().setup();



        // Creating chrome browser instance and launching it
        driver = new ChromeDriver();

        //URL
        String BaseURl= "https://www.cleartrip.com/flights";

        //Initialising to search the flights
        driver.get(BaseURl);

        Flights flight= new Flights(driver);
        flight.departure("BLR - Bangalore, IN");
        flight.arrival("DME - Moscow, RU");
        flight.searchFlights();
        String flightPrice = flight.getPrice();
        driver.close();
        return flightPrice;
    }
}
