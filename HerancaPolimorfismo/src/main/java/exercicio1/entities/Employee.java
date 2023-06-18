package exercicio1.entities;

import java.util.List;

public class Employee {

    private String name;
    protected Integer hours;
    protected Double valuePorHour;

    public Employee(){

    }

    public Employee(String name, Integer hours, Double valuePorHour) {
        this.name = name;
        this.hours = hours;
        this.valuePorHour = valuePorHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePorHour() {
        return valuePorHour;
    }

    public void setValuePorHour(Double valuePorHour) {
        this.valuePorHour = valuePorHour;
    }

    public Double payment(){
        return valuePorHour * hours;
    }
}
