package Week_4.Day15.Practice.Patterns;
/*
 *****
  *****
   *****
    *****
 */

public class stairs {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for(int s = 3; s >= i; s--){
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
