package Week_6.Day22.Practice.BankAppUsingArrayList.Exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("Please enter an valid account number");
    }
}
