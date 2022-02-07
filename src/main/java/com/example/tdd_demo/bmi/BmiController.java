package com.example.tdd_demo.bmi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class BmiController {

    private final BmiService service;

    @GetMapping("/bmi/{weight}/{height}")
    public ResponseEntity<?> calculateBmi(@PathVariable double weight, @PathVariable double height) {
        if (weight == 0 || height == 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        service.calculateBmi(weight, height);
        return ResponseEntity.ok(service.calculateBmi(weight, height));
    }
}
