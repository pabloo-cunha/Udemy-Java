package exercicio_fixacao.service;

import exercicio_fixacao.entities.Contract;
import exercicio_fixacao.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        Double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i); //data de vencimento

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
