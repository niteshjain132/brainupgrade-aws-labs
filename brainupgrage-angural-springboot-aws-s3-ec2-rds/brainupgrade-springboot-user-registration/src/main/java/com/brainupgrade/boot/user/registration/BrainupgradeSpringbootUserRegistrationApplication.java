package com.brainupgrade.boot.user.registration;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.brainupgrade.boot.user.registration.model.User;
import com.brainupgrade.boot.user.registration.service.UserRegistrationService;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class BrainupgradeSpringbootUserRegistrationApplication {

  @Autowired
  UserRegistrationService userRegistrationService;

  @PostMapping("/register/user")
  public String registerUser(@RequestBody User user) {
    userRegistrationService.save(user);
    return "Hi"+user.getName()+" , your registraion has been completed successfully";
  }

  @GetMapping("/users")
  public List<User> getAllUsers() {
      return userRegistrationService.findAllUsers();
  }
  @GetMapping("/users/{email}")
  public List<User> findUser(@PathVariable(name = "email") String email) {
    return userRegistrationService.findUserByEmail(email);
  }
  @DeleteMapping("/users/{id}")
  public List<User> cancelUserRegistration(@PathVariable int id) {
    userRegistrationService.delete(id);
    return userRegistrationService.findAllUsers();
  }
  public static void main(String[] args) {
    SpringApplication.run(BrainupgradeSpringbootUserRegistrationApplication.class, args);
  }

}
