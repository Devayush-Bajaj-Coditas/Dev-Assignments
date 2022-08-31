package Week_7.Day25;
/*7)Transaction management program,where display the records before and
        after rollback.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class TransactionManagement{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Connection connection = null;
    TransactionManagement(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_day_27","root","12345");
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    void Transaction() throws IOException, SQLException {
        System.out.println("Enter the amount you want to Deposit : ");
        int depositAmt = Integer.parseInt(bufferedReader.readLine());
        PreparedStatement ps = connection.prepareStatement("Insert into question_2(date, amt) values(?,?)");
        ps.setString(1,"30/08/2022");
        ps.setInt(2,depositAmt);
        ps.executeUpdate();
        System.out.println("Press 1 to confirm transaction\nPress 2 to Rollback");
        int flag = Integer.parseInt(bufferedReader.readLine());
        if (flag ==1){
            connection.commit();
            System.out.println("Balance added successful");
        }
        else {
            connection.rollback();
            System.out.println("transaction cancelled");
        }

    }

}
public class Q2_RollBack {
    public static void main(String[] args) throws SQLException, IOException {
        TransactionManagement transactionManagement = new TransactionManagement();
        transactionManagement.Transaction();
    }
}
