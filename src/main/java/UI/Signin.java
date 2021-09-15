package UI;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class Signin extends PageIntilization {
    public static WebDriver driver;
    public Signin(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }
    //yourtrips
    @FindBy (xpath= "//button[@class = 'flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer bn p-2 nmx-2 hover:bg-neutral-0 br-4 c-neutral-400 hover:c-secondary-500']")
    WebElement yourtrips;

    //SignIn
    @FindBy(xpath = "//button[@class ='bg-secondary-500 hover:bg-secondary-600 c-white bc-transparent c-pointer py-1 px-3 h-8 fs-3 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")
    WebElement signin;

    //Enter Email
    @FindBy(xpath ="//input[@placeholder ='Email address']")
    WebElement email;

    //Enter password
    @FindBy(xpath ="//input[@type ='password']")
    WebElement password;

    //Signbutton
    @FindBy(xpath ="//input[@type ='password']")
    WebElement signinbutton;


    public void yourTrips(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", yourtrips );
    }
    public void signin(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signin);
    }
    public void emailaddress(String emailaddress) {
        email.sendKeys(emailaddress);
    }
    public void password(String enterpassword) {
        password.sendKeys(enterpassword);
    }
    public void signinbutton(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signinbutton );
    }
}

