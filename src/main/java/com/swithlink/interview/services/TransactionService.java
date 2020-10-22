package com.swithlink.interview.services;

import com.swithlink.interview.models.Transaction;
import com.swithlink.interview.models.User;
import com.swithlink.interview.repositories.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private UserService userService;

    public Transaction saveTransaction(Transaction transaction,String username){

        User user = userService.search(username);
        transaction.setUser(user);
        return transactionRepository.save(transaction);
    }

    
}
