package Week_4.Day15.Practice.Patterns;
/*          *
            * *
            * * *
            * * * *
            * * * * *              */


public class RightTriangle {

    void print(){
        for(int i =1; i <=5; i++){
            for(int j =0 ; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class main{
    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.print();
    }
}