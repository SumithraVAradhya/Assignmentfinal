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
    @FindBy (xpath= "//button[@class = 'flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer bn p-2 nmx-2 hover:bg-neutral-0 br-4 c-neutral-400 hover:c-secondary-500']")
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
    @FindBy(xpath ="//input[@type ='password']")
    WebElement signInButton;


    public void yourTrips(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", yourTrips );
    }
    public void signIn(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signIn);
    }
    public void emailAddress(String emailAddress) {
        email.sendKeys(emailAddress);
    }
    public void password(String enterPassword) {
        password.sendKeys(enterPassword);
    }
    public void signInButton(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signInButton );
    }
}

