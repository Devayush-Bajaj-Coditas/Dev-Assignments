package Week_5.Day18.PRACTICE;

import Week_4.Day17.Q2_Employee_Input_All_Ways.BufferReader_Input;

import java.io.*;
import java.nio.Buffer;

public class Stringreader{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/myData.csv"));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/myData1.xls"));

        String s = null;
        while((s = bufferedReader.readLine()) != null) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
