package Week_4.Day17.Q2_Employee_Input_All_Ways;

import Week_4.Day17.BufferReaderTest_PRACTICE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader_Input {
    EmployeeDetails employeeDetails = new EmployeeDetails();

    void acceptDetails() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name : ");
        employeeDetails.employeeName = bufferedReader.readLine();
        System.out.println("Enter your Id : ");
        employeeDetails.employeeId = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter your salary : ");
        employeeDetails.employeeSalary = Float.parseFloat(bufferedReader.readLine());
    }
    void display(){
        System.out.println("Name : " + employeeDetails.employeeName+ "\nID : " + employeeDetails.employeeId +"\nSalary : " + employeeDetails.employeeSalary );
    }
}
class Main{
    public static void main(String[] args) throws IOException {
        BufferReader_Input bufferReader_input = new BufferReader_Input();
        bufferReader_input.acceptDetails();
        bufferReader_input.display();
    }
}


/*          OUTPUT
        Enter your name :
        Devayush Bajaj
        Enter your Id :
        11056
        Enter your salary :
        4500000


        Name : Devayush Bajaj
        ID : 11056
        Salary : 4500000.0
        */

