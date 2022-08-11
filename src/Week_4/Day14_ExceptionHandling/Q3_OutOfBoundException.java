package Week_4.Day14_ExceptionHandling;;
/**3)
public class ABC
        public static void main(String[] args) {
            int] array = new int[1o]; int sum = 0;
            I/ good code
            for (inti =0; i< array.length; i++){
                sum sum + array[i];
                Try it for conditions =>1)i< 10
                        =>2)i<11
                                    @DevayushBajaj */
public class Q3_OutOfBoundException {


    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;

        try {
            //For i<10
            for (int i = 0; i < 10; i++) {
                sum = sum + array[i];
            }
            System.out.println("When condition is i<10 =  " + sum);
            //for i<11                  //OUT OF BOUND EXCEPTION
            for (int i = 0; i < 11; i++) {
                sum = sum + array[i];
            }
            System.out.println("When condition is i<11 =  " + sum);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array length exceeded " + "EXCEPTION ERROR : " + exception);
        }
    }
}

/*      OUTPUT
           When condition is i<10 =  0
            Array length exceeded EXCEPTION ERROR : java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
*/
