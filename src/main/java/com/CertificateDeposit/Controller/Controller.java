package com.CertificateDeposit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.CertificateDeposit.Model.InterestFormula;
import com.CertificateDeposit.MongoDB.userRepository;

@RestController
public class Controller {

    @Autowired
    private userRepository repository;

    @GetMapping("/test")
    public String testMethod() {
        return "Success!";
    }

    @GetMapping("/Calculation")
    public String calculateCDValue(@RequestBody InterestFormula values) {
        return Double.toString(values.getA());
    }

    @GetMapping("/allUsers")
    public List getAllUsers() {
        return repository.findAll();
    }

    
}
