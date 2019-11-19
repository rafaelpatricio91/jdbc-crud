package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory
{
	
	public static Connection getConnection()
	{
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "";
		
		Connection conn;
		try
		{
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
