package Week_4.Day15;

    class InvalidAmountException extends Exception{
        public InvalidAmountException(){
            super("Invalid Amount Entered");
        }

    }

    class InsufficientBalanceException extends Exception{
        public InsufficientBalanceException(){
            super("Insufficient balance");
        }
    }
