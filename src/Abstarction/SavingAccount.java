package Abstarction;

public class SavingAccount extends Bankaccount {
    public SavingAccount(String accountnumber, double balance) {
        super(accountnumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("deposite od $"+amount+"Successful");

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= checkBalance()) {
            balance -= amount;
            System.out.println("withdraw of $" + amount + "Successful.");
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
