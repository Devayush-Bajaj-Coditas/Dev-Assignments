package Week_5.Day18.PRACTICE;
class Engine{
    Engine (int power){
        System.out.println("Power is "+ power);
    }
    void sound(){
        System.out.println("phurrrrrrrrr");
    }
}

class Car{
    Engine engine = new Engine(1500);
    void carSound(){
        engine.sound();
    }
}

public class AssociationInharitance {
    public static void main(String[] args) {
        Car car = new Car();
        car.carSound();
    }
}
