package Week_4.Day14_ExceptionHandling.Exceptions;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class OpenFile{
    void fileWriterr() {
        try {
            FileReader fileReader = new FileReader("Dev.txt");
            System.out.println("File opened");
        }catch (IOException e) {
            System.out.println("File not found");
        }finally {
            System.out.println("In finally block");
        }
    }


}


public class FileNOtFound {
    public static void main(String[] args) {
        OpenFile openFile = new OpenFile();
        openFile.fileWriterr();
    }
}
