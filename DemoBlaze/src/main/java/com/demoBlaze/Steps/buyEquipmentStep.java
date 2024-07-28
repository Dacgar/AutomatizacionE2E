package com.demoBlaze.Steps;

import com.demoBlaze.PageObject.buyEquipmentPageObject;
import com.demoBlaze.Utils.DataDriven;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class buyEquipmentStep {
    buyEquipmentPageObject buyEquipmentPageObject = new buyEquipmentPageObject();

    DataDriven data = new DataDriven();
    String [] datosFormulario = data.obtainDatasExcel();
    String name = datosFormulario[0];
    String country = datosFormulario[1];
    String city = datosFormulario[2];
    String credit = datosFormulario[3];
    String month = datosFormulario[4];
    String year = datosFormulario[5];



    @Managed
    WebDriver driver;

    private static final int TIMEOUT = 10;

    @Step
    public void openNavigator(){
        WebDriverManager.chromedriver().setup();
        buyEquipmentPageObject.open();
    }

    @Step
    public void Clicklnk_PhoneSamsung(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject
                .getLnk_PhoneSamsung()).click();
    }
    @Step
    public void ClickbtnAddCart(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getBtn_AddCart()).click();
    }
    @Step
    public void ClickAceptAlert(){
        try
        {
            WebDriverWait
                    wait = new WebDriverWait(getDriver(), TIMEOUT);
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        }
        catch
        (NoAlertPresentException e) {

        }
    }
    @Step
    public void ClickbtnHome(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getLnk_Home()).click();
    }
    @Step
    public void CLickPhoneNexus(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getLnk_PhoneNexus()).click();
    }
    @Step
    public void clickAddPhoneNexus(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getBtn_AddCartt()).click();
    }
    @Step
    public void clickBtnCart(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getBtn_Cart()).click();
    }
    @Step
    public void clickBtnPlaceHolder(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                        getBtn_PlaceHolder()).click();
    }
    @Step
    public void writeName(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getTxt_Name()).sendKeys(name);
    }
    @Step
    public void writeCountry(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getTxt_Country()).sendKeys(country);
    }
    @Step
    public void writeCity(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getTxt_City()).sendKeys(city);
    }
    @Step
    public void writeCreditCart(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getTxt_CreditCart()).sendKeys(credit);
    }
    @Step
    public void writeMonth(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getTxt_Month()).sendKeys(month);
    }
    @Step
    public void writeYear(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getTxt_Year()).sendKeys(year);
    }
    @Step
    public void clickBtnPurchase(){
        buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.
                getBtn_Purchase()).click();
    }
    @Step
    public void validationMessaje(){
        Assert.assertThat(buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.getMsj_Validation())
                .isDisplayed(), Matchers.is(true));
    }
    @Step
    public void validationMessagePurchase(){
        Assert.assertThat(buyEquipmentPageObject.getDriver().findElement(buyEquipmentPageObject.getMsj_ValidationPurchase())
                .isDisplayed(), Matchers.is(true));
    }
}
