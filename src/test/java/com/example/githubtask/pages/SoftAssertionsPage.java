package com.example.githubtask.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SoftAssertionsPage {
    private final SelenideElement junitH4 = $x("//h4[contains(text(), 'JUnit5')]");

    /**
     * Из заголовка с примером кода на JUnit5 возвращает строку JUnit5
     * тем самым подтверждая, что пример с кодом для JUnit5 существует.
     * */
    public void getJUnit5Example() {
        junitH4.shouldHave(Condition.text("Using JUnit5"));

//        String[] h4Split = junitH4.text().split(" ");
//        return h4Split[2];
    }
}
