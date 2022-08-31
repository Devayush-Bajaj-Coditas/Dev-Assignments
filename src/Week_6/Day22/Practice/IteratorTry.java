package Week_6.Day22.Practice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Operation{
    ArrayList<Integer> arrayList = new ArrayList();
    void addInList(){
        arrayList.add(12);
        arrayList.add(2);
        arrayList.add(34);
        arrayList.add(21);
        arrayList.add(3);
    }
    //USING FOR LOOP WITH ARRAYLIST METHODS
    void iterateUsingFor(){
        System.out.println("Iterating using for loop in arrayList");
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    //****************************Iterating collection iterator *********************************************
    void myIterator(){

        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    void listIterator(){

        ListIterator listIterator = arrayList.listIterator();
        // Printing the next values
        System.out.println("*****List Iterator NEXT*****");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        listIterator=arrayList.listIterator();
        System.out.println("*****List Iterator PREVIOUS*****");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}

public class IteratorTry {
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.iterateUsingFor();
        operation.addInList();
        operation.myIterator();
        operation.listIterator();

    }
}
