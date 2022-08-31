package Week_6.Day20.CollectionFrameworkPractice;

import com.sun.jdi.ObjectReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Array_List{
    ArrayList myArrayList = new ArrayList();
    void ArrayL() {
        myArrayList.add("Devayush");
        myArrayList.add(15);
        myArrayList.add('t');

        System.out.println(myArrayList.get(2));
        System.out.println("Orignal list : " + myArrayList);

        //Converting an array list into Array
      Object finalArray[] = myArrayList.toArray();


      ArrayList<Integer> intArrayList = new ArrayList();
      intArrayList.add(12);
      intArrayList.add(543);
      intArrayList.add(434);
      intArrayList.add(43232);
        //PRinting array linst into accending order
        Collections.sort(intArrayList,Comparator.naturalOrder());
        System.out.println("Accending " + intArrayList);

        // decending
        Collections.sort(intArrayList, Comparator.reverseOrder());
        System.out.println("Descending " + myArrayList);

        //Iterating the list
        System.out.println("Iterating the list using iterator" );
        Iterator iterator = myArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    void show(){
        for(int i = 0; i < myArrayList.size(); i++){
            System.out.println();
        }
    }

}


public class List_ArrayList {
    public static void main(String[] args) {
        new Array_List().ArrayL();
    }
}

