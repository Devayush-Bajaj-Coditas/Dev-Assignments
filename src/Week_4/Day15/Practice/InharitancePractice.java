package Week_4.Day15.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Parent{
    void display(){
        System.out.println("This is Parent");
    }
}
class child{
    Parent parent = new Parent ();
    void parentMethodUse(){
        parent.display();
    }
}

class child2{
    void parentMethodUse(){
        Parent parent = new Parent();
        parent.display();
    }
}

class FileCreator{
    void createFile(){
        try {
            PrintStream printStream = new PrintStream("Deva.txt");
            printStream.print("THis is printf");
            printStream.println("\nThis is println");
            FileOutputStream fileOutputStream = new FileOutputStream("DevaFileoutputStreme.txt");
            fileOutputStream.write(3333);
            fileOutputStream.flush();

            printStream.flush();
        }
        catch (Exception e){
            System.out.println("************************************");
            e.printStackTrace();
        }
    }
}
public class InharitancePractice {
    public static void main(String[] args) {

        FileCreator fileCreator = new FileCreator();
        fileCreator.createFile();
    }
}
