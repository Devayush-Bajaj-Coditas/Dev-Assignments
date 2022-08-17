package Week_4.Day16;

import Week_4.Day15.Q1_Bank_Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// creating, Writing and reading the file
class FileInput {
    void createFIle() throws IOException {
        File myfile = new File("Dev.txt");
        createFIle();
    }
    void writeFile() throws IOException {               //FILEWRITTER is used to read the file
        FileWriter fileWriter = new FileWriter("Dev.txt");
        fileWriter.write("lets do this");
        fileWriter.close();

    }
    void readFile() throws FileNotFoundException {
        File file = new File("Dev.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

}
public class FileClassPRACTICE {
    public static void main(String[] args) throws IOException {
        FileInput  fileInput = new FileInput();
        fileInput.createFIle();
        fileInput.writeFile();
        fileInput.readFile();
    }
}
