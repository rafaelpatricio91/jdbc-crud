package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.ConnectionFactory;

public class Update
{
	public static void main(String[] args) throws SQLException
	{
		Connection conn = ConnectionFactory.getConnection();
		
			String sql = "UPDATE user SET name=?, username=?, password=? WHERE name=?";
			
			PreparedStatement stmt = conn.prepareStatement(sql); //preparedStatement pois existem paramentros a serem passados
			stmt.setString(1, "O pipa");
			stmt.setString(2, "Rabiola");
			stmt.setString(3, "senha");
			stmt.setString(4, "Rafona");
			
			int rowsUpdated = stmt.executeUpdate();
			
			if (rowsUpdated > 0)
			{
				System.out.println("Updated!");
			}
		conn.close();
	}
}
