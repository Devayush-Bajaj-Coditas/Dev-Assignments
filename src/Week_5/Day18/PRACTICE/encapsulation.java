package Week_5.Day18.PRACTICE;

import java.util.SplittableRandom;

class Employeee{
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Employeee employeee =  new Employeee();
        employeee.setName("devayush");
        System.out.println("Emp name is " + employeee.getName());
    }
}
