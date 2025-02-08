package org.example.pages;

import org.example.utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.utilities.Locators.*;

public class KategoriBebek extends BasePage {

    public KategoriBebek(WebDriver driver) {
        super(driver);
    }

    public void KategoriBebekSecimi() {
        waitClick(menuKategoriBebebek);
        click(menuKategoriBebebek);
    }

    public void altKategoriBebekClick() {
        waitClick(menuBebekBezi);
        click(menuBebekBezi);
    }

    public void ürünActions(){
        actions(productMendil);
        waitClick(productMendil);
        click(mendilKutulariSecim);
    }

    public void ürünSecimi(){
        waitClick(mendilÜrünSecim);
        click(mendilÜrünSecim);
    }

    public void ürünSepeteEkle(){
        waitClick(addToCartButton);
        click(addToCartButton);
    }

    public void sepetGoruntule(){
        waitClick(goToSepet);
        click(goToSepet);
    }

    public boolean isCartVisible() {
        try {
            // Sepet öğesini bulma
            WebElement cartElement = find(By.id("sw-gtc"));
            return cartElement.isDisplayed(); // Sepet öğesi görünürse true döner
        } catch (NoSuchElementException e) {
            return false;  // Eğer öğe bulunamazsa false döner
        }
    }



}
