package aula1.entities;

import java.math.BigDecimal;

public class Account {

    private Integer Number;
    private String holder;
    protected BigDecimal balance;

    public Account(Integer number, String holder, BigDecimal balance) {
        Number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account() {
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void withdraw(BigDecimal amount){
        balance.subtract(amount.add(BigDecimal.valueOf(5.0)));
    }

    public void deposit(BigDecimal amount){
        balance.add(amount);
    }


}
