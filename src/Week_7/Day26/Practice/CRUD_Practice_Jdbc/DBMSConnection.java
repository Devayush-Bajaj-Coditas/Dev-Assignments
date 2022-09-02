package Week_7.Day26.Practice.CRUD_Practice_Jdbc;;
import Week_7.Day26.Practice.CRUD_Practice_Jdbc.Dao.ConnectionRequirements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBMSConnection {
    Connection connection = null;
    DBMSConnection(){
        try {
            Class.forName(ConnectionRequirements.DRIVERNAME);
            connection = DriverManager.getConnection(ConnectionRequirements.PATH,ConnectionRequirements.USER,ConnectionRequirements.PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
