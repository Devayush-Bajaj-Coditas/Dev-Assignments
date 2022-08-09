package Week_2.Day7;
/*4). Create an abstract class shape with abstract method void area);
        ereate 4 more classes circle, cylinder, square and rectangle
        shape
        circle square
        cylinder
        SHAPE is parent for circle and square, and circle is parent for cylinder rectangle is child
        of square
        ctangle

 */

abstract class Shape{
    abstract void area();

}
class Circle extends Shape {

    @Override
    void area() {
        int radius = 10;
        System.out.println("Area of circle is " + Math.PI + radius*radius );
    }
}

class Cylinder extends Circle{
    void area(){
        int radius = 100, height = 20;
        System.out.println("Area of cylinder is " + 2 * Math.PI *radius *height );
    }

}

class Square extends Shape{


    @Override
    void area() {
        int side=10;
        System.out.println("Area of square is " + 4*side);
    }
}

class Rectangle extends Square{

    void area(){
        int length = 100;
        int width = 20;
        System.out.println("Area of rectangle " + length * width);
    }
}

class TestShape{
    void testShape(){
        Shape shape[] = new Shape[4];
        for (int i =0;i<4;i++){
            switch(i){
                case 0 :
                    shape [i] = new Circle();
                    break;
                case 1 :
                    shape [i] = new Rectangle();
                    break;
                case 2 :
                    shape [i] = new Square();
                    break;
                case 3 :
                    shape [i] = new Cylinder();
                    break;
            }
        }
        for (int i = 0 ; i< 4 ; i++){
            shape[i].area();
        }
    }
}
public class Shapes {
    public static void main(String[] args) {
        TestShape testShape = new TestShape();
        testShape.testShape();
    }
}


/*
OUTPUT
Area of circle is 3.141592653589793100
Area of rectangle 2000
Area of square is 40
Area of cylinder is 12566.370614359173

 */