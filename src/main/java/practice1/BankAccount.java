package practice1;

public class BankAccount {
    private  String owner;
    private  double balance;

    BankAccount(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }
    //getters
    public String getOwner() {
        return this.owner;
    }
    public double getBalance() {
        return this.balance;
    }
    //setter
    public  void setOwner(String newOwner) {
        this.owner = newOwner;
    }
    public void deposit(double amount) {
        double newBalance = this.balance + amount;
        this.balance = newBalance;
    }
    public  void withdraw(double amount) {
        this.balance = this.balance -amount;
    }
    public void printBalance() {
        System.out.println("Current balance=" + this.balance);
    }
}
