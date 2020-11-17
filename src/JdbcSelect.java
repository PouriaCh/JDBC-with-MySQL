import java.sql.*;

public class JdbcSelect {
	public static void getDbTable(Statement stmt) {
		try {
			String strSelect = "select * from books";
			ResultSet rset = stmt.executeQuery(strSelect);
			System.out.println("The SQL statement is: " + strSelect + "\n");
            System.out.println("The records selected are: ");
            int rowCount = 0;
            while(rset.next()) {
                int id = rset.getInt("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + ", " + title + ", " 
                + author + ", " + price + ", "+ qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
