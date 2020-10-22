package com.swithlink.interview.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.envers.Audited;

import lombok.Data;

@Entity
@Data
@Audited
public class User extends Auditable<String>{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
  @Column(unique = true, nullable = false)
  private String username;

  @Column(unique = true, nullable = false)
  private String email;

  @Column(unique = true, nullable = false)
  private String phonenumber;

  @Column(unique = true, nullable = false)
  private String servicepin;

  @Size(min = 8, message = "Minimum password length: 8 characters")
  private String password;

  @Column(unique = false, nullable = false)
  private double balance;

  @ElementCollection(fetch = FetchType.EAGER)
  List<Role> roles;
}
