package com.umasuraj.pom.pages;

import com.umasuraj.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private By productName = By.cssSelector("td[class='product-name'] a");
    private By checkoutBtn = By.cssSelector(".checkout-button");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public String getProductName(){
        return driver.findElement(productName).getText();
    }
    public CheckoutPage navigateToCheckout(){
        driver.findElement(checkoutBtn).click();
        return new CheckoutPage(driver);
    }
}
