package entities;

public class Account {

    private String name;
    private int Account;

    private double balance;

    public Account() {
    }

    public Account(int Account, String name) {
        this.name = name;
        this.Account = Account;
    }

    public Account(int Account, String name, double initialDeposit) {
        this.name = name;
        this.Account = Account;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return Account;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double value){
        balance = (balance-value) - 5;
    }

    public void deposit(double value){
        balance += value;
    }

    public void cadastrarConta(int numero){
        Account = numero;
    }

    @Override
    public String toString() {
        return "Account number: " + Account +
                ", Holder: " + name +
                ", Balance: " + balance;
    }
}
