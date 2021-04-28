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

    @Override
    public PaymentBank fetchPaymentBankById(Long id) {
        PaymentBank paymentBank;
       paymentBank = (PaymentBank) redisTemplate.opsForHash().get(KEY,id.toString());
        return paymentBank;
    }

    @Override
    public boolean updatePayment(Long id, PaymentBank payment) {
        try {
            redisTemplate.opsForHash().put(KEY, id, payment);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deletePaymnet(Long id) {
        try {
            redisTemplate.opsForHash().delete(KEY,id.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
