import com.uiassignment.utilities.readproperty;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;

public class SignInTest extends BaseTest {

    @Test
    public void sign() throws IOException, AWTException {

        readproperty read_details = new readproperty();
        Properties Prop = read_details.fetch_property();
        String userName = signIn(Prop);
        Assert.assertTrue(userName.equals(Prop.getProperty("InvalidCredentialsMessage")));

    }
}