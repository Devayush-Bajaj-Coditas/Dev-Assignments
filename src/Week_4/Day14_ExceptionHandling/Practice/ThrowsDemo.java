package Week_4.Day14_ExceptionHandling.Practice;

import java.io.*;

public class ThrowsDemo {

    void createFile () throws FileNotFoundException {
        PrintStream ps = new PrintStream("ThrowsPracticeDay14.txt");
        ps.println("This is an throws demo");
    }
    void readFile() throws IOException {
        FileReader fileReader = new FileReader("ThrowsPracticeDay14.txt");
        fileReader.read();

    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        try {
            throwsDemo.createFile();
            throwsDemo.readFile();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
