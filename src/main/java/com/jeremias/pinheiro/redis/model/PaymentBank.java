package com.jeremias.pinheiro.redis.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@Data

public class PaymentBank implements Serializable {

    private Long id;
    private String bankCode; //size 3
    private String agency;// 0192
    private String agencyDv;//size 1  0
    private String account; //size 13
    private String accountDv;// 2
    private String documentNumber;//cpf or cnpj
    private String name;//max 30 only letters
    private double value;
    private String typeAccount;// conta_corrente, conta_poupanca, conta_corrente_conjunta, conta_poupanca_conjunta
}
