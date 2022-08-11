package Week_4.Day17;

import java.util.Scanner;

/*
1)EXECUTE SIMPLE SCANNER EXAMPLE FOR STUDENT(ID, NAME,MARKS)
        CASE1=>ACCEPT DATA IN NAME,ID,MARKS SEQUENCE
        >USING nextLine() method
        CASE2->ACCEPT DATA IN ID,MARKS,STRING SEQUENCE
        can select as per your choice or as per logic
*/
class ScannerInput{
    String name;
    int id;
    float marks;

    void input_CASE1(){
        System.out.println("************ CASE 1 ****************");
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = s.nextLine();
        System.out.println("Enter your ID : ");
        id = s.nextInt();
        System.out.println("Enter your Percentage : ");
        marks = s.nextFloat();
    }
    void input_CASE2(){
        System.out.println("************ CASE 2 ****************");
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter your ID : ");
        id = s.nextInt();
        System.out.println("Enter your Percentage : ");
        marks = Float.parseFloat(s.nextLine());
        System.out.println("Enter your name : ");
        name = s.nextLine();
    }
    void display(){
        System.out.println("Name : " + name+ "\nID : " + id +"\nMarks : " + marks );
    }
}

public class Q1_ScannerInput {
    public static void main(String[] args) {
        ScannerInput scannerInput = new ScannerInput();
        scannerInput.input_CASE1();
        scannerInput.display();
        scannerInput.input_CASE2();
        scannerInput.display();
    }
}

/*

************ CASE 1 ****************
        Enter your name :
        Devayush Bajaj
        Enter your ID :
        15
        Enter your Percentage :
        70

        Name : Devayush Bajaj
        ID : 15
        Marks : 70.0
************ CASE 2 ****************
        Enter your ID :
        15
        Enter your Percentage :
        75
        Enter your name :

        Name :
        ID : 15
        Marks : 75.0

        Process finished with exit code 0
*/
