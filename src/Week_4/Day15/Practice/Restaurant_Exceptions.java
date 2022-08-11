package Week_4.Day15.Practice;

    class InsufficientQuantity extends Exception{
        public InsufficientQuantity(){
            super("Insufficient Quantity of food trying to order");
        }


        public void printStackTrace()
        {
            printStackTrace(System.err);
            System.out.println("This is my error");
        }

    }
    class PaymentNotReceived extends Exception{
        public PaymentNotReceived(){
            super("Payment not received");
        }
    }