package cubic.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCHELPER {

	public static void main(String[] args) {
		try {

			// load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "hr", "hr");

			// create the statement
			Statement Stmt = con.createStatement();

			// Execute the query
			ResultSet rs = Stmt.executeQuery("select * from employees");

			// Translate the data
			while (rs.next()) {

				String id = rs.getString("EMPLOYEE_ID");
				String FIRSTNAME = rs.getString("FIRST_NAME");
				String LASTNAME = rs.getString("LAST_NAME");
				System.out.println(id + "  " + FIRSTNAME + "  " + LASTNAME );

			}

		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
