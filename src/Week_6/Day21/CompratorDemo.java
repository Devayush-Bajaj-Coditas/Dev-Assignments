package Week_6.Day21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employees{
    int employeeId;
    String name, city;

    public Employees(int employeeId, String name, String city) {
        this.employeeId = employeeId;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
class SortByName implements Comparator<Employees>{
    public int compare(Employees a, Employees b){
        return a.name.compareTo(b.name);
    }
}

class SortById implements Comparator<Employees>{
    public int compare(Employees a, Employees b){
        return a.employeeId - b.employeeId;
    }
}

class EmployeeOperations {
    public void operations() throws Exception {
        int id,userChoice;
        String name, city;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Employees> employees = new ArrayList<Employees>();
        boolean condition =true;
        while(condition) {
            System.out.println("Press \n1 to add data \n2 to display details\n3 to sort\n4 to exit");
            userChoice = Integer.parseInt(bufferedReader.readLine());
            switch (userChoice) {
                case 1:
                    System.out.println("Enter number of employees you want to add: ");
                    int totalEmployees = Integer.parseInt(bufferedReader.readLine());
                    for (int i = 0; i <= totalEmployees; i++) {
                        System.out.print("Enter " + i + " employee details \nID:");
                        id = Integer.parseInt(bufferedReader.readLine());
                        System.out.print("Name : ");
                        name = bufferedReader.readLine();
                        System.out.print("City : ");
                        city = bufferedReader.readLine();
                        employees.add(new Employees(id, name, city));
                    }
                    break;
                case 2:
                    System.out.println("Displaying the data: ");
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println(employees.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Sort as per \n1)Name \n2)Id ");
                    int sortChoice = Integer.parseInt(bufferedReader.readLine());
                    switch (sortChoice) {
                        case 1:
                            System.out.println("Sorting by names");
                            Collections.sort(employees, new SortByName());
                            for (int i = 0; i < employees.size(); i++) {
                                System.out.println(employees.get(i));
                            }
                            break;
                        case 2:
                            System.out.println("Sorting by Id");
                            Collections.sort(employees, new SortById());
                            for (int i = 0; i < employees.size(); i++) {
                                System.out.println(employees.get(i));
                            }
                            break;
                    }
                case 4:
                    condition=false;
                    break;
            }
        }
    }
}

public class CompratorDemo {
    public static void main(String[] args) throws Exception {
        EmployeeOperations employeeOperations = new EmployeeOperations();
        employeeOperations.operations();
    }
}
/*              OUTPUT
        Press
        1 to add data
        2 to display details
        3 to sort
        4 to exit
        1
        Enter number of employees you want to add:
        4
        Enter 1 employee details
        ID:15
        Name : Devayush
        City : Bhopal
        Enter 2 employee details
        ID:43432
        Name : Usman
        City : Pune
        Enter 3 employee details
        ID:543543
        Name : Anuj
        City : UK
        Enter 4 employee details
        ID:57567678
        Name : Swraj
        City : Pune
        Press
        1 to add data
        2 to display details
        3 to sort
        4 to exit
        2
        Displaying the data:
        Employees{employeeId=43432, name='Usman', city='Pune'}
        Employees{employeeId=543543, name='Anuj', city='UK'}
        Employees{employeeId=57567678, name='Swraj', city='Pune'}
        Press
        1 to add data
        2 to display details
        3 to sort
        4 to exit
        3
        Sort as per
        1)Name
        2)Id
        1
        Sorting by names
        Employees{employeeId=15, name='Devayush', city='Bhopal'}
        Employees{employeeId=57567678, name='Swraj', city='Pune'}
        Employees{employeeId=43432, name='Usman', city='Pune'}

        Process finished with exit code 0
*/
