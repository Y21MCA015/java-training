package Abstarction;

public class Test {

    public static void main(String[] args){
        Bankaccount b=new SavingAccount("1234567890",0.00);
        System.out.println("initial Balance :$"+b.checkBalance());
//        b.deposit(5000.00);
//        System.out.println("update Balance :$"+b.checkBalance());
        b.withdraw(400.00);
        System.out.println("update Balance :$"+b.checkBalance());     }
}
