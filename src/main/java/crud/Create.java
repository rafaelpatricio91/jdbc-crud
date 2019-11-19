package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.ConnectionFactory;

public class Create
{
	public static void main(String[] args) throws SQLException
	{
		Connection conn = ConnectionFactory.getConnection();
		
		String sql = "INSERT INTO user(name, username, password) VALUES (?,?,?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql); //preparedStatement pois existem paramentros a serem passados
		stmt.setString(1, "Rafona");
		stmt.setString(2, "Dom Rafona");
		stmt.setString(3, "123456");
		
		int rowsInserted = stmt.executeUpdate(); // Retorna quantas linhas foram afetadas pelo comando
		
		if (rowsInserted > 0)
		{
			System.out.println("user inserted successfully");
		}
		
		conn.close();
	}
}
