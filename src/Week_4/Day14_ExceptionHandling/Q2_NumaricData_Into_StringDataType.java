package Week_4.Day14_ExceptionHandling;

import Week_3.Day12.Assignmets.Q2_CountVovalsAndConso;

import java.util.Scanner;

/** try to add Numeric data in String data type then handle this exception
 @DevayushBajaj */
public class Q2_NumaricData_Into_StringDataType {


    public static void main(String[] args) {
        try{
            String age;
            System.out.println("Enter your age : ");
            Scanner s = new Scanner(System.in);
            age = s.next();
            int age2 = Integer.parseInt(age);
            System.out.println("My age is " + age);
        }
        catch (NumberFormatException NFE) {
            System.out.println("Enter integer value ERROR = " + NFE.getMessage());
        }
    }
}
/*
    Enter your age :
        five
        Enter integer value ERROR = For input string: "five"

    Enter your age :
        5
        My age is 5

*/
