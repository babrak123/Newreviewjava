package cubic.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public Connection getConnection() {
		Connection con = null;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
	 }  catch (ClassNotFoundException ex) {
			ex.printStackTrace();
			

	} catch (SQLException ex) {
		ex.printStackTrace();
	}
	 return con;

	}

	public void getEmployeeInfo(Connection con) {

	try {
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from employees");

	while (rs.next()) {

	String empId = rs.getString("EMPLOYEE_ID");
	String firstName = rs.getString("FIRST_NAME");
	String lastName = rs.getString("LAST_NAME");
	String email = rs.getString("EMAIL");
	
	System.out.println(empId + " : " + firstName + " : " + lastName + " : " + email);
	}
	
	} catch (SQLException ex) {
		ex.printStackTrace();
	}

	}

	public void addEmployeeInfo(Connection con) {
	try {
	Statement stmt = con.createStatement();
	stmt.executeUpdate(	"insert into employees(EMPLOYEE_ID,LAST_NAME,FIRST_NAME,EMAIL) values(108,'hamdard','babrak','babrak@gmail.com')");
	con.commit();

	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

	public void updateEmployeeInfo(Connection con) {
	try {
	Statement stmt = con.createStatement();
	stmt.executeUpdate("update employees set FIRST_NAME='stephaine' where employee_id=103");
	con.commit();
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	public void deleteEmployeeInfo(Connection con) {
	try {
	Statement stmt = con.createStatement();
	stmt.executeUpdate("delete from employees where employees_id=104");
	con.commit();
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
	try {
	JDBC jdbc = new JDBC();
	Connection con = jdbc.getConnection();
	// jdbc.addEmployeeInfo(con);
	jdbc.updateEmployeeInfo(con);
	// jdbc.deleteEmployeeInfo(con);
	jdbc.getEmployeeInfo(con);
	con.close();
	
	} catch (SQLException ex) {
		ex.printStackTrace();
	}
	}
    }
