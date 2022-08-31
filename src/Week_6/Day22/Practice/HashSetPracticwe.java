package Week_6.Day22.Practice;

import java.util.HashSet;

class Employee{
    String name;
    int id;
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Employee() {
    }
}

class Implemintation extends Employee{
    Employee e1 = new Employee("devayush",15);
    Employee e2 = new Employee("Amit",14);
    Employee e3 = new Employee("Sagar",15);
    HashSet <Employee> h = new <Employee> HashSet();

    Implemintation() {
        super();
    }

    void insert(){
        h.add(e1);
        h.add(e2);
        h.add(e3);
    }

    public int hashCode(){
        return id;
    }

    public boolean equals(Object o){
        Employee e1 = (Employee) o;
        if(e1.id == this.id){
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return ("name" + name + "Id " + id );
    }
}


public class HashSetPracticwe {

    public static void main(String[] args) {
        Implemintation implemintation = new Implemintation();
        implemintation.insert();
        System.out.println(implemintation.h);

    }

}
