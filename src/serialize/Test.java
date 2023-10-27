package serialize;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Employee> s = new ArrayList<>();
        s.add(new Employee(123, "sharath", "javafullstack", "Hyderabad", "pancard"));
        s.add(new Employee(124, "kumar", "javafullstack", "Hyderabad", "pancard"));
        s.add(new Employee(125, "ravi", "javafullstack", "Hyderabad", "pancard"));
        s.add(new Employee(126, "sandeep", "javafullstack", "Hyderabad", "pancard"));
        s.add(new Employee(127, "sagar", "javafullstack", "Hyderabad", "pancard"));
        s.add(new Employee(128, "shiva", "javafullstack", "Hyderabad", "pancard"));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(s);
            System.out.println("Serialized data is saved to employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
