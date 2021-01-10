package com.CertificateDeposit.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {
    @Id
    private String userName;
    private List<Bank> banks;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Bank> getBanks() {
        return this.banks;
    }

    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }

}
