package Week_6.Day20;

import java.util.HashMap;
import java.util.Map;

public class MapDemoJava {
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();
        map.put(12, "B");
        map.put(13, "D");
        map.put(14, "F");
        map.put(15, "H");
        map.put(null,"L");
        map.put(14,null);



        Map<Integer, String> map2 = new HashMap<>();
        map.put(12, "A");
        map.put(13, "C");
        map.put(14, "E");
        map.put(15, "G");



        map.putAll(map2);
        System.out.println("value for 14 key is  " + map.get(14));
        System.out.println("contains " + map.containsKey(14));
        System.out.println("Replace " + map.replace(15,"EF"));
        System.out.println("Replace with old new " + map.replace(17,"G","GH"));
        System.out.println("Only string values ");
        //Hoe to access it
        //Map.Entry<Integer, String > entry = map.entrySet();

        //How to use map with iterator
    }
}
