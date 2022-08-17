package Week_4.Day14_ExceptionHandling.Practice;

import java.util.Scanner;

class YoungAGeException extends RuntimeException{
    YoungAGeException(String msg){
        super(msg);
    }
}

public class CustomExceptionPractice {
    int age;
    void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");
        age = s.nextInt();
    }

    void compare(){
        try{
        if(age < 18){
            throw new YoungAGeException("You are not eligible");
        }
        else
            System.out.println("You are eligible");
    }
        catch (YoungAGeException e){
            e.printStackTrace();
        }

        System.out.println("Program continue");
    }

    public static void main(String[] args) {
        CustomExceptionPractice customExceptionPractice = new CustomExceptionPractice();
        customExceptionPractice.input();
        customExceptionPractice.compare();
    }

}
