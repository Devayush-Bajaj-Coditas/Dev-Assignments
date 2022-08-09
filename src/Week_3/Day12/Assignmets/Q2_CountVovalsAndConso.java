package Week_3.Day12.Assignmets;
//2) Count the total number of vowels and consonants in a string
public class Q2_CountVovalsAndConso {
    void finder() {
        int vovelCount = 0, consonantsCount = 0;
        String str = "My name is Devayush";

        //Converting entire string to lower case
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            //Checks whether a character is a vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vovelCount++;
            }
            //Checks whether a character is a consonant
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                consonantsCount++;
            }
        }
        System.out.println("Number of vowels: " + vovelCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }

    public static void main(String[] args) {
        Q2_CountVovalsAndConso q2_countVovalsAndConso = new Q2_CountVovalsAndConso();
        q2_countVovalsAndConso.finder();
    }
}
/*
OUTPUT
Number of vowels: 6
Number of consonants: 10
 */