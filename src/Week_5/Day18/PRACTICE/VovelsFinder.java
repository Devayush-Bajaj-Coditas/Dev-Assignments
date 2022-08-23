package Week_5.Day18.PRACTICE;

import java.util.Locale;
import java.util.Scanner;

class Vovels{
    String names;
    int vcount = 0;
    void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        names = s.next();
    }
    void vovlesFinder(){
        names = names.toUpperCase();
        System.out.println(names);
        for (int i = 0; i< names.length(); i++ ){
            if (names.charAt(i) == 'A' || names.charAt(i) == 'E' || names.charAt(i) == 'I' || names.charAt(i) =='O' || names.charAt(i) =='U'){
                 vcount++;
            }
        }
        System.out.println("Number of vovels are " + vcount );
    }
}

public class VovelsFinder {


    public static void main(String[] args) {
        Vovels vovels = new Vovels();
        vovels.input();
        vovels.vovlesFinder();
    }
}
