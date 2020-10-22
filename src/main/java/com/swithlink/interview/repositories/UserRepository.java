package com.swithlink.interview.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swithlink.interview.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

  boolean existsByUsername(String username);

  User findByUsername(String username);

  @Transactional
  void deleteByUsername(String username);

  User findByPhonenumber(String phonenumber);

}
