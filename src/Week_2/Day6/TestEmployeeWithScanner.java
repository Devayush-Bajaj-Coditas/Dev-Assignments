
package Week_2.Day6;

/*
1. Create class WageEmployee extending Employee class with attributes as hrs (int)and
rate(int) and method computeSalary() to calculate the salary
Print the salary and details of WageEmployee. (Note: Use the previous Employee classes.
Accept the values from the user.Default, Parameterised Constructor and toString() to be
written in all the classes) */

import java.sql.SQLOutput;

import java.util.Scanner;

class Employee{
    int id;
    String name;
    Employee(int id,String name) {                  //parameterised constructor
        this.id = id;
        this.name = name;
    }
    void computeSalary(){

    }
}
class WageEmployee extends Employee{
    int hrs,rate;
    WageEmployee(int id, String name,  int hrs, int rate){
        super(id,name);                             //Super is used to call parameters of the parent class
        this.hrs = hrs;
        this.rate = rate;
    }
    void computeSalary( ){
        super.computeSalary();
        System.out.println(" Name : " + name + "\n ID : " + id + "\n Hours worked : " + hrs + "\n Rate per hour "+ rate + "\n total Waged salary = " + hrs*rate);
        System.out.println("**********----------***********");
    }
}
/*2. Create SalesPerson class extending WageEmployee with attributes as sales(int) and
commission (int).
Override the ComputeSalary() in Salesperson class and print the salary and details of
SalesPerson */
class SalesPerson extends WageEmployee{
    int Sales, Commission;
    SalesPerson ( int id, String name, int hrs, int rate, int Sales, int Commission){
        super(id, name, hrs, rate);
        this.Sales = Sales;
        this.Commission = Commission;
    }
    void computeSalary(){
        super.computeSalary();
        System.out.println(" Name : " + name + "\n ID : " + id + "\n Hours worked : " + hrs + "\n Rate per hour "+ rate + "\n total Waged salary = " + hrs*rate + " Total Sales : " + Sales + "\n Total Commission : " + Commission + "Total Salary : " + Sales+Commission);
        System.out.println("**********----------***********");
    }
}
/*3. Create Manager class extending Employee class with attributes as fixed salary(int) and
incentives(int) and method compute Salary) to calculate the salary of Manager Print the salary
and details of Manager*/
class Manager extends  Employee{
    int fixedSalary, Incentives;
    Manager(int id, String name, int fixedSalary,int Incentives){
        super(id,name);
        this.fixedSalary = fixedSalary;
        this.Incentives = Incentives;
    }
    void computeSalary(){
        super.computeSalary();
        System.out.println(" Name : " + name + "\n ID : " + id + " Fixed Salary : " + fixedSalary + " Incentives : "  + Incentives  +" Total Salary : " + fixedSalary+Incentives );
        System.out.println("**********----------***********");
    }
}


/*4. Write a TestEmployee class to print the details of all types of employees (use array[] of
Employee class)*/


public class TestEmployeeWithScanner {


    void show(Employee emp[]) {
        for (Employee employee : emp) {
            employee.computeSalary();
        }
    }

    void Input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Role");
        String role = s.next();
        if (role == "Wage Employee") {
            System.out.println("Enter your name: ");
            String name = s.next();
            System.out.println("Enter your ID: ");
            int id = s.nextInt();
            System.out.println("Enter your working hours");
            int hours = s.nextInt();
            System.out.println("Enter your rate per hour");
            int rate = s.nextInt();

            if (role == "Sales Person") {
                System.out.println("Enter your name: ");
                String name1 = s.next();
                System.out.println("Enter your ID: ");
                int id1 = s.nextInt();
                System.out.println("Enter your working hours");
                int hours1 = s.nextInt();
                System.out.println("Enter your rate per hour");
                int rate1 = s.nextInt();

                int Id = s.nextInt();
                WageEmployee input_values[] = new WageEmployee[4];
                for (int i = 0; i < 4; i++) {
                    input_values[i] = new WageEmployee(id, name, hours, rate);

                }
            }
        }
    }
        public static void main (String[] args){

            Employee employee = new WageEmployee(14, "Devayush", 8, 2000);
            employee.computeSalary();

            Employee salesPerson = new WageEmployee(12, "Aditi", 10, 2500);
            salesPerson.computeSalary();

            WageEmployee wageEmployee = new SalesPerson(15, "Abhishek", 8, 5000, 200, 3000);
            wageEmployee.computeSalary();

            Manager managerr = new Manager(17, "Binod", 50000, 10000);
            managerr.computeSalary();


            Employee emp[] = new Employee[4];
            emp[0] = employee;
            emp[1] = salesPerson;
            emp[2] = wageEmployee;
            emp[3] = managerr;

            new TestEmployeeWithScanner().show(emp);


        }

    }

/*          OUTPUT
 Name : Devayush
 ID : 14
 Hours worked : 8
 Rate per hour 2000
 total Waged salary = 16000
**********----------***********
 Name : Aditi
 ID : 12
 Hours worked : 10
 Rate per hour 2500
 total Waged salary = 25000

**********----------***********
 Name : Abhishek
 ID : 15
 Hours worked : 8
 Rate per hour 5000
 total Waged salary = 40000 Total Sales : 200
 Total Commission : 3000Total Salary : 2003000
**********----------***********
 Name : Binod
 ID : 17 Fixed Salary : 50000 Incentives : 10000 Total Salary : 5000010000
**********----------***********
 Name : Devayush
 ID : 14
 Hours worked : 8
 Rate per hour 2000
 total Waged salary = 16000
**********----------***********
 Name : Aditi
 ID : 12
 Hours worked : 10
 Rate per hour 2500
 total Waged salary = 25000

**********----------***********
 Name : Abhishek
 ID : 15
 Hours worked : 8
 Rate per hour 5000
 total Waged salary = 40000 Total Sales : 200
 Total Commission : 3000Total Salary : 2003000
**********----------***********
 Name : Binod
 ID : 17 Fixed Salary : 50000 Incentives : 10000 Total Salary : 5000010000
**********----------***********

Process finished with exit code 0

 */

