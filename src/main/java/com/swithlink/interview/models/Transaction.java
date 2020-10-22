package com.swithlink.interview.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;
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
@Audited
public class Transaction  extends Auditable<String>{

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
}
