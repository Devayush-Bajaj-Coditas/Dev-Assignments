
/*Question 1 to 3 Answers:-

Q1) Check for the package, related to Array Where Array related in-built methods are present?
=>create Simple code using those package in—built functionality.
=>whenever required use the "for-each" loop to iterate.
=>follow Naming conventions and indentation While coding.(spaces,tab
*/
package Week_2.Day5;

import java.util.Arrays;
import java.util.Collections;

class Array_meth {
    int Array_values1[] = {12, 43, 6, 76, 43, 45};
    int Array_values2[] = {1, 2, 3, 4, 5, 6};

    void as_list() {
        //As List ->Returns a fixed-size list backed by the specified Arrays
        Arrays.asList(Array_values1);
        System.out.println("asList : " + Arrays.toString(Array_values1));
        System.out.println();
    }

    void sorting() {
        //Sorting in ascending order
        Arrays.sort(Array_values1);
        System.out.println("sorting: " + Arrays.toString(Array_values1));
        System.out.println();
    }

    void Binary_search() {
        System.out.println("Binary Search of 76 is:  " + Arrays.binarySearch(Array_values1, 76));
        System.out.println();
    }
//Q2 Print array in Ascending and descending order,using in-built functionality.
    void AccendingANDdecendin(){
        //Accending order
        Integer Array_values3 [] ={1,2,3,4,5};
                Arrays.sort(Array_values3);
        System.out.println("Accenting order of array : " + Arrays.toString(Array_values3));
        //Decending Order

        Arrays.sort(Array_values3, Collections.reverseOrder());
        System.out.println("Decanting order : "+ Arrays.asList(Array_values3)) ;
    }
//Q3) Copy one array into the another arrays in-built functionality
    void copy_(){
        System.out.println("Array copy : "+ Arrays.toString(Arrays.copyOf(Array_values1, 5)));
        System.out.println();
        //any change in orignal array will refect in copy also
    }
    void clone_(){
        System.out.println("Array Clone" + Arrays.toString(Array_values1.clone()));
        //Independent Array
    }

    void Equals(){
        System.out.println("Equals : "+ Arrays.equals(Array_values1,Array_values2));
    }


}
public class ARRAY_methods {
    public static void main(String[] args) {
        Array_meth array_meth = new Array_meth();
        array_meth.as_list();
        array_meth.sorting();
        array_meth.Binary_search();
        array_meth.copy_();
        array_meth.clone_();
        array_meth.Equals();
       array_meth.AccendingANDdecendin();
    }
}

/*          OUTPUT
asList : [12, 43, 6, 76, 43, 45]

sorting: [6, 12, 43, 43, 45, 76]

Binary Search of 76 is:  5

Array copy : [6, 12, 43, 43, 45]

Array Clone[6, 12, 43, 43, 45, 76]
Equals : false
Accenting order of array : [1, 2, 3, 4, 5]
Decanting order : [5, 4, 3, 2, 1]
*/

