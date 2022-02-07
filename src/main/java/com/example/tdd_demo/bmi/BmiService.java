package com.example.tdd_demo.bmi;

import org.springframework.stereotype.Service;

@Service
public class BmiService {

    public double calculateBmi(double weight, double height) throws IllegalArgumentException {
        double bmiResult;

        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than 0.0 kg ");
        }

        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0.0 cm ");
        }

        double heightInCm = height / 100;
        bmiResult = Math.round((weight / (heightInCm * heightInCm)) * 10);
        bmiResult /= 10;

        return bmiResult;

    }
}
