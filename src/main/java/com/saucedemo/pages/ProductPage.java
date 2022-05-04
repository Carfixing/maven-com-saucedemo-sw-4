package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {
    By emailField = By.id("user-name");
    By passWordField  = By.name("password");
    By loginButton = By.id("login-button");
    By headerMessage = By.xpath("//span[contains(text(),'Products')]");
    By products = By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']");


    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }

    public void enterPassword(String passWord){
        sendTextToElement(passWordField,passWord);
    }

    public void loginButton(){
        clickOnElement(loginButton);
    }

    public String getHeaderMessage (){
        return getTextFromElement(headerMessage);
    }

    public void getProductList(){
        List<WebElement> productsList = driver.findElements(products);
        System.out.println("Items displayed : " + productsList.size());
        for (WebElement element : productsList)
            Assert.isTrue(true, String.valueOf(element.isDisplayed()));
    }


}
