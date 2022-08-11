package Week_4.Day17.Q2_Employee_Input_All_Ways;
import Week_4.Day17.Q2_Employee_Input_All_Ways.EmployeeDetails;
public class CommandLineArgument_Input {

    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.employeeName = args[0];
        employeeDetails.employeeId = Integer.parseInt(args[1]);
        employeeDetails.employeeSalary = Float.parseFloat(args[2]);
        System.out.println("Name : " + employeeDetails.employeeName+ "\nID : " + employeeDetails.employeeId +"\nSalary : " + employeeDetails.employeeSalary );
    }
}

/*             OUTPUT
        Name : Devayush
        ID : 11056
        Salary : 450000.0
*/
