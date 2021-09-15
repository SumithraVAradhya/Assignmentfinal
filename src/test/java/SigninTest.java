import UI.Signin;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SigninTest  {
    public static WebDriver driver;
    @Test
    public void flights()
    {
        WebDriverManager.chromedriver().setup();


        // Creating chrome browser instance and launching it
        driver = new ChromeDriver();

        //URL
        String BaseURl= "https://www.cleartrip.com/";

        //Initialising to search the flights
        driver.get(BaseURl);

        Signin signin= new Signin(driver);
        signin.yourTrips();
        signin.signin();
        signin.emailaddress("sumithraaradhya43@gmail.com");
        signin.password("Sumi@3107");
        signin.signinbutton();
        driver.close();
    }
}