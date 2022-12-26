package com.example.githubtask.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SoftAssertionsPage {
    private final SelenideElement junitH4 = $x("//h4[contains(text(), 'JUnit5')]");

    /**
     * Проверка наличия примера для JUnit5.
     * */
    public void getJUnit5Example() {
        junitH4.shouldHave(Condition.text("Using JUnit5"));

    }
}
