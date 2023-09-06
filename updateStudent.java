import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Program {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/twinkle";
		String username="root";
		String password="root";
		Connection connection=null;
		String sql=("UPDATE student SET email='disha@mail.com' WHERE id=12");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 connection= DriverManager.getConnection(url,username,password);
		 
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
				System.out.println("done work");
			}catch(SQLException e){
				e.printStackTrace();
			}
				
			}
		}
		
		
			
		
		}
	

			
		
	



