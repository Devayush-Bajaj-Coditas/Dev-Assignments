/*Q1)What is Constructor chaining?

Constructor chaining means calling one constructor from another constructor with respect to the current object

 */
//Constructor chaining with inheritance
package Week_3.Day10;

import java.util.BitSet;

class BaseClass {
    String name;

    BaseClass() {
        System.out.println("This is No-Args constructor of base class");
    }

    BaseClass(String name) {
        this.name = name;
        System.out.println("parameterised const  " + name);

    }

}
class Derived extends BaseClass {
    Derived(){
        System.out.println("No args constructor of Derived class");
    }

    Derived(String name){
        super(name);            //it will fetch the name from base constructor
        System.out.println("Calling parameterised const of Derived ");
    }
}

public class Q1_Constructor_chaining {
    public static void main(String[] args) {
        Derived derived = new Derived("Devayush");
    }
}


/*          OUTPUT
parameterised const  Devayush
Calling parameterised const of Derived

 */