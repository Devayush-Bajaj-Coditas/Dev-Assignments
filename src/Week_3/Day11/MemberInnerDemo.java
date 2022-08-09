package Week_3.Day11;

class Outer1{
    class Inner{
        public void show(){
            System.out.println("THis is inside the local inner class");
        }
    }

    public void display(){
        System.out.println("This is inside the method display...");



        Inner inner = new Inner();
        inner.show();
    }
}
public class MemberInnerDemo {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.display();
        Outer1.Inner inner=  outer.new Inner();
        inner.show();

    }
}
