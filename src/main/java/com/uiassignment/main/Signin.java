package com.uiassignment.main;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class Signin extends PageIntilization {
    public static WebDriver driver;
    public Signin(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
    }
    //yourTrips
    @FindBy (xpath = "(//div[@class ='p-relative'])[1]")
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
    @FindBy(id ="userAccountLink")
    WebElement userAccount;


    public void Trips(){
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

