package entities;

import java.math.BigDecimal;

/**
 * @author Gabriel Francisco - gabfssilva@gmail.com
 */
public class Account {
    String agency;
    String number;
    Customer customer;
    BigDecimal amount;
    BigDecimal limit;

    public void deposit(BigDecimal value) {
        amount = value.add(amount);
    }

    public void withdraw(BigDecimal value){
        if(amount.add(limit).subtract(value).doubleValue() < 0.0){
           throw new IllegalArgumentException("no limit available");
        }

        amount = amount.subtract(value);
    }

    public void transfer(BigDecimal value, Account receiver){
        this.withdraw(value);
        receiver.deposit(value);
    }
}
