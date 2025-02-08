package org.example.pages;
import static org.example.utilities.Locators.*;


import org.example.utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }

    public void openCart(){
        waitClick(goToSepet);
        click(goToSepet);
    }

    public String sepetClickVerify(){
        return getText(sepetVerify);
    }







//    public boolean checkIfProductAdded(){
//        return getShoppingProducts().size() > 0 ;
//    }
//
//    private List<WebElement> getShoppingProducts(){
//        return findAll(shoppingCardProducts);
//    }


}
