package exercicio1.entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharger;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePorHour, Double additionalCharger) {
        super(name, hours, valuePorHour);
        this.additionalCharger = additionalCharger;
    }

    public Double getAdditionalCharger() {
        return additionalCharger;
    }

    public void setAdditionalCharger(Double additionalCharger) {
        this.additionalCharger = additionalCharger;
    }

    @Override
    public Double payment(){
        return super.payment() + 1.1 * additionalCharger;
    }
}
