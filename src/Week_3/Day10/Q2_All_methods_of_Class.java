package Week_3.Day10;
/*
Q2)Try all methods of "Class" For variables,methods,constructor,classS
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Myclass{
    int randomNumbwe =10;
    Myclass(int randomNumbwe){
        this.randomNumbwe = randomNumbwe;
        System.out.println("This is constructor of the class");
    }
    void show(){
        System.out.println("This is method of the class");
    }
    void myName(String name){
        int age = 24;
        System.out.println("My name is " + name + "and age is " + age);
    }
}

class Test{
    int Id,Mobile_no;
    Test(int Id,int Mobile_no){
        this.Id = Id;
        this.Mobile_no = Mobile_no;
    }

    private void password(){

    }
}


class MyDerived extends Myclass{
    MyDerived(int randomNumbwe) {
        super(randomNumbwe);
    }
}

public class Q2_All_methods_of_Class {
    public static void main(String[] args) throws Exception{
       Class c = Class.forName("Week_3.Day10.Myclass");

        //Getting methods
        Method meth []= c.getDeclaredMethods();
        for (Method method : meth) {
            System.out.println(method);
        }
        //Getting variables
        Field[] variables = c.getDeclaredFields();
        for (Field field : variables){
            System.out.println(field);
        }
        //Getting Constructor
        Constructor[] cons = c.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println(c.getClasses());
    }
}
/*
        OUTPUT
void Week_3.Day10.Myclass.myName(java.lang.String)
void Week_3.Day10.Myclass.show()
int Week_3.Day10.Myclass.randomNumbwe
[Ljava.lang.Class;@58ceff1
 */

