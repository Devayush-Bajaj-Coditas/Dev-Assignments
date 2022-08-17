package Week_4.Day15.Practice.Patterns;
/*
    *
   ***
  *****
 *******
 */
public class Pyramid {
    void pattern(){
        for(int rows = 1; rows<5; rows++){
            for (int spaces = 4; spaces >= rows; spaces--){
                System.out.print(" ");
            }
            for (int leftStars = 1; leftStars <= rows; leftStars++){
                System.out.print("*");
            }
            for (int rightStars = 2; rightStars <= rows; rightStars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class main3{
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.pattern();
    }
}