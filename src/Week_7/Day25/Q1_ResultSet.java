package Week_7.Day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

/**6)Write a program where you will update record of Teacher(id,name,designation)
 using Resultset
 Note check What is "TYPE SCROLL_SENSITIVE"&
 "TYPE SCROLL_INSENSITIVE"
 @DevayushBajaj */
class TeacherManagenment{
    Connection connection = null;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    TeacherManagenment() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Day25_Q1_TeacherManagement","root","12345");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void updateTeacher() {

        try {
            System.out.println("Enter the ID of teacher you want to update : ");
            int id = Integer.parseInt(bufferedReader.readLine());
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("update Question_1_ResultSet Set id = ?, name = ?, designation = ? where id = ?",
                            ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            System.out.println("Enter new name : ");
            String newName = bufferedReader.readLine();
            System.out.println(" Enter new designation : ");
            String newDesignation = bufferedReader.readLine();
            System.out.println("Enter new ID : ");
            int newId = Integer.parseInt(bufferedReader.readLine());

            preparedStatement.setInt(4,id);
            preparedStatement.setString(2,newName);
            preparedStatement.setInt(1,newId);
            preparedStatement.setString(3,newDesignation);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void show() throws IOException, SQLException {

        System.out.println("Result set before updating database manually ");
        try {
            Statement statement =connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Question_1_ResultSet");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2)
                + " " + resultSet.getString(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Edit the data manually and press any key to display : ");
        String userInput = bufferedReader.readLine();

        System.out.println("Result : - ");

        Statement statement =  connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Question_1_ResultSet");
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }

    }
}

public class Q1_ResultSet {
    public static void main(String[] args) throws SQLException, IOException {
        TeacherManagenment teacherManagenment = new TeacherManagenment();
        teacherManagenment.updateTeacher();
        teacherManagenment.show();
    }
}
