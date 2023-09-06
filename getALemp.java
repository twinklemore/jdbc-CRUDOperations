import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class getAL {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/twinkle";
		String username="root";
		String password="root";
		Connection connection=null;
		String sql="SELECT * FROM employee";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	connection=DriverManager.getConnection(url,username,password);
	Statement statement=connection.createStatement();
	ResultSet resultSet=statement.executeQuery(sql); 
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
		System.out.println("************************************************");
		
	}
	
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
			connection.close();
			System.out.println("all good...");
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}


