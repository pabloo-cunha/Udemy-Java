package interfacesdefault.entities;

import interfacesdefault.service.InterestService;

public class BrazilInterestService implements InterestService {

    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

}
