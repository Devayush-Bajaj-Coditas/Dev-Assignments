package Week_3.Day12.Assignmets;

class Employee{
    int emp_id, emp_salary;
    String emp_name;
    String emp_address;

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_salary=" + emp_salary +
                ", emp_name='" + emp_name + '\'' +
                ", emp_address='" + emp_address + '\'' +
                '}';
    }

    public Employee(int emp_id, int emp_salary, String emp_name, String emp_address) {
        this.emp_id = emp_id;
        this.emp_salary = emp_salary;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
    }


}

public class Q8_ReinitilizeTheValueOfClass {
    public static void main(String[] args) {
        Employee employee = new Employee(15,12000,"Devayush","Bhopal");
        System.out.println(employee);
    }
}
//OUTPUT ---> Employee{emp_id=15, emp_salary=12000, emp_name='Devayush', emp_address='Bhopal'}