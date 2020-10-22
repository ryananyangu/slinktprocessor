package com.swithlink.interview.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Entity
@Data
public class Customer {

    @GeneratedValue
    @Id
    public Long customerID;


    public String name;


    @GeneratedValue(generator = "UUID")
	@GenericGenerator(
		name = "UUID",
		strategy = "org.hibernate.id.UUIDGenerator"
	)
    public String accountNumber;
    public double balance;
    public String phoneNumber;
    public String email;
    public String servicePin;

    @LastModifiedDate
    public Date modifiedAt;

    @CreatedDate
    public Date createdAt;

    @LastModifiedBy
    public String modifiedBy;

    @CreatedBy
    public String createdBy;
}
