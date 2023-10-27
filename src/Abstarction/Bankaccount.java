package Abstarction;

public abstract class Bankaccount {
    private String accountnumber;
     double balance;

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bankaccount(String accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
    //abstarct method
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    //non abstarct method
    public double checkBalance() {
        return balance;
    }
}
