package com.ab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ab.repo.RegistrationRepository;
import com.ab.repo.model.User;

@Service
public class RegistrationService {

  @Autowired
  public RegistrationRepository registrationRepository;

  public void registerUserService(User register) {
    System.out.println("INSIDE OF REGISTER USER SERVICE");
    System.out.println("Email is:" + register.getEmail());
    System.out.println("Password is:" + register.getPassword());
    System.out.println("firstname :" + register.getFirstName());
    System.out.println("lastname:" + register.getLastName());
    registrationRepository.registerUser(register);
  }

}
