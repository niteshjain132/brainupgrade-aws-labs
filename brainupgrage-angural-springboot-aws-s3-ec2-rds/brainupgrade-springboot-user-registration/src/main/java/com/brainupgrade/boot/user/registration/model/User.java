package com.brainupgrade.boot.user.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "USER_REGISTRATION")
public class User {
  @Id
  @GeneratedValue
  private int id;
  private String name;
  private String email;
  private int experience;
  private String domain;
}
