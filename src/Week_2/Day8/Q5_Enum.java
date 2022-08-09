package Week_2.Day8;
/*
6)Write a program using enum which will print following output
Add enum RED('STOP"),GREEN("GO"),YELLOw"DRIVE VERY SLOW")
Try to print values
RED MEANS STOP
GREEN MEANS GO
YELLOW MEANS DRIVE VERY SLOw
 */

enum Traffic_lights
{
    RED ("Stop"),
    GREEN ("Go"),
    YELLOW("Drive Slowly");

    private String description;
    Traffic_lights(String signal) {
        this.description = signal;
    }
    public String returnIt(){
        return description;
    }
}
public class Q5_Enum {
    public static void main(String[] args) {
        for(Traffic_lights traffic: Traffic_lights.values()){
            System.out.println(traffic.name() + " Means " +  traffic.returnIt());

        }
    }
}
/*
OUTPUT
RED Means Stop
GREEN Means Go
YELLOW Means Drive Slowly

 */
