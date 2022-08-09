/*
Q4)using the "equals" methodfiind the duplicate elements (int/String)of the array.
print the Duplicate element.
=>try to remove the second occurrence of Duplicate element ,
again print Array elements (Without duplication)
*/

class Duplicate {
    int Array1[] = {1, 2, 3, 4, 5, 1, 4};

    void duplicate() {
        System.out.println("COMMON ELEMENTS IN ARRAY ARE: ");
        for (int i = 0; i < Array1.length; i++) {
            for (int j = i + 1; j < Array1.length; j++) {
                if (Array1[i] == Array1[j]) {
                    System.out.println(Array1[j]);
                }

            }
        }
    }

    void without_duplicate() {
        System.out.println("Array without duplicate: ");
        for (int i = 0; i < Array1.length-1; i++) {
            if (Array1[i] != Array1[i+1]) {
                System.out.println(Array1[i]);
            }
        }
    }
}
    public class Duplicate_elements_array {
    public static void main(String[] args) {
            Duplicate duplicate = new Duplicate();
            duplicate.duplicate();
            duplicate.without_duplicate();
    }
}

/*      OUTPUT
COMMON ELEMENTS IN ARRAY ARE:
1
4
Array without duplicate:
1
2
3
4
5
 */
