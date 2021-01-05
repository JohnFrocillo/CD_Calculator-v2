package com.CertificateDeposit.CertificateDepositCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
	public String testMethod() {
		return "Success!";
    }
    
}
