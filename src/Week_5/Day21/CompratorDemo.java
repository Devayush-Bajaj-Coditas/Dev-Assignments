package Week_5.Day21;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

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


public class CompratorDemo {
    public static void main(String[] args) throws IOException {
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
                    for (int i = 1; i <= totalEmployees; i++) {
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
                    for (int i = 1; i < employees.size(); i++) {
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
                            for (int i = 1; i < employees.size(); i++) {
                                System.out.println(employees.get(i));
                            }
                            break;
                        case 2:
                            System.out.println("Sorting by Id");
                            Collections.sort(employees, new SortById());
                            for (int i = 1; i < employees.size(); i++) {
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
