package Week_4.Day15.Practice.Patterns;
/*
        *****
        ****
        ***
        **
        *
*/

public class InverseRightTriange {
    void pattern(){
        for (int i =1; i <= 5; i++){
            for (int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class main2{
    public static void main(String[] args) {
        InverseRightTriange inverseRightTriange = new InverseRightTriange();
        inverseRightTriange.pattern();
    }
}