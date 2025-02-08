package org.example.pages;
import static org.example.utilities.Locators.*;

import org.example.utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver){
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButton);
    }

    public void ayakkabiSecim(){
        click(menuAyakkabiSecim);
    }

    public void productJsScroll(){
//     jsScrollProduct();
     waitClick(ayakkabiOlcüSelect);
     click(ayakkabiOlcüSelect);
    }

   public void optionOlcü(String olcü){
     waitClick(ayakkabiOlcüSelect);
     optionSelectMethod(ayakkabiOlcüSelect,olcü);
   }

    public void addToCart(){
        waitClick(addToCartButton);
        click(addToCartButton);
    }

}
