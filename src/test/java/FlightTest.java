import UI.Flights;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlightTest  {

    @Test
    public void flights() throws InterruptedException {
     BaseTest price = new BaseTest();
     String flightPrice = price.FlightSearch();
        System.out.println(flightPrice);
    }
}
