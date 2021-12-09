package com.workers.hrpayroll.services;

import com.workers.hrpayroll.entities.Payament;
import com.workers.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PayamentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payament getPayament(Long workerId, int days) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerId);

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);

        return new Payament(worker.getName(),worker.getDailyIncome(), days);
    }

}
