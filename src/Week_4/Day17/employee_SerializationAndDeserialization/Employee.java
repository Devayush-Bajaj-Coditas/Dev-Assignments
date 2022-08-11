package Week_4.Day17.employee_SerializationAndDeserialization;

import java.io.Serializable;

public class Employee implements Serializable{
    int eid;
    String ename;
    float esal;

    public Employee(int eid, String ename, float esal) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
    }
}