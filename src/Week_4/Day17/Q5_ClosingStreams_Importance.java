package Week_4.Day17;

//  Q5)Closing Streams is important or not? Explain by writing code
import java.io.FileWriter;
import java.io.IOException;

class File{
    void createFile(){
        try
        {
            FileWriter fileWriter = new FileWriter("MyFile.txt");

            fileWriter.append("This is my file");

            fileWriter.close();
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
    }
}
public class Q5_ClosingStreams_Importance {
    public static void main(String[] args) {
        File file = new File();
        file.createFile();
    }
}

/*
If we do not close the file then it will not reflect anything init. So closing of file is important


MyFile.txt <----- File created
This is my file
 */