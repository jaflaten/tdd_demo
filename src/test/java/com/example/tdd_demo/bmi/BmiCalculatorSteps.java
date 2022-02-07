package com.example.tdd_demo.bmi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BmiCalculatorSteps {
    double weight, height, bmiResult;

    BmiService service = new BmiService();

    @Given("The weight {double} kg")
    public void the_weight_kg(Double w) {
        weight = w;
    }

    @And("the height {double} cm")
    public void the_height_cm(Double h) {
        height = h;
    }


    @When("the user requests to calculate the BMI")
    public void the_user_requests_to_calculate_the_BMI() {
        Assertions.assertTrue(weight > 0);
        Assertions.assertTrue(height > 0);

        bmiResult = service.calculateBmi(weight, height);

    }

    @Then("the value should be {double}")
    public void return_BMI_value(Double bmi) {
        Assertions.assertEquals(bmi, bmiResult);
    }

}
