package com.jeremias.pinheiro.redis.repository;

import com.jeremias.pinheiro.redis.model.PaymentBank;

import java.util.List;

public interface AbstractRepository {
    boolean save(PaymentBank payment);

    List<PaymentBank> fetchPayments();
}
