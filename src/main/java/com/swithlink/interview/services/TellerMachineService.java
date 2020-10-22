package com.swithlink.interview.services;

import com.swithlink.interview.models.TellerMachine;
import com.swithlink.interview.repositories.TellerMachineRepositiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TellerMachineService {

    @Autowired
    private TellerMachineRepositiry tellerMachineRepositiry;

    public TellerMachine saveTellerMachine(TellerMachine tellerMachine){
        return tellerMachineRepositiry.save(tellerMachine);

    }
    
}
