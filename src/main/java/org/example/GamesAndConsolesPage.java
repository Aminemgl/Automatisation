package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GamesAndConsolesPage {

    By bestSeller = By.cssSelector("a[class='a-link-normal octopus-pc-item-link'][title='The Legend of Zelda : Tears of the Kingdom']\"");


    WebDriver driver;

    public GamesAndConsolesPage(WebDriver driver) {
        this.driver = driver;
    }


    public void accederPremierJeu() {
        driver.findElement(bestSeller).click();
    }
}