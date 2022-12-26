package com.example.githubtask.tests;

import com.example.githubtask.pages.SelenidePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LaunchTests extends BaseTest {
    private final static String URL = "https://github.com/selenide/selenide";
    SelenidePage selenidePage = new SelenidePage(URL);

    @Test
    public void isJunit5OnThePage() {
    selenidePage
            .switchToWikiPage()
            .openSoftAssertions()
            .getJUnit5Example();
    }
}
