package com.demoBlaze.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitFor {
    public void esperaImplicita ( int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void esperaExplilicitaClick (By elemento, WebDriver driver) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.elementToBeClickable(elemento));
    }
    public void esperaExplicitaTexto (WebDriver driver, By elemento) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
    public void esperarCargaPagina (WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}
