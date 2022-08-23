package Week_6.Day20;

import java.util.Enumeration;
import java.util.Vector;

public class Day21 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(15);
        v.add(15);
        v.add(15);
        v.add(15);
        v.add(15);
        v.add(15);
        v.add(15);

        Enumeration enumeration = v.elements();
        enumeration.asIterator();

    }
}
