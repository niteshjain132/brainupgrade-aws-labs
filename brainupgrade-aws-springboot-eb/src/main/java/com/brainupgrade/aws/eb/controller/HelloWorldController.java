package com.brainupgrade.aws.eb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.brainupgrade.aws.eb.model.HelloWorld;

@RestController
public class HelloWorldController {
  @GetMapping(path = "/hello-world")
  public String helloWorld() {
      return "Hello World";
  }

  @GetMapping(path = "/hello-world-model")
  public HelloWorld helloWorldBean() {
      return new HelloWorld("Hello World - Changed");
  }
  
  @GetMapping(path = "/hello-world/{name}")
  public HelloWorld helloWorldWithUserName(@PathVariable String name) {
      return new HelloWorld(String.format("Hello World, %s", name));
  }
}
