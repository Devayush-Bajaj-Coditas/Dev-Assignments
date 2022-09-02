package Week_7.WeeklyTest.BookMAnagenment.src;

import java.io.IOException;
import java.sql.SQLException;

public interface BookManagementMethods {
    //crud
    public void createRecord() throws Exception;
    public void retrieveRecords() throws SQLException;
    public void updateRecords() throws SQLException;
    public void deleteRecords() throws IOException, SQLException;

}
