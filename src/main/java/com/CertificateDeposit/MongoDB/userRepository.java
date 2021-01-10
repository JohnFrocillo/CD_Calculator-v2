package com.CertificateDeposit.MongoDB;

import com.CertificateDeposit.Model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<User, String>{
    
}
