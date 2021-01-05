package com.CertificateDeposit.CertificateDepositCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CertificateDeposit.CertificateDepositCalculator.Model.InterestFormula;

@RestController
public class Controller {

    @GetMapping("/test")
	public String testMethod() {
		return "Success!";
    }

    @GetMapping("/Calculation")
    public String calculateCDValue(@RequestBody InterestFormula values) {
        return Double.toString(values.getA());
    }
    
}
