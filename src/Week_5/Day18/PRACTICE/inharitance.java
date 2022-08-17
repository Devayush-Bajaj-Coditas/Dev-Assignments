package Week_5.Day18.PRACTICE;
class myEx extends Exception{
    myEx(){
        super("invalid thing");
    }
}

class A{}
class B {
    A a;
}

interface c {
    int a = 12;
}
public class inharitance {
    public static void main(String[] args) throws myEx {
        int a = 1;
        try {
            if (a > 0) {
                throw new myEx();

            }
        } catch (myEx e) {
            e.printStackTrace();
        }
        System.out.println("HELLO");
    }
}