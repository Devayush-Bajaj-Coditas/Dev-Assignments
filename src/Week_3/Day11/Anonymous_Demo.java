package Week_3.Day11;

interface Animal{
    void sleep();
    void eat();
}
public class Anonymous_Demo {

    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void sleep() {
                System.out.println("Sleep method");
            }

            @Override
            public void eat() {
                System.out.println("Eat method");

            }
        };

        animal.eat();
        animal.sleep();

    }
}
