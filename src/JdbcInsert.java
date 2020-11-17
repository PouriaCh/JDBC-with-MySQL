import java.sql.*;

public class JdbcInsert {
    public static void main(String[] args){
        try (
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebookshop", "myuser", "15669");
            Statement stmt = conn.createStatement();
        ) {
        // Execute a SQL INSERT|DELETE statement via executeUpdate(),
        //   which returns an int indicating the number of rows affected.     
    
        // Delete record with id = 1003
        	
	        int dataId = 1010; // ID of the column to be deleted
        	String sqlDelete = "delete from books where id = " + dataId;
	        System.out.println("The SQL statement is: " + sqlDelete + "\n");
	        int countDeleted = stmt.executeUpdate(sqlDelete);
	        System.out.println(countDeleted + " records deleted!\n");
             // check the result

        // Insert a new record
	        
            String sqlInsert = "insert ignore into books values (1006, 'Gone with the Wind', 'Ramsay', 66.66, 66)";
            System.out.println("The SQL statement is :" + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted!\n");
            // check the result
            if (countInserted > 0) {
                JdbcSelect.getDbTable(stmt);
            }
            
        
        // Insert multiple records

            String sqlInsertMany = "insert ignore into books values " 
            + "(1007, 'Python for Dummies', 'Michael Scott', 19.99, 200),"
            + "(1008, 'How to Use MySQL', 'Pouria', 49.99, 2000)";
            System.out.println("The SQL statement is: " + sqlInsertMany + "\n");
            int countInsertedMany = stmt.executeUpdate(sqlInsertMany);
            System.out.println(countInsertedMany + " records inserted! \n");
            if (countInsertedMany > 0) {
                JdbcSelect.getDbTable(stmt);
            }

        // Insert a partial record
            
            String sqlInsertPartial = "insert ignore into books (id, title, author) values " 
            + "(1009, 'Fishing 101', 'Kumar')";
            System.out.println("The SQL statement is: " + sqlInsertPartial + "\n");
            int countInsertedPartial = stmt.executeUpdate(sqlInsertPartial);
            System.out.println(countInsertedPartial + " records inserted! \n");
            if (countInsertedPartial > 0) {
                JdbcSelect.getDbTable(stmt);
            }


        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}