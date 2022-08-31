package Week_6.Day22.Practice.BankAppUsingArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankOperations {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int balance;
    void Deposit() throws IOException {
        int deposit;
        System.out.println("Enter the Deposit Amount : ");
        deposit = Integer.parseInt(bufferedReader.readLine());
        balance += deposit;
        System.out.println("Your money has been deposited successfully \n" +
                "Your updated balance is " + balance);
    }
    void withdraw() throws IOException {
        System.out.println("Enter the amount you want to withdraw ");
        int withdraw = Integer.parseInt(bufferedReader.readLine());
        balance += withdraw;
        System.out.println("Your withdrawal is success\n" +
                "Your updated balance is  " + balance);
    }
    void validateUser(){
        System.out.println("Please enter your account number ");
    }
}
