package com.workers.hrpayroll.controller;

import com.workers.hrpayroll.entities.Payament;
import com.workers.hrpayroll.services.PayamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PayamentController {

    @Autowired
    private PayamentService service;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payament> getPayament(@PathVariable Long workerId, @PathVariable Integer days) {
        Payament payament = service.getPayament(workerId,days);
        return ResponseEntity.ok(payament);
    }


}
