package Week_6.Day22.Practice.BankAppUsingArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bank {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    CurrentAccount currentAccount = new CurrentAccount();
    SavingsAccount savingsAccount = new SavingsAccount();
    int startUpMenuChoice, existingUserChoice, joinBankMenuChoice;


    void startUpMenu() throws IOException {
        System.out.println("********** Welcome to DBIB Bank **********\n" +
                "How may I help you\n" +
                "1 ---> Join the bank\n"+
                "2 ---> Existing User\n" +
                "3 ---> Exit\n" +
                "ENTER ---> ");
        startUpMenuChoice = Integer.parseInt(bufferedReader.readLine());
        switch (startUpMenuChoice){
            case 1 :
                new Bank().existingUserMenu();
        }
    }

    void existingUserMenu() throws IOException {
        System.out.println("Please select your account type \n" +
                "1 ---> Savings Account\n" +
                "2 ---> Current Account" +
                "3 --> Previous menu" +
                "ENTER ---> ");
        existingUserChoice = Integer.parseInt(bufferedReader.readLine());
        switch (existingUserChoice) {
            case 1:


            case 2:


            case 3:
                new Bank().startUpMenu();

        }
    }

    void JoinBankMenu() throws IOException {
        System.out.println("Which type of account you want to create \n" +
                "1 ---> Create Savings Account\n" +
                "2 ---> Create Current Account" +
                "3 --> Previous menu" +
                "ENTER ---> ");
        joinBankMenuChoice = Integer.parseInt(bufferedReader.readLine());
        switch (joinBankMenuChoice){
            case 1:
                savingsAccount.createSavingsAccount();
            case 2:

            case 3:
                new Bank().startUpMenu();
        }
    }
}

