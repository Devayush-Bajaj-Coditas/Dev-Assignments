package Week_4.Day17.employee_SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {
    public static void main(String[] args) throws IOException {
        Employee obj_e = new Employee(121 ,"John" ,5000f);

        FileOutputStream out = new FileOutputStream("EmpSerialNEw.txt");
        ObjectOutputStream obj_o = new ObjectOutputStream(out);

        obj_o.writeObject(obj_e);
        System.out.println("Serialization done successfully");
    }
}
