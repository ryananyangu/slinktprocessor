package com.swithlink.interview.services;

import com.swithlink.interview.models.Transaction;
import com.swithlink.interview.repositories.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction saveTransaction(Transaction transaction){

        return transactionRepository.save(transaction);
    }

    
}