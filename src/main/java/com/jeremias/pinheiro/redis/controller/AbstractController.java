package com.jeremias.pinheiro.redis.controller;

import com.jeremias.pinheiro.redis.model.PaymentBank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public interface AbstractController {

    @PostMapping("/save")
    ResponseEntity<?> savePayment(@RequestBody  PaymentBank payment);

    @GetMapping("/list")
    ResponseEntity<?> fetchPayments();
}
