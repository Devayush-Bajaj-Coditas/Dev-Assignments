//Q4)Try to access the parameterized method of the class
package Week_3.Day10;
import java.lang.reflect.*;
public class Q4_access_parameterised {
    String name;
    public void myMethod(String name){
        this.name = name;
        System.out.println("My name is "+ name);
    }

}
/*
class main{
    private static Q4_access_parameterised q4_access_parameterised;

    public static void main(String[] args) {
        Q4_access_parameterised q4_access_parameterised = new Q4_access_parameterised();
        q4_access_parameterised.myMethod("Devayush");
        Class.getDeclaredMethod("myMethod","String");

    }
}


 */