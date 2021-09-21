import com.uiassignment.utilities.readproperty;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;

public class HotelsTest extends BaseTest  {
    @Test
    public void hotels() throws IOException, AWTException {
        readproperty read_details = new readproperty();
        Properties Prop = read_details.fetch_property();
        String price =  hotelSearch(Prop);
        int  priceOfHotel = Integer.parseInt(price.replaceAll("[^\\d]",""));
        Assert.assertTrue(priceOfHotel>Integer.parseInt(Prop.getProperty("HotelPrice")));
    }
}