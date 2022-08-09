package Week_2.Day7;
/*
1)Write a program in which you will declare an abstract class Vehicle inherits this
class from two classes car and truck using the method engine in both display "car has
good engine" and "truck has bad engine".
 */
abstract class Vehicle{
    abstract void engine();

}

class Car extends Vehicle{
    void engine(){
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle{
    void engine(){
        System.out.println("Truck has bad engine");
    }
}

public class Engine {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.engine();
        Vehicle vehicle2 = new Truck();
        vehicle2.engine();

    }
}
