package com.demoBlaze.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScript {
    public static void clickJS(WebDriver driver, By by) {

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }
}
