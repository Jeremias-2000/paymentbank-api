package com.jeremias.pinheiro.redis.service;

import com.jeremias.pinheiro.redis.model.PaymentBank;

import java.util.List;

public interface AbstractService {


    boolean save(PaymentBank payment);

    List<PaymentBank> fetchPayments();

    PaymentBank fetchPaymentBankById(Long id);

    boolean updatePayment(Long id, PaymentBank payment);

    boolean deletePayment(Long id);
}
