package com.umasuraj;

import com.umasuraj.pom.base.BaseTest;
import com.umasuraj.pom.objects.BillingAddress;
import com.umasuraj.pom.pages.CartPage;
import com.umasuraj.pom.pages.CheckoutPage;
import com.umasuraj.pom.pages.HomePage;
import com.umasuraj.pom.pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestCase extends BaseTest {

    @Test
    public void guestCheckoutUsingDirectBankTransfer() throws InterruptedException {
      /*  BillingAddress billingAddress = new BillingAddress().
                setFirstName("demo").
                setLastName("user").
                setCompany("demo").
                setAddressLineOne("San Francisco").
                setCity("San Francisco").
                setPostCode("94188").
                setEmail("tsurajuma@gmail.com");*/

        BillingAddress billingAddress = new BillingAddress("demo", "user", "demo",
                "San Francisco", "San Francisco", "94188", "tsurajuma@gmail.com");

        StorePage storePage = new HomePage(driver).
                load().
                navigateToStoreUsingMenu().
                search("Blue");
        Assert.assertEquals(storePage.getTitle(), "Search results: “Blue”");

        storePage.clickAddToCartBtn("Blue Shoes");
        Thread.sleep(5000);
        CartPage cartPage = storePage.clickViewCartLink();
        Assert.assertEquals(cartPage.getProductName(),"Blue Shoes");

        CheckoutPage checkoutPage = cartPage.navigateToCheckout()
                .placeOrder(billingAddress);
        Thread.sleep(5000);
        Assert.assertEquals(checkoutPage.getSuccessNotice(),"Thank you. Your order has been received.");

    }

    @Test
    public void loginAndCheckoutUsingDirectBankTransfer() throws InterruptedException {
        BillingAddress billingAddress = new BillingAddress().
                setFirstName("demo").
                setLastName("user").
                setCompany("demo").
                setAddressLineOne("San Francisco").
                setCity("San Francisco").
                setPostCode("94188").
                setEmail("tsurajuma@gmail.com");

        StorePage storePage = new HomePage(driver).
                load().
                navigateToStoreUsingMenu().
                search("Blue");
        Assert.assertEquals(storePage.getTitle(), "Search results: “Blue”");

        storePage.clickAddToCartBtn("Blue Shoes");
        Thread.sleep(5000);
        CartPage cartPage = storePage.clickViewCartLink();
        Assert.assertEquals(cartPage.getProductName(),"Blue Shoes");

        CheckoutPage checkoutPage = cartPage.navigateToCheckout()
                .placeOrder(billingAddress);
        Thread.sleep(5000);
        Assert.assertEquals(checkoutPage.getSuccessNotice(),"Thank you. Your order has been received.");

    }

} // end class
