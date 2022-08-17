package Week_4.Day17.Q2_Employee_Input_All_Ways;
import Week_4.Day17.Q2_Employee_Input_All_Ways.EmployeeDetails;
import java.io.Console;
import Week_4.Day17.Q2_Employee_Input_All_Ways.EmployeeDetails;
public class Console_Input {
	public static void main(String[] args) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		Console con = System.console();
		employeeDetails.employeeName = con.readLine();
		employeeDetails.employeeId = Integer.parseInt(con.readLine());
		employeeDetails.employeeSalary = Float.parseFloat(con.readLine());
		System.out.println("Name : " + employeeDetails.employeeName+ "\nID : " + employeeDetails.employeeId +"\nSalary : " + employeeDetails.employeeSalary );

	}

}

/*		OUTPUT
PS C:\Users\coditas\Desktop\Hello> javac Console_Input.java
PS C:\Users\coditas\Desktop\Hello> java Console_Input
Devayush
170056
45000
Name : Devayush
ID : 170056
Salary : 45000.0
*/
