package Week_5.Day18.PRACTICE;
/*4). Create an abstract class shape with abstract method void area();
        create 4 more classes circle, cylinder, square and rectangle

        SHAPE is parent for circle and square, and circle is parent for cylinder ,rectangle is child
        of square.      */
abstract class Shapes{
    abstract void area();
}

class Circle extends Shapes{

    void area() {
        System.out.println("Area of circle");
    }
}
class Cylinder extends Circle{
    void area(){
        System.out.println("Area of Cylinder");
    }
}
class Square extends Shapes{
    void area(){
        System.out.println("Area of Square");
    }
}

class Rectangle extends Square{
    void area(){
        System.out.println("Area of Rectangle");
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Cylinder cylinder = new Cylinder();
        Rectangle rectangle = new Rectangle();


    }
}
