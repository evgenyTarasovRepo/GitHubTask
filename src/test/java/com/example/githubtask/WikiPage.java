package com.example.githubtask;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class WikiPage {
    private final SelenideElement showMoreBtn = $x("//button[contains(@class, 'btn-link')]");
    private final ElementsCollection pages = $$(".flex-items-start");

    /**
     * Разворачивает список Pages.
     * Открывает страницу SoftAssertions кликая по ссылке из списка
     * */
    public SoftAssertionsPage openSoftAssertions() {
        showMoreBtn.click();
        pages.last()
                .shouldBe(Condition.visible)
                .click();
        return new SoftAssertionsPage();
    }
}
