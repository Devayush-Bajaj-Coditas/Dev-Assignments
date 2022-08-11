package Week_4.Day14_ExceptionHandling;;

/**1)Write a code for "Class CastException'" and handle it using Exception handling
        Mechanism
        >try,catch,finally
                            @DevayushBajaj */

class Parent{
    void display (String name){
        System.out.println("My name is "+ name);
    }
}
class Child extends  Parent {
    void display(String name) {
        System.out.println("My name is " + name);
    }
}
    public class Q1_ClassCastException {
        public static void main(String[] args) {

            try {
                Child child = (Child) new Parent();
                child.display("Devayush");
            }
            catch (java.lang.ClassCastException classCastException){
                System.out.println("We are getting Class cast exception");
            }
            finally{
                System.out.println("End of the program");
            }
        }
    }

/*          OUTPUT
    We are getting Class cast exception
    End of the program
*/

