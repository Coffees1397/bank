package entities;

import java.math.BigDecimal;

public class Bank {
    public static void main(String[] args) {
        Account pedroAccount = new Account();
        pedroAccount.limit = new BigDecimal(100);

        Account ghessAccount = new Account();
        ghessAccount.limit = new BigDecimal(500);

        pedroAccount.deposit(new BigDecimal(100));
        ghessAccount.deposit(new BigDecimal(200));

        System.out.println("Pedro tem um saldo de " + pedroAccount.amount);
        System.out.println("Ghess tem um saldo de " + ghessAccount.amount);

        ghessAccount.transfer(new BigDecimal(50), pedroAccount);

        System.out.println("Pedro tem um saldo de " + pedroAccount.amount);
        System.out.println("Ghess tem um saldo de " + ghessAccount.amount);

        pedroAccount.withdraw(new BigDecimal(25));
        ghessAccount.withdraw(new BigDecimal(10));

        System.out.println("Pedro tem um saldo de " + pedroAccount.amount);
        System.out.println("Ghess tem um saldo de " + ghessAccount.amount);

        pedroAccount.withdraw(new BigDecimal(2000));
    }
}
