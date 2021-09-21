package com.uiassignment.main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn extends PageIntilization {
    public static WebDriver driver;
    public SignIn(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }
    //yourTrips
    @FindBy (xpath = "//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer bn p-2 nmx-2 hover:bg-neutral-0 br-4 c-neutral-400 hover:c-secondary-500']")
    WebElement yourTrips;

    //SignIn
    @FindBy(xpath = "//button[@class ='bg-secondary-500 hover:bg-secondary-600 c-white bc-transparent c-pointer py-1 px-3 h-8 fs-3 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")
    WebElement signIn;

    //Enter Email
    @FindBy(xpath ="//input[@placeholder ='Email address']")
    WebElement email;

    //Enter password
    @FindBy(xpath ="//input[@type ='password']")
    WebElement password;

    //SignButton
    @FindBy(xpath ="//button[@class ='bg-secondary-500 hover:bg-secondary-600 c-white bc-transparent c-pointer w-100p py-2 px-4 h-9 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")
    WebElement signInButton;
   //UserAccount
    @FindBy(xpath ="//div[@class ='py-2 px-2 h-8 flex flex-middle bg-error-600 c-white fs-2 br-4 ']")
    WebElement userAccount;


    public void Trips(){
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(yourTrips));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", yourTrips );
    }
    public void logIn(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signIn);
    }
    public void email(String emailAddress) {
        email.sendKeys(emailAddress);
    }
    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }
    public void loginInButton(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signInButton );
    }
    public String getUserName()
    {
        return userAccount.getText();
    }
}

