package Week_5.Day18.PRACTICE;

import java.io.*;

/*
Byte and char are two types of FH

Byte run on 8 bit CHar run on 16 bit

 */
public class FileHandlingPractice {
    void fh()throws Exception{

        FileOutputStream fileOutputStream = new FileOutputStream("devTry15.txt");

        fileOutputStream.write(65);
        fileOutputStream.flush();

        FileInputStream fileInputStream = new FileInputStream("devTry15.txt");
        System.out.println((char)fileInputStream.read());
    }

    void byteArrayStr() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("devTry15.txt");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String sentence = "Devayush";
        byteArrayOutputStream.write(sentence.getBytes());
        byteArrayOutputStream.writeTo(fileOutputStream);
        byteArrayOutputStream.flush();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        int i =0;
        while((i = byteArrayInputStream.read()) != -1){
            System.out.print((char) i);
        }
    }

    void bufferStr() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("devTry15.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String text = "\nThis is BufferInputString ;)";
        bufferedOutputStream.write(text.getBytes());
        bufferedOutputStream.flush();

        FileInputStream fileInputStream = new FileInputStream("devTry15.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int i =0;
        while( (i = bufferedInputStream.read()) != -1){
            System.out.print((char) i);
        }
    }
    void dataOutput_dataInput() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("devTry15.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        String text = " \nThis is data output streamer";
        dataOutputStream.writeBytes(text);
        dataOutputStream.flush();

        FileInputStream fileInputStream = new FileInputStream("devTry15.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        System.out.print(dataInputStream.readLine());


    }

    public static void main(String[] args) throws Exception {

        FileHandlingPractice fileHandlingPractice = new FileHandlingPractice();
        fileHandlingPractice.fh();
        fileHandlingPractice.byteArrayStr();
        fileHandlingPractice.bufferStr();
        fileHandlingPractice.dataOutput_dataInput();
    }
}