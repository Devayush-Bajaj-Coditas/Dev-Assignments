package Week_2.Day8;

import Week_2.Day7.Shapes;

/*
Q1 CREATE A CLASS NAMED SHAPE, WHICH CONTAINS ONLY SINGLE
METHOD,calculateArea0. THIS METHOD SHOULD HAVE "N" NUMBER OF
PARAMETERS FOR DIFFERENT SHAPES LIKE FOR|
CIRCLE,RECTANGLE, TRIANGLE
 */
class Shape2{
    void calculateArea(int ...arg){
        System.out.println("Printing shape");
    }
}

class Circle1 extends Shape2{
    void calculateArea (int...arg){
        System.out.println("Area of circle is " + Math.PI*(int)arg[0]);
    }
}

public class Q1_Shape {
    public static void main(String[] args) {
        Shape2 shape2 = new Circle1();
        shape2.calculateArea(12);

    }
}
/*
OUTPUT
Area of circle is 37.69911184307752
 */