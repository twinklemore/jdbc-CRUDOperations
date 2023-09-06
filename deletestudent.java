import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Prog1 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/twinkle";
		String username="root";
		String password="root";
		Connection connection=null;
		String sql=("DELETE FROM student where id=2");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	 connection=DriverManager.getConnection(url,username,password);
	 Statement statement=connection.createStatement();
	 statement.execute(sql);
	 System.out.println("all done");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	finally {
		try {
			connection.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	}
}
		
	


		
	


