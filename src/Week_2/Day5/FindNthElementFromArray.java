import java.util.Arrays;
import java.util.Scanner;

//Q6)Try to get the nth index element from an array. Accept index value from user
class Array_finder{
    int Array1 [] = {1,4,6,7,9,10,8};
    int status =0;
    Scanner scanner = new Scanner(System.in);
    void compare(){
        System.out.println("Enter an element you want to search: ");
        int input = scanner.nextInt();
        for (int i = 0; i< Array1.length; i++){
            if(Array1[i] == input){
                status = i+1;
            }
        }
        if (status>0 ){
                System.out.println("nth largest value is " + Array1[status] );
        }
        else
            System.out.println("Value not found ");
    }
}

public class FindNthElementFromArray {
    public static void main(String[] args) {
        Array_finder array_finder = new Array_finder();
        array_finder.compare();
    }
}

/*
OUTPUT
Enter an element you want to search:
9
nth largest value is 10
 */

