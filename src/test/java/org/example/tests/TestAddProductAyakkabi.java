package org.example.tests;

import org.example.pages.CartPage;
import org.example.pages.HomePage;
import org.example.pages.ProductDetailPage;
import org.example.pages.ProductsPage;
import org.testng.annotations.Test;


public class TestAddProductAyakkabi extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test(priority = 1)
    public void acceptCookiesTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        Thread.sleep(2000);
//        productsPage = new ProductsPage(driver);
//        homePage.searchBox().search("Laptop");
//        Assert.assertTrue(productsPage.isOnProductPage(),
//                      "Not on products page!");
    }

    @Test(priority = 2)
    public void menuButtonClickTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.menuClick();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void menuViewAllClickTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.menuViewAllClick();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void menuTurAyakkabiTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.menuTurAyakkabi();
        Thread.sleep(2000);
        homePage.menuTurAyakkabiCizme();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void ayakkabiSecimTest() throws InterruptedException {
       productDetailPage = new ProductDetailPage(driver);
       productDetailPage.ayakkabiSecim();
       Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void optionOlcüTest() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.optionOlcü(" 37 EU ");
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void addToCartTest() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToCart();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void goToCartTest() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.openCart();
        Thread.sleep(2000);
    }

}
