package Week_6.Day20;

class Node{
    int key;
    Node nextNode;

    Node(int key){
        this.key = key;
        this.nextNode = null;
    }

}

class Queue{
    Node front, rear;
    public Queue(){
        this.front = this.rear =null;
    }
}

public class Q1_LinkedListImplementation_Queue {
}
