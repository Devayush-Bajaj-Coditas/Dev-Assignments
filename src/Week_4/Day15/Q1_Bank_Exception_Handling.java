package Week_4.Day15;

import java.util.Scanner;

/*
1 Write a program for::below cases to handle wrong operations done by customers in
        deposit, and withdrawal operations.
        Case 1)CREATE an InvalidAmountException if the user enters zero or -ve amount in deposit
        and withdraw operations
        Case 2)I hrow InsufficientBalanceException if the user enters the amount greater than the
        balance in case of withdrawing operations
*/

class Bank {
    double balance;

    public double deposit(double Diposit_amount) {

        try {
            if (Diposit_amount >= 1) {
                balance += Diposit_amount;
                System.out.println("Amount has been successfully added\nNew Balance: "+ balance);
            }
            else
                throw new InvalidAmountException();
        }
        catch (InvalidAmountException e) {
            e.printStackTrace();
        }
        return balance;
    }

     public double withdraw(double withdrawal_amount) {
        balance = 1000;
         try {
             if (withdrawal_amount >= 1 && withdrawal_amount < balance) {
                 balance = balance - withdrawal_amount;
                 System.out.println("Amount has been successfully withdraw\nNew Balance: "+ balance);
             }
             else if (balance < withdrawal_amount){
                throw new InsufficientBalanceException();
             }
             else
                 throw new InvalidAmountException();
         }
         catch (InvalidAmountException | InsufficientBalanceException e) {
             e.printStackTrace();
         }
         return balance;
     }

     void input(){
        Scanner input = new Scanner(System.in);
         System.out.println("Press 1 to Deposit\nPress 2 to Withdraw");
         int user_input = input.nextInt();
         Bank bank = new Bank();
         if (user_input ==1){
             System.out.println("Enter Deposit amount :  ");
              int dipositAmt = input.nextInt();
              bank.deposit(dipositAmt);
         }
         else
             System.out.println("Enter Withdraw amount :  ");
             int withdrawAmt = input.nextInt();
             bank.withdraw(withdrawAmt);
     }


}

public class Q1_Bank_Exception_Handling {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.input();
    }
}


/*
        Press 1 to Deposit
        Press 2 to Withdraw
        1
        Enter Deposit amount :
        1000
        Amount has been successfully added
        New Balance: 1000.0

       ---------------------------------------
       Press 1 to Deposit
            Press 2 to Withdraw
            1
            Enter Deposit amount :
            0
            Week_4.Day14_ExceptionHandling.Day15.InvalidAmountException: Invalid Amount Entered
                at Week_4.Day14_ExceptionHandling.Day15.Bank.deposit(Q1_Bank_Exception_Handling.java:35)
                at Week_4.Day14_ExceptionHandling.Day15.Bank.input(Q1_Bank_Exception_Handling.java:70)
                at Week_4.Day14_ExceptionHandling.Day15.Q1_Bank_Exception_Handling.main(Q1_Bank_Exception_Handling.java:84)
------------------------------------------------------------------

        Press 1 to Deposit
        Press 2 to Withdraw
        2
        Enter Withdraw amount :
        500
        Amount has been successfully withdraw
        New Balance: 500.0

        --------------------------------

*/

