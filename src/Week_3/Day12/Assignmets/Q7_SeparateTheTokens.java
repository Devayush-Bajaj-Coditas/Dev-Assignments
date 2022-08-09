package Week_3.Day12.Assignmets;

import java.util.StringTokenizer;

public class Q7_SeparateTheTokens {

    public static void main(String[] args) {
        System.out.println("Numbers are :");
        StringTokenizer st = new StringTokenizer("3+(20%2)(20/2)","+(%)/");
        while (st.hasMoreTokens()){
            System.out.print(st.nextToken()+ " ");
        }
        System.out.println("\nOperates are :");
        StringTokenizer st1 = new StringTokenizer("3+(20%2)(20/2)","[0123456789]");
        while (st1.hasMoreTokens()){
            System.out.print(st1.nextToken()+ " ");
        }
    }
}
/*
OUTPUT

Numbers are :
3 20 2 20 2
Operates are :
+( % )( / )
 */