package org.example.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void type(By locator,String text){
      wait.until(ExpectedConditions.visibilityOf(find(locator)));
      find(locator).sendKeys(text);
    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public List<WebElement> findAll(By locator){
     return driver.findElements(locator);
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void click(By locator){
        find(locator).click();
    }

    public void jsScrollProduct(){
        WebElement productScroll = driver.findElement(By.xpath("*[@id=\"native_dropdown_selected_size_name\"]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",productScroll );
    }

    public void optionSelectMethod(By locator,String text){
        Select select = new Select(find(locator));
        select.selectByVisibleText(text);
    }

    public String getText(By locator){
        wait.until(ExpectedConditions.visibilityOf(find(locator)));
        return find(locator).getText();
    }

    public void waitClick(By locator){
//        wait.pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.elementToBeClickable(find(locator)));
    }

    public void forceClick(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].focus(); arguments[0].click();", element);
    }


    public void iframe(By locator){
        driver.switchTo().frame(find(locator));
    }

    public void actions(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(find(locator)).perform();
    }


}

