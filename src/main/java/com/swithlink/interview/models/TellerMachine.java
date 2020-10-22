package com.swithlink.interview.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.envers.Audited;

import lombok.Data;



@Entity
@Audited
@Data
public class TellerMachine  extends Auditable<String>{

    @GeneratedValue
    @Id
    private Long id;
    private double balance;
    private String location;
}
