package com.swithlink.interview.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;


@Data
@Entity
public class TellerMachine {

    @GeneratedValue
    @Id
    public Long ATMId;
    public double balance;
    public String number;

    @LastModifiedDate
    public Date modifiedAt;

    @CreatedDate
    public Date createdAt;

    @LastModifiedBy
    public String modifiedBy;

    @CreatedBy
    public String createdBy;

}
