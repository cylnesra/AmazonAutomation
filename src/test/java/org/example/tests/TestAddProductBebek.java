package org.example.tests;

import apiutils.TestRailAPI;
import org.example.pages.HomePage;
import org.example.pages.KategoriBebek;
import org.testng.annotations.Test;

public class TestAddProductBebek extends BaseTest {
    HomePage homePage;
    KategoriBebek kategoriBebek;

    private static final int testCaseId = 1;

    @Test(priority = 1)
    public void acceptCookiesTest() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        Thread.sleep(2000);
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
    public void kategoriBebekClickTest() throws InterruptedException {
        kategoriBebek = new KategoriBebek(driver);
        kategoriBebek.KategoriBebekSecimi();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void altKategoriBebekClickTest() throws InterruptedException {
        kategoriBebek = new KategoriBebek(driver);
        kategoriBebek.altKategoriBebekClick();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void ürünMendilSecimiTest() throws InterruptedException {
        kategoriBebek = new KategoriBebek(driver);
        kategoriBebek.ürünActions();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void ürünSecimiTest() throws InterruptedException {
        kategoriBebek = new KategoriBebek(driver);
        kategoriBebek.ürünSecimi();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void ürünSepeteEkleTest() throws InterruptedException {
        kategoriBebek = new KategoriBebek(driver);
        kategoriBebek.ürünSepeteEkle();
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void sepetGoruntuleTest() throws InterruptedException {
        kategoriBebek = new KategoriBebek(driver);
        kategoriBebek.sepetGoruntule();
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void testResultIntegration() throws InterruptedException {
        boolean isCartVisible = kategoriBebek.isCartVisible();

        int statusId = isCartVisible ? 1 : 5;
        String comment = isCartVisible ? "Test passed: Cart is visible" : "Test failed: Cart not visible";
        TestRailAPI.addTestResult(testCaseId, statusId, comment);

        Thread.sleep(2000);
    }
}
