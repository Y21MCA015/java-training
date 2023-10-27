package serialize;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser")); // Replace "serializedData.dat" with the actual file name you used for serialization

        List<Employee> deserializedList = (List<Employee>) in.readObject();
        in.close();

        // Now, you have the deserialized List<Employee> in deserializedList
        for (Employee employee : deserializedList) {
            System.out.println(employee);
        }
    }
}
