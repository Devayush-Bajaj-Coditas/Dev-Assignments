/*Accept 5 names of string type, count the length.and as per their length assign there
order (Ascending).
 */


package Week_3.Day12.Assignmets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Q5_FiveNames {
    //taking input and making an array

    public static void takeInput(String[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.next();
        }
    }

    public static String changeName(String name) {
        name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' ||
                    name.charAt(i) == 'u') {
                int a = name.charAt(i);
                name = name.replace(name.charAt(i), (char) (a + 1));
            }

        }
        return name;
    }

    public static void main(String[] args) {
        int count = 5;
        System.out.println("Enter 5 names");
        String names[] = new String[count];
        takeInput(names);
        Arrays.sort(names, Comparator.comparingInt(String::length));
        System.out.println("ascending Order : \n" + Arrays.toString(names));
        //taking oneByOne and checking vowel if there changing it
        int i = 0;
        for (String name : names) {
            names[i++] = changeName(name);

        }
        System.out.println("After Changes : \n" + Arrays.toString(names));

    }
}

/*      OUTPUT
ascending Order :
[anuj, Osman, Zulfa, Devayush, Abhishek]
After Changes :
[bnvj, Osmbn, Zvlfb, Dfvbyvsh, Abhjshfk]
 */