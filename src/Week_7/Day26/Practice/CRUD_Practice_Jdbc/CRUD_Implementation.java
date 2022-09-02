package Week_7.Day26.Practice.CRUD_Practice_Jdbc;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.PhantomReference;
import java.nio.file.ReadOnlyFileSystemException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD_Implementation extends DBMSConnection implements CRUD_Operations {
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void createRecord() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into CRUD_Records values (? , ? , ? ,? )");

            System.out.print("Enter your Details\nID: ");
            preparedStatement.setInt(1,Integer.parseInt(bufferedReader.readLine()));
            System.out.print("Name: ");
            preparedStatement.setString(2, bufferedReader.readLine());
            System.out.print("MobileNO: ");
            preparedStatement.setInt(3,Integer.parseInt(bufferedReader.readLine()));
            System.out.print("Address: ");
            preparedStatement.setString(4, bufferedReader.readLine());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Record created");
    }

    @Override
    public void readRecords() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from CRUD_Records");
            while(resultSet.next())
                System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2) + " "
                    + resultSet.getInt(3) + " " + resultSet.getString(4));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateRecord() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("Update  CRUD_Records set ? = ? ");

            System.out.print("What you want to edit : \n1 --> ID\n2 --> Name\n3 --> Mobile Number\n 4 --> Address \nEnter:");
            int choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice){
                case 1:
                    System.out.print("Enter new Id : ");
                    preparedStatement.setString(1,"id");
                    preparedStatement.setInt(2,Integer.parseInt(bufferedReader.readLine()));
                    preparedStatement.executeUpdate();
                    break;

                case 2:
                    System.out.print("Enter new Name : ");
                    preparedStatement.setString(1,"name");
                    preparedStatement.setString(2, bufferedReader.readLine());
                    preparedStatement.executeUpdate();
                    break;

                case 3:
                    System.out.print("Enter new Mobile Number: ");
                    preparedStatement.setString(1,"MobileNo");
                    preparedStatement.setInt(2,Integer.parseInt(bufferedReader.readLine()));
                    preparedStatement.executeUpdate();
                    break;

                    case 4:
                        System.out.print("Enter new Address : ");
                    preparedStatement.setString(1,"Address");
                    preparedStatement.setString(2, bufferedReader.readLine());
                    preparedStatement.executeUpdate();
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Updated successfully");
    }

    @Override
    public void delete() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from CRUD_Records where id = ? ");
            System.out.print("Enter ID you want to delete : ");
            preparedStatement.setInt(1, Integer.parseInt(bufferedReader.readLine()));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Deleted");

    }

}
