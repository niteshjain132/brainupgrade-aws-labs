package com.brainupgrade.boot.user.registration.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.brainupgrade.boot.user.registration.model.User;

public interface UserRegistrationRepository extends JpaRepository<User, Integer> {
  public List<User> findByEmail(String email);
}
