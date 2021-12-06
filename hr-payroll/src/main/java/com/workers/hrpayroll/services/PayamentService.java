package com.workers.hrpayroll.services;

import com.workers.hrpayroll.entities.Payament;
import org.springframework.stereotype.Service;

@Service
public class PayamentService {

    public Payament getPayament(Long workerId, int days) {
        return new Payament("Bob", 200.0, days);
    }

}
