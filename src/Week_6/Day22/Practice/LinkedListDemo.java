package Week_6.Day22.Practice;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    LinkedList <Integer> lis = new LinkedList();        //generic
    void linked(){
        lis.add(12);
        lis.add(15);
        lis.add(2,32);

        lis.add(55);
        Iterator itr = lis.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    void linkListAsADeque(){
        System.out.println("Linked list as a deque");
        System.out.println("First element before adding " +lis.getFirst());
        lis.addFirst(12);
        System.out.println("First element after adding " + lis.getLast());
    }

    void linkedListAsStack(){
        System.out.println("Linked list as a Stack " + lis);
        System.out.println("POP ");
        lis.pop();
        System.out.println("PUSH " + lis);
        lis.push(25);
        System.out.println(lis);
    }

    public static void main(String[] args) {
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.linked();
        linkedListDemo.linkListAsADeque();
        linkedListDemo.linkedListAsStack();
    }

}
