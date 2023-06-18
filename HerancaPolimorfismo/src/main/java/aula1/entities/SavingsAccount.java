package aula1.entities;

import java.math.BigDecimal;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(Integer number, String holder, BigDecimal balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance.add(balance.multiply(BigDecimal.valueOf(interestRate)));
    }

    @Override
    public void withdraw(BigDecimal amount){
        balance = balance.subtract(amount);
    }
}
