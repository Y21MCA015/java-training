package InterfaceExample;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("i am calling from airtel sim ");
    }

    @Override
    public void dailling() {
       System.out.println("i am dailling from airtel sim ");
    }

    @Override
    public void usingInternet() {
       System.out.println("i am usingairtel sim for the Internet");
    }
}
