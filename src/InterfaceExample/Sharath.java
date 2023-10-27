package InterfaceExample;

public class Sharath implements Sim{
    @Override
    public void calling() {
        System.out.println("i am calling from the sharath sim");
    }

    @Override
    public void dailling() {
         System.out.println("i am dailling from the sharath sim");
    }

    @Override
    public void usingInternet() {
       System.out.println("i am using internet from sharath sim ");
    }
    public void price(){
        System.out.println("the price of the sharath sim is 500 rs per sim ");
    }
}
