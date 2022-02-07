Feature: we want to calculate the BMI of a person given weight and height

Scenario: With the weight and the height of a person we can calculate BMI

Given The weight 80.0 kg
And the height 180.0 cm
When the user requests to calculate the BMI

Then the value should be 24.7


