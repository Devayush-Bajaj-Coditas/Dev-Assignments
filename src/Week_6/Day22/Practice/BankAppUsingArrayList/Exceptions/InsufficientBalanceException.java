package Week_6.Day22.Practice.BankAppUsingArrayList.Exceptions;

public class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(){
        super("Insufficient Balance");
    }
}
