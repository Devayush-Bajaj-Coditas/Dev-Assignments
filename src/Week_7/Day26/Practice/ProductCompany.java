package Week_7.Day26.Practice;

import jdk.jfr.consumer.RecordedStackTrace;

import javax.naming.ldap.PagedResultsControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.*;

public class ProductCompany {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Connection connection =null;
    ProductCompany() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coreJava_26","root","12345");
    }
    void insertData() throws IOException, SQLException {
        System.out.print("Enter product details\nproduct name = ");
        String name = bufferedReader.readLine();
        System.out.print("Product Id : ");
        int id = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Price: ");
        float price = Float.parseFloat(bufferedReader.readLine());
        PreparedStatement preparedStatement = connection.prepareStatement("insert into ProductCompanyPractice values (?,?,?)");
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setFloat(3,price);
        preparedStatement.executeUpdate();
    }

    void ShowData(){

    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }
}

