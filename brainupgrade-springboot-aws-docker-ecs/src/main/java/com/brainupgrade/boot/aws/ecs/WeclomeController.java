package com.brainupgrade.boot.aws.ecs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeclomeController {

  @GetMapping("/welcome")
  public String greetings() {
    return "Welcome to Brainupgrade Academay";
  }
  
}
