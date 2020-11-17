import java.sql.*;

public class JdbcUpdate {
    public static void updateDbTable (Statement stmt) {
        try {
            String strUpdate = "update books set qty = 0 where title= 'A Teaspoon of Java'";
            System.out.println("The SQL statement is : " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected. \n");
            
            if (countUpdated > 0) {
                JdbcSelect.getDbTable(stmt);
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}