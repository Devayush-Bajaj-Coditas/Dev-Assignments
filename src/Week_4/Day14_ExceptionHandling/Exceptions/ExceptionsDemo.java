package Week_4.Day14_ExceptionHandling.Exceptions;

import java.util.Locale;

public class ExceptionsDemo {
    public static void show(){
        sayHello(null);         //NullPointerException
    }
    public static void sayHello(String name){
        try {
            System.out.println(name.toUpperCase());     //risky code
        }
        catch (NullPointerException n){
            System.out.println("Null values are not allowed");      //Handling code
        }
    }

    public static void main(String[] args) {
        ExceptionsDemo.show();
    }
}
