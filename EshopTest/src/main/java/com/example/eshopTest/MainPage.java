package com.example.eshopTest;

import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public void findAndClickOnNthProduct(int n){
        List<WebElement> allProductBuyButtons = $(byClassName("marginBottom")).findElements(byClassName("btnBuy"));
        if (allProductBuyButtons.size() > n) {
            allProductBuyButtons.get(n).click();

        }
        else{
            System.out.println("not enough products found");
        }
    }
}
