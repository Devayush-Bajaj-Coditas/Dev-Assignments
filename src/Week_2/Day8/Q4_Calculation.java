package Week_2.Day8;
/*
5)Write a program for Addition operation,
Class Addition{
/add method overloading for addo
Class Varargs_Addition
/use varargs for add method
Class MainApplication{
//access above classes in mainO
 */

//fixed object are required
class Addition{
    int add(int a, int b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }

}

class Varargs_Addition{
//Number of args not required in object
    int add(int ... args){
        int sum = 0;
        for(int x: args){
            sum+=x;
        }
        return sum;
    }

}
class MainApplication {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println("3 inputs output "+addition.add(14,34,543));
        System.out.println("2 inputs output "+addition.add(12,435));
        System.out.println("********************************");
        //object for varargs
        Varargs_Addition varargs_addition = new Varargs_Addition();
        System.out.println(varargs_addition.add(12,3,324,35,54,4,4,544,4,423,34534,6,5879,879,8));
    }
}
public class Q4_Calculation {
}

/*
OUTPUT
3 inputs output 591
2 inputs output 447
********************************
42713

 */
