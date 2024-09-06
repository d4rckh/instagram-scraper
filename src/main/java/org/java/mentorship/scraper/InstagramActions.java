package org.java.mentorship.scraper;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RequiredArgsConstructor
public class InstagramActions {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public void clickAllowAllCookies() {
        wait.until(ExpectedConditions.presenceOfElementLocated(InstagramElements.allowAllCookiesButton));
        wait.until(ExpectedConditions.elementToBeClickable(InstagramElements.allowAllCookiesButton)).click();
    }

    public void clickFollowing() {
        wait.until(ExpectedConditions.presenceOfElementLocated(InstagramElements.followingButton));
        wait.until(ExpectedConditions.elementToBeClickable(InstagramElements.followingButton)).click();
    }

    public void loginWithCredentials() {
        driver.findElement(By.name("username")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
        wait.until(ExpectedConditions.elementToBeClickable(InstagramElements.loginButton)).click();
    }

}
