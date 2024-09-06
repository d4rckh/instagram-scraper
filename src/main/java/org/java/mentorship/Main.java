package org.java.mentorship;

import org.java.mentorship.driver.ChromeDriverSetup;
import org.java.mentorship.scraper.InstagramScraper;
import org.openqa.selenium.WebDriver;

public class Main {

    private static final WebDriver driver = new ChromeDriverSetup().createDriver();
    private static final InstagramScraper instagramScraper = new InstagramScraper(driver);

    public static void main(String[] args) {

        instagramScraper.scrapeFollowing("timofte_ioachim");

    }
}