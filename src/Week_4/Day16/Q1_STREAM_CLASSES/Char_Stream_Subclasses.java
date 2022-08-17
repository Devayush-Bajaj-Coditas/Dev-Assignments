package Week_4.Day16.Q1_STREAM_CLASSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1)CHARACTER STREAM CLASSES
class Char_Stream{
    String name;
    void input_from_BufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name : ");
        name = br.readLine();
    }
    void output_From_BufferedWritter(){
        //InputStreamReader inputStreamReader = new InputStreamReader();
    }
}

public class Char_Stream_Subclasses {
}
