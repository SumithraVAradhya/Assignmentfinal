import org.junit.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class FlightTest extends BaseTest  {

    @Test
    public void flights() throws IOException, AWTException {
     String flightPrice = FlightSearch();
        int  price = Integer.parseInt(flightPrice.replaceAll("[^\\d]",""));
        Assert.assertTrue(price>5000);
    }
}
