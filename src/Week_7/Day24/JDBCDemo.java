package Week_7.Day24;

import com.mysql.cj.jdbc.StatementImpl;
import org.w3c.dom.css.CSSUnknownRule;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.*;

class UserDatabaseManagement {
    Connection connection = null;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int orderId;

    void connectTODatabase() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day24","root", "12345");
        //connection.setAutoCommit(false);
    }

    void insertData() throws SQLException, IOException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into UserDatabaseManagement values (? , ? , ?) ");
        System.out.print("Enter name: ");
        String name = bufferedReader.readLine();
        System.out.print("Enter Order Id: ");
        orderId = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Enter address : ");
        String address = bufferedReader.readLine();
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, orderId);
        preparedStatement.setString(3, address);
        preparedStatement.executeUpdate();
        System.out.println("Record added successful");
    }

    void updateRecords() throws IOException, SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("update UserDatabaseManagement set ? = ?");
        System.out.print("\nPlease Enter your orderID to make changes : ");
        orderId = Integer.parseInt(bufferedReader.readLine());
        System.out.print("What you want to change? \n Press\n 1 - name\n 2 - Address\n Enter: ");
        int choice = Integer.parseInt(bufferedReader.readLine());
        switch (choice) {
            case 1:
                String newName = bufferedReader.readLine();
                preparedStatement.setString(1, "name");
                preparedStatement.setString(2, newName);
                preparedStatement.executeUpdate();


            case 2:
                String newAddress = bufferedReader.readLine();
                preparedStatement.setString(1, "city");
                preparedStatement.setString(2, newAddress);
                preparedStatement.executeUpdate();
        }

    }

    void deleteData() throws IOException, SQLException {
        System.out.print("\nEnter order id: ");
        orderId = Integer.parseInt(bufferedReader.readLine());
        PreparedStatement preparedStatement = connection.prepareStatement("delete from UserDatabaseManagement where id = ?");
        preparedStatement.setInt(1,orderId);
        preparedStatement.executeUpdate();
    }

    void showData() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from UserDatabaseManagement");
        System.out.println( resultSet.getString(1) + " " + resultSet.getInt(2) + " "
                + resultSet.getString(3));
    }
}

public class JDBCDemo {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        UserDatabaseManagement userDatabaseManagement = new UserDatabaseManagement();
        userDatabaseManagement.connectTODatabase();
        int choice;
        do{
            System.out.print("\nHow may I help you\nPress\n1 - Insert Data\n2 - Update Data\n3 - Delete Data\n4 - EXIT\n Enter : ");
            choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice) {
                case 1:
                    userDatabaseManagement.insertData();
                    break;
                case 2:
                    userDatabaseManagement.updateRecords();
                    break;
                case 3:
                    userDatabaseManagement.deleteData();
                    break;
                case 4:
                    userDatabaseManagement.showData();
                    break;
            }
        }while (choice != 5);
    }
}
