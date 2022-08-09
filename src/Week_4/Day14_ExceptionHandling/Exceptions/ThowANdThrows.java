package Week_4.Day14_ExceptionHandling.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThowANdThrows {

    void check_For_file() throws FileNotFoundException {
        FileInputStream fin = new FileInputStream( "ABC.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        ThowANdThrows thowANdThrows = new ThowANdThrows();
        thowANdThrows.check_For_file();
    }
}
