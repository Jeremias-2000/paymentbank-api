package com.jeremias.pinheiro.redis.service;

import com.jeremias.pinheiro.redis.model.PaymentBank;
import com.jeremias.pinheiro.redis.repository.AbstractRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentBankService implements AbstractService{

    @Autowired
    private AbstractRepository repository;

    @Override
    public boolean save(PaymentBank payment) {
        return repository.save(payment);
    }

    @Override
    public List<PaymentBank> fetchPayments() {
        return repository.fetchPayments();
    }

    @Override
    public PaymentBank fetchPaymentBankById(Long id) {
        return repository.fetchPaymentBankById(id);
    }

    @Override
    public boolean updatePayment(Long id, PaymentBank payment) {
        return repository.updatePayment(id,payment);
    }

    @Override
    public boolean deletePayment(Long id) {
        return repository.deletePaymnet(id);
    }
}
