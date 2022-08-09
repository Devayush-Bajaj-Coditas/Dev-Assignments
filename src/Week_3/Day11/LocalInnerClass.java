package Week_3.Day11;


class Outer{
    public void display(){
        System.out.println("This is inside the method display...");

        class Inner{
            public void show(){
                System.out.println("THis is inside the local inner class");
            }
        }

        Inner inner = new Inner();
        inner.show();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
