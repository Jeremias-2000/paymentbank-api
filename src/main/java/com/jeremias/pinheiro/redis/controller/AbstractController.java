package com.jeremias.pinheiro.redis.controller;

import com.jeremias.pinheiro.redis.model.PaymentBank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface AbstractController {

    @PostMapping("/save")
    ResponseEntity<?> savePayment(@RequestBody  PaymentBank payment);

    @GetMapping("/list")
    ResponseEntity<?> fetchPayments();

    @GetMapping("/search/{id}")
    ResponseEntity<?> fetchPaymentBankById(@PathVariable("id") Long id);

    @PutMapping("/update/{id}")
    ResponseEntity<?> updatePayment(@PathVariable("id") Long id,@RequestBody PaymentBank payment);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> deletePaymentBankById(@PathVariable("id") Long id);
}
