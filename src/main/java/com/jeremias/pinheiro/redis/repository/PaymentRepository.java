package com.jeremias.pinheiro.redis.repository;

import com.jeremias.pinheiro.redis.model.PaymentBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentRepository implements AbstractRepository{

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String KEY = "PAYMENT_BANK";;

    @Override
    public boolean save(PaymentBank payment) {
       try{
           redisTemplate.opsForHash().put(KEY,payment.toString(),payment);
           return  true;
       }catch(Exception e){
           return false;
       }
    }

    @Override
    public List<PaymentBank> fetchPayments() {
        List<PaymentBank> payments;
        payments = redisTemplate.opsForHash().values(KEY);
        return payments;
    }
}
