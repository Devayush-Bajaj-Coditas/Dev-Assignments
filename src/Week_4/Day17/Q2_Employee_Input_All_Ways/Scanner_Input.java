package Week_4.Day17.Q2_Employee_Input_All_Ways;

import java.util.Scanner;

public class Scanner_Input {
    EmployeeDetails employeeDetails = new EmployeeDetails();
    void acceptDetails(){
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter Name : ");
        employeeDetails.employeeName = s.nextLine();
        System.out.println("Enter ID : ");
        employeeDetails.employeeId = s.nextInt();
        System.out.println("Enter Salary : ");
        employeeDetails.employeeSalary = s.nextFloat();
    }
    void display(){
        System.out.println("Name : " + employeeDetails.employeeName+ "\nID : " + employeeDetails.employeeId +"\nSalary : " + employeeDetails.employeeSalary );
    }
}
class main{
    public static void main(String[] args) {
        Scanner_Input scannerInput = new Scanner_Input();
        scannerInput.acceptDetails();
        scannerInput.display();
    }
}

/*      OUTPUT

        Enter Name :
        Devayush Bajaj
        Enter ID :
        11056
        Enter Salary :
        1200000


        Name : Devayush Bajaj
        ID : 11056
        Salary : 1200000.0
*/

