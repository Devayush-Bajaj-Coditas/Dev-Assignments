package Week_4.Day15.Practice.Patterns;


public class InvertedPyramid {

    void pattern(){
        for(int rows = 1; rows <=4; rows++)
        {
            for (int space = 2; space <= rows; space++)
            {
                System.out.print(" ");
            }
            for(int LeftStars = 4; LeftStars >= rows; LeftStars--){
                System.out.print("*");
            }
            for(int RightStars = 1; RightStars <= rows; RightStars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class main4{
    public static void main(String[] args) {
        InvertedPyramid invertedPyramid = new InvertedPyramid();
        invertedPyramid.pattern();
    }
}