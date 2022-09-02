package Week_6.Day23.StreamAPI;

import Week_4.Day16.IOPractice.Streme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
Stream api was introduced in jdk version 1.8
-- related to collection framework
 -- used to process bulk operations and process of collection
 --reduce the length of the code by reducing boiler code
 */

class Learning{
    void beforeStremeAPI(){    // BOILER PLATE CODE
        //creating a list and filter all even numbers

        List<Integer> mylist = new ArrayList<>();
         mylist.add(2);
         mylist.add(10);
         mylist.add(133);
         mylist.add(341);

         //filtering all the odd numbers and puting it into other list
        List <Integer> listEven = new ArrayList<>();
        for (Integer i : listEven){
            if(i%2 == 0){
                listEven.add(i);
            }
        }
        System.out.println(mylist);
        System.out.println(listEven);
    }

    void usingStreamAPI()
    {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(2);
        mylist.add(10);
        mylist.add(133);
        mylist.add(341);
        Stream <Integer> stream = mylist.stream();
       List<Integer> list2 = stream.filter(i -> i % 2 ==0).collect(Collectors.toList());
        System.out.println(list2);
    }
    void numberMoreThan50(){
        List<Integer> mylist = new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(40);
        mylist.add(50);
        mylist.add(60);
        mylist.add(170);
        Stream <Integer> stream = mylist.stream();
        List<Integer> list1 = stream.filter(i ->i<50).collect(Collectors.toList());
        System.out.println(list1);
    }
}
public class Basics {
    public static void main(String[] args) {
        Learning learning = new Learning();
        learning.beforeStremeAPI();
        learning.usingStreamAPI();
        learning.numberMoreThan50();

    }
}
