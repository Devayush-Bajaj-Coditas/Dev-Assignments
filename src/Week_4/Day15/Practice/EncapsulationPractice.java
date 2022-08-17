package Week_4.Day15.Practice;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

class MyEmp{
    private String name;
    void setName(String name, String password){
        if(password == "123") {
            this.name = name;
        }
        else {
            System.out.println("YOur password is incorrect");
        }
    }
    String getname(){
        return name;
    }
}

//**************************************IO Stremes *************************************************

class ByteInOutDemo{
    void createFile(){
        String s = "Devayush";
        byte b[] = s.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(12);
        byteArrayOutputStream.writeBytes(b);
    }
}
public class EncapsulationPractice {
    public static void main(String[] args) {
        MyEmp myEmp = new MyEmp();
        myEmp.setName("Devayush","123");
        System.out.println(myEmp.getname());

        System.out.println("Byte conversion");
        ByteInOutDemo byteInOutDemo = new ByteInOutDemo();
        byteInOutDemo.createFile();
    }
}
