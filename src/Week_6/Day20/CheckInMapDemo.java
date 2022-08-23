package Week_6.Day20;

import java.util.*;

public class CheckInMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(12, "B");
        map.put(13, "D");
        map.put(14, "F");
        map.put(15, "H");
        map.put(null, "L");

        if(!map.containsKey(3)){
            map.put(3,"k");
            System.out.println("");

            List l = new ArrayList();
            l.add(5);
            l.add("devayush");
            l.add('l');

            Iterator i = l.iterator();
            while (i.hasNext()){
                System.out.println(i.next());

            }

        }
    }
}
