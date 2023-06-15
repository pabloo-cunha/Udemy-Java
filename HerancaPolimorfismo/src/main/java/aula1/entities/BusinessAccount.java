package aula1.entities;

import java.math.BigDecimal;

public class BusinessAccount extends Account{

    private BigDecimal loanLimited;


    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, BigDecimal balance, BigDecimal loanLimited) {
        super(number, holder, balance);
        this.loanLimited = loanLimited;
    }

    public BigDecimal getLoanLimited() {
        return loanLimited;
    }

    public void setLoanLimited(BigDecimal loanLimited) {
        this.loanLimited = loanLimited;
    }

    public void loan(BigDecimal amount){
        if (amount.compareTo(loanLimited) <= 0)
            deposit(amount);
    }
}
