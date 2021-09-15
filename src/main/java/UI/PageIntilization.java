package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageIntilization {

    public PageIntilization(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
}