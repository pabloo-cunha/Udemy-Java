package exercicio_fixacao.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate date;
    private Double amount;



    public Installment() {
    }

    public Installment(LocalDate duDate, Double amount) {
        this.date = duDate;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate duDate) {
        this.date = duDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date.format(dtf) + " - " + String.format("%.2f", amount);
    }
}
