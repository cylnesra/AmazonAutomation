package org.example.pages;

import org.example.utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.example.utilities.Locators.*;

public class SearchBox extends BasePage {

    public SearchBox(WebDriver driver) {
        super(driver);
    }
    public void search(String text) {
        type(searchBoxLocator , text);
        click(submitButtonLocator);
    }
}
