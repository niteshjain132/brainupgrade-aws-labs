package com.brainupgrade.boot.user.registration.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.brainupgrade.boot.user.registration.model.User;
import com.brainupgrade.boot.user.registration.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {

  @Autowired
  UserRegistrationRepository userRegistrationRepository;
  
  public void save(User user) {
    userRegistrationRepository.save(user);
  }
  public List<User> findAllUsers() {
    return userRegistrationRepository.findAll();
  }
  public List<User> findUserByEmail(String email) {
    return userRegistrationRepository.findByEmail(email); 
  }
  
  public void delete(int id) {
    userRegistrationRepository.deleteById(id);
  }
}
