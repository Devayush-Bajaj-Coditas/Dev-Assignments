package Week_4.Day17.employee_SerializationAndDeserialization;

import java.io.*;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("EmpSerialNEw.txt"));

        Employee obj_e1 = (Employee) obj.readObject();

        System.out.println("Deserialization done");
        System.out.println("Employee_id " + obj_e1.eid + "\nName ::" + obj_e1.ename + "\n Salary :: " + obj_e1.esal);
    }
}
