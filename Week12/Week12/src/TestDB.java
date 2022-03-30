import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestDB {
	
	static final String DB_NAME = "testdb.db";
	static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\HP\\Documents\\2021_W_JAC444\\Week12\\src\\";
	
	static final String TABLE_CONTACTS = "contacts";
	
	static final String COLUMN_NAME = "name";
	static final String COLUMN_PHONE = "phone";
	static final String COLUMN_EMAIL = "email";

	public static void main(String[] args) {
		try {
			//jbdc:sqlite or mysql or oracle:path
			
			//Example
			//Class.forName("oracle.jdbc.drive.OracleDrive");
			//Drive d = new oracle.jdbc.drive.OracleDrive();
			//DriverManger.registerDriver(d);
			
			//Step.1 -- Connecting to the DB via your drive
			Connection conn = DriverManager.getConnection( CONNECTION_STRING + DB_NAME);
			//conn.setAutoCommit(false);
			//Step.2 -- Creating statements
			Statement st = conn.createStatement();
			//Statement st1 = conn.createStatement();
			
			//Drop the table
			st.execute("Drop table if exists " + TABLE_CONTACTS);
			
			//Create the table
			st.execute("Create table IF NOT Exists " + TABLE_CONTACTS + " (" + COLUMN_NAME + " Text, " + COLUMN_PHONE + " Integer, " + COLUMN_EMAIL + " text)");
			
			//Insert the data
			st.execute("Insert into contacts (name, phone, email) values ('ABC', 123456, 'abc@abc.com')");
			st.execute("Insert into contacts (name, phone, email) values ('John', 456789, 'john@abc.com')");
			st.execute("Insert into contacts (name, phone, email) values ('albert', 789123, 'albert@abc.com')");
			
			//Delete the data
			//st.execute("Delete from contacts where name='ABC'");
			
			//Select the statement
			// 1st Way
			/*st.execute("Select * from contacts");			
			ResultSet result = st.getResultSet();
			while(result.next()) {
				System.out.println(result.getString("name") + " " + result.getInt("phone") + " " + result.getString("email"));				
			}
			result.close();*/
			// 2nd Way
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the name to search: ");
			String read = scan.nextLine();
			
			String QUERY_NAME = "Select * from " + TABLE_CONTACTS + " where " + COLUMN_NAME + "='" + read + "'";
			ResultSet rs = st.executeQuery(QUERY_NAME);
			int count = 1;
			while(rs.next()) {
				System.out.println("Record: " + count);
				System.out.println(rs.getString("NAME") + " " + rs.getInt("phone") + " " + rs.getString("Email"));
				count++;
			}
			rs.close();
			
			st.close();
			conn.close();
			
		} catch(SQLException ex) {
			//System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace());
		}

	}

}
