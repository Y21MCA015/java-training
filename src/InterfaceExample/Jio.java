package InterfaceExample;

public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("i am using jio sim for calling ");
    }

    @Override
    public void dailling() {
     System.out.println("i am usingjio sim for the dailling");
    }

    @Override
    public void usingInternet() {
        System.out.println("i am usingjio for the internet");

    }
}
