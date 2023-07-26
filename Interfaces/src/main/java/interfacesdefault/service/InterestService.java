package interfacesdefault.service;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();
    default double payment(Double amount, Integer months){
        if (months < 1)
            throw new InvalidParameterException("Months must be greater than zero");

        return amount * Math.pow(1 + getInterestRate()/100, months);
    }
}
