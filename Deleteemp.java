
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	public class TestSave {
	public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/twinkle";
	String username="root";
	String password="root";
	Connection connection=null;
	String sql=("INSERT INTO employee VALUES (01,'misba', 'misba@mail.com')");

	//STEP-1: load/register the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	//Step-2: Establish connection
	 connection=DriverManager.getConnection(url, username, password);
	//Step-3:Establish statement
		Statement statement=connection.createStatement();
		
	//step-4:execute the statement
	statement.execute(sql); //update execute return type is int
	//step-5:close connection
	connection.close();
	System.out.println("ALL GOOD");
	}
	catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	finally { 
try {
	connection.close();
	System.out.println("ALL GOOD!!!...");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	}
	}

	

