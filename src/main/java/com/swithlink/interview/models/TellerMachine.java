package com.swithlink.interview.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.envers.Audited;

import lombok.Data;


@Data
@Entity
@Audited
public class TellerMachine  extends Auditable<String>{

    @GeneratedValue
    @Id
    public Long id;
    public double balance;
    public String location;
}
