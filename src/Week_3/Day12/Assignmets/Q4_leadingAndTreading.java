package Week_3.Day12.Assignmets;
/**
Q8 Remove both leading and trailing white space characters from the given string and
also showcase the Unicode value of the character present at index 5.
 @DevayushBajaj*/
public class Q4_leadingAndTreading {
    public static void main(String[] args) {
        String sentence="  This is a simple sentence  ";
        int result=sentence.codePointAt(4);
        //Remove both leading and trailing white space characters
        String trimmedString=sentence.trim();
        System.out.println(trimmedString);
        System.out.println("Unicorn value at 5th index is " + result);
    }
}

/*
OUTPUT
This is a simple sentence
Unicorn value at 5th index is 105

 */
