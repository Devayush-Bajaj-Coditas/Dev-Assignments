package Week_7.WeeklyTest.BookMAnagenment.src.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnectivity {
    static Connection connection = null;
    public static Connection getMyConnection() throws Exception {
        Class.forName(BookManagnenmentConnection.DRIVERNAME);
        connection = DriverManager.getConnection(BookManagnenmentConnection.PATH,
                BookManagnenmentConnection.USER,BookManagnenmentConnection.PASSWORD);
        return connection;
    }
    private SqlConnectivity(){
    }
}
