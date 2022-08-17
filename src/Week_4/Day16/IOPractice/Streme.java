package Week_4.Day16.IOPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Streme {
    void openFIle(){

    }
    void readFile(){
        try {
            FileInputStream fileInputStream = new FileInputStream("Dfile.txt");
            int data;
            while(fileInputStream.read() != -1){
                System.out.println();

            }
        } catch (RuntimeException | IOException e){
            e.printStackTrace();
        }
    }
}
