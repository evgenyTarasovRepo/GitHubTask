package com.example.githubtask.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {
    @BeforeAll
    public static void init() {
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    public static void turnDown() {
        Selenide.closeWebDriver();
    }
}
