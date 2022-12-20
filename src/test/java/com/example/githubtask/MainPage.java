package com.example.githubtask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainPage extends BaseSetupClass {
    private final static String URL = "https://github.com/selenide/selenide";
    SelenidePage selenidePage = new SelenidePage(URL);

    @Test
    public void isJunit5OnThePage() {

        String jUnit5Example = selenidePage
                .switchToWikiPage()
                .openSoftAssertions()
                .getJUnit5Example();

        Assertions.assertEquals(jUnit5Example, "JUnit5");

    }
}
