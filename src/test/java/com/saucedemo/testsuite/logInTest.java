package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class logInTest extends TestBase {
    HomePage homePage =  new HomePage();
    ProductPage productPage = new ProductPage();

    @Test
    public void  userSholdLoginSuccessfullyWithValid(){
        homePage.enterEmail("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.loginButton();
        String expectedMessage = "PRODUCTS";
        String actualMessage = homePage.verifyTheProductMsg();
        Assert.assertEquals(expectedMessage, actualMessage, "Product Text is not match");
    }
    @Test
    public void  verifyThatSixProductsAreDisplayedOnPage(){
        productPage.enterEmail("standard_user");
        productPage.enterPassword("secret_sauce");
        productPage.loginButton();
        String expectedMessage = "PRODUCTS";
        String actualMessage = productPage.getHeaderMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Error message displayed");
        productPage.getProductList();

    }

}
