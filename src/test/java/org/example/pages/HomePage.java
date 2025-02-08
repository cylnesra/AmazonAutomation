package org.example.pages;

import org.example.utilities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.utilities.Locators.*;

public class HomePage extends BasePage {

//    SearchBox searchBox ;

    public HomePage(WebDriver driver) {
        super(driver);
//        searchBox = new SearchBox(driver);
    }

//    public SearchBox searchBox(){
//        return this.searchBox;
//    }

//    public boolean isProductCountUp() {
//        return getCartCount() > 0 ;
//    }
//
//    public void goToCart() {
//        click(cartContainerLocator);
//    }
//
//    private int getCartCount(){
//        String count = find(cartCountLocator).getText();
//        return Integer.parseInt(count);
//    }
public void selectProduct(int i) {
    getAllProducts().get(i).click();
}

    private List<WebElement> getAllProducts(){
        return findAll(menuFull);
    }
    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }

    public void menuClick(){
        waitClick(menuButtonLocator);
        click(menuButtonLocator);
    }

    public void menuViewAllClick(){
        waitClick(menuViewAllLocator);
        click(menuViewAllLocator);
    }

    public void menuTurAyakkabi(){
        waitClick(menuKategoriSecimAyakkabi);
        click(menuKategoriSecimAyakkabi);
    }

    public void menuTurAyakkabiCizme(){
        waitClick(menuAyakkabiCizme);
        forceClick(menuAyakkabiCizme);
    }

}