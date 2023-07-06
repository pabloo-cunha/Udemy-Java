package aula1.entities;


public class Funcionario {


    @Override
    public String toString() {
        return "--\tFuncionario\t--\n" +
                "Name: " + name +
                "\nNet Salary: " + String.format("%.2f", netSalary());
    }

    public String name;
    public Double grossSalary;
    public Double tax;

    public double netSalary(){

        return grossSalary - tax;
    }

    public void increaseSalary(double percentagem){

        this.grossSalary += (grossSalary * percentagem);
    }

}
