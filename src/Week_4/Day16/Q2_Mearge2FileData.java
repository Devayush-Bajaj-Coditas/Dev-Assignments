package Week_4.Day16;

import java.io.File;
import java.io.IOException;

class FileManager{
    void create_file(){
        try {
            File newFile = new File ("File1.txt");
            if(newFile.createNewFile()){
                System.out.println("New file has been created");
            }
            else
            {
                System.out.println("File already Exist");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    void write_file(){

    }


}

public class Q2_Mearge2FileData {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.create_file();
    }

}
