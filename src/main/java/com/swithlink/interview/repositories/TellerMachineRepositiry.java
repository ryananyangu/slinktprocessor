package com.swithlink.interview.repositories;

import java.util.List;

import com.swithlink.interview.models.TellerMachine;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TellerMachineRepositiry   extends JpaRepository<TellerMachine, Integer> {

    List<TellerMachine> findByLocation(String location);
    
}
