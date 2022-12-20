package com.example.githubtask;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenidePage {
    private final SelenideElement wikiLink = $("#wiki-tab");

    public SelenidePage(String url) {
        open(url);
    }

    /**
     * Открывает страницу Wiki кликая по ссылке
     * */
    public WikiPage switchToWikiPage() {
        wikiLink.click();
        return new WikiPage();
    }
}
