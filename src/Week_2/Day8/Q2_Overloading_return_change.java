/*
3)Practically prove, After changing the return type overloading happens or not?
 */
package Week_2.Day8;
class Myclass{
    int myMethod(int a, int b){
        return a+b;
    }
    String myMethod(String a, String b){
        return a+b;
    }
}

public class Q2_Overloading_return_change {
    public static void main(String[] args) {
        Myclass myclass = new Myclass();
        System.out.println( "Int method returns: "+myclass.myMethod(10,20));
        System.out.println("String method returns " + myclass.myMethod("Devayush "," Bajaj"));

    }
}
/*
OUTPUT
Int method returns: 30
String method returns Devayush  Bajaj

 */