package Week_6.Day23;

import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.x.protobuf.MysqlxPrepare;

import javax.swing.plaf.nimbus.State;
import java.io.PrintStream;
import java.sql.*;
class DbConnection{
    Connection connection = null;
    DbConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/devayush","root","12345");

        }catch (Exception e ){
            e.printStackTrace();
        }
    }
    void createDatabase(){
        try {
            PreparedStatement ps = connection.prepareStatement("Create database JDBC");
            System.out.println("Database created successfully");
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    void opendatabase(){
        try{
            Statement st = connection.createStatement();
            st.execute("select * from JDBC");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void createTable(){
        try{
            PreparedStatement ps = connection.prepareStatement("create table data(name varchar(40), id int)");
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    void insertData(){
        try {
            PreparedStatement ps = connection.prepareStatement("insert into jdbc values('Devayush',15)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    void showData(){
        try {
            PreparedStatement statement = connection.prepareStatement("Select * from data");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getInt(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}


public class JDBCDemo {
    public static void main(String[] args) {
        DbConnection dbConnection = new DbConnection();
        dbConnection.createDatabase();
        dbConnection.createTable();
        dbConnection.insertData();
        dbConnection.showData();
    }
}
