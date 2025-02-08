package org.example.pages;

import org.example.utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.example.utilities.Locators.*;

import java.util.List;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void menuKategoriBebekSecim(){
        waitClick(menuKategoriBebebek);
        forceClick(menuKategoriBebebek);
    }

}