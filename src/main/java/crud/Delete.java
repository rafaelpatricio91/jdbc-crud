package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.ConnectionFactory;

public class Delete
{
	public static void main(String[] args) throws SQLException
	{
		Connection conn = ConnectionFactory.getConnection();
		
			String sql = "DELETE FROM user WHERE name=?";
			
			PreparedStatement stmt = conn.prepareStatement(sql); //preparedStatement pois existem paramentros a serem passados
			stmt.setString(1, "O pipa");
			
			int rowsAffected = stmt.executeUpdate();
			
			if (rowsAffected > 0)
			{
				System.out.println("User DROPED");
			}
		
		conn.close();
	}
}
