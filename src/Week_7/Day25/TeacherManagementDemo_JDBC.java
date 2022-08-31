
package Week_7.Day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

class TeacherManagenmentSystem {
    Connection connection = null;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    TeacherManagenmentSystem() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Day25_Q1_TeacherManagement", "root", "12345");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void AddTeacher() throws IOException {
        int id;
        String name, designation;
        do {
            System.out.println("Enter \nID\n name\n designation");
            try {
                id = Integer.parseInt(bufferedReader.readLine());
                name = bufferedReader.readLine();
                designation = bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                PreparedStatement ps = connection.prepareStatement("insert into TeacherPersonalDetails values(?, ?, ?)");
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, designation);
                ps.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Do you want to add more data\n1. Yes\n2. No");
            if (Integer.parseInt(bufferedReader.readLine()) == 2)
                id = 0;
        } while (id != 0);

    }

    void showDetails() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from TeacherPersonalDetails");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }
    }

    void editDetails() throws SQLException, IOException {
        PreparedStatement preparedStatement = connection.prepareStatement("update teacherpersonaldetails SET id = ? ,name = ?, designation = ? where id = ? ");
        System.out.println("Enter teacher Id which you want to update : ");
        int teacherId = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter new name : ");
        String newName = bufferedReader.readLine();
        System.out.println("Enter new id : ");
        int newId = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter new Designation");
        String newDesig = bufferedReader.readLine();
        preparedStatement.setInt(1, newId);
        preparedStatement.setString(2, newName);
        preparedStatement.setString(3, newDesig);
        preparedStatement.setInt(4, teacherId);
        preparedStatement.executeUpdate();
    }

    void delete() throws SQLException, IOException {
        PreparedStatement preparedStatement = connection.prepareStatement("Delete from teacherpersonaldetails where id = ? ");
        System.out.println("Enter the Id you want to delete : ");
        int delId = Integer.parseInt(bufferedReader.readLine());
        preparedStatement.setInt(1, delId);
        preparedStatement.executeUpdate();

    }
}


public class TeacherManagementDemo_JDBC {
    public static void main(String[] args) throws IOException, SQLException {
        TeacherManagenmentSystem teacherManagenmentSystem = new TeacherManagenmentSystem();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        do {
            System.out.println("Press\n 1 to add teacher \n 2 to show database \n 3 to edit data \n 4 to delete a record \n 5 to EXIT \nENTER: ");
            choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice) {
                case 1:
                    teacherManagenmentSystem.AddTeacher();
                    break;
                case 2:
                    teacherManagenmentSystem.showDetails();
                    break;
                case 3:
                    teacherManagenmentSystem.editDetails();
                    break;

                case 4:
                    teacherManagenmentSystem.delete();
                    break;

            }

        } while (choice != 5);
    }
}