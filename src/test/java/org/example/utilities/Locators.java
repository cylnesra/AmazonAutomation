package org.example.utilities;

import org.openqa.selenium.By;

public class Locators {
    public static final By addToCartButton = new By.ByCssSelector("input[name='submit.add-to-cart']");
    public static final By shoppingCardProducts = By.cssSelector("span.a-truncate-cut");
    public static final By cartCountLocator = By.id("nav-cart-count");
    public static final By cartContainerLocator = By.id("nav-cart-count-container");
    public static final By acceptCookiesLocator = By.id("sp-cc-accept");
    public static final By shippingOptionLocator = By.id("p_n_free_shipping_eligible-title");
    public static final By productNameLocator = new By.ByCssSelector("span.a-size-base-plus");
    public static final By searchBoxLocator = By.id("twotabsearchtextbox");
    public static final By submitButtonLocator = By.id("nav-search-submit-button");
    public static final By menuButtonLocator = By.className("hm-icon");
    public static final By menuViewAllLocator = By.xpath("//a[@class=\"hmenu-item hmenu-compressed-btn\"]");
    public static final By menuKategoriSecimAyakkabi = By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a");
    public static final By menuAyakkabiCizme = By.xpath("//*[@id=\"hmenu-content\"]/ul[26]/li[6]/a");
    public static final By menuAyakkabiSecim = By.xpath("//*[@id=\"a-page\"]/div[1]/div[2]/div[3]/div[1]/div/div[2]/div[2]/ul/li[1]/span/div/div/a/div[2]/div[1]");
    public static final By ayakkabiOlcüSelect = By.xpath("//*[@id=\"native_dropdown_selected_size_name\"]");
    public static final By ayakkabiOlcüSecim = By.xpath("//*[@id=\"native_size_name_1\"]");
    public static final By goToSepet = By.id("sw-gtc");
    public static final By sepetVerify = By.xpath("//*[contains(text(),'Alışveriş Sepeti')]");
    public static final By iframe = By.xpath("//iframe[@name=\"__tcfapiLocator\"]");
    public static final By menuFull = By.xpath("//*[@id=\"hmenu-content\"]/ul[2]");
    public static final By menuKategoriBebebek = By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a");
    public static final By menuBebekBezi = By.xpath("//*[@id=\"hmenu-content\"]/ul[28]/li[4]/a");
    public static final By productMendil = By.xpath("//*[@id=\"a-page\"]/div[1]/div[2]/div[3]/div[1]/div/div/div/ul/li[2]");
    public static final By mendilKutulariSecim = By.xpath("//*[@id=\"a-page\"]/div[1]/div[2]/div[3]/div[1]/div/div/div/ul/li[2]/span/span/div/ul/li[1]/span/a/div");
    public static final By mendilÜrünSecim = By.xpath("//*[@id=\"a-page\"]/div[1]/div[2]/div[3]/div[1]/div/div[2]/div[2]/ul/li[2]/span/div/div/a/div[2]/div");



}
