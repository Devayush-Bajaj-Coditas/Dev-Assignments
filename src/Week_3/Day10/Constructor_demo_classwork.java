package Week_3.Day10;

class Teacher{
    private int id;
    private String name, city;
    private float salary;

    //Default constructor
    Teacher(){
        System.out.println("This is default constructor " + id + name + city + salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                '}';
    }

    //Parameterised constructor
    Teacher(int id){
        super();
        //THIS is pointing to the current object
        //when parameters are same use this t differenciate between locl and Instance for value
        this.id = id;
        System.out.println("This is Parameterised constructor " + id );

    }
}

class Asst_professor extends Teacher{
    int exp;

    public Asst_professor(int exp, String position) {
        this.exp = exp;
        this.position = position;
    }

    private String position;
}

public class Constructor_demo_classwork {
    public static void main(String[] args) {

        //Teacher teacher= new Teacher();

        Teacher teacher1 = new Teacher(2);

    }
}
