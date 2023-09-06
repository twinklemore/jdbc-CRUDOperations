import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/twinkle";
		String username="root";
		String password="root";
		Connection connection=null;
		String sql=("UPDATE employee set email='sid123@mail.com' WHERE name='SID'");

		//STEP-1: load/register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//Step-2: Establish connection
		 connection=DriverManager.getConnection(url, username, password);
		//Step-3:Establish statement
			Statement statement=connection.createStatement();
			int a=statement.executeUpdate("UPDATE employee SET name='TWINKLE',email='tpmore@mail.com' WHERE id=3");
			if(a>0) {
				System.out.println("UPDATED");
			}
			else {
				System.out.println("NOT UPDATED");
			}
		}		catch (ClassNotFoundException e) {
			
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


