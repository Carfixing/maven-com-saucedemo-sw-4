package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By emailField = By.id("user-name");
    By passWordField  = By.name("password");
    By loginButton = By.id("login-button");
    By verifyText = By.className("title");

    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }

    public void enterPassword(String passWord){

        sendTextToElement(passWordField,passWord);
    }

    public void loginButton(){

        clickOnElement(loginButton);
    }

    public String verifyTheProductMsg(){

        return getTextFromElement(verifyText);
    }
}
