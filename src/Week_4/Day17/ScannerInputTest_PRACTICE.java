package Week_4.Day17;

import java.util.Scanner;

public class ScannerInputTest_PRACTICE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String value");
        //String str_value = s.next();
        String str_value = s.nextLine();

        System.out.println("Enter Integer value");
        int int_value = s.nextInt();
        System.out.println("String value is " + str_value );
        System.out.println("Integer value is " + int_value );
    }
}


/*
 ***************** OUTPUT ************************
    CASE 1 - When single word is given to the String input
        Enter String value
        Devayush
        Enter Integer value
        15
        String value is Devayush
        Integer value is 15

    CASE 2 - When 2 words are given to the String input

        Enter String value
        Devayush Bajaj
        Enter Integer value
        Exception in thread "main" java.util.InputMismatchException

        * This will give Exception as it is putting 2nd sting word into the Integer type variable
****************************************************************************************************
    CASE 3 (Solution) - Using nextLine()

    * Enter String value
        Devayush BAjaj
        Enter Integer value
        15
        String value is Devayush BAjaj
        Integer value is 15

        Process finished with exit code 0

        */


