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
    private Long id;


    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    private String description;
    private double amount;
    private String action;
    private String channel;    
}
