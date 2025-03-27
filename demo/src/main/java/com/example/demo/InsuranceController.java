package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/insurances")
public class InsuranceController {

    @GetMapping
    public List<String> getAllInsurances() {
        return Arrays.asList("Health Insurance", "Car Insurance", "Life Insurance");
    }

    @PostMapping("/purchase")
    public String purchaseInsurance() {
        return "Insurance purchased successfully!";
    }
}
