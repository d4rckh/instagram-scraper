package org.java.mentorship.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverSetup {

    public static String CHROME_VERSION = "114.0.5735.90";

    public void setupChromeDriver() {
        WebDriverManager.chromedriver().browserVersion(CHROME_VERSION).setup();
    }

    public WebDriver createDriver() {
        setupChromeDriver();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");

        return new ChromeDriver(options);
    }

}
