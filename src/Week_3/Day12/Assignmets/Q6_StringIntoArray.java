package Week_3.Day12.Assignmets;

public class Q6_StringIntoArray {
        public static void main(String[] args) {

            // sample string
            String str = "Believe in yourself ";

            // split string using space as delimiter
            String[] strArray = str.split(" ");

            // original String
            System.out.println("Original String : \n" + str);

            System.out.println("\nPrinting elements in Array ...");
            for(String element : strArray) {
                System.out.println(element.toString());
            }
        }
    }

    //OUTPUT
/*
Original String :
Believe in yourself

Printing elements in Array ...
Believe
in
yourself

 */
