package Week_2.Day7;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
class employee{

    void display(){
        System.out.println("Under EMployee");
    }
}
class wageEmploye extends employee{
    void display(){
        super.display();
        System.out.println("Under wageEmployee");
    }
}
public class demo {
    public static void main(String[] args) {
        employee employee1 = new wageEmploye();
        employee1.display();
    }



}
