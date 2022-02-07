package com.example.tdd_demo.bmi;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, strict = true)
public class BmiCalculatorTests {
}
