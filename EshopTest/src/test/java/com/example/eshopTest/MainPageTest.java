package com.example.eshopTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;

public class MainPageTest {
    private final MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        Configuration.startMaximized = true;
        open("https://www.topeninejlevneji.cz/");
    }

    @Test
    public void search() {
        $(byTitle("Radiátory")).click();
        $(byText("Od nejdražšího")).click();
        mainPage.findAndClickOnNthProduct(0);
        $(byText("Zpět na nákup")).click();
        mainPage.findAndClickOnNthProduct(1);
        $(byText("Zpět na nákup")).click();
    }

}
