package entities;

public class Student {

    @Override
    public String toString() {
        return "Name: " + name +
                "\nNota 1: " + nota1 +
                "\nNota 2: " + nota2 +
                "\nNota 3: " + nota3 + "\n\t---------\t" +
                "\nResult: " + verificarAprovacao();
    }

    public String name;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public double somarNota(){
        return nota1 + nota2 + nota3;
    }

    public String verificarAprovacao(){
        if (somarNota() < 60d)
            return "Reproved" + "\nMissing point: " + (60-somarNota());
        else
            return "Pass";
    }



}
