package org.java.mentorship.scraper;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InstagramScraper {

    private final WebDriver webDriver;
    private final InstagramActions instagramActions;
    private final WebDriverWait wait;

    public InstagramScraper(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(10));
        this.instagramActions = new InstagramActions(webDriver, this.wait);
    }

    public void scrapeFollowing(String instagramUsername) {

        webDriver.get(String.format("https://instagram.com/%s", instagramUsername));

        instagramActions.clickAllowAllCookies();

        instagramActions.clickFollowing();

        instagramActions.loginWithCredentials();



    }

}
