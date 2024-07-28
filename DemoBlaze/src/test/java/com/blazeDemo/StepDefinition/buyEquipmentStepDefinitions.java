package com.blazeDemo.StepDefinition;

import com.demoBlaze.Steps.buyEquipmentStep;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

public class buyEquipmentStepDefinitions {
    @Steps
    buyEquipmentStep buyEquipmentStep;


    @Given("^Login to the page$")
    public void loginToThePage() {
        buyEquipmentStep.openNavigator();
    }


    @Given("^I add multiple products to cart$")
    public void iAddMultipleProductsToCart() {
        buyEquipmentStep.Clicklnk_PhoneSamsung();
        buyEquipmentStep.ClickbtnAddCart();
        buyEquipmentStep.ClickAceptAlert();
        buyEquipmentStep.ClickbtnHome();
        buyEquipmentStep.CLickPhoneNexus();
        buyEquipmentStep.clickAddPhoneNexus();
        buyEquipmentStep.ClickAceptAlert();
        buyEquipmentStep.clickBtnCart();
        buyEquipmentStep.validationMessaje();
        buyEquipmentStep.clickBtnPlaceHolder();
    }

    @When("^the user completes the purchase form$")
    public void theUserCompletesThePurchaseForm() {
        buyEquipmentStep.writeName();
        buyEquipmentStep.writeCountry();
        buyEquipmentStep.writeCity();
        buyEquipmentStep.writeCreditCart();
        buyEquipmentStep.writeMonth();
        buyEquipmentStep.writeYear();
        buyEquipmentStep.clickBtnPurchase();
    }

    @Then("^the purchase is finalized$")
    public void thePurchaseIsFinalized() {
        buyEquipmentStep.validationMessagePurchase();
    }
}
