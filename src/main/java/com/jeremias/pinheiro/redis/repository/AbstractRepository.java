package com.jeremias.pinheiro.redis.repository;

import com.jeremias.pinheiro.redis.model.PaymentBank;

import java.util.List;

public interface AbstractRepository {
    boolean save(PaymentBank payment);

    List<PaymentBank> fetchPayments();

    PaymentBank fetchPaymentBankById(Long id);

    boolean updatePayment(Long id, PaymentBank payment);

    boolean deletePaymnet(Long id);
}
