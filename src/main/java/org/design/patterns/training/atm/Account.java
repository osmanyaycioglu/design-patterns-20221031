package org.design.patterns.training.atm;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Builder(setterPrefix = "with")
public class Account {

    private String accountName;
    private EAccountType accountType;
    private BigDecimal amount;


}
