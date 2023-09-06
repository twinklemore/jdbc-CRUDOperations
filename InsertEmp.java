package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/twinkle";
		String username="root";
		String password="root";
		String sql=("INSERT INTO employee VALUES (15,'louis','louispartridge@mail.com')");

		   //STEP-1: load/register the driver
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
		   //Step-2: Establish connection
			
			
			Connection connection=DriverManager.getConnection(url, username, password); 
		  //Step-3:Establish statement
			
			
			Statement statement=connection.createStatement(); 
			
		  //Step-4:execute the statement
		   statement.execute(sql);
		   
		   
		  //Step-5:close connection
		       connection.close();
		       System.out.println("WORK DONE");
		}
		       catch (ClassNotFoundException e) {
			
			   e.printStackTrace();
		}      catch (SQLException e) {
			   e.printStackTrace();
		}

		}

		}


