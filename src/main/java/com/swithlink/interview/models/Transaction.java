package com.swithlink.interview.models;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @GeneratedValue
    @Id
    @NonNull
    public Long transactionID;


    @ManyToOne(fetch = FetchType.EAGER)
    public User User;

    public String description;
    public double amount;
    public String action;
    public String channel;


    @LastModifiedDate
    public Date modifiedAt;

    @CreatedDate
    public Date createdAt;

    @LastModifiedBy
    public String modifiedBy;

    @CreatedBy
    public String createdBy;


    
}
