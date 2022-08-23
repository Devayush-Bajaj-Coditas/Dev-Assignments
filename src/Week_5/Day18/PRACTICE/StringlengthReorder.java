package Week_5.Day18.PRACTICE;

import java.util.Arrays;

class Strings{
    String s1 = "Hello";
    String s2 = "my";
    String s3 = "name";
    String s4 = "is";
    String s5 = "java";

    void sort(){
        String s[] = {s1,s2,s3,s4,s5};
        String temp;
        for (int i =0; i<s.length; i++){
            for (int k = 1; k < s.length -1; k++){
                if (s[k].compareTo(s[k+1])>0){
                    temp = s[k];
                    s[k] = s[k+1];
                    s[k+1] = temp;
                }
            }
        }


        for(int i = 0 ; i < s.length; i++){
            System.out.println(s[i]);
        }

    }

}


class IntSorting{
    int temp;

    void sort(){
        int numbers[] = {12,3,65,43,3};
        for(int i = 0; i< numbers.length; i++){
            for (int k = 0; k< numbers.length -1; k++){
                if (numbers[k]>numbers[k+1]){
                    temp = numbers[k];
                    numbers[k] = numbers[k+1];
                    numbers[k+1] = temp;
                }
            }
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}

public class StringlengthReorder {
    public static void main(String[] args) {
        System.out.println("Sorting String array");
        Strings strings = new Strings();
        strings.sort();

        System.out.println("sorting inter array");
        IntSorting intSorting = new IntSorting();
        intSorting.sort();
    }
}
