package Week_3.Day12;

public class String_Demo {
    public static void main(String[] args) {
        // Way 1
        String first_name = "Coditas";       //Literal Way
        // Way 2
       // String last_name = "ELTP";
        String last_name = new String("ELTP");      //new way

        System.out.println(first_name + " " + last_name);

        //immutability check
        first_name.concat("PlP");   // not effertct as it is immutable
        first_name = first_name.concat("PLP");
        System.out.println(first_name);
        System.out.println("After reasigning FIRST NAME: " + first_name + last_name);

        System.out.println("****************************************");
        String firn_name = "coditas";
        String frin_name2 =new String("Coditas");
        //equality

        //way one
        System.out.println(firn_name.equals(firn_name));

        //Way2
        //System.out.println(firn_name == first_name);
        System.out.println(firn_name == frin_name2);

        //Way3
        System.out.println(first_name.compareTo(firn_name));
        System.out.println(first_name.compareTo(firn_name));
        //if they are exact same it wil return 0
        // is first name is less then seconf name = Negative one
        // if fn is greater then ln = positive
        System.out.println("******************************");
        String check_null_value = null;
       // System.out.println(check_null_value.length());      //Null pointer exception displayed


    }
}
