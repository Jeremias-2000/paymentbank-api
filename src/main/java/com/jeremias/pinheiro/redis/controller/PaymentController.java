package com.jeremias.pinheiro.redis.controller;

import com.jeremias.pinheiro.redis.model.PaymentBank;
import com.jeremias.pinheiro.redis.service.PaymentBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController  implements AbstractController{

    @Autowired
    private PaymentBankService paymentBankService;

    @Override
    public ResponseEntity<String> savePayment(PaymentBank payment) {
        boolean result = paymentBankService.save(payment);
        if(result)
            return ResponseEntity.ok().build();
        else
            return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseEntity<?> fetchPayments() {
        List<PaymentBank> payments;
        payments = paymentBankService.fetchPayments();
        return ResponseEntity.ok(payments);
    }
}
