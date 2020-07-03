package com.ab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

  @RequestMapping("/showLogin")
  public String viewLogin() {
    System.out.println("INSIDE CONTROLLER");
    return "Login";
  }
}
