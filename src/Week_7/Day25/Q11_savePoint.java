package Week_7.Day25;

import com.mysql.cj.jdbc.Driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.*;

/*11)check the concept of savepoint() and try to implement it using a simple example.
        Add the output of every different scenario.*/
class Student{
    int rollNo;
    String name,city;
    Connection connection = null;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Student(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Day25_Q1_TeacherManagement","root","12345");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    void updateData() throws SQLException, IOException {

        System.out.println("Enter ROll no. that you want to update : ");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("update Question11_savePoint set ? = ? where id = ?");
        System.out.println("Enter your rollNumber which you want to edit");
        rollNo = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter 1 to update name\nEnter 2 to update city");
        int updateChoice = Integer.parseInt(bufferedReader.readLine());
        switch (updateChoice){
            case 1:
                System.out.println("Enter new name : ");
                String newName = bufferedReader.readLine();
                resultSet.updateString(1,"name");
                resultSet.updateString(2,newName);
                resultSet.updateInt(3,rollNo);
                System.out.println("Name changed successfully");
                break;
                case 2:
                    System.out.println("Enter new City: ");
                    String newCIty = bufferedReader.readLine();
                    resultSet.updateString(1,"city");
                    resultSet.updateString(2,newCIty);
                    resultSet.updateInt(3,rollNo);
                    System.out.println("City changed successfully");
                    break;

        }

    }
}


public class Q11_savePoint {
    public static void main(String[] args) throws SQLException, IOException {
        Student student = new Student();
        student.updateData();
    }
}
