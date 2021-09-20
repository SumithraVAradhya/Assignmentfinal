import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class HotelsTest extends BaseTest  {
    @Test
    public void hotels() throws IOException, AWTException {
        String price =  hotelSearch();
        int  priceOfHotel = Integer.parseInt(price.replaceAll("[^\\d]",""));
        Assert.assertTrue(priceOfHotel>3000);
    }
}