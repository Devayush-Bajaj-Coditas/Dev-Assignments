package Week_4.Day14_ExceptionHandling;

class Demo_exception{
    public void divide () {
        int a = 12, b = 0;

        try {
            float div = a / b;
            System.out.println("Div is : " + div);
        }
        catch (ArithmeticException ae){
            System.out.println("b cannot be zero" + ae.getMessage());
        }
    }

}



public class ExceptionHandlingDemo {
    public static void main(String[] args) {


        Demo_exception demo_exception = new Demo_exception();
        demo_exception.divide();
    }
}


