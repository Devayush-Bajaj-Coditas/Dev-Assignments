/*
4)Practically prove, After changing the return type, overriding happens or not?
 */

package Week_2.Day8;

/*
We cannot overwrite the method but by using covariant function introduced in jdk 1.5 we can do it
 */

class ClassOne {
    int myFunction(){
        System.out.println("THIS IS PARENT CLASS ");
        return 10;
    }

}
/*
class ClassTwo extends ClassOne{
    String myFunction(){
        System.out.println("This is child class");
        return "This is return string";
    }

}
 */


public class Q3_Overriding_return_Change {
    public static void main(String[] args) {
     //   ClassOne classOne = new ClassTwo();
      //  classOne.myFunction();
    }
}
/*
NO OUTPUT
 */