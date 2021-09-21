import com.uiassignment.utilities.readproperty;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;

public class FlightTest extends BaseTest  {

    @Test
    public void flights() throws IOException, AWTException {
        readproperty read_details = new readproperty();
        Properties Prop = read_details.fetch_property();
     String flightPrice = FlightSearch(Prop);
        int  price = Integer.parseInt(flightPrice.replaceAll("[^\\d]",""));
        Assert.assertTrue(price> Integer.parseInt(Prop.getProperty("FlightPrice")));
    }
}
