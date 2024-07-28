package com.blazeDemo.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features",
    glue ="com.blazeDemo.StepDefinition",
    tags ="@buysTelephoneEquipment",
    snippets = SnippetType.CAMELCASE

)
public class buyEquipmentRunner {
}
