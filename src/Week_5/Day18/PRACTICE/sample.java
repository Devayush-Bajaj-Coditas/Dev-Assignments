package Week_5.Day18.PRACTICE;

import java.io.*;

public class sample {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src/A.txt"));
            BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream("src/B.txt"));

            String WriteThis = "THis is data";

            bufferedOutputStream.write(WriteThis.getBytes());
            bufferedOutputStream.flush();

           // BufferedReader bufferedReader = new BufferedReader(new Fil);





        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
