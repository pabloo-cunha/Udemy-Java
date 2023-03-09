package vetores3.entities;

public class Alturas {

    String name;

    int idade;
    double altura;

    public Alturas(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Alturas{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
