package com.workers.hrpayroll.services;

import com.workers.hrpayroll.entities.Payament;
import com.workers.hrpayroll.entities.Worker;
import com.workers.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayamentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payament getPayament(Long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payament(worker.getName(),worker.getDailyIncome(), days);
    }

}
