import com.uiassignment.main.Flights;
import com.uiassignment.main.Hotels;
import com.uiassignment.main.Signin;
import com.uiassignment.utilities.BrowserSetup;
import com.uiassignment.utilities.readproperty;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    public String FlightSearch(Properties Prop) throws AWTException, IOException {



        // Creating chrome browser instance and launching it
        driver = BrowserSetup.getDriver(Prop.getProperty("Browser"));
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        //Initialising to search the Flights
        driver.get(Prop.getProperty("Flights_URL"));
        driver.manage().window().maximize();


        Flights flight = new Flights(driver);
        flight.departure(Prop.getProperty("CityDepartureFlight"));
        flight.arrival(Prop.getProperty("CityArrivalFlight"));
        flight.selectDate();
        flight.searchFlights();
        String flightPrice = flight.getPrice();
        driver.close();
        return flightPrice;
    }


    public String hotelSearch(Properties Prop) throws AWTException, IOException {


        // Creating chrome browser instance and launching it
        driver = BrowserSetup.getDriver(Prop.getProperty("Browser"));

        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        //Initialising to search the hotels
        driver.get(Prop.getProperty("Hotel_URL"));
        driver.manage().window().maximize();


        Hotels hotel = new Hotels(driver);
        hotel.where(Prop.getProperty("CityHotel"));

        hotel.checkIn();
        hotel.checkout();
        hotel.searchHotel();
        String price = hotel.getPrice();
        driver.close();
        return price;

    }

    public String signIn(Properties Prop) throws AWTException, IOException {


        // Creating chrome browser instance and launching it
        driver = BrowserSetup.getDriver(Prop.getProperty("Browser"));

        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        //Initialising to signIn
        driver.get(Prop.getProperty("Base_URL"));
        driver.manage().window().maximize();


        Signin signIn = new Signin(driver);
        signIn.Trips();
        signIn.logIn();
        signIn.email(Prop.getProperty("Email"));
        signIn.enterPassword(Prop.getProperty("Password"));
        signIn.loginInButton();
        String userName= signIn.getUserName();
        driver.close();
        return userName;
    }
}
