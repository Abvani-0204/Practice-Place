package com.ab.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ab.repo.model.User;
import com.ab.service.RegistrationService;

@Controller
public class RegistrationController {

  @Autowired
  public RegistrationService registrationService;

  @RequestMapping(value = "/ShowRegistration", method = {RequestMethod.GET, RequestMethod.POST})
  public String viewRegistration(@ModelAttribute("userObjectR") User user, BindingResult result, Model model, HttpServletRequest request) {
    String method = request.getMethod();
    
    if(("GET").equals(method)) {
      System.out.println("INSIDE REGISTRATION CONTROLLER TO GO TO REGISTRATION PAGE");
      return "Registration";
    }
    else {
      System.out.println("FirstName is:"+user.getFirstName());
      System.out.println("LastName is:"+user.getLastName());
      System.out.println("Email is:"+user.getEmail());
      System.out.println("Password is:"+user.getPassword());
          
      registrationService.registerUserService(user);
      model.addAttribute("userObject", new User());
      return "Login";
    }

  }
}
