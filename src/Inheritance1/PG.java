package Inheritance1;

public class PG extends Firstclass {
    public String course;
    public double fee;

    public PG(String name, String fathername, String mothername, String address, String classname, String teachername, String course, double fee) {
        super(name, fathername, mothername, address, classname, teachername);
        this.course = course;
        this.fee = fee;
    }
}
