package Week_4.Day17;//Taking input from user as BufferInput

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest_PRACTICE {
        String name;
        int age;
        float percentage;

    void input() throws IOException {
        BufferedReader BReader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name : ");
        name = BReader.readLine();
        System.out.println("Enter your age : ");
        age = Integer.parseInt(BReader.readLine());
        System.out.println("Enter your percentage : ");
        percentage = Float.parseFloat(BReader.readLine());

    }
    void display(){
        System.out.println("Name : " + name+ "\nage : " + age +"\nPercentage : " + percentage );
    }

    public static void main(String[] args) throws IOException {
        BufferReaderTest_PRACTICE q2_bufferReaderTest = new BufferReaderTest_PRACTICE();
        q2_bufferReaderTest.input();
        q2_bufferReaderTest.display();
    }
}
