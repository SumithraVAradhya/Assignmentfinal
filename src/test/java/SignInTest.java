import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SignInTest extends BaseTest {

    @Test
    public void sign() throws IOException, AWTException {
        {
            String userName = signIn();
            System.out.println(userName);
        }
    }
}