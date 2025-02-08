package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseTest {
    public static WebDriver  driver;


    protected static String baseUrl = "https://www.amazon.com.tr/";
    protected SoftAssert softAssert;


    @BeforeTest
    @Deprecated
    public static void setUp(){

        ChromeOptions options = new ChromeOptions();
        //options.setBrowserVersion("114.0");
        options.addArguments("--remote-allow-origins=*");
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application2\\chrome.exe");
        //options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //String test =System.getProperty(("webdriver.chrome.driver"));
        //System.setProperty("webdriver.chrome.driver","D:\\Automation\\untitled\\chromedriver\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","D:\\Automation\\untitled\\chrome-win32\\chrome.exe");

        //String test2 =System.getProperty(("webdriver.chrome.driver"));
        //WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver(options);
//        try {
//            Thread.sleep(100);
//            driver.manage().window().maximize();
//            Thread.sleep(100);
//            driver.get(baseUrl);
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterTest
    public void tearDown() throws InterruptedException {
        if(driver == null) {
            return;
        }
        //softAssert.assertAll();
           driver.quit();
           driver = null;
        }

}