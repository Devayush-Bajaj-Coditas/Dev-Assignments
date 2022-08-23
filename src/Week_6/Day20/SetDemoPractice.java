package Week_6.Day20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemoPractice {
    void setMethods(){
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);


        Set<Integer> set2 = new HashSet<>();

        set2.add(11);
        set2.add(12);
        set2.add(13);
        set2.add(14);
        set2.add(15);
        set2.add(16);


        //Heshset =>
        // Null - allowed
        //
        System.out.println("set count" + set1.size());

        System.out.println("Is empty " + set1.isEmpty());

        System.out.println("Contains or not" + set1.contains(21));

        System.out.println("BeforeRetain");
        System.out.println("retains all :: " + set1.retainAll(set2));
        System.out.println("After retain");


    }

    void LinkedHashsetMethods(){
        Set<Integer> set1 = new LinkedHashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);


        Set<Integer> set2 = new HashSet<>();

        set2.add(11);
        set2.add(12);
        set2.add(13);
        set2.add(14);
        set2.add(15);
        set2.add(16);


        System.out.println("set count" + set1.size());

        System.out.println("Is empty " + set1.isEmpty());

        System.out.println("Contains or not" + set1.contains(21));

        System.out.println("BeforeRetain");
        System.out.println("retains all :: " + set1.retainAll(set2));
        System.out.println("After retain");


    }

    public static void main(String[] args) {
        SetDemoPractice setDemoPractice = new SetDemoPractice();



        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);


        //Ways to access elements in hashset

        //way1 ---> For LOOP

        System.out.println("**********For LOOP***********");
        for (Integer i : set){
            System.out.println(i);
        }

        //way2 ---> USing array
        System.out.println("********** Using Array **********");
        Object arr[] = set.toArray();
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        //Way 3 ---> Iterator
        System.out.println("********** Using Iterator ********** ");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
/*
Null => allowed
Order
Duplicates
 */