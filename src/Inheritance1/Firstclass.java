package Inheritance1;

public class Firstclass extends Person{
    public String classname;
    public String teachername;

    public Firstclass(String name, String fathername, String mothername, String address, String classname, String teachername) {
        super(name, fathername, mothername, address);
        this.classname = classname;
        this.teachername = teachername;
    }
}
