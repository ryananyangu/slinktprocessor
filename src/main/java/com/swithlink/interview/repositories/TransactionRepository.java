package com.swithlink.interview.repositories;

import java.util.List;

import com.swithlink.interview.models.Transaction;
import com.swithlink.interview.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository  extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByUser(User user);
    List<Transaction> findByAction(String action);
    List<Transaction> findByChannel(String channel);
}
