package com.demoBlaze.PageObject;

import lombok.Getter;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("https://demoblaze.com/")
public class buyEquipmentPageObject extends PageObject {
    By lnk_PhoneSamsung = By.xpath("//a[contains(text(),'Samsung galaxy s6')]");
    By btn_AddCart = By.xpath("//a[contains(text(),'Add to cart')]");
    By lnk_Home = By.xpath("//a[@id='nava']");
    By lnk_PhoneNexus = By.xpath("//a[contains(text(),'Nexus 6')]");
    By btn_AddCartt = By.xpath("//a[contains(text(),'Add to cart')]");
    By lnk_Homee = By.xpath("//a[@id='nava']");
    By btn_Cart = By.xpath("//a[@id='cartur']");
    By btn_PlaceHolder = By.xpath("//button[contains(text(),'Place Order')]");
    By txt_Name = By.xpath("//input[@id='name']");
    By txt_Country = By.xpath("//input[@id='country']");
    By txt_City = By.xpath("//input[@id='city']");
    By txt_CreditCart = By.xpath("//input[@id='card']");
    By txt_Month = By.xpath("//input[@id='month']");
    By txt_Year = By.xpath("//input[@id='year']");
    By btn_Purchase = By.xpath("//button[contains(text(),'Purchase')]");
    By Msj_Validation = By.xpath("//h2[contains(text(),'Products')]");
    By Msj_ValidationPurchase = By.xpath("//*[contains(text(),'Thank you for your purchase!')]");
}
