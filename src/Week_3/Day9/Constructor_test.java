package Week_3.MyPractice;

public class Constructor_test {
    String name;
    int roll_no;

    //T H I S  Keyword
    Constructor_test(String name, int roll_noc) {
        this.name = name;
        this.roll_no = roll_no;
        System.out.println("My name is " + name + "And roll no is " + roll_no);
        return;


    }

    Constructor_test(String name_C) {
        name = name_C;
        System.out.println("My name is " + name);
    }

    //Constructor chaining
    Constructor_test(Constructor_test Other) {
        System.out.println("Calling Object variables with this keyword into another constructor");
        this.name = Other.name;
        this.roll_no = Other.roll_no;
        System.out.println("My name " + this.name + "roll: " + this.roll_no);

    }


    public static void main(String[] args) {
        Constructor_test Student1 = new Constructor_test("Devayush");
        Constructor_test constructor_test1 = new Constructor_test("Devayush", 14);
        Constructor_test Other1 = new Constructor_test(Student1);

        // making copy of object variable

        Constructor_test constructor_test2 = constructor_test1;
        constructor_test1.name = "**************Changing name in First object *************";
        System.out.println("Printing name of second object " + constructor_test2.name );
    }
}
