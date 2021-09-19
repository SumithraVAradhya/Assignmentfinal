import com.uiassignment.main.Signin;
import com.uiassignment.utilities.BrowserSetup;
import com.uiassignment.utilities.readproperty;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SignInTest extends BaseTest {

    @Test
    public void sign() throws IOException, AWTException {
        {
            signIn();
        }
    }
}